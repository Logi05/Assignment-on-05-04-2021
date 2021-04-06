package com.training123;
interface Example
{
	default void print(int a, int b)
	{
		System.out.println("Default Method: "+(a+b));
	}
}
interface Example12{
	public static void printable()
	{
		System.out.println("Static method");
	}
}
public class Beta implements Example {
	public static void main(String[] args) {
		Example12.printable();	
		Beta b=new Beta();
		b.print(8,2);
	}
}
