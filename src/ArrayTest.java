import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayTest {
	public static void main(String[] args){
		String[] suitArray = {"Spades", "Diamonds"};
		String[] rankArray = {"Ace", "Jack"};
		int[] pointArray = {1, 2};
		List<String> suitArrays = Arrays.asList(suitArray);
		ArrayList<String> a = new ArrayList(suitArrays);
		for (int i = 0; i < a.size(); i++){
			String item = a.get(i);
			Card card = new Card(item, "Diamonds", 5);
			System.out.println(card.toString());
		/*ArrayList<Object> b = new ArrayList<Object>();
		ArrayList<Object> ab = new ArrayList<Object>();
		a.add(suitArray);
		b.add(rankArray);
		ab.add(pointArray);
		
		*/
		}
	}
}

