package cards;

public class Card {

	/**
	 * The suit cannot be changed after the card is constructed.
	 */
	private final String suits;
	/**
	 * The ranks cannot be changed after the card is constructed.
	 */
	private final String ranks;
	/**
	 * constructer to create new object with  setting values .
	 */
	public Card(String suits, String ranks) {
		this.suits = suits;
		this.ranks = ranks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ranks == null) ? 0 : ranks.hashCode());
		result = prime * result + ((suits == null) ? 0 : suits.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (ranks == null) {
			if (other.ranks != null)
				return false;
		} else if (!ranks.equals(other.ranks))
			return false;
		if (suits == null) {
			if (other.suits != null)
				return false;
		} else if (!suits.equals(other.suits))
			return false;
		return true;
	}

	public String getSuits() {
		return suits;
	}

	public String getRanks() {
		return ranks;
	}

}
