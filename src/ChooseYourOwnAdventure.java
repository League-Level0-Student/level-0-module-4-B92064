import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
	System.out.print("Once upon a time, there was a ");
	String c1 = JOptionPane.showInputDialog("What was there?");
	System.out.print(c1);
	System.out.print(".");
	System.out.println(" He wasn't a very normal "+ c1 + " and he had the ability to make birds fly.");
	System.out.print(" At one point in his life, he decided to do something with his life. He wanted to become a ");
	String c2 = JOptionPane.showInputDialog("What did he want to become?");
	System.out.print(c2);
	
	}

}
