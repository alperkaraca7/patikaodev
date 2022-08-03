package etkinlikonermeprogrami;

import java.util.Scanner;

public class etkinlikoner {
	
	public static void main(String[] args) {
		
		
		/* Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
		Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
		Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
		Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner. */
		 
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("sıcaklık değerini giriniz :");
		int C = scanner.nextInt();
		
		if (C<5 && C>-10) System.out.println("tam kayak yapmalık bir hava kaçırma :)");
		
		else if (C>5 && C <15) System.out.println("sinemaya gitmeye ne dersin :)");
		
		else if (C >= 15 && C<25) System.out.println("bu havada güzel bir piknik yapmak iyi olurdu :) ");
		
		else if (C >= 25 && C<45) System.out.println("yüzmeye gidebilirsin bu sıcakta iyi gider :)");
		
		else {
			System.out.println("etkinlik için geçerli bir derece değil :( ");
		}
			
	
			
			
		
			
		
		
		
		
	}

}
