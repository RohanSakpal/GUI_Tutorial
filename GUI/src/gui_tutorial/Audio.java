/*
p * 1 step : download mp3 song convert to wav format
 * 2 step : copy and paste in project
 */

package gui_tutorial;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Audio {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		Scanner sc = new Scanner(System.in);
		
		File file = new File("Prism - Bobby Richards.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		String response = "";
		while(!response.equals("Q")) {
			System.out.println("P = play , S = stop, R = reset, Q = quit");
			System.out.println("Enter your choice");
			response = sc.next();
			response = response.toUpperCase();
			
			if(response.equals("P")) {
				clip.start();
			} 
			else if(response.equals("S")) {
				clip.stop();
			}
			else if(response.equals("R")) {
				clip.setMicrosecondPosition(0);
			} 
			else if(response.equals("Q")) {
				clip.close();
				System.out.println("Thank you for using! \n bye bye.");
			} 
			else {
				System.out.println("not valid key");
			}
		}
			
		clip.start();
	}

}
