package com.spring.controller;


import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



import com.spring.model.Student;

@Controller
public class ComplexController {
	@RequestMapping("/complex")
	public String complex() {
	
		return "complex";
	}
//	@RequestMapping(path = "/complexformhandle" , method = {RequestMethod.GET , RequestMethod.POST})
//	public String complexform(@RequestParam("name") String name , @RequestParam("email") String email , @RequestParam("contact") String contact , @RequestParam("password") String password , @RequestParam("courses") String course , @RequestParam(required = true ,name = "checkbox") String check ) {
//		 System.out.println(name+email+contact+password+course);
//		
//		return "complexsuccess";
//	}
 	@RequestMapping(path = "/complexformhandle" , method = {RequestMethod.GET , RequestMethod.POST})
	public String complexform(@ModelAttribute("student") Student student , BindingResult result , @RequestParam(required = true , name="checkbox") String check) 
	{
		if(result.hasErrors()) {
			return "complex";	
		}
		System.out.println(student);
		return "complexsuccess";
	}
	
}
	