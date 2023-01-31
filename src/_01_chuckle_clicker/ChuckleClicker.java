package _01_chuckle_clicker;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
new ChuckleClicker().makeButtons();
	}

	void makeButtons() {

		JFrame frame = new JFrame();
		JButton Button1 = new JButton("Joke");
		JButton Button2 = new JButton("Punchline");
		JPanel Panel = new JPanel();
		
		frame.add (Panel);
		Panel.add(Button1);
		Panel.add(Button2);
		frame.setVisible(true);
		frame.pack();
		Button1.addActionListener(this);
		Button2.addActionListener(this);
		// Were you typing on the Zoom?
		// yes, I don't know why they don't go through. I've been trying to get a mic so
		// this hoepgully won't happen. But what i was typing was I need help with
		// adding a Jbutton and Jpanel to the JFrame
		// oh okay well for any swing stuff you can look back at your old cold
	} // yes

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}


	 
	 
	 
	