package extra;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[]args) {
	String score = JOptionPane.showInputDialog("What's your test score?");
	double num = Double.parseDouble(score);
	if(num <= 50 ) {
		JOptionPane.showMessageDialog(null, "You failed");
	}
	if(num >= 80) {
		JOptionPane.showMessageDialog(null, "You did good!!");
	}
	else{
		JOptionPane.showMessageDialog(null, "You can do better");
	}
	
}
}
