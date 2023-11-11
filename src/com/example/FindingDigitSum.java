package com.example;

import java.util.Scanner;

public class FindingDigitSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scanner.nextInt();
		int r, sum = 0;
		while (n != 0) {
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		System.out.println("Digit Sum is = " + sum);
	}
}
