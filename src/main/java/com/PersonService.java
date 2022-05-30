package com;

import java.util.*;

import org.bson.Document;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.mongodb.DBCollection;
//import com.mongodb.BasicDBObject;
//import com.mongodb.DBCursor;
//import com.mongodb.DBObject;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

@Service("personService")
@Transactional
public class PersonService {
	
	private static String db_name = "Cencus";
	private static String collection_name = "CRUD-Operation-Spring-MVC";
	
	public List<Person> getAll(){
		
		List<Person> person_list = new ArrayList<Person>();
		MongoCollection<Document> coll = MongoFactory.getCollection(db_name,collection_name);
		FindIterable<Document> fi = coll.find();
        MongoCursor<Document> cursor = fi.iterator();
		
        while(cursor.hasNext()) {   
        	
            Document dbObject = cursor.next();
 
            Person person = new Person();
            person.setId(Integer.parseInt(dbObject.get("id").toString()));
            person.setName(dbObject.get("Name").toString());
            person.setGender(dbObject.get("Gender").toString());
            person.setLocation(dbObject.get("Location").toString());
            person.setAge(Integer.parseInt(dbObject.get("Age").toString()));
            
            // Adding the user details to the list.
            person_list.add(person);
        }
        cursor.close();
        System.out.println(person_list.size()+" documents found and loaded from collection.");
        return person_list;
	}
	
}
