package com.method;

public class ReturnMethod {

	public int add(int a,int b)
	{
		int addition = a + b;
		return addition;
	}
	
	public int sub(int c ,int d)
	{
		int subtraction = c - d;
		return subtraction;
	}
	
	public int mul(int e,int f)
	{
		int multiplication = e * f;
		return multiplication;
	}
	
	public int div(int g,int h)
	{
		int division = g / h;
		return division;
	}
	
	public static void main(String[] args) {
		ReturnMethod rm = new ReturnMethod();
		
		int Add= rm.add(20, 80);
		System.out.println("Addition is:"+Add);
		
		int Sub = rm.sub(50,90);
		System.out.println("Subtraction is:"+Sub);
		
		int Mul = rm.mul(6,80);
		System.out.println("Multiplication is:"+Mul);
		
		int Div = rm.div(20,5);
		System.out.println("Division is:"+Div);
	}
	
}
