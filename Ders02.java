package x;

import java.util.Scanner;

public class Ders02 {

	public static void main(String[] args) {
	
        Scanner scan = new Scanner(System.in);
		
		float a,b;
		
		System.out.println("float sayi gir bro ");
		
		a= scan.nextFloat();
		
		System.out.println("bi float sayi  daha gir simdi ");
		
		b = scan.nextFloat();
		
		System.out.println("bak simdi bunlarin toplami ");
		
		System.out.println(a+b);
		
		System.out.println("nasi bildim ama  ");
		
		int c;
		System.out.println("bi sayi daha gir  ");
		c = scan.nextInt();
		
		System.out.println("bak simdi bunun karesini alcam hoobb ");
		System.out.println(c*c);
		
		String isim;
		System.out.println("ismini girer misin lutfen ");
		
		isim = scan.next();
		
		System.out.println("merhabalar " + isim + " bugun nasilsin? ");
		
		
		
		
	
	
		

		
		
		
		
	}

}
