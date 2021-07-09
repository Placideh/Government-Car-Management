/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.CarDao;
import java.io.IOException;
import java.util.ArrayList;
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
@WebServlet(name = "DeleteServlet", urlPatterns = {"/delete"})
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String plateNo = req.getParameter("plateno");
        CarDao.deleteCar(plateNo);
        ArrayList<Car> carList = CarDao.getAll();
        HttpSession session = req.getSession();
        session.setAttribute("cars", carList);
        resp.sendRedirect("carlist.jsp");
    }

}
