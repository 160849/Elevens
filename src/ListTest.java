
public class ListTest {

	public static void main(String[] args) {
		String[] rankArray = {"Ace", "Jack"};
		String[] SuitArray = {"Spades", "Diamonds", "Fun"};
		Integer[] pointArray = {1, 2};
		Deck Bicycle = new Deck(rankArray, SuitArray, pointArray);
		Bicycle.shuffle();
		System.out.println(Bicycle.deal());
		System.out.println(Bicycle.Decksize());
		System.out.println(Bicycle.toString());

	}

}
