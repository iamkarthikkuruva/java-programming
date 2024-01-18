package com.java.practise;

public class ReverseString {

	public static void main(String[] args) {

		String str = "ABCD";
		String rev = "";

		int len = str.length(); // 4

		/*
		 * for (int i = len - 1; i >= 0; i--) { //3 rev = rev + str.charAt(i); //D }
		 */

		// logic 2
		char a[] = str.toCharArray();
		int lth = a.length; // 4
		for (int i = lth - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println("Reversed String is:" + rev);
	}

}