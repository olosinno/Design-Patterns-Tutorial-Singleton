package dp.singleton;
import java.util.LinkedList;
public class ScrabbleTest {
	public static void main(String[] args) {
		Singleton newInstance = Singleton.getInstance();
		System.out.print("Instance 1 ID: " + System.identityHashCode(newInstance)); // allows us to track between different or same objects
		System.out.println(newInstance.getLetterList());
		LinkedList<String> player1Tiles = newInstance.getTiles(7);
		System.out.print("Player 1: " + player1Tiles);
		System.out.println(newInstance.getLetterList());
		Singleton instanceTwo = Singleton.getInstance();
		System.out.print("Instance 2 ID: " + System.identityHashCode(instanceTwo)); // allows us to track between different or same objects
		System.out.println(instanceTwo.getLetterList());
		LinkedList<String> player2Tiles = newInstance.getTiles(7);
		System.out.print("Player 2: " + player2Tiles);
	}
}
