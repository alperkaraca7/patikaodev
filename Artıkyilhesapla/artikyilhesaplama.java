package Artıkyilhesapla;

import java.util.Scanner;



public class artikyilhesaplama {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("yıl giriniz :");
		int yil = scanner.nextInt();
		
		
		if (yil %100 ==0) {
			if (yil % 400 ==0) {
				System.out.println(yil+"bir artık yıldır");
			}
			else {
				System.out.println(yil+" artık yıl değildir");
			}
			
			
		}
		else if (yil%4==0) {
			
			System.out.println(yil+"artık yıldır");
			
		}
		else {
			System.out.println(yil+"bir artık yıl değildir");
		}

	}

}
