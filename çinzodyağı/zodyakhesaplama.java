package çinzodyağı;

import java.util.Scanner;

public class zodyakhesaplama {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		System.out.print("doğum yılınızı giriniz : ");
		int dogumyili = scanner.nextInt();
		
		int zodyak = dogumyili %12 ;
		
		if (zodyak ==0 ) {
			System.out.println("çin zodyağına göre burcunuz : maymun");
			
		}
		else if (zodyak==1) {
			System.out.println("çin zodyağına göre burcunuz : horoz");
		}
		else if (zodyak==2) {
			System.out.println("çin zodyağına göre burcunuz : köpek");
		}
		else if (zodyak==3) {
			System.out.println("çin zodyağına göre burcunuz : domuz");
		}
		else if (zodyak==4) {
			System.out.println("çin zodyağına göre burcunuz : fare");
		}
		else if (zodyak==5) {
			System.out.println("çin zodyağına göre burcunuz : öküz");
		}
		else if (zodyak==6) {
			System.out.println("çin zodyağına göre burcunuz : kaplan");
		}
		else if (zodyak==7) {
			System.out.println("çin zodyağına göre burcunuz : tavşan");
		}
		else if (zodyak==8) {
			System.out.println("çin zodyağına göre burcunuz : ejderha");
		}
		else if (zodyak==9) {
			System.out.println("çin zodyağına göre burcunuz : yılan");
		}
		else if (zodyak==10) {
			System.out.println("çin zodyağına göre burcunuz : at");
		}
		else if (zodyak==11) {
			System.out.println("çin zodyağına göre burcunuz : koyun");
		}
		else {
			System.out.println("hatalı numara");
		}
	}
	

	}


