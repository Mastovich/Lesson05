package lt.lhu.unit04.main;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		int more;
		
		a = inputIntFromConsole("Please enter the A: ");
		b = inputIntFromConsole("Please enter the B: ");
		
		more = bolshe(a,b);
		
		printmore(a, b, more);
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
	
	public static int bolshe(int a, int b) {
		int res, more;
		
		res = a / 10;
		
		if (res >= b) {
			more = a;
		}else {
			more = b;
		}
		return more;
	}
	public static void printmore(int a, int b, int more) {
		System.out.println(" Bolshe cifr  v chisle " + more);
	}
}
