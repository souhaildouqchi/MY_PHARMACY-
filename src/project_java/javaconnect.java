/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_java;

/**
 *
 * @author souhail
 */
import java.sql.*;
import javax.swing.*;
public class javaconnect {
    Connection conn = null;
    public static Connection ConnecrDb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacy?useTimezone=true&serverTimezone=UTC","root",                                         "saramounaim");
                    return conn;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "connex madaratch"+e);
            return null;
        }
    }
}
