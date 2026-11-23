package com.methodoverloading;

//Write a Java program to demonstrate method overloading.

public class Overloading {

	
	public void m1()
	{
		System.out.println("---Default m1 Method----");
	}
	
	public void m1(int i)
	{
		System.out.println("---one parameter m1 Method----");
	}
	
	public void m1(int i,String s)
	{
		System.out.println("---Two parameter m1 Method----");
	}
	
	public void m1(int i,double d,char c)
	{
		System.out.println("---Three parameter m1 Method----");
	}
	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.m1();
		o.m1(20);
		o.m1(90, "ABC");
		o.m1(90,100.0,'A');
	}
}
