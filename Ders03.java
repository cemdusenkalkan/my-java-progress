package x;

import java.util.Scanner;

public class Ders03 {

	public static void main(String[] args) {
	// kullanıcıdan alınan string içerisinde kaç adet a karakteri olduğunu bulmak.
		
		Scanner scan = new Scanner(System.in);

		String karakterdizisi;
		
		System.out.println("bir yazı girer misiniz? ");
		
		karakterdizisi = scan.nextLine();
		
		int i,sayac,uzunluk;
		
		uzunluk = karakterdizisi.length();
		
		sayac = 0;
		
	 for(i=0;i<uzunluk;i++) {
		 
		 if(karakterdizisi.charAt(i)=='a') sayac++;
		 
	
		 
			 
			
		}
	 System.out.println("string ifadede " + sayac + "a harfi vardır.");
	 
			 
	}

}
