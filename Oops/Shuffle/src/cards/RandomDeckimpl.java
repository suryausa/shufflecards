package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cards.constants.CommonConstants;
import cards.interfaces.RandomDeck;

public class RandomDeckimpl implements RandomDeck {

	@Override
	public List<Card> decknew() {

		List<Card> card = new ArrayList<Card>();

		/**
		 * loop. Create an not shuffled deck of cards using Card constructer.and
		 * adding them to card list
		 */

		for (int i = 0; i < CommonConstants.suits.length; i++) {
			for (int k = 0; k < CommonConstants.ranks.length; k++) {
				card.add(new Card(CommonConstants.suits[i], CommonConstants.ranks[k]));
			}
		}

		/**
		 * Adding joker to the deck
		 */

		/**
		 * shuffle. shuffled deck of cards in cards list and updates it
		 */
		// Shuffle the cards
		Collections.shuffle(card);
		return card;

	}
}
