package com.myapp.controller;
import com.myapp.dao.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class MainController {
	@RequestMapping("/login")
	public ModelAndView getLogin()
	{
		User u1=new User();
		return new ModelAndView("Login","userinfo",u1);
	}
	@RequestMapping("/loginValidation")
	public String getValidate(@ModelAttribute("userinfo") User u1)
	{
		String result=null;
		if(u1.getUsername().equals("admin")&&u1.getPassword().equals("admin"))
		{
			result="success";
		}
		else
		{
			result="invalid";
		}
		return result;
	}

}
