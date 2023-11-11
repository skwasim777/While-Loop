package com.example;

import java.util.Scanner;

public class FindingSumAndMean {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scanner.nextInt();
		int a = 1, sum = 0;
		while (a <= n) {
			sum = sum + a;
			a++;
		}
		System.out.printf("Sum = %d , Mean = %d " , sum,(sum/n));
	}
}
