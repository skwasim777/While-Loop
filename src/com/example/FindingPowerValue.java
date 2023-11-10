package com.example;

import java.util.Scanner;

public class FindingPowerValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Base Value :");
		int b = scanner.nextInt();
		System.out.println("Enter Power Value :");
		int p = scanner.nextInt();
		long pwr = 1;
		while (p >= 1) {
			pwr = pwr * b;
			p--;
		}
		System.out.println("Power Base Value is = " + pwr);
	}
}
