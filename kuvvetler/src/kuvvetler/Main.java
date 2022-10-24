package kuvvetler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int kuvvetBes=5,kuvvetDort=4,deger;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Deðer giriniz: ");
		deger=scan.nextInt();
		
		while(kuvvetBes<deger) {
			System.out.println("5'in kuvveti: "+kuvvetBes);
			kuvvetBes*=5;
		}
		
		while(kuvvetDort<deger) {
			System.out.println("4'ün Kuvveti: "+kuvvetDort);
			kuvvetDort*=4;
		}
	}

}
