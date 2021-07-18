package question_4_5;

import java.util.Scanner;

public class Area_Rectangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter lenghth : ");
		double l = input.nextDouble();
		
		System.out.println("Enter breadth : ");
		double b = input.nextDouble();
		
		double A = l*b;
		System.out.println("The area of rectangle is " +A);

	}

}
