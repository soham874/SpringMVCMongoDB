package com;

import java.util.*;

import org.apache.log4j.Logger;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mongodb.DBCollection;
//import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

@Service("personService")
@Transactional
public class PersonService {
	
	private static String db_name = "Cencus";
	private static String collection_name = "CRUD-Operation-Spring-MVC";
	
	private static Logger log = Logger.getLogger(PersonService.class);
	
	public List<Person> getAll(){
		
		List<Person> person_list = new ArrayList<Person>();
		DBCollection coll = MongoFactory.getCollection(db_name,collection_name);
		DBCursor cursor = coll.find(); 
		
        while(cursor.hasNext()) {           
            DBObject dbObject = cursor.next();
 
            Person person = new Person();
            person.setId(Integer.parseInt(dbObject.get("id").toString()));
            person.setName(dbObject.get("Name").toString());
            person.setGender(dbObject.get("Gender").toString());
            person.setLocation(dbObject.get("Location").toString());
            person.setAge(Integer.parseInt(dbObject.get("Age").toString()));
 
            // Adding the user details to the list.
            person_list.add(person);
        }
        log.debug("Total records fetched from the mongo database are= " + person_list.size());
        return person_list;
	}
	
}
