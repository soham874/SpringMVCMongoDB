<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Welcome</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://examples.javacodegeeks.com/wp-content/litespeed/localres/aHR0cHM6Ly9tYXhjZG4uYm9vdHN0cmFwY2RuLmNvbS8=bootstrap/4.0.0/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <h2 id="article_header" class="text-warning" align="center">Spring Mvc and MongoDb Example</h2>
            <div> </div>
      
            <!-- Table to display the user list from the mongo database -->
            <table id="users_table" class="table" border="1">
                <thead>
                    <tr>
						<th width='60' align="center">Id</th>
						<th width='300' align="center">Name</th>
						<th width='300' align="center">Age</th>
						<th width='300' align="center">Gender</th>
						<th width='200' align="center">Location</th>
					</tr>
                </thead>
                <tbody>
                    <c:forEach items="${person}" var="person">
                        <tr align="center">
                            <td>${person.id}</td>
                            <td>${person.Name}</td>
                            <td>${person.Age}</td>
                            <td>${person.Gender}</td>
                            <td>${person.Location}</td> 
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>        
    </body>
</html>