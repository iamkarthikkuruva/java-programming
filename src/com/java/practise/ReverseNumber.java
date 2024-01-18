package com.java.practise;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		// logic 1

		/*
		 * int rev = 0; while (num != 0) { rev = rev * 10 + num % 10; // 0+1234%10=4,
		 * num = num / 10; }
		 */
		
		//logic 2
		
		/*
		 * StringBuffer sb = new StringBuffer(String.valueOf(num)); StringBuffer rev =
		 * sb.reverse();
		 */

		
		//logic 2
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		StringBuilder rev = sb.reverse();
		
		System.out.println("Reverse Num is :" + rev);
	}

}

