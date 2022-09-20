package com.project.d;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
	
	public void insertData(){
	{
		
		String Query="INSERT INTO STUDENTS (student_id,student_name,student_score) VALUES(?,?,?)";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Kasim@2022");
			PreparedStatement ps=con.prepareStatement(Query);
			Scanner sc=new Scanner(System.in);
			System.out.println("***************Please enter the student details************");
			for(int i=0;i<=2;i++) {
				System.out.println(" ");	
			
		   if(sc!=null)
			
			{
				
				System.out.println("Enter student id :");
				int id=sc.nextInt();
				
				System.out.println("Enter student name :");
				String name=sc.next();
				
				System.out.println("Enter student score :");
				int score=sc.nextInt();
				
				if(con!=null)
				{
					if(ps!=null)
					{
						ps.setInt(1, id);
						ps.setString(2, name);
						ps.setInt(3, score);
						System.out.println("Success :"+ps.executeUpdate());
					}
				}
			}
		}
		
		
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
	}



}
}


