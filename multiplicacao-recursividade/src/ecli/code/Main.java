package ecli.code;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("DIGITE O PRIMEIRO VALOR A SER MULTIPLICADO:");
		int x = scan.nextInt();
		
		System.out.println("DIGITE O SEGUNDO VALOR A SER MULTIPLICADO:");
		int y = scan.nextInt();
		
		System.out.println(x + " x " + y + " = " + multiplicacao(x, y));
	}
	
	public static int multiplicacao(int x, int y) {
		if(x == 1) {
			return y;
		} else {
			return y + multiplicacao(y,x - 1);
		}
	}
}
