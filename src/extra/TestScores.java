package extra;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[]args) {
	String score = JOptionPane.showInputDialog("What's your test score?");
	int s = Integer.parseInt(score);
	double num = 
	if(num <= 50 ) {
		JOptionPane.showMessageDialog(null, "You failed");
	}
	if(num >= 85) {
		JOptionPane.showMessageDialog(null, "You did good!!");
	}
	else{
		JOptionPane.showMessageDialog(null, "You can do better");
	}
	
}
}
