package com.tutorials.basics.conditionalstm;

import java.util.Scanner;

public class IfElseExce {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();

		if (number % 2 != 0) {
			System.out.println("Number is Odd");
		} else {
			System.out.println("Number is Even");
		}
		scanner.close();
	}

}
