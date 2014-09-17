/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rankArray = {"Ace", "Jack", "King", "Queen", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two"};
		String[] SuitArray = {"Spades", "Diamonds", "Clubs", "Hearts"};
		Integer[] pointArray = {13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		Deck Bicycle = new Deck(rankArray, SuitArray, pointArray);
		System.out.println(Bicycle.toString());
		}
}
