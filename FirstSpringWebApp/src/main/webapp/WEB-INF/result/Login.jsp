
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