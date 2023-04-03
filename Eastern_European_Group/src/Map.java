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
		JButton ballButton = new JButton("Add Ball");
		JButton strikeButton = new JButton("Add Strike");
		
		frame.add(label, BorderLayout.CENTER);
		frame.add(playerPanel, BorderLayout.SOUTH);
		frame.add(songPanel, BorderLayout.WEST);
		frame.add(mapPanel, BorderLayout.EAST);
		
		// TODO: Add buttons and listeners to make things work.
		//panel.add(ballButton, BorderLayout.EAST);
		//panel.add(strikeButton, BorderLayout.WEST);
		
		for (Country i : countries) {
			JButton butt = new JButton(i.getName());
			mapPanel.add(butt);
			new CountryListener(i, butt);
			
		}
		frame.setSize(200,600);
		
		
		//BallListener balls = new BallListener();
		//StrikeListener strikes = new StrikeListener();
		
		//ballButton.addActionListener(balls);
		//strikeButton.addActionListener(strikes);
		// The following line is given to show you how to use the given method:
		//updateLabel(0, 0);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void addCountry(String name) {
		
	}
	
	public void updateLabel(String phrase) {
		this.label.setText("This is a label able to label any panel");
	}
	
	public void updateDisplay() {
		//refresh Jpanels
	}
	
	
	class CountryListener implements ActionListener {
		private Country country;
		public CountryListener(Country country, JButton button) {
			this.country = country;
			button.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
				selectedCountry = country;
				updateDisplay();
			}
		}
	


}
