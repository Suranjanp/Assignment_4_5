package question_4_$;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		 final double PI = 3.14;
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the radius : ");
		 double r = input.nextDouble();
		 
		 double R = r*r;
		 double A = PI*R;
		 System.out.println("The area of circle is " +A);
	}

}
