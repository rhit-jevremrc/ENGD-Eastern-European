import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javazoom.jl.player.Player;



public class Song {
	private String title;
	private String artist = "Uknown";
	private String album= "Uknown";
	private Double length = 0.0;
	private Integer releaseYear = 0;
	private String filePath;
	private Clip clip;
	private String status;
	
	
	
	
	public Song(String name) {
		this.filePath = name + ".WAV";
		this.title = name;
		
		
	}

	public Song(String name, String artist, String album) {
		this.filePath = name + ".WAV";
		this.title = name;
		this.album = album;
		this.artist = artist;
			
	}
	
	
	public String getTitle() {
		return this.title;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public String getAlbum() {
		return this.album;
	}
	
	public Double getLength() {
		return this.length;
	}
	
	public Integer getRelease() {
		return this.releaseYear;
	}
	
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setArtist(String person) {
		this.artist = person;
	}
	
	public void setAlbum(String disc) {
		this.album = disc;
	}
	
	public void setLength(Double length) {
		this.length = length;
	}
	
	public void setRelease(Integer year) {
		this.releaseYear = year;
	}
	
	
	
	public void playSong() {		
		if(this.status != "playing") {
			this.clip.start();
			this.status = "playing";
		}
	}
	
	public void pauseSong() {		
		if(this.status != "paused") {
			this.clip.stop();
			this.status = "paused";
		}
	}
	
	  public void SimpleAudioPlayer() // make this the constructor for the class
		        throws UnsupportedAudioFileException,
		        IOException, LineUnavailableException 
		    {
		        // create AudioInputStream object
		        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(this.filePath).getAbsoluteFile());
		          
		        // create clip reference
		        this.clip = AudioSystem.getClip();
		          
		        // open audioInputStream to the clip
		        this.clip.open(audioInputStream);
		          
		        this.clip.loop(Clip.LOOP_CONTINUOUSLY);
		        
		        
		    }
	
}
