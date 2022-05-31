package com.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.model.Person;

import okhttp3.*;

public class MongoServices {
    
	private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
	
	private static String JsonValue() {
        return "{"
        		+ "\n    \"collection\":\"CRUD-Operation-Spring-MVC\","
        		+ "\n    \"database\":\"Cencus\","
        		+ "\n    \"dataSource\":\"TestCluster\""
        		+ "\n"
        	+ "\n}";
      }
	
	public static List<Person> testPost() throws IOException, JSONException{
		OkHttpClient client = new OkHttpClient().newBuilder().build();
		RequestBody body = RequestBody.create(JsonValue(),JSON);
        Request request = new Request.Builder()
            .url("https://data.mongodb-api.com/app/data-qswvl/endpoint/data/beta/action/find")
            .post(body)
            .addHeader("Content-Type", "application/json")
            .addHeader("Access-Control-Request-Headers", "*")
            .addHeader("api-key", "1Zgu9DzZbfN1eFs5kdzwB7WiqA58Ck7S2DHpBJc14WdgsfVuBhvvk5dMiIk81Bea")
            .build();
        Response response = client.newCall(request).execute();
        System.out.println(response.toString());
        //System.out.println(response.body().string());
        String jsonData = response.body().string();
        JSONObject Jobject = new JSONObject(jsonData);
        JSONArray Jarray = Jobject.getJSONArray("documents");
        List<Person> person_list = new ArrayList<Person>();
        for (int i = 0; i < Jarray.length(); i++) {
            JSONObject object = Jarray.getJSONObject(i);
            Person temp_person = new Person();
            
            temp_person.setId(object.getInt("id"));
            temp_person.setAge(object.getInt("Age"));
            temp_person.setGender(object.getString("Gender"));
            temp_person.setLocation(object.getString("Location"));
            temp_person.setName(object.getString("Name"));
            person_list.add(temp_person);
            System.out.println(temp_person.toString());
        }
        response.close();
        return person_list;
	}
}
