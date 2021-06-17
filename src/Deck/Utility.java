package Deck;

/******************************************************************************
 * Purpose : Workshop 
 * @author Sanyukta Nirmal
 * @Version 1.0
 * @Since 17-06-2021
 *
 *******************************************************************************/

import java.util.Random;
import java.util.Scanner;

public class Utility {

	static Scanner scanner = new Scanner(System.in);

	/**
	 * shuffles the card of deck
	 * 
	 * @param arr array of cards
	 * @return returns shuffle array
	 * 
	 */
	public static String[] shuffleCards(String[] arr) {
		Random random = new Random();
		int a, b;
		String temp;
		for (int i = 0; i < 52; i++) {
			a = random.nextInt(51);
			b = random.nextInt(51);
			if (a != b) {
				temp = arr[a];
				arr[a] = arr[b];
				arr[b] = temp;
			}
		}
		return arr;

	}

}
