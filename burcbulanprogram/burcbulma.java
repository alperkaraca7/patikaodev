package burcbulanprogram;

import java.util.Scanner;

public class burcbulma {

	public static void main(String[] args) {
		
		/*
		 * Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("doğduğunuz ay :");
		int ay =scanner.nextInt();
		
		System.out.println("doğduğunuz gün :");
		int gün =scanner.nextInt();
		
		if (ay==1) {
			if (gün<22) {
				System.out.println("oğlak burcusunuz ");
			}
			else {
				System.out.println("kova burcusunuz");}
		
		}
		else if (ay==2) {
			if (gün<20) {
				System.out.println("kova burcusunuz");
		}	else {
			System.out.println("balık burcusunuz");
			
		}
			
		}
		else if (ay==3) {
			if (gün<21) {
				System.out.println("balık burcusunuz");
		}	else {
			System.out.println("koç burcusunuz");
			
		}
			
		}
		else if (ay==4) {
			if (gün<21) {
				System.out.println("koç burcusunuz");
		}	else {
			System.out.println("boğa burcusunuz");
			
		}
			
		}
		else if (ay==5) {
			if (gün<22) {
				System.out.println("boğa burcusunuz");
		}	else {
			System.out.println("ikizler burcusunuz");
			
		}
			
		}
		else if (ay==6) {
			if (gün<23) {
				System.out.println("ikizler burcusunuz");
		}	else {
			System.out.println("yengeç  burcusunuz");
			
		}
			
		}
		else if (ay==7) {
			if (gün<23) {
				System.out.println("yengeç burcusunuz");
		}	else {
			System.out.println("aslan  burcusunuz");
			
		}
			
		}
		else if (ay==8) {
			if (gün<23) {
				System.out.println("aslan  burcusunuz");
		}	else {
			System.out.println("başak burcusunuz");
			
		}
			
		}
		else if (ay==9) {
			if (gün<23) {
				System.out.println("başak burcusunuz");
		}	else {
			System.out.println("terazi  burcusunuz");
			
		}
			
		}
		
		else if (ay==10) {
			if (gün<23) {
				System.out.println("terazi burcusunuz");
		}	else {
			System.out.println("akrep  burcusunuz");
			
		}
			
		}
		else if (ay==11) {
			if (gün<23) {
				System.out.println("akrep burcusunuz");
		}	else {
			System.out.println("yay  burcusunuz");
			
		}
			
		}
		else if (ay==12) {
			if (gün<22) {
				System.out.println("yay burcusunuz");
		}	else {
			System.out.println("oğlak  burcusunuz");
			
		}
			
		}
		
		
	
		
		
		
	}
}