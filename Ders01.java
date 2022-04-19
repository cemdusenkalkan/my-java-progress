package x;

public class Ders01 {

	public static void main(String[] args) {
		// Açıklama satırlarını bu şekilde kullanıyorum, 2 tane slash atarak.
		/* Çok satırlı bir açıklama yapmak içinse
		 * bunu kullanıyorum.
		 */
        Byte bayt;
        Short kisa;
        
        int a,b,sonuc;
        // buyuk int yazmak sınıf olusturur (INT) kucuk harfle yazmaksa normal bi degisken olusturur
        
       a = 3;
       b = 5;
       
       sonuc = a * b;
       
        kisa = 80;
        bayt = 12;
        	
        System.out.println(bayt);
        System.out.println(kisa);
        System.out.println(sonuc);
        
        char harf;
        harf = 'a';
        
        /* Karakterlerde cift tırnak yerine tek tırnak kullanılır.
         * Stringlerde ise çift tırnak kullanılır.
         * karakter ve string arasındaki temel fark budur.
         * 
         */
        System.out.println(harf);
        
        String isim;
        isim = "CemDusenkalkan";
        System.out.println("naberlen " + isim);
        
        Boolean durum;
        durum = true;
        
        System.out.println(durum);
        
	}

}
