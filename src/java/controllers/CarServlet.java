/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.CarDao;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Car;

/**
 *
 * @author placideh
 */
@WebServlet(name = "CarServlet", urlPatterns = {"/register"})
public class CarServlet extends HttpServlet {
    private Map<String,String>errors;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo=req.getPathInfo();
        String plateNo=req.getParameter("plateno");
        String plate=plateNo.toUpperCase().trim();
        LocalDate manufacturedDate=LocalDate.parse(req.getParameter("manufacturedDate"));
        Long cost=Long.parseLong(req.getParameter("cost"));
        String institution=req.getParameter("institution");
        Car car=new Car(plate, manufacturedDate, cost, institution);
        try{
            if(verifyCarInfo(car)){
                if(pathInfo==null){
                    if(CarDao.findByPlateNo(plate)!=null){
                        throw new IllegalArgumentException("The Car Plate Number is already been Taken");
                    }
                        CarDao.registerCar(car);
                        ArrayList<Car> carList=CarDao.getAll();
                        HttpSession session=req.getSession();
                        session.setAttribute("cars", carList);
                        resp.sendRedirect("carlist.jsp");
                }
            }
               
        }catch(IllegalArgumentException e){
            errors.put("generalError",e.getMessage());
            req.getSession().setAttribute("error", errors);
            resp.sendRedirect("index.jsp");
        }
        
    }
    private boolean verifyCarInfo(Car car){
            Long minimumCarCost=15000000L;
            Long maxCarCost=60000000L;
            errors=new HashMap<>();
           if(!car.getPlateNo().matches("[GP||GR]{2}[0-9]{3}[A-Z]{1}")){
               errors.put("plateNo","PlateNo Must Begin with GP OR GR with 3 digits ending with an Alphabet");
               
           }
           if((LocalDate.now().getYear()-car.getManufacturingDate().getYear())>5||LocalDate.now().getYear()-car.getManufacturingDate().getYear()<0){
               errors.put("manufacturedDate","We Buy Newest Car Atleast 5 years After Being Manufactured");
               
           }
           if(car.getCost()<minimumCarCost||car.getCost()>maxCarCost){
               
               errors.put("cost","Cost Of car Must Be between 15,000,000 and 60,000,000 RWF");
           }
           if(errors.isEmpty()){
            return true;
               
           }
           throw new IllegalArgumentException("One or More Fields Contains an error ");
    }

   
    
}
