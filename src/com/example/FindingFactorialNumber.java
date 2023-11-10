package com.example;

import java.util.Scanner;

public class FindingFactorialNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scanner.nextInt();
		int f = 1;
		while (n > 1) {
			f = f * n;
			n--;
		}
		System.out.println("Factorial Value is = " + f);
	}
}
