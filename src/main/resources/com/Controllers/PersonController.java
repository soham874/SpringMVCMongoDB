package com.Controllers;

import java.util.List;

import javax.annotation.Resource;
 
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
 
import com.Models.Person;
import com.Services.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {
	
	private static Logger log = Logger.getLogger(UserController.class);
	PersonService personService;
 
    // Displaying the initial users list.
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getPersons(Model model) {
        log.debug("Request to fetch all users from the mongo database");
        List<Person> person_list = personService.getAll();      
        model.addAttribute("person", person_list);     
        return "Welcome";
    }
	
}
