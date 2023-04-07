import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {		// TODO Auto-generated method stub

		System.out.println("Hello!");
		System.out.println("Hello World...");
		Map map = new Map();
		map.addCountry("Russia");
		map.addCountry("Lithuania");
		
		//
		Song lobster = new Song("lobster", "family guy", "greatest hits");
		lobster.SimpleAudioPlayer();
		//
		
		map.display();
		//while( true){
			//map.updateDisplay();
		//}
	}
//
	//test
	
	
}
