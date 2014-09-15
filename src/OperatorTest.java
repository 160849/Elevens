
public class OperatorTest {
	public static int k;
	
	
	
	private static boolean fun(){
		return k != 3;
	}
	public static void main(String[] args) {
		k = 2;
		System.out.println(fun());
		
		}
}