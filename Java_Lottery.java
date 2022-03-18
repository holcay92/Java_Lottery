import java.util.Scanner;

import java.util.Collections;

import java.util.ArrayList;
public class MilliPiyango {
	public static void main(String[] args) {
		int GameCode;
		System.out.print("HOSGELDINIZ...\n\n");		
		do {			
		System.out.print("\t\t\tLUTFEN OYNAMAK ISTEDIGINIZ OYUNUN NUMARASINI GIRINIZ...\n\n");
		System.out.println("\t\t\t--0----------CIKIS:\n \t\t\t--1---SAYISAL LOTO:\n \t\t\t--2---- SUPER LOTO:\n\n \t\t\tNUMARA: ");			
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		GameCode = input.nextInt();
			switch( GameCode ) {
				case 1:		
					sayisalLoto();break;
				case 2:
					superLoto();break;
				case 0:{
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nPROGRAM SONLANDIRILDI...");
					System.exit(0);
				}	
			}	
		}
		while(N!=0);
	}
	public static void sayisalLoto() {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0 ; i < 90 ; i++) {
			list.add(i,i+1);
		}	
			Collections.shuffle (list); 
			System.out.println ("SANSLI NUMARALARINIZ..."+"\n"); 
			System.out.print("- ");
			for (int k = 0 ; k < 6 ; k ++) { 
				
			System.out.print ( list.get (k)+" - " );
	
			}System.out.println();
			System.out.println();						
	}
		public static void superLoto() {
			ArrayList<Integer> list = new ArrayList<>();
			for(int i = 0 ; i < 60 ; i++) {
				list.add(i,i+1);
			}	
				Collections.shuffle (list); 
				System.out.println ("SANSLI NUMARALARINIZ..."+"\n"); 
				System.out.print("- ");
				for (int k = 0 ; k < 6 ; k ++) { 
				System.out.print (list.get (k) +" - "  );		
				}
				System.out.println();
				System.out.println();						
		}		
}
