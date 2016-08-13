/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstdatabasemysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Justin
 */
public class MyFirstDatabaseMySQL {

    public static void main(String[] args) {
        
        try {
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "dzjustinli2", "1A2b3c4d5e");
            
            Statement myStatement = myConnection.createStatement();
            
            ResultSet myResult = myStatement.executeQuery("select * from city");
            
            while(myResult.next()){
                System.out.println(myResult.getString("Name") + ", " + myResult.getString("Population"));
            }

        } catch (Exception e){
            
        }
        
    }
    
}
