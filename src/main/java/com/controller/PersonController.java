package com.controller;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;

//import javax.annotation.Resource;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

import com.model.Person;
import com.service.MongoServices;
import com.service.PersonService;

@Controller
public class PersonController {
		
	@Autowired
	PersonService personService;
	
	// Displaying the initial users list.
    @RequestMapping(value = "/")
    public String basicLanding(Model model) {     
        return "Welcome";
    }
	
    // Displaying the initial users list.
    @RequestMapping(value = "/viewPerson")
    public String viewPerson(Model model) throws IOException, JSONException {
    	MongoServices.testPost();
        List<Person> person_list = personService.getAll(); 
        model.addAttribute("person", person_list);     
        return "Welcome";
    }
	
}
