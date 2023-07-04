package Currency;

import java.util.Arrays;
import java.util.Scanner;

public class DriverApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of notes in your country");
		int numOfNotes = sc.nextInt();
		
		int[] currency = new int[numOfNotes];
		System.out.println("Please enter the" + numOfNotes + "Denominations");
		for(int i = 0; i < currency.length; i++) {
			currency[i] = sc.nextInt();
			
		}
		
		System.out.println("Before Sorting:" + Arrays.toString(currency));
		
		SelectionSort ss = new SelectionSort();
		ss.mySort(currency);
		
		System.out.println("After Sorting:" + Arrays.toString(currency));
		
		System.out.println("Enter the amount to exchange:");
		
		int amountToExchange = sc.nextInt();
		
		Notes note = new Notes();
		
		note.noteCount(currency, amountToExchange);

	}

}
