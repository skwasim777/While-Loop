package com.example;

import java.util.Scanner;

// 1 2 3 9 4 5 6 18 
public class PrinitingSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scanner.nextInt();
		int i = 1;
		while (n >= i) {
			System.out.printf("%d ", i);
			if (i % 3 == 0)
				System.out.printf("%d ", i * 3);
			i++;
		}
	}
}
