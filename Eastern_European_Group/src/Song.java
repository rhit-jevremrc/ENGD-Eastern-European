import java.io.FileInputStream;
import java.io.InputStream;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JOptionPane;

public class Song {
	private String title;
	private String artist;
	private String album;
	private Double length;
	private Integer releaseYear;
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
	
	public static void playSong() {
		
		InputStream music;
		try {
			music = new FileInputStream(new File(filepath));
			AudioStream audios = new AudioInputStream((TargetDataLine) music);
			AudioPlayer.player.start(audios);
		}
		catch(Exception e) {
			JOptionPane.showMessageDialog(null, "error!");
		}
	}
	
}
