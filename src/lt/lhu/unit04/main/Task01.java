package lt.lhu.unit04.main;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		int NOD, NOK;
		
		a = inputIntFromConsole("Please enter the A: ");
		b = inputIntFromConsole("Please enter the B: ");
		
		NOD = naibolshee(a, b);
		NOK = naimenshee(a, b);
		
		printNOD(a, b, NOD);
		printNOK(a, b, NOK);
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
		
	public static int naibolshee(int a, int b) {
		int NOD = 1;
		for (int i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				NOD = i;
			}
		}
		return NOD;
	}
	
	public static int naimenshee(int a, int b) {
		int NOK;
		
		NOK = (a * b) / naibolshee(a, b);
		
		return NOK;
	}
	
	public static void printNOD(int a, int b, int NOD) {
		System.out.println(" NOD " + a + " and " + b + " is " + NOD);
	}
	
	public static void printNOK(int a, int b, int NOK) {
		System.out.println(" NOK " + a + " and " + b + " is " + NOK);
	}
}
