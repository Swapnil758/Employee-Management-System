package com.employee.manage;

/**
 * Employee class represents an employee entity with attributes like employee ID,
 * name, salary, and department number. This class includes constructors,
 * getter and setter methods, and a toString method for displaying employee details.
 */
public class Employee {

    private int empid; // Employee ID
    private String ename; // Employee Name
    private String sal; // Employee Salary
    private String deptno; // Employee Department Number

    /**
     * Constructor to initialize all attributes, including employee ID.
     * Used when working with existing employee records.
     *
     * @param empid  Employee ID
     * @param ename  Employee Name
     * @param sal    Employee Salary
     * @param deptno Employee Department Number
     */
    public Employee(int empid, String ename, String sal, String deptno) {
        this.empid = empid;
        this.ename = ename;
        this.sal = sal;
        this.deptno = deptno;
    }

    /**
     * Constructor to initialize employee details except for the employee ID.
     * Used when adding a new employee since ID is often auto-generated.
     *
     * @param ename  Employee Name
     * @param sal    Employee Salary
     * @param deptno Employee Department Number
     */
    public Employee(String ename, String sal, String deptno) {
        this.ename = ename;
        this.sal = sal;
        this.deptno = deptno;
    }

    /**
     * Default constructor required for frameworks and object instantiation without parameters.
     */
    public Employee() {}

    /**
     * Gets the employee ID.
     *
     * @return Employee ID
     */
    public int getEmpid() {
        return empid;
    }

    /**
     * Sets the employee ID.
     *
     * @param empid Employee ID
     */
    public void setEmpid(int empid) {
        this.empid = empid;
    }

    /**
     * Gets the employee name.
     *
     * @return Employee Name
     */
    public String getEname() {
        return ename;
    }

    /**
     * Sets the employee name.
     *
     * @param ename Employee Name
     */
    public void setEname(String ename) {
        this.ename = ename;
    }

    /**
     * Gets the employee salary.
     *
     * @return Employee Salary
     */
    public String getSal() {
        return sal;
    }

    /**
     * Sets the employee salary.
     *
     * @param sal Employee Salary
     */
    public void setSal(String sal) {
        this.sal = sal;
    }

    /**
     * Gets the employee department number.
     *
     * @return Employee Department Number
     */
    public String getDeptno() {
        return deptno;
    }

    /**
     * Sets the employee department number.
     *
     * @param deptno Employee Department Number
     */
    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    /**
     * Returns a string representation of the Employee object.
     *
     * @return String containing employee details
     */
    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", deptno=" + deptno + "]";
    }
}
