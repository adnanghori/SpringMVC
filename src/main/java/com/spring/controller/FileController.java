package com.spring.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileController {
	@RequestMapping("/file")
	public String file() {
		
		return "file";
	}
	@RequestMapping(value="/fileupload" , method = {RequestMethod.GET , RequestMethod.POST})
	public String fileUpload(@RequestParam("file") CommonsMultipartFile file ,  HttpSession session , Model m ) {
		//we've get the file , now uploading
		byte[] data = file.getBytes();
		String path = session.getServletContext().getRealPath("/")+ "WEB-INF"+File.separator +"resources"+File.separator+ "image" +File.separator+file.getOriginalFilename();
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
		m.addAttribute("size", file.getSize());
		System.out.println(path);
		
		return "filesuccess";
	}
}
