package com.jsp_app.dao;

import com.jsp_app.models.Users;
import com.jsp_app.utils.ConnectBean;
import com.jsp_app.utils.ConnectionManager;
import java.sql.*;

   public class UserDAO 	
   {
      static Connection currentCon = null;
      static ResultSet rs = null;  

      public static Users login(Users bean) throws Exception {
	
        String username = bean.getUsername();    
        String password = bean.getPassword();   
	    
        String searchQuery = "select * from users where login='" + username + "' AND password='" + password + "'";	    
        Statement stmt = ConnectBean.getInstance().getConnection().createStatement();
        try {
           
           rs = stmt.executeQuery(searchQuery);
           boolean more = rs.next();
           // if user does not exist set the isValid variable to false
           if (!more) {
              System.out.println("Sorry, you are not a registered user! Please sign up first");
              bean.setValid(false);
           }
           //if user exists set the isValid variable to true
           else if (more) {
              String name = rs.getString("name");
              bean.setName(name);
              bean.setValid(true);
           }
        } 
        catch (Exception ex) {
           System.out.println("Log In failed: An Exception has occurred! " + ex);
        } 
        finally {
            if (rs != null) {
               try {
                  rs.close();
               } catch (Exception e) {}
                  rs = null;
            }

            if (stmt != null) {
               try {
                  stmt.close();
               } catch (Exception e) {}
                  stmt = null;
            }

            if (currentCon != null) {
               try {
                  currentCon.close();
               } catch (SQLException e) {
               }
               currentCon = null;
            }
        }
        return bean;	
      }	
   }