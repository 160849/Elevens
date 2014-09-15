/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

	private String suit;//The suit of the card
	private String rank;//The rank of the card as a string
	private int pointValue;//How many points the card is worth

	public Card(String cardRank, String cardSuit, int cardPointValue) {
		rank = cardRank;
		suit = cardSuit;
		pointValue = cardPointValue;
	}

	public String getsuit() {
		return suit;//Accesses the Card's suit and returns the Card's suit	
   }

	public String getrank() {//Accesses the Card's rank
		return rank;
	}

	public int getpointValue() {//Accesses the Card's point value
		return pointValue;
	}

	public boolean matches(Card otherCard) {//Compares this card to another, if suit, rank and point value are the same returns true
		if (this.suit.equals(otherCard.suit))
		{
			if (this.rank.equals(otherCard.rank)){
				if (this.pointValue == otherCard.pointValue){
					System.out.println("True");
					return true;
				}
			}
		}
		System.out.println("False");
		return false;
		
	}

	public String toString() {//print the card as a string
		return rank + " of " + suit + "\nPoint Value = " + (pointValue);
		
	}
}
