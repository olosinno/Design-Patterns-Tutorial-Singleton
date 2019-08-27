package dp.singleton;

public class ScrabbleThreads {
	public static void main(String[] args) {
		Runnable getTiles = new GetTheTiles();
		Runnable getTilesAgain = new GetTheTiles();
		
		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
	}
}
