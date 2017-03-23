package mainrun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import cards.Card;
import cards.RandomDeckimpl;
import cards.interfaces.RandomDeck;

public class Run {

	/**
	 * Display(). displays all the cards in the deck one after the other and
	 * prints them
	 */
	private void Display() {

		RandomDeck randomDeck = new RandomDeckimpl();
		String str = "2";
		List<Card> randomdis = randomDeck.decknew();
		/**
		 * this for loop iterates all the cards in the list by using getter
		 * methods
		 */
		for (Card c : randomdis) {
			System.out.println(c.getSuits() + " / " + c.getRanks());
		}

		try {

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Please enter 1 to  generate new deck and 2 to exit ");
			str = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/**
		 * if condition will call the method by itself based on the input
		 * provided by
		 */
		if ("1".equals(str)) {
			Run mainrun = new Run();
			mainrun.Display();
		}
	}

	/**
	 * main. Program execution start from here
	 */
	public static void main(String[] args) {
		Run mainrun = new Run();

		mainrun.Display();

	}

}
