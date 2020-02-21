    <%@ page import="java.io.*,java.util.*,java.sql.*"%>
    <%@ page import="javax.servlet.http.*,javax.servlet.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
    <%@ page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8"%>
    <link rel="stylesheet" href="./css/bootstrap.min.css">         
    <script src="./js/jquery-3.2.1.min.js"></script>
    <script src="./js/bootstrap.min.js"></script>      
    
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1251">
        <title>Login Page</title>
    </head>
    <body class="d-flex flex-column">
        <div id="page-content">
        <div class="container">
            <div class="row justify-content-center">
                <form action="LoginServlet">
                  <div class="form-group">
                    <label>login</label>
                    <input type="text" class="form-control" name="un" required>
                  </div>
                  <div class="form-group">
                    <label>password</label>
                    <input type="password" class="form-control" name="pw" required>
                  </div>
                  <button type="submit" class="btn btn-primary">Submit</button>
                </form>                    
            </div>       
        </div>
        </div>        
    </body>
</html>