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
	JButton Button1 = new JButton("Joke");
	JButton Button2 = new JButton("Punchline");
	void makeButtons() {

		JFrame frame = new JFrame();
		JPanel Panel = new JPanel();
		
		frame.add (Panel);
		Panel.add(Button1);
		Panel.add(Button2);
		frame.setVisible(true);
		frame.pack();
		Button1.addActionListener(this);
		Button2.addActionListener(this);
	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == Button1) {
			
		}
	}
}


	 
	 
	 
	