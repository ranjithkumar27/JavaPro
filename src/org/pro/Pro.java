package org.pro;

public class Pro {

	public static void main(String[] args) {

		//Reverse a string
		
		String input = "Welcome";
		
		System.out.println("Before reverse  "+input);
		String reverse="";
		
		int length = input.length();
		
		for(int i=length-1;i>=0;i--) {
			
			
			char c =input.charAt(i);
			
			reverse=reverse+c;
			
		}
		
		System.out.println("After reverse  "+reverse);
	}

}
