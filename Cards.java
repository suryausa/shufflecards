package executors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cards {

	public void createdeck() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Please enter 1 to  generate new deck and 2 to exit ");
		String str = br.readLine();

		String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		List<String> card = new ArrayList<String>();
		for (int i = 0; i < suits.length; i++) {
			for (int k = 0; k < ranks.length; k++) {
				card.add(suits[i] + "/" + ranks[k]);
			}
		}

		Collections.shuffle(card);
		System.out.println(card);
		System.out.println(str);

		if (str.equals("1")) {
			Cards c = new Cards();
			c.createdeck();
		}

	}

	public static void main(String[] args) throws IOException {
		Cards c = new Cards();
		c.createdeck();
	}

}
