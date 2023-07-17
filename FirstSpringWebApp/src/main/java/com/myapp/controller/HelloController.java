 package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
//	http://localhost:8080/FirstSpringWebApp/index
@Controller
public class HelloController {
	@RequestMapping("/index")
	public String getData()
	{
		return "Welcome";//it is searching for Welcome.jsp
	}
	
	@RequestMapping("/data")
	public ModelAndView getInfo()
	{
		return new ModelAndView("ProductInfo","info","Welcome to Spring Data");
	}
	

}

