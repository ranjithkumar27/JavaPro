package org.pro;

import java.util.Scanner;

public class Pro {

	public static void main(String[] args) {

		// Reverse a string

		String input = "Welcome";

		System.out.println("Before reverse  " + input);
		String reverse = "";

		int length = input.length();

		for (int i = length - 1; i >= 0; i--) {

			char c = input.charAt(i);

			reverse = reverse + c;

		}

		System.out.println("After reverse  " + reverse);

		// Swap two numbers

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first value");

		int a = sc.nextInt();

		System.out.println("Enter the second value");

		int b = sc.nextInt();

		System.out.println("Before swapping two numbers A is " + a + " B is " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping two numbers A is " + a + " B is " + b);
		
		//Three program sum of odd numbers
		
		
		int values = 100;
		int count = 0;//4
		for(int i=1;i<values;i++) {//5
			if(i%2!=0) {
				count=count+i;//4+5=9
				
			}
			
			
		}
		
		System.out.println("Sum of odd numbers is "+count);

	}

}
