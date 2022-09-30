package com.student.manage;
import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
	static Connection con;
	public static Connection createC(){
		try {
			//load the driver
			//We can skip the next line as manual loading of driver class is no longer necessary.
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String user="root";
			String password="system";
			String url="jdbc:mysql://localhost:3306/student_manage";
			con=DriverManager.getConnection(url, user, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
