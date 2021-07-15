<%-- 
    Document   : index
    Created on : Jul 5, 2021, 10:21:21 AM
    Author     : placideh
--%>

<%@page import="java.util.Map"%>
<%@page import="java.util.Date"%>
<%@page import="models.Car"%>
<%@page import="dao.CarDao"%>
<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link rel="stylesheet" type="text/css" href="./css/style.css">
    </head>
  <%
            Map<String, String> errors = (Map)session.getAttribute("error");
            pageContext.setAttribute("error", errors);
            session.removeAttribute("error");
  %>

    <body>
        <header id="main-header">
             <h3>Government Web Car Management</h3>

        </header>
        <nav id="navbar">
            <ul class="myList">
                <li><a href="#">Home</a></li>
                <li><a href="#">Services</a></li>
                <li><a href="#">About</a></li>
            </ul>

        </nav>
        <main>
            <div class="showcase">
                <h1>Government Car Web Management</h1>
                <p> Government Car Web Application Where all Government  Cars are registered 
                    We Maintain and Keep Track of National Institution.This Web is of Government 
                    Level Use.
                </p>
                
            </div>
            
            <div class="container">
                <form class="my-form" action="register" method="get">
                    <h3>&spades;Car Register Form&spades;</h3>
                    <div class="my-input">
                        <label class="error">${error["generalError"]}</label><br>
                        <label>PlateNo</label>
                        <input type="text" class="plateno "  name="plateno"  placeholder="GR###A|GP###Z" required>
                               <br> <label class="error">${error["plateNo"]}</label>
                    </div>
                     <div class="my-input">
                        <label>Manufacturing Date</label>
                        <input type="date" class="inputTag"  name="manufacturedDate"  required>
                               <br><label class="error">${error["manufacturedDate"]}</label>
                    </div>
                     <div class="my-input">
                        <label>Cost</label>
                        <input type="text" class="cost"  name="cost"  required ><br>
                       <label class="error">${error["cost"]}</label>
                    </div>
                        <label for="institution">Choose an Institution:</label>
                        <select name="institution"   class="selectionList" required>
                        <option value="REB">REB</option>
                        <option value="RAB">RAB</option>
                        <option value="RBA">RBA</option>
                        <option value="RBC">RBC</option>
                        <option value="MINECOFIN" >MINECOFIN</option>
                        <option value="BNR">BNR</option>
                        <option value="HEC" >HEC</option>
                        <option value="MINIJUSTE">MINIJUSTE</option>
                        <option value="MINISANTE" >MINISANTE</option>
                    </select>
                        <br>
                        <input class="registerBtn" type="submit" value="submit &RuleDelayed;">
                </form>
            </div>
            
        </main>
        <footer id="main-footer">
            <h4>Government Web Car Management </h4>
            <ul class="footerList">
                <li><a class="aTagfooter" href="#">Facebook</a></li>
                <li><a class="aTagfooter" href="#">Twitter</a></li>
                <li><a class="aTagfooter" href="#">LinkedIn</a></li>
                <li><a class="aTagfooter" href="#">Instagram</a></li>

            </ul>
            <p>Government Car Website &copy;2021 Kigali
        </footer>
    </body>
</html>
