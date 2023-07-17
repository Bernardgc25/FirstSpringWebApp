package com.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//http://localhost:8080/FirstSpringWebApp/index
@Controller
public class HelloController {
	@RequestMapping("/index")
	public String getData()
	{
		return "Welcome";//it is searching for Welcome.jsp
	}

}

