package com.training123;
interface Ex1
{
	public static void run() {
		System.out.println("Implementation");
	}
}
public interface Maininter {
	public static void main(String[] args) {
	System.out.println("Main Interface");
	Ex1.run();
}
}
