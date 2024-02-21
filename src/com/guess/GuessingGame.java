package com.guess;
import java.util.*;

public class GuessingGame {
	

	public static void main(String[] args) {
   		Scanner sc=new Scanner(System.in);
		
	     int again=0;
	     do {
	    	 int randomNumber =(int) (Math.random() * 50) + 1;
		     int maximumChances = 4;
		     System.err.println("             ***Welcome to my Number Guessing Game***");
			 System.err.println("***You will have 4 attempts to get correct number between 1-50 digits***");

		     
	     for(int attempt=1;attempt<=maximumChances;attempt++) {
	    	 System.out.println();
	    	 System.out.print("Attempt "+attempt+")"+" Enter your Guess =");
	    	 int guess=sc.nextInt();
	    	 
	    	 if(guess>50) {
	    		 System.out.println("Please enter number between 1-50");
	    	 }else if(guess<randomNumber) {
	    		 System.out.println("Good try but higher");
	    	 }else if(guess>randomNumber) {
	    		 System.out.println("Good try but lower");
	    	 }else if(guess==randomNumber) {
	    		 System.err.println("          **Bravo**");
	    		 System.err.println("**You guessed the Correct number**");
	    		 System.err.println("");
	    		 
	    		 System.err.println("Do you want to play again Enter Yes-> 1 / No-> 0");
	    		 again=sc.nextInt();
	    		 if(again==0) {
	    			 System.out.println("THANKYOU FOR PLAYING THIS GAME");
	    			 break;
	    		 }
	    	 }else if(attempt==4 && guess!=randomNumber) {
	    		 System.out.println();
	    		 System.err.println("**You played well but your attempts are over**");
	    		 System.err.println("           ***THE NUMBER WAS "+randomNumber+"***");
	    		 System.err.println("           **GOOD LUCK NEXT TIME**");
	    		 System.out.println("");
	    		 System.out.println("Do you want to play again Enter Yes-> 1 / No-> 0");
	    		 again=sc.nextInt();
	    		 if(again==0) {
	    			 System.out.println("THANKYOU FOR PLAYING THIS GAME");
	    			 break;
	    		 }
	    	 }
	    	 
	     }
	     }while(again!=0);
	     sc.close();
	     
	}

}
