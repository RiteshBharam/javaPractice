package com.tutorials.basics.conditionalstm;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the amount");
		int budget = scanner.nextInt(); //crore
		if(budget>=5) {
			System.out.println("Purchase Audi");
		}
		else {
			System.out.println("Purchase Scorpio");
		}
		scanner.close();

	}

}
