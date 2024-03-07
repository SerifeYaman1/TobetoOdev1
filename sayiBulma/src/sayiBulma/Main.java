package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int [] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi=false;
		
		 for(int i=0;i<sayilar.length;i++) {
			 if(i==aranacak) {
				 varMi=true;
				 break;
			 }
		 }
		 
		 if(varMi) {
			 System.out.println("Sayı mevcuttur. Aranan Sayı : " + aranacak);
		 }else {
			 System.out.println("Sayı mevcut değildir.");
		 }
	}
}
