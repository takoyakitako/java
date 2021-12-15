package week12;

public class SimplePairTest {

	public static void main(String[] args) {
		SimplePair<String> pair = new SimplePair<String>("apple", "tomato");
		System.out.println(pair.getFirst());
		System.out.println(pair.getSecond());
		
		SimplePair<String> ipair = new SimplePair<Integer>(1,2);
		System.out.println(ipair.getFirst());
		System.out.println(ipair.getSecond());
		
		SimplePair<String> dpair = new SimplePair<Double>(1.0,2.0);
		System.out.println(dpair.getFirst());
		System.out.println(dpair.getSecond());
	}
}