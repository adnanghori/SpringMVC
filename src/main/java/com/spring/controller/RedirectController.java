package com.spring.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
//	@RequestMapping("/one")
//	public void one(HttpServletResponse response) throws IOException  {
//		System.out.println("First");
//		response.sendRedirect("/SpringMVC/two");
//	}
//	@RequestMapping("/two")
//	public String two() {
//		System.out.println("Second");
//		return "";	
//	}
	@RequestMapping("/one")
	public RedirectView one()  {
		System.out.println("First");
		RedirectView redirectView = new  RedirectView();
		//redirectView.setUrl("/SpringMVC/two");
		// we can send redirect to another application also for ex-
		redirectView.setUrl("https://www.google.com/");
		return redirectView;
	}
	@RequestMapping("/two")
	public String two() {
		System.out.println("Second");
		return "";	
	}
}
