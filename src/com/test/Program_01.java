package com.test;

import java.util.Scanner;

public class Program_01 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number:");
		int a=sc.nextInt();
		System.out.println("square of " + a + " is " +(a*a));
	}

}
