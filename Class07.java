package x;

import java.util.Scanner;

public class Class07 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		int counter,total;
		float  average;
		
		
		counter=1;
		total=0;
		
		
		while(counter<11) {
			
			System.out.println("enter your number " + counter );
			
			total = total + scan.nextInt();
			counter++;
			
		}
		average = total/11;
		System.out.println("Average = " + average);
		
		
			
		}
	}


