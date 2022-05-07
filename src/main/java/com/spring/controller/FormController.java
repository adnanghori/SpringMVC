package com.spring.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.User;

@Controller

public class FormController {
	//Approach 1
//	@RequestMapping(path = "/form", method = {RequestMethod.GET,RequestMethod.POST})
//	public String handleForm(HttpServletRequest request) {
//		 String email = request.getParameter("email");
//		 String username = request.getParameter("username");
//		 String password = request.getParameter("pass");
//		 
//		 System.out.println(email+username+password);
//		 
//		return "form";
//	}
	// Approach 2s
	@RequestMapping("/form")
	public String form() {
		
		return "form";
	}
	@RequestMapping(path = "/processform", method = {RequestMethod.GET,RequestMethod.POST})
	public String handleForm(@ModelAttribute User user)
	{
		 System.out.println(user);
		return "success";
	}
}
//@RequestMapping(path = "/form", method = {RequestMethod.GET,RequestMethod.POST})
//public String handleForm(@RequestParam("email") String email , @RequestParam("username") String username, @RequestParam("pass") String password )
//{
//	 System.out.println(email+username+password);
//	  
//	return "form";
//}
