package com.passanobjectasanargumenttoamethod;

//Write a Java program to pass an object as an argument to a method.

public class Student {

	int roll_No;
	String name ;
	
	Student(int roll_No,String name)
	{
		this.roll_No = roll_No;
		this.name = name;
	}
	
	public void displayStudentDetails(Student s)
	{
		System.out.println("Roll No is:"+roll_No);
		System.out.println("Name is:"+name);
	}
	
	public static void main(String[] args) {
		Student s= new Student(29,"ABC");
		s.displayStudentDetails(s);
	}
}
