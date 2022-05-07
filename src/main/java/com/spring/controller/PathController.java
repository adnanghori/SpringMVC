package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PathController {
	@RequestMapping("/user/{id}")
	public String getUserDetail(@PathVariable("id")int id) {
		System.out.println(id);
		return "index"; 
	}
}
