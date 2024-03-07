package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	public static void sayiBulmaca() {
		int [] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMi=false;
		
		 for(int i=0;i<sayilar.length;i++) {
			 if(i==aranacak) {
				 varMi=true;
				 break;
			 }
		 }
		 String mesaj ="";
			if(varMi) {
				mesaj="Sayı mevcuttur. Aranan Sayı : " + aranacak;	
				mesajVer(mesaj);
			}else {
				mesajVer("Sayı mevcut değildir.");
			}
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
	
}
