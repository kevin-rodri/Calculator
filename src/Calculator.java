import java.util.Scanner;

public class Calculator {
		
	public static void main(String[] args) {
		int operandUno, operandDos;
		double operandOne, operandTwo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Whole or double numbers?");
		String in = sc.nextLine();
		if (in.equalsIgnoreCase("whole")) {
		System.out.println("Enter in a number:");
		  operandUno = sc.nextInt();
		System.out.println("Enter in a number:");
		 operandDos = sc.nextInt();
		 System.out.println("Would you like to: \n1. add \n2. subtract \n3. multiply \n4. divide");
			int input = sc.nextInt();
			if (input == 1) {
			System.out.print((operandUno + operandDos));
		} else if (input == 2) {
			System.out.print((operandUno - operandDos));
		} else if(input == 3) {
			System.out.print((operandUno * operandDos));
		} else if (input == 4) {
			if (operandDos == 0) {
				System.out.println("Error: Divide by Zero");
			} else {
				System.out.print((operandUno / operandDos));
			}	
	
		} else {
			System.out.println("invalid input");
			}
		} else if (in.equalsIgnoreCase("double")) {
			System.out.println("Enter in a number:");
			 operandOne = sc.nextDouble();
			System.out.println("Enter in a number:");
			 operandTwo = sc.nextDouble();
			 System.out.println("Would you like to: \n1. add \n2. subtract \n3. multiply \n4. divide");
				int input = sc.nextInt();
				if (input == 1) {
				System.out.print((operandOne + operandTwo));
			} else if (input == 2) {
				System.out.print((operandOne - operandTwo));
			} else if(input == 3) {
				System.out.print((operandOne * operandTwo));
			} else if (input == 4) {
				if (operandTwo == 0) {
					System.out.println("Error: Divide by Zero");
				} else {
					System.out.print((operandOne / operandTwo));
				}	
			} else {
				System.out.println("invalid input");
				}
		} else {
			System.out.println("invalid input");
		}
	}	
}
	

