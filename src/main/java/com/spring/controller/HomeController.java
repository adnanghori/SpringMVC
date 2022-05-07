package com.spring.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.resource.HttpResource;

@Controller
@RequestMapping("/first")
public class HomeController {
	 
	@RequestMapping("/home")
	public String home(Model model) {  // we can return model & view as well
		model.addAttribute("name","Adnan");
		System.out.println(10/0);
		return "index"; // Returning name of view
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("about");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help(ModelAndView modelView) {
		Integer valueOf = Integer.valueOf(10);
		 modelView.addObject("name", "Adnan");
		 modelView.addObject(valueOf);
		 modelView.setViewName("help");
		 List <Integer> list = new ArrayList<Integer>();
		 list.add(101);
		 list.add(102);
		 list.add(103);
		 list.add(104);
		 modelView.addObject("list",list);
		return modelView; 
	}
	@ExceptionHandler(value=ArithmeticException.class)
	public String handler(Model m) {
		m.addAttribute("msg","Arithmetic Exception");
		return "globalerror";
	}
}
