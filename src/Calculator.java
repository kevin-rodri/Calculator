import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in a number:");
		int operandUno = sc.nextInt();
		System.out.println("Enter in a number:");
		int operandDos = sc.nextInt();
		System.out.print((operandUno + operandDos));
		
	}

}
