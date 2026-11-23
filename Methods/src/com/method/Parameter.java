package com.method;

public class Parameter {

	public void m1(int id,String name)
	{
		System.out.println("Student ID:"+id);
		System.out.println("Student Name:"+name);
	}
	
	public static void main(String[] args) {
		Parameter p = new Parameter();
		p.m1(20,"Sakshi");
	}
}
