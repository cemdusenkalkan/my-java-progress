package x;

import java.util.Scanner;

public class Class06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float x,y;
		
		int operation;
		
		System.out.println("enter a number please. ");
		
		x=scan.nextInt();
		
		System.out.println("enter another one more number please. ");
		
		y=scan.nextInt();
		
		System.out.println("for addition, press 1. ");
		System.out.println("for subtraction, press 2. ");
		System.out.println("for multiplication, press 3. ");
		System.out.println("for division, press 4. ");
		System.out.println("Choose an operation please.  ");
		
		operation=scan.nextInt();
		
		switch (operation) {
		case 1:
			System.out.println(x+y);
			
			break;
			
		case 2:
			System.out.println(x-y);
			
			break;
			
		case 3:
			System.out.println(x*y);
			
			break;
			
		case 4:
			System.out.println(x/y);
			
				
			
			break;

		default:
			System.out.println("please choose between 1 and 4");
			break;
		}
		
	
		
		

	}

}
