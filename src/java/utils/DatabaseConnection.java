/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author placideh
 */
public class DatabaseConnection {
    public static Connection getConnected() throws SQLException{
        String url="jdbc:mysql://localhost:3306/webTech";
        String username="placideh";
        String password="toor12";
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection con=DriverManager.getConnection(url,username, password);
        return con;
    }
  
}
