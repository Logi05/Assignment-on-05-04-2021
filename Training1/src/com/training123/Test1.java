package com.training123;
interface Test
{
	default void display() {
		System.out.println("Test default method");
	}
}
interface Test2
{
	public void show();
	abstract void display1();	
}
interface Test3
{
	public void show1();
	public static void display() {
		System.out.println("Static method");
	}
	default void showable()
	{
		System.out.println("Showable method");
	}
	
}
public class Test1 implements Test2,Test,Test3{
	public void display() {
		System.out.println("Test1 display method");
		Test3.display();
		Test.super.display();
	}
	@Override
	public void show() {
		System.out.println("Show method");
	}
	public void show1() {
		System.out.println("show1 method");
	}
	 public void display1()
	{
		System.out.println("Abstract method");
	}
	public static void main(String[] args) {
	Test1 obj=new Test1();
	obj.display();
	obj.show();
	obj.show1();
	obj.display1();
	obj.showable();
}
}


