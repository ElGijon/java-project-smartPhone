package smartphone;

import smartphone.tools.MediaPlayer;
import smartphone.tools.Telephone;
import smartphone.tools.WebBrowser;

public class SmartPhone implements MediaPlayer, Telephone, WebBrowser {

	public void viewPage() {
		System.out.println("Viewing a web page");
		
	}

	public void addNewTab() {
		System.out.println("Adding a new browser tab");
		
	}

	public void refreshPage() {
		System.out.println("Refreshing the web page");
		
	}

	public void call() {
		System.out.println("Connecting a phone call (Calling...)");
		
	}

	public void answerCall() {
		System.out.println("Answering a phone call");
		
	}

	public void hearVoiceMail() {
		System.out.println("Listening to the voice mail");
		
	}

	public void play() {
		System.out.println("Playing Media");
		
	}	

	public void pause() {
		System.out.println("Pausing Media");
		
	}

	public void selectMedia() {
		System.out.println("Selecting Media");
		
	}
	
	
	
}