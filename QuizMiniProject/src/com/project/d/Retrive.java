package com.project.d;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Retrive{

	public void retriveDetail() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","Kasim@2022");
			PreparedStatement ps = con.prepareStatement("select*from student");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("student_id: "+rs.getInt(1));
				System.out.println("student_name: "+rs.getString(2));
				System.out.println("student_score="+rs.getString(3));
			}
			con.close();
			ps.close();
			rs.close();			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

