import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

	private List<Card> cards;
	private int size;
	
	public Deck(String[] ranks, String[] suits, Integer[] values) {
		ArrayList<String> suit = new ArrayList<String>(Arrays.asList(suits));
		ArrayList<String> rank = new ArrayList<String>(Arrays.asList(ranks));
		ArrayList<Integer> point = new ArrayList<Integer>(Arrays.asList(values));
		cards = new ArrayList<Card>();
		for (int i = 0; i < rank.size(); i++){
			String arrayrank = rank.get(i);
			String arraysuit = suit.get(i);
			Integer arrayvalue = point.get(i);
			Card card = new Card(arrayrank, arraysuit, arrayvalue);
			cards.add(card);
			size = cards.size();
		}
	}
	
	public boolean isEmpty() {
		if (size < 1){
			return true;
		}
		return false;
	}

	/**
	 * Accesses the number of undealt cards in this deck.
	 * @return the number of undealt cards in this deck.
	 */

	
	public int Decksize(){
		return size;
	}
	/**
	 * Randomly permute the given collection of cards
	 * and reset the size to represent the entire deck.
	 */
	public void shuffle() {
		size = cards.size();
		java.util.Collections.shuffle(cards);
	}

	/**
	 * Deals a card from this deck.
	 * @return the card just dealt, or null if all the cards have been
	 *         previously dealt.
	 */
	public Card deal() {
		if (size > 0){
			Card fun = cards.get(size - 1);
			size --;
			return fun;
		}
		System.out.println("There are no more cards to deal");
			return null;
			
		
	}

	/**
	 * Generates and returns a string representation of this deck.
	 * @return a string representation of this deck.
	 */
	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards.get(k);
			if (k != 0) {
				rtn = rtn + ",\n";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.size() - 1; k >= size; k--) {
			rtn = rtn + cards.get(k);
			if (k != size) {
				rtn = rtn + ", \n";
			}
			if ((k - cards.size()) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
