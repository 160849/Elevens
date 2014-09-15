/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] rankArray = {"Ace", "Jack", "King", "Queen"};
		String[] SuitArray = {"Spades", "Diamonds", "Clubs", "Hearts"};
		Integer[] pointArray = {1, 2, 3, 4};
		Deck Bicycle = new Deck(rankArray, SuitArray, pointArray);
		System.out.println(Bicycle.toString());
		}
}
