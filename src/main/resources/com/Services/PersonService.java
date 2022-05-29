package com.Services;

import java.util.*;
import com.Models.MongoFactory;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

@Service("personService")
@Transactional
public class PersonService {
	
	private static String db_name = "Cencus";
	private static String collection_name = "CRUD-Operation-Spring-MVC";
	
	private static Logger log = Logger.getLogger(PersonService.class);
	
	public List<Person> getAll(){
		
		List<Person> user_list = new ArrayList<>();
		DBCollection coll = MongoFactory.getCollection(db_name,collection_name);
		DBCursor cursor = coll.find(); 
		
        while(cursor.hasNext()) {           
            DBObject dbObject = cursor.next();
 
            Person person = new Person();
            person.setId(dbObject.get("id").toString());
            person.setName(dbObject.get("Name").toString());
            person.setGender(dbObject.get("Gender").toString());
            person.setLocation(dbObject.get("Location").toString());
            person.setAge(Integer.parseInt(dbObject.get("Age")));
 
            // Adding the user details to the list.
            user_list.add(user);
        }
        log.debug("Total records fetched from the mongo database are= " + user_list.size());
        return user_list;
	}
	
}
