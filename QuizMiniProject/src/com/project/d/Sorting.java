package com.project.d;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sorting {
   static final String DB_URL = "jdbc:mysql://localhost/user";
   static final String USER = "root";
   static final String PASS = "Kasim@2022";
   static final String QUERY = "SELECT student_id, student_name, student_score FROM students";

   public void sorting() {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();) {		      
         System.out.println("Fetching records in ascending order...");
         ResultSet rs = stmt.executeQuery(QUERY + " ORDER BY first ASC");
         while(rs.next()){
            //Display values
            System.out.print("student_id: " + rs.getInt("student_id"));
            System.out.print("student_name: " + rs.getString("student_name"));
            System.out.print("student_score: " + rs.getString("student_score"));
            
         }

      
          rs.close();
       } catch (SQLException e) {
          e.printStackTrace();
       }
   }
}


