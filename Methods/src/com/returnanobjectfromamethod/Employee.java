package com.returnanobjectfromamethod;

//Write a Java program to return an object from a method.

public class Employee {

	int empId;
	String empName;
	
	Employee(int empId,String empName)
	{
		this.empId = empId;
		this.empName = empName;
	}
	
	Employee getEmployee()
	{
		Employee e = new Employee(29,"Shizuka");
		return e;
	}
	
	public void displayEmployeeDetails()
	{
		System.out.println("Employee Id is:"+empId);
		System.out.println("Employee Name is:"+empName);
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee(13, "Nobita");
		e1.displayEmployeeDetails();
		
		Employee e2 = e1.getEmployee();
		e2.displayEmployeeDetails();
	}
	
}
