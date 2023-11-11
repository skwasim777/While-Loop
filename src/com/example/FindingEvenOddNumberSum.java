package com.example;

import java.util.Scanner;

public class FindingEvenOddNumberSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scanner.nextInt();
		int es = 0, os = 0;
		while (n >= 1) {
			if (n % 2 == 0)
				es = es + n;
			else
				os = os + n;
			n--;
		}
		System.out.printf("Even Sum = %d \nOdd Sum = %d ", es, os);
	}
}
