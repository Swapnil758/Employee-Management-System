🏢 Employee Management System

📌 Overview

The Employee Management System is a Java-based application that allows users to perform CRUD (Create, Read, Update, Delete) operations on employee records using MySQL as the database.

✨ Features

✅ Add Employee: Insert new employee details into the database.

❌ Delete Employee: Remove an employee record using their ID.

📜 Show All Employees: Display a list of all employees with their details.

✏️ Update Employee: Modify existing employee records.

🔌 Database Connectivity: Uses JDBC to interact with MySQL.

🛠️ Technologies Used

Java (Core Java, JDBC)

MySQL (Database)

JDBC (Database Connectivity)

BufferedReader (For user input handling)
 
📂 Project Structure

📂 EmployeeManagementSystem
│-- 📄 CP.java           # Handles MySQL connection setup
│-- 📄 Employee.java     # Employee model class
│-- 📄 EmployeeDB.java   # Contains database operations (CRUD)
│-- 📄 Start.java        # Main class to run the application
│-- 📄 README.md         # Project documentation

🚀 Setup & Installation

1️⃣ Import the project into your favorite IDE (Eclipse, IntelliJ, etc.).

2️⃣ Set up MySQL database:

CREATE DATABASE employees;
USE employees;
CREATE TABLE employees (
    empid INT AUTO_INCREMENT PRIMARY KEY,
    ename VARCHAR(100),
    sal VARCHAR(20),
    deptno VARCHAR(10)
);

3️⃣ Update database credentials in CP.java:

String url = "jdbc:mysql://localhost:3306/employees";
String username = "your_username";
String password = "your_password";

4️⃣ Run Start.java to start the application.

🎯 How to Use

Follow on-screen prompts to perform CRUD operations.

Press the corresponding number to execute an action (Add, Delete, Show, Update employees).

Enter 5 to exit the program.
