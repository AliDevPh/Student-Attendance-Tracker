/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Alysa Emilio
 */
class Myconnection {
    public static Connection getConnection(){
        Connection conn = null;

        final String DB_URL = "jdbc:mysql://localhost/kdots?serverTimezone=UTC";
        final String USERNAME = "root";
        final String PASSWORD = "";


        try {
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        } catch (SQLException ex){
            Logger.getLogger(Myconnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conn;
    }
    
    
}
