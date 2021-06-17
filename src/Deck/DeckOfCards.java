package Deck;

public class DeckOfCards {
	
	   
	      private static String[] SUITS= new  String[]  {
	            "Clubs", "Diamonds", "Hearts", "Spades"
	        };
	      private static String[] RANKS = new String[] {
	            "2", "3", "4", "5", "6", "7", "8", "9", "10",
	            "Jack", "Queen", "King", "Ace"
	        };
//	      private static String[] = new String[52];
	      public static void main(String[] args) {
	        // initialize deck
//	      private void SuitDeck() {
	    	  int n = SUITS.length * RANKS.length;	 
		        String[] deck = new String[n];
	        for (int i = 0; i < RANKS.length; i++) {
	            for (int j = 0; j < SUITS.length; j++) {
	            	
	               deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
	            }
	        }

	       
	        // shuffle
	        for (int i = 0; i < n; i++) {
	            int r = i + (int) (Math.random() * (n-i));
	            String temp = deck[r];
	            deck[r] = deck[i];
	            deck[i] = temp;
	        }
	      
	      
	        	
	        // print shuffled deck
	        for (int i = 0; i < n; i++) {
	            System.out.println(deck[i]);
	        }
	    }

	}
	
	

