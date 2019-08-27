package dp.singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Singleton {
	private static Singleton firstInstance = null; // static because these objects will almost always need to be available on a global basis

	String[] letters = {"a", "a", "a", "a", "a", "a", "a", "a", "a", "b", "b", "c", "c", "d", "d", "d", "d", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "e", "f", "f", "g", "g", "g", "h", "h", "i", "i", "i", "i", "i", "i", "i", "i", "i", "j", "k", "l", "l", "l", "l", "m", "m", "n", "n", "n", "n", "n", "n", "o", "o", "o", "o", "o", "o", "o", "o", "p", "p", "q", "r", "r", "r", "r", "r", "r", "s", "s", "s", "s", "t", "t", "t", "t", "t", "t", "u", "u", "u", "u", "v", "v", "w", "w", "x", "y", "y", "z", null, null};
	
	private LinkedList<String> letterList = new LinkedList<String> (Arrays.asList(letters));
	
	static boolean firstThread = true;
	
	private Singleton() {}
// We could make getInstance a synchronized method to force every thread to wait its turn. That way only one thread can access a method at a time. This can really slow everything down though public static synchronized Singleton getInstance()
	public static Singleton getInstance() {
		if(firstInstance == null)
			if(firstThread) {
				firstThread = false;
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
		synchronized(Singleton.class) {
			if(firstInstance == null) {
				firstInstance = new Singleton();
				Collections.shuffle(firstInstance.letterList); // randomizes letter List
			}
		}
		return firstInstance;
		}
	
	public LinkedList<String> getLetterList() {return firstInstance.letterList;}
	public LinkedList<String> getTiles(int tileNumber) {
		LinkedList<String> tilesToSend = new LinkedList<String>();
		for(int i = 0; i <= tileNumber; i++) tilesToSend.add(firstInstance.letterList.remove(0));
		return tilesToSend;
	}
}
