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

//
package com.myapp.dao;

public class User {
	private String username;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	
	

}

//
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "f"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Student Information</h2>
     <f:form action="loginValidation" method="post" modelAttribute="userinfo">
     <table>
     <tr>
     <td>
     <f:label path="username">User Name</f:label>
     </td>
     <td>
     <f:input path="username"/>
     </td>
     </tr>
     <tr>
     <td>
     <f:label path="password">Password</f:label>
     </td>
     <td>
     <f:input path="password"/>
     </td>
     </tr>
     <tr>
     	<Td></Td>
     	<td><input type="submit" value="Login"/></td>
     </tr>
     	   </table>
     </f:form>
	
//
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
This is Success Page
</body>
</html>

//

