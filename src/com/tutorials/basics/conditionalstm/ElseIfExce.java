package com.tutorials.basics.conditionalstm;

import java.util.Scanner;

public class ElseIfExce {

	public static void main(String[] args) {
		// WAP to calculate grades A =(marks>=90) B=(marks btw 80 & 90)
		// C=(marks btw 70 & 80) Fail=(marks < 30)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks");
		double marks = scanner.nextDouble();
		if (marks >= 90) {
			System.out.println("Grade A");
		} else if (80 < marks && marks < 90) {
			System.out.println("Grade B");
		} else if (70 < marks && marks < 80) {
			System.out.println("Grade C");
		} else if (marks < 30) {
			System.out.println("Fail");
		} else {
			System.out.println("Grade D");
		}
		scanner.close();
	}

}
