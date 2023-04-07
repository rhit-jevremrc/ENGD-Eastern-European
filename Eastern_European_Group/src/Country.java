import java.util.ArrayList;

public class Country {
	private ArrayList<Song> songs = new ArrayList<Song>();
	private String name;
	
	
	public Country(String name) {
		this.name = name;
		
	}
	
	public void getLocation(){
		//return coordinates for button
		return;
	}
	
	public void addSong(String name) {
		this.songs.add(new Song(name));
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
}
