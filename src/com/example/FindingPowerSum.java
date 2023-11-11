package com.example;

import java.util.Scanner;

public class FindingPowerSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Base Value :");
		int b = scanner.nextInt();
		System.out.println("Enter Power Value :");
		int p = scanner.nextInt();
		long pwr = 1;
		int sum = 0;
		while (p >= 1) {
			pwr = pwr * b;
			sum = (int) (sum + pwr);
			p--;
		}
		System.out.println("Sum of power value is = " + sum);
	}
}
