import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Map {
	private ArrayList<Country> countries = new ArrayList<Country>();
	private JLabel label = new JLabel();
	private Country selectedCountry;
	
	
	public void display() {
		JFrame frame = new JFrame();
		JPanel mapPanel = new JPanel();
		JPanel songPanel = new JPanel();
		JPanel playerPanel = new JPanel();
		
		frame.add(label, BorderLayout.CENTER);
		frame.add(playerPanel, BorderLayout.SOUTH);
		frame.add(songPanel, BorderLayout.WEST);
		frame.add(mapPanel, BorderLayout.EAST);		
		// TODO: Add buttons and listeners to make things work.
		
		for (Country i : countries) {
			JButton butt = new JButton(i.getName());
			mapPanel.add(butt, BorderLayout.CENTER); //i.getLocation());
			CountryListener cunt = new CountryListener(i, butt);
			butt.addActionListener(cunt);
		}
		this.selectedCountry = countries.get(0);
		updateLabel("I like to look at count ries");

		
		
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void addCountry(String name) {
		this.countries.add(new Country(name));
	}
	
	public void updateLabel(String phrase) {
		this.label.setText(phrase);
	}
	
	public void updateDisplay() {
		//refresh Jpanels
		//make sure selected country refreshes and changes panel accordingly
	}
	
	
	class CountryListener implements ActionListener {
		private Country country;
		public CountryListener(Country country, JButton button) {
			this.country = country;
			button.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
				selectedCountry = country;
				updateLabel(selectedCountry.getName());
				updateDisplay();
			}
		}
	
	class SongListener implements ActionListener {
		private Song song;
		public SongListener(Song song, JButton button) {
			this.song = song;
			button.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
				//selectedSong = song;
				updateDisplay();
			}
		}
	
	
	
	class AudioListener implements ActionListener {
		private Song song;
		public AudioListener(Song song, JButton button) {
			this.song = song;
			button.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
				//if paused, play, if play pause, update logo
				updateDisplay();
			}
		}//repeat class for skip buttons


}
