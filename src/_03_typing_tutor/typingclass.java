package _03_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

setup()
public class typingclass {
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}

JFrame frame = new JFrame();
JPanel panel = new JPanel();
char currentLetter;

void setup(){
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}










}