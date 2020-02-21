package com.jsp_app.utils;

import java.sql.*;
import java.util.*;

public class ConnectionManager {

      static Connection con;
      static String url;
            
      public static Connection getConnection()
      {       
         try
         {
//            String url = "jdbc:oracle:thin:@10.26.232.216:1521:card"; 
             String url = "jdbc:sqlite:C:\\Projects\\JAVA\\jsp_app\\database.sqlite3";
            // assuming "DataSource" is your DataSource name

//            Class.forName("oracle.jdbc.OracleDriver");
            Class.forName("org.sqlite.JDBC");
            
            
            try
            {            	
//               con = DriverManager.getConnection(url,"zc","gtpltw21"); 
                con = DriverManager.getConnection(url); 
                								
            // assuming your SQL Server's	username is "username"               
            // and password is "password"
                 
            }
            
            catch (SQLException ex)
            {
               ex.printStackTrace();
            }
         }

         catch(ClassNotFoundException e)
         {
            System.out.println(e);
         }

      return con;
}
   }
