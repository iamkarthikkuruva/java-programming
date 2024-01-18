package com.java.practise;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.next();

		String org_str = str;
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		if (org_str.equals(rev)) {
			System.out.println(rev + " is a Palindrome String");
		} else {
			System.out.println(rev + " is not a Palindrome String");
		}
	}
}

