package lt.lhu.unit04.main;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		double sum;
		
		a = inputDoubleFromConsole("Please enter the A: ");
		b = inputDoubleFromConsole("Please enter the B: ");
		c = inputDoubleFromConsole("Please enter the C: ");
		
		sum = biggestandsmallest(a, b, c);
		
		printsum(a, b, c, sum);
	}
	
	public static double inputDoubleFromConsole(String message) {
		double value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Error " + message);
		}
		value = sc.nextDouble();
		
		return value;
	}
	
	public static double biggestandsmallest(double a, double b, double c)  {
		double max;
        double min;
        
        if(a >= b) {
            if(b >= c) {
                max = a;
                min = c;
            }else{
                if(a >= c) {
                    max = a;
                }else{
                    max = c;
                }
                min = b;
            }
        }else {
            if(b >= c) {
                if(a >= c) {
                    min = c;
                }else {
                    min = a;
                }
                max = b;
            }else {
                max = c;
                min = a;
            }
        }
        double sum;
        
        sum = min + max;
        
        return sum;
	}
	
	public static void printsum(double a, double b, double c, double sum) {
		System.out.println(" Result is " + sum);
	}
}
