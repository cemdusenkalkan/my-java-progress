package x;

import java.util.Scanner;

public class Ders04 {

	public static void main(String[] args) {
	// ax^2+bx+c = 0
		
		//discriminant solution

		int a,b,c;
		
		float delta;
		
		float x1,x2;
		
        Scanner scan =new Scanner(System.in);
    
	     System.out.println("a degerini gir :");
	     
	     a = scan.nextInt();
	     
	     System.out.println("b degerini gir :");
		
		b = scan.nextInt();
				
	     System.out.println("c degerini gir :");
		
	     c= scan.nextInt();
	     
	     delta = b*b-(4*a*c);
	     
	     System.out.println("delta = " + delta);
	
	     if(delta>0) {
	    	 x1 = (float) (-b +Math.sqrt(delta)/(2*a));
	    	 x2 = (float) (-b -Math.sqrt(delta)/(2*a));
	    			 
	    	 System.out.println("x1 =" + x1);
	    	 System.out.println("x2 =" + x2);
	    	 
	     }	 else if(delta==0) {
	    		 
	    		x1 = -b/(2*a);
	    				
	    			System.out.println("Cakisik 2 Kok varmis bunda, o da  " + x1);
	     }
	    			
	    			else if(delta<0) {
	    				System.out.println("Kok Yoktur");
	    	 }
}
	    		 
	}
		

