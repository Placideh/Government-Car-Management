/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Car;
import utils.DatabaseConnection;

/**
 *
 * @author placideh
 */
public class CarDao {
    public static void registerCar(Car car){
        try(Connection con=DatabaseConnection.getConnected()){
            String QUERY="INSERT INTO car_table (plateno,manufacturingDate,cost,institution) VALUES (?,?,?,?)";
            PreparedStatement statement=con.prepareStatement(QUERY);
            statement.setString(1,car.getPlateNo());
            statement.setDate(2,(Date.valueOf(car.getManufacturingDate())));
            statement.setLong(3,car.getCost());
            statement.setString(4,car.getInstitution());
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static void updateCar(Car car){
        try(Connection con=DatabaseConnection.getConnected()){
            String QUERY="UPDATE car_table SET manufacturingDate=?,cost=?,institution=? WHERE plateno=?";
            PreparedStatement statement=con.prepareStatement(QUERY);
            statement.setDate(1,(Date.valueOf(car.getManufacturingDate())));
            statement.setLong(2,car.getCost());
            statement.setString(3,car.getInstitution());
            statement.setString(4,car.getPlateNo());
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
  
    public static void deleteCar(String plateNo){
        try(Connection con=DatabaseConnection.getConnected()){
            String QUERY="DELETE FROM car_table WHERE plateno=?";
            PreparedStatement statement=con.prepareStatement(QUERY);
            statement.setString(1,plateNo);
            statement.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public static Car findByPlateNo(String plateNo){
        Car car=null;
        try(Connection con=DatabaseConnection.getConnected()){
            String QUERY="SELECT * FROM car_table WHERE plateno=?";
            PreparedStatement statement=con.prepareStatement(QUERY);
            statement.setString(1,plateNo);
            ResultSet result=statement.executeQuery();
            while(result.next()){
                car=new Car(result.getString(1),result.getDate(2).toLocalDate(),result.getLong(3),result.getString(4));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return car;
    }
    public static ArrayList<Car> getAll(){
        ArrayList<Car> carList=new ArrayList<>();
        try(Connection con=DatabaseConnection.getConnected()){
            String QUERY="SELECT * FROM car_table";
            PreparedStatement statement=con.prepareStatement(QUERY);
            ResultSet result=statement.executeQuery();
            while(result.next()){
                Car car=new Car(result.getString(1),result.getDate(2).toLocalDate(),result.getLong(3),result.getString(4));
                carList.add(car);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return carList;
    }
}
