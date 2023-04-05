import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Kaulins {
	static void mestKaulinu(int reizes) {
		int skaitlis;
		Random rand = new Random();
		for(int i=1; i<=reizes; i++) {
			skaitlis = rand.nextInt(6)+1;	
			JOptionPane.showMessageDialog(null,"Uzkrita skaitlis "+skaitlis);
		}
	}
	
	public static void main(String[] args) {
		int reizes;
		Scanner scan = new Scanner(System.in);
		
		reizes = Integer.parseInt(JOptionPane.showInputDialog(null,"Cik reizes mest kauliņu?"));
		do {
		mestKaulinu(reizes);
		}while(reizes<1);
		scan.close();
	}
}
