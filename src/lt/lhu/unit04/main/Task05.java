package lt.lhu.unit04.main;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		int NOD;
		
		a = inputIntFromConsole("Please enter the A: ");
		b = inputIntFromConsole("Please enter the B: ");
		c = inputIntFromConsole("Please enter the C: ");
		
		NOD = resultat(a, b, c);
		
		printres(a, b, c);
	}
	
	public static int inputIntFromConsole(String message) {
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Error " + message);
		}
		value = sc.nextInt();
		
		return value;
	}	
		
	public static int resultat(int a, int b, int c) {
		int NOD = 1;
		for (int i = 1; i <= a && i <= b && i <= c; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				NOD = i;
			}
		}
		return NOD;
	}
	public static void printres(int a, int b, int c) {
		if (resultat(a, b, c) == 1) {
			System.out.println("Chisla vzaimno prostyje");
		}else {
			System.out.println("Chisla ne vzaimno prostyje");		
		}
	}
}



