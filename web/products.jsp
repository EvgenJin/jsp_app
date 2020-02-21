<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="./css/bootstrap.min.css">
<script src="./js/jquery-3.2.1.min.js"></script>
<script src="./js/bootstrap.min.js"></script>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="common/header.jsp" />
        <div class="container">
            <h1>Product list</h1>
            <div align="center">
                <table class="table table-sm table-bordered">
                  <thead>
                    <tr>
                      <th class="col-md-1" scope="col">Actions</th>  
                      <th class="col-md-1" scope="col">id</th>
                      <th class="col-md-5" scope="col">Serial Number</th>
                      <th class="col-md-5" scope="col">Inventory Number</th>                      
                    </tr>
                  </thead>
                  <tbody>
                    <c:forEach var="product" items="${listProducts}">
                        <tr>
                            <td><button type="button" class="btn btn-sm btn-primary">Primary</button></td>
                            <td><c:out value="${product.id}" /></td>
                            <td><c:out value="${product.serial_num}" /></td>
                            <td><c:out value="${product.inventory_num}" /></td>
                            
    <!--                        <td>
                                <a href="/edit?id=<c:out value='${book.id}' />">Edit</a>
                                &nbsp;&nbsp;&nbsp;&nbsp;
                                <a href="/delete?id=<c:out value='${book.id}' />">Delete</a>                     
                            </td>-->
                        </tr>
                    </c:forEach>
                  </tbody>
                </table>            
            </div>   
        </div>
        <jsp:include page="common/footer.jsp" />
    </body>
</html>
