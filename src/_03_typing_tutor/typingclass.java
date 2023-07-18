package _03_typing_tutor;

import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class typingclass {
	char currentLetter ;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	   
	}

	void setup(){
		currentLetter = generateRandomLetter();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel(currentLetter+"");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
	frame.add(keyListener)
	}
}









