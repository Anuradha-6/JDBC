package com.student.manage;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDao {
	
	public static boolean insertStudentToDB(Student s) {
		boolean b=false;
		try {
			Connection con=CP.createC();
			String q="insert into students(sname, sphone, scity) values(?,?,?)";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);		
			//Set value of parameter
			pstmt.setString(1, s.getName());
			pstmt.setString(2, s.getPhone());
			pstmt.setString(3, s.getCity());
			//Execute
			pstmt.executeUpdate();
			b=true;			
		}
		
		
		
		catch(Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	
	public static boolean delete(int id) {
		boolean b=false;
		try {
			Connection con=CP.createC();
			String q="delete from students where sid=?";
			//PreparedStatement
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setInt(1, id);
			
			//Execute
			pstmt.executeUpdate();
			b=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return b;
	}
	
	public static void display() {
		try {
			Connection con=CP.createC();
			String q="select * from students";
			Statement stmt=con.createStatement();
			
			//Execute
			ResultSet set=stmt.executeQuery(q);
			
			while(set.next()) {
				int id=set.getInt(1);
				String name=set.getString(2);
				String phone=set.getString(3);
				String city=set.getString("scity");
				
				System.out.println("ID : "+id);
				System.out.println("Name : " + name);
				System.out.println("Phone Number : " + phone);
				System.out.println("City : " + city);
				System.out.println("---------------------------------------");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
