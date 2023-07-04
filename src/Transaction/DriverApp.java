package Transaction;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of transactional days:");
		int nod=sc.nextInt();
		
		int earnings[] = new int[nod];  //Dynamic Array
		System.out.println("Enter the transactions for " + nod  + " days");
		
		for (int i = 0; i < earnings.length; i++) {
			earnings[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(earnings));
		
		System.out.println("Enter the number of targets:");
		int targets = sc.nextInt();
		
		Target tc = new Target();
		tc.targetCheck(earnings,targets);
		
		
		
		

	}

}
