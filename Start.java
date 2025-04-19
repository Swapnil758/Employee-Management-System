import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.employee.manage.Employee;
import com.employee.manage.EmployeeDB;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Welcome to Our Employee Management System : ");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("press 1 to ADD employee");
			System.out.println("press 2 to DELETE employee");
			System.out.println("press 3 to SHOW all employees");
			System.out.println("press 4 to UPDATE employee");
			System.out.println("press 5 to Exit...");

			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
				// add employee

				System.out.println("Enter Employee Name : ");
				String name = br.readLine();
				System.out.println("Enter Employee Salary : ");
				String salary = br.readLine();
				System.out.println("Enter Employee Department Number : ");
				String deptno = br.readLine();

				// create Employee Object to store Employees
				Employee emp = new Employee(name, salary, deptno);
				System.out.println(emp);
				if (EmployeeDB.insertEmployee(emp)) {
					System.out.println("Employee added successfully!");
				} else
					System.out.println("Something went wrong...");

			} else if (c == 2) {
				// delete employee
				System.out.println("Enter Employee ID :");
				int id = Integer.parseInt(br.readLine());
				if (EmployeeDB.deleteEmployee(id)) {
					System.out.println("Employee deleted successfully!");
				} else
					System.out.println("Something went wrong...");
			} else if (c == 3) {
				// show all employee
				EmployeeDB.showAllEmployees();
			} else if (c == 4) {
				// update employee
				System.out.println("Enter employee ID :");
				int id = Integer.parseInt(br.readLine());

				System.out.println("Enter employee name or press Enter to skip :");
				String name = br.readLine();

				System.out.println("Enter employee salary or press Enter to skip :");
				String salary = br.readLine();

				System.out.println("Enter department no. or presss Enter to cintinue :");
				String deptno = br.readLine();
				Employee emp = new Employee(id, name, salary, deptno);

				if (EmployeeDB.updateEmployee(emp)) {
					System.out.println("Employee details updated successfully...");
				} else
					System.out.println("Something went wrong...");
			} else if (c == 5) {
				// exit
				break;
			} else {

			}
		}
		System.out.println("program Existed...");
		System.out.println("Thankyou for using our Application...");

	}

}
