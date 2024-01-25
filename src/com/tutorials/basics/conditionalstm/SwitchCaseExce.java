package com.tutorials.basics.conditionalstm;

import java.util.Scanner;

public class SwitchCaseExce {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number 1 = ");
		int number1 = scanner.nextInt();
		System.out.println("+ , - , * , /");
		char operation = scanner.next().charAt(0);
		System.out.println("Enter Second Number 2 = ");
		int number2 = scanner.nextInt();

		
		switch(operation) {
		case '+' : System.out.println("Addition = "+(number1+number2));
		break;
		case '-' : System.out.println("Subtraction = "+(number1-number2));
		break;
		case '*' : System.out.println("Multiplication = "+(number1*number2));
		break;
		case '/' : System.out.println("Add = "+(number1/number2));
		break;
		default: System.out.println("You Entered wring input");
		}
		scanner.close();
	}

}
