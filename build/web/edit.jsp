<%-- 
    Document   : edit
    Created on : Jul 6, 2021, 6:01:45 PM
    Author     : placideh
--%>

<%@page import="java.time.LocalDate"%>
<%@page import="java.sql.Date"%>
<%@page import="models.Car"%>
<%@page import="dao.CarDao"%>
<%@page import="java.util.Map"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Page</title>
        <link rel="stylesheet" type="text/css" href="./css/edit.css">
    </head>
    <body>
        <%
        String plateNo=request.getParameter("plateno");
        Car car = null;
        if (plateNo != null) {
            car = CarDao.findByPlateNo(plateNo);
        } else {
            car = (Car)session.getAttribute("editCar");
            
            session.removeAttribute("editCar");

            Map<String, String> errors = (Map)session.getAttribute("error");
            pageContext.setAttribute("error", errors);
            session.removeAttribute("error");
        }
        pageContext.setAttribute("car", car);
        %>
        <header id="main-header">
            <h3>Government Web Car Management</h3>
        </header>
        
        <form class="my-form" action="update" method="get">
                    <h3>&spades;Car Register Form&spades;</h3>
                    <div class="my-input">
                        <label class="error ">${error["generalError"]}</label><br>
                        <label>PlateNo</label>
                        <input type="text"  class="plateno " value=${car.plateNo} name="plateno"  placeholder="GR###A|GP###Z" required>
                               <br> <label class="error">${error["plateNo"]}</label>
                    </div>
                     <div class="my-input">
                        <label>Manufacturing Date</label>
                        <input class="inputTag" type="date"  value=${car.manufacturingDate} name="manufacturedDate"  required>
                               <br><label class="error">${error["manufacturedDate"]}</label>
                    </div>
                     <div class="my-input">
                        <label>Cost</label>
                        <input type="text" class="cost" value=${car.cost} name="cost"  required ><br>
                       <label class="error">${error["cost"]}</label>
                    </div>
                        <label for="institution">Choose an Institution:</label>
                        <select name="institution"  value=${car.institution}  class="selectionList" required>
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
                        <br>
                        <input type="submit"  class="updateBtn" value="update &nbsp; &Bumpeq;"><br>
                        
                        <a href="carlist.jsp" class="cancelBtn">Cancel</a>
                </form>
    </body>
</html>
