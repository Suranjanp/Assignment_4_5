package question_4_5;

import java.util.Scanner;

public class Area_triangle {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter base : ");
		double b = input.nextDouble();
		
		System.out.println("Enter height : ");
		double h = input.nextDouble();
		
		double a = (h*b)/2;
		System.out.println("The area of traingle is " +a);
	}

}
