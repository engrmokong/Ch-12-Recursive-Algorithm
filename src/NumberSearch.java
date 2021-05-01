import java.util.*;
public class NumberSearch {

	public static void findNumber(int number, int lowVal, int highVal) {
	      int midVal;

	    /*  midVal = (highVal + lowVal) / 2;
	      System.out.print(number);
	      System.out.print(" ");
	      System.out.print(midVal);

	      if (number == midVal) {
	         System.out.println(" k");
	      }
	      else {
	         if (number < midVal) {
	            System.out.println(" l");
	            findNumber(number, lowVal, midVal);
	         }
	         else {
	            System.out.println(" m");
	            findNumber(number, midVal + 1, highVal);
	         }
	      }
	      */
	     
	      /* midVal = (highVal + lowVal) / 2;
	      System.out.print(number);
	      System.out.print(" ");
	      System.out.print(midVal);

	      if (number == midVal) {
	         System.out.println(" j");
	      }
	      else {
	         if (number < midVal) {
	            System.out.println(" k");
	            findNumber(number, lowVal, midVal);
	         }
	         else {
	            System.out.println(" l");
	            findNumber(number, midVal + 1, highVal);
	         }
	      }
	      */
	      
	      midVal = (highVal + lowVal) / 2;
	      System.out.print(number);
	      System.out.print(" ");
	      System.out.print(midVal);

	      if (number == midVal) {
	         System.out.println(" b");
	      }
	      else {
	         if (number < midVal) {
	            System.out.println(" c");
	            findNumber(number, lowVal, midVal);
	         }
	         else {
	            System.out.println(" d");
	            findNumber(number, midVal + 1, highVal);
	         }
	      }
	   }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
	      int number;
	      
	      System.out.print("Enter a number: ");
	      
	      number = scnr.nextInt();
	      findNumber(number, 0, 8);
	   }

}


