package com.java.practise;

public class Swapping2Numbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swapping " + a + " and " + b);
		int t = a;
		a = b;
		b = t;
		System.out.println("After swapping " + a + " and " + b);
		
		//logic 2 
		/*
		 * a=a+b; b=a-b; a=a-b;
		 */
	}

}
