package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import cards.interfaces.RandomDeck;

public class RandomDeckimpl implements RandomDeck {

	private enum Rank {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
	};

	private enum Suite {
		CLUBS, DIAMONDS, HEARTS, SPADES
	};

	@Override
	public List<Card> decknew() {

		List<Card> card = new ArrayList<Card>();
		
		/**
	      * loop.  Create an not shuffled deck of cards using Card constructer.and adding them to card list
	      */
		for (Rank rank : Rank.values()) {
			for (Suite suite : Suite.values()) {
				card.add(new Card( suite.toString(),rank.toString()));
			}
		}
		

		/**
	      * Adding joker to the deck 
	      */
		card.add(new Card("JOKER", "JOKER"));
		card.add(new Card("JOKER", "JOKER"));
		card.add(new Card("JOKER", "JOKER"));
		card.add(new Card("JOKER", "JOKER"));

		/**
	      * shuffle. shuffled deck of cards in  cards list and updates it 
	      */
		// Shuffle the cards
		Collections.shuffle(card);
		return card;

	}
}
