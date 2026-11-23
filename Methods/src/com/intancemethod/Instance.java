package com.intancemethod;

//Write a Java program to demonstrate instance methods inside a class.

public class Instance {

	int number = 29;
	String name = "ABC";
	
	public void studentDetails()
	{
		System.out.println("---Student Details Method---");
		System.out.println("Number is:"+number);
		System.out.println("Name is:"+name);
	}
	
	public void displayStudentDetails()
	{
		System.out.println(name+" "+"Playing a Game..");
		System.out.println(number+" "+"is My Favrioute Number..");
	}
	
	public static void main(String[] args) {
		Instance i = new Instance();
		i.studentDetails();
		i.displayStudentDetails();
	}
}
