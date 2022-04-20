package x;

import java.util.Scanner;

public class Class05 {

	public static void main(String[] args) {
		// Enter 2 midterm score and 1 final score.
		// midterms score affect %30 and final score affects %40
        // if your average score is above 50, you are passed
		//  average score is between 40-50, conditionally passed
		// under 40, you failed your class
		
		Scanner scan = new Scanner(System.in);
		
		int M1,M2,F;
		
		float avg;
		
		System.out.println("please enter your first midterm score. ");
		
		M1 = scan.nextInt();
		
		System.out.println("please enter your second midterm score. ");
		
		M2 = scan.nextInt();
		
		System.out.println("please enter your final score. ");
		
		F= scan.nextInt();
		
		avg= (float) (M1*0.3 + M2*0.3 + F*0.4);
		
		System.out.println("your average score is " + avg);
		
		if(avg>=50) {
			
			System.out.println("passed. Vacation time ! ");
			
		} else if(avg>=40 && avg<50) {
			
			System.out.println("conditional pass. Vacation time !");
		
			
		} else {
			System.out.println("failed :(");
			
		}
	}

}
