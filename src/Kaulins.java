import java.util.Random;
import java.util.Scanner;

public class Kaulins {
	static void mestKaulinu(int reizes) {
		int skaitlis, lielakais =0;
		Random rand = new Random();
		for(int i=1; i<=reizes; i++) {
			skaitlis = rand.nextInt(6)+1;	
			System.out.println("Uzkrita skaitlis "+skaitlis);
			
			if(lielakais<skaitlis) {
				lielakais =skaitlis;
			}
		}
		System.out.println("Lielakais skaitlis no metieniem bija "+lielakais);

	}
	
	public static void main(String[] args) {
		int reizes;
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kauliņu?");
		reizes = scan.nextInt();
		do {
		mestKaulinu(reizes);
		}while(reizes<1);
		scan.close();
	}
}
