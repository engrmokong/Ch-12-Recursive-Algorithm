import java.util.*;

public class NumberGuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
	      System.out.println("Choose a number from 0 to 100.");
	      System.out.println("Answer with:");
	      System.out.println("   l (your num is lower)");
	      System.out.println("   h (your num is higher)");
	      System.out.println("   any other key (guess is right).");

	      guessNumber(0, 100, scnr);

	      return;
		
		

	}
	public static void guessNumber(int lowVal, int highVal, Scanner scnr) {
	      int midVal;            // Midpoint of low..high
	      char userAnswer;       // User response

	      midVal = (highVal + lowVal) / 2;

	      System.out.print("Is it " + midVal + "? (l/h/y): ");
	      userAnswer = scnr.next().charAt(0);

	      if ((userAnswer != 'l') && (userAnswer != 'h')) { // Base case:
	         System.out.println("Thank you!");              // Found number
	      }
	      else { // Recursive case: split into lower OR upper half
	         if (userAnswer == 'l') {                   // Guess in lower half
	            guessNumber(lowVal, midVal, scnr);      // Recursive call
	         }
	         else {                                     // Guess in upper half
	            guessNumber(midVal + 1, highVal, scnr); // Recursive call
	         }
	      }
	      return;
	   }


}
