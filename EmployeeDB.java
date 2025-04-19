package com.employee.manage;

import java.sql.*;

public class EmployeeDB {

	// insert employee
	public static boolean insertEmployee(Employee emp) {
		boolean success = false;
		try {
			Connection con = CP.createC();
			String query = "INSERT INTO employees(ename, sal, deptno) VALUES(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, emp.getEname());
			ps.setString(2, emp.getSal());
			ps.setString(3, emp.getDeptno());

			ps.executeUpdate();
			success = true;
		} catch (Exception e) {
			System.out.println("Database Connection failed " + e.getMessage());
			e.printStackTrace();
		}
		return success;
	}

	// delete employee
	public static boolean deleteEmployee(int empid) {
		boolean success = false;
		try {
			Connection con = CP.createC();
			String query = "delete from employees where empid= ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, empid);

			ps.executeUpdate();
			success = true;
		} catch (Exception e) {
			System.out.println("Database Connection failed " + e.getMessage());
			e.printStackTrace();
		}
		return success;
	}

	public static void showAllEmployees() {
		try {
			Connection con = CP.createC();
			String query = "SELECT * from employees";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(query);

			// Get metaData to retrieve column count
			ResultSetMetaData rsmd = set.getMetaData();
			int columnCount = rsmd.getColumnCount();

			while (set.next()) {
				System.out.println("++++++++++++++++++++++++++++");
				for (int i = 1; i <= columnCount; i++) {
					//dynamically fetch column name and value
					String columnName = rsmd.getColumnName(i);
					String columnValue = set.getString(i);

					System.out.println(columnName + " : " + columnValue);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static boolean updateEmployee(Employee emp) {
		boolean success= false;
		try {
			Connection con= CP.createC();
			
			String query= "UPDATE employees SET ename= ?, sal= ?, deptno= ? where empid= ?";
			PreparedStatement pstmt= con.prepareStatement(query);
			
			pstmt.setString(1, emp.getEname());
			pstmt.setString(2, emp.getSal());
			pstmt.setString(3, emp.getDeptno());
			pstmt.setInt(4, emp.getEmpid());
			
			int rowsEffected= pstmt.executeUpdate();
			success= rowsEffected>0;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return success;
	}
}
