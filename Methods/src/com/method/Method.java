package com.method;

public class Method {

	int roll_no;
	String name;
	
	Method()
	{
		roll_no = 10;
		name = "Sakshi";
	}
	
	public void displayStudentDetails()
	{
		int age = 22;
		String address ="Pune";
		Method m = new Method();
		System.out.println("Student Roll No:"+m.roll_no);
		System.out.println("Student Name:"+m.name);
		System.out.println("Student Age:"+age);
		System.out.println("Student Address:"+address);
	}
	public static void main(String[] args) {
		Method m1 = new Method();
		m1.displayStudentDetails();
	}
}
