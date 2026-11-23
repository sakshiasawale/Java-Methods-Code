package com.calculatormethodoverloading;

//Write a Java program to create a class Calculator with overloaded methods to add two integers, three integers, and two double values.

public class Calculator {

	public int add(int i , int j)
	{
		int addition = i + j;
		return addition;
	}
	
	public int add(int i , int j , int k)
	{
		int three_Addition = i + j + k;
		return three_Addition;
	}
	
	public double add1(double i , double j)
	{
		double doubleAdd = i + j;
		return doubleAdd;
	}
	
	public double add1(double i , double j , double k)
	{
		double three_Addition = i + j + k;
		return three_Addition;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		int add = c.add(10, 20);
		System.out.println("Two number addition is:"+add);

		int add1 = c.add(20, 120,3000);
		System.out.println("Three number addition is:"+add1);
		
		double add2 = c.add1(900,2000);
		System.out.println("Two number double addition is:"+add2);
		
		double add3 = c.add1(20, 30,40);
		System.out.println("Three number double addition is:"+add3);
	}
}
