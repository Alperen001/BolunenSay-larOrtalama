import java.util.Scanner;

public class CiftSayilar {

	public static void main(String[] args) {
		int gsayi,que=0,toplam=0;
		
		double sonuc1;
		Scanner inp = new Scanner(System.in);
		System.out.println("Lütfen Sayý Giriniz: ");
		gsayi = inp.nextInt();
		
		for (int i = 1; i <= gsayi; i++) {
			if (i%3==0 && i%4==0) {
				toplam=toplam+i;
				que++;
				System.out.println("3 ve 4'e bölünen sayýlar: "+ i);
			}
			
		}
		sonuc1=toplam/que;
		System.out.println("3 ve 4'e tam bölünen sayýlarýn ortalamasý: " + sonuc1 );

		

		
	}

}
