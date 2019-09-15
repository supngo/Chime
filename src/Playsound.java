import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Playsound {

	public static void main(String[] args) {
		Playsound playsound = new Playsound();
		String time = new SimpleDateFormat("ha").format(new Date()).toLowerCase(); 
		playsound.play("chimes/chime.wav");
		playsound.play("chimes/"+time+".wav");
	}
	
	private void play(String sound){
		String os = System.getProperty("os.name");
		if(os !=null && os.equalsIgnoreCase("Linux")){
			try{
				String command = "aplay "+sound;
				Process proc = Runtime.getRuntime().exec(command);
				proc.waitFor();
			}
			catch (IOException | InterruptedException e){
				e.printStackTrace();
			}
		}
		else{
			try{
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(new File(sound)));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}