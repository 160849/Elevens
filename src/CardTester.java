
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card ace = new Card("Ace", "Spades", 1);
		Card jack = new Card("Jack", "Spades", 11);
		ace.matches(jack);
		System.out.println(ace.toString());
		System.out.println(jack.toString());
	}
	
}
