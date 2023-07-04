package Currency;

public class Notes {

	public void noteCount(int[] currency, int amountToExchange) {
		
		int notes[] = new int[currency.length];
		
		int sumOfNotes = 0;
		
		for (int i = 0; i < currency.length; i++) {
			notes[i] = amountToExchange / currency[i];
			
			amountToExchange %= currency[i];
			
			sumOfNotes += notes[i];
			
		} 
		
		for (int i = 0; i < notes.length; i++) {
			
			if (notes[i] != 0) {
			System.out.println(notes[i] + "x" + currency[i]);	
			
			}
		}
		
		System.out.println("Total number of notes are:" + sumOfNotes);
	
   }


}
