<%-- 
    Document   : carlist
    Created on : Jul 5, 2021, 5:52:04 PM
    Author     : placideh
    required : to install jstl libary in order to loop over the data
--%>

<%@page import="models.Car"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Cars Page</title>
        <link rel="stylesheet" type="text/css" href="./css/table.css">
    </head>
    <body>
        <header id="main-header">
            <h3>Government Web Car Management</h3>

        </header>
       
        <a href="index.jsp"class="newCarBtn" >Add New Car &nbsp; &RightTriangleBar;</a>
        <table cellpadding="15" border="1" cellspacing="0" >
            <caption> <h2 >List of All Government Cars </h2></caption>
            <thead style="background:blue ;color:#f4f4f4" class="tableHead">
                <tr>
                    <th>CarPlateNumber</th>
                    <th>Manufactured Date</th>
                    <th>Cost</th>
                    <th>Institution</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody class="tableBody">
            <c:forEach items="${cars}" var="car">
                <tr>
                    <td>${car.plateNo}</td>
                    <td>${car.manufacturingDate}</td>
                    <td>${car.cost}</td>
                    <td>${car.institution}</td>
                    <td>
                        <a href="edit.jsp?plateno=${car.plateNo}&manufacturedDate=${car.manufacturingDate}&cost=${car.cost}&institution=${car.institution} ">Edit&Rarrtl;</a> |
                        <a href="delete?plateno=${car.plateNo}" class="delBtn">Delete&cross;</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </body>
</html>
