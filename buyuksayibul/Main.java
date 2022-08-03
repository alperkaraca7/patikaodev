package buyuksayibul;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. sayıyı giriniz");
		int s1 = scanner.nextInt();
		
		System.out.println("2. sayıyı giriniz");
		int s2 = scanner.nextInt();
		
		System.out.println("3. sayıyı giriniz");
		int s3 = scanner.nextInt();
		
		
		if (s1 >s2 && s1 >s3 ) {
			if (s2<s1 && s2>s3) {
				
				System.out.println("büyükten küçüğe sayların sıralanışı"+" " +s1+ " "+s2+" "+s3);
				
			}
			else if (s3>s2 && s2<s3) {
				System.out.println("büyükten küçüğe sayların sıralanışı"+" " +s1+ " "+s3+" "+s2);
				
			}
			
		}
		
		if (s2 >s1 && s2 >s3 ) {
			if (s1<s2 && s1>s3) {
				
				System.out.println("büyükten küçüğe sayların sıralanışı"+" " +s2+ " "+s1+" "+s3);
				
			}
			else if (s3>s1 && s1<s3) {
				System.out.println("büyükten küçüğe sayların sıralanışı"+" " +s2+ " "+s3+" "+s1);
				
			}
			
		}
		
		if (s3 >s2 && s3 >s1 ) {
			if (s2<s3 && s2>s1) {
				
				System.out.println("büyükten küçüğe sayların sıralanışı"+" " +s3+ " "+s2+" "+s1);
				
			}
			else if (s1>s2 && s2<s1) {
				System.out.println("büyükten küçüğe sayların sıralanışı"+" " +s3+ " "+s3+" "+s2);
				
			}
			
		}
		
	

	}

}
