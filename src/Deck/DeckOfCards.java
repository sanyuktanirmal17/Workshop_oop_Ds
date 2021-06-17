package Deck;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DeckOfCards {

	private String[] suits = new String[] { "Clubs", "Diamonds", "Hearts", "Spades" };
	private String[] rank = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",	"Ace" };
	String[] card = new String[52];
	int start = 0, end = 12, j1 = 0;

	/**
	 * for combination of Suits and Ranks.
	 *  Created HashSet to check if all cards are unique.
	 * 
	 * @return string array deck of cards if all cards are unique
	 */
	private String[] Deck() {
		for (int i = 0; i < 4; i++) {
			for (int j = start; j <= end; j++) {
				card[j] = suits[i] + " " + rank[j1];

			}
			j1 = 0;
			start = end + 1;
			end += 13;
			Set<String> checkSet = new HashSet<String>(Arrays.asList(card));

			if (checkSet.size() == card.length) {
				return card;
			} else {
				return null;
			}
		}

		/**
		 * code for shuffle all the cards
		 * 
		 */
		Utility.shuffleCards(card);

		/**
		 * printing cards for 4 player distributed is done to receive
		 *  all 9 cards for each
		 */

		int j2 = 0;
		for (int i = 0; i < 4; i++) {
			System.out.print(" Player " + i + ": \n");
			for (int j = 0; j < 9; j++) {

				System.out.print(card[j2] + "== \n");
				j2++;
			}
			System.out.println(card);
		}
		return card; 

	}

	public static void main(String[] args) {
		DeckOfCards card = new DeckOfCards();
		card.Deck();
	}
}
