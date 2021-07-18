package question_4_$;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		try (//Write a program to calculate Simple Interest input by the user. Simple Interest = P*T*R/100
		Scanner input = new Scanner(System.in)) {
			System.out.println("Enter Principle : ");
			double P = input.nextDouble();				
			
			System.out.println("Enter Time : ");
			double T = input.nextDouble();	
			
			System.out.println("Enter Rate : ");
			double R = input.nextDouble();
			
			double SI = (P*T*R)/100;
			System.out.println("The simple interest is " + SI);
		}

	}

}
