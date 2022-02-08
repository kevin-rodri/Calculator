import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in a number:");
		int operandUno = sc.nextInt();
		System.out.println("Enter in a number:");
		int operandDos = sc.nextInt();
		System.out.println("Would you like to: \n1. add \2. subtract");
		int input = sc.nextInt();
		if (input == 1) {
		System.out.print((operandUno + operandDos));
	} else if (input == 2) {
		System.out.print((operandUno - operandDos));
	} else {
		System.out.println("invalid input");
		}
	}
	
}
