package com.employee.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

	static Connection con;

	public static Connection createC() {

		try {
			// load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Create Connection... 
			String url = "jdbc:mysql://localhost:3306/employee_manage";
			String username = "root";
			String password = "Admin";
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}
}
