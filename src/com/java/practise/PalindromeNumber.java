package com.java.practise;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();

		int rev = 0;
		int org_num = num;

		while (num != 0) {
			rev = rev * 10 + num % 10; // 0+1234%10=4   //4*10+123%10=40+3=43
			num = num / 10; //123 //12
		}
		
		if (org_num == rev) {
			System.out.println("Palindrome Number is " + rev);
		} else {
			System.out.println(rev + " Not a Palindrome Number");
		}
	}

}
