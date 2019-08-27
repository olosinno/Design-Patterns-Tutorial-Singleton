package dp.singleton;
import java.util.LinkedList;
public class GetTheTiles implements Runnable {
	public void run() {
		Singleton newInstance = Singleton.getInstance();
		System.out.print("Instance ID: " + System.identityHashCode(newInstance)); // allows us to track between different or same objects
		System.out.println(newInstance.getLetterList());
		LinkedList<String> player1Tiles = newInstance.getTiles(7);
		System.out.print("Player 1: " + player1Tiles);
		System.out.println("Got tiles!");
	}
}
