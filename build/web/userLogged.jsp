<%@ page language="java" 
      contentType="text/html; charset=UTF-8"
      pageEncoding="UTF-8"
      import="com.jsp_app.bean.UserBean"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">

<html>

   <head>
      <meta http-equiv="Content-Type" 
         content="text/html; charset=windows-1251">
      <title>User Logged Successfully</title>
   </head>

   <body>

      <center>
            <% UserBean currentUser = (UserBean) session.getAttribute("currentSessionUser");%>
             Welcome <%= currentUser.getName() %>            
      </center>

   </body>

</html>