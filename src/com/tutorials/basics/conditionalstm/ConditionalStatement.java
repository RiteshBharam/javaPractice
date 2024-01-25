package com.tutorials.basics.conditionalstm;

public class ConditionalStatement {

	public static void main(String[] args) {

		/* //If statement
		 *  if(10<20) { System.out.println("Statement is true"); //Gives
		 * output when condition is true }
		 */
	
		/*//if-else
		  if(2<3) { System.out.println("if is executed"); }else {
		  System.out.println("else is executed"); }
		 */
		
		
		/*
		 //else if 
		  int money = 100;
		  
		  if(money >= 5000) { 
		  			System.out.println("party in 5 star"); 			 
		  }else if(money<5000 && money>3000){ 
		  			System.out.println("party in 3 star"); 
		  }else {
		  			System.out.println("normal party"); 
		  }
		 */
		
		int num = 2;
	
		switch(num) {
		case 1: System.out.println("You entered 1");
			break;
		case 2: System.out.println("You entered 2");
			break;
		default: System.out.println("You entered wrong option");
		}
		

	}

}
