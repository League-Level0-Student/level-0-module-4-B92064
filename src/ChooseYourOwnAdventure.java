import javax.swing.JOptionPane;

public class ChooseYourOwnAdventure {
	public static void main(String[] args) {
	System.out.print("Once upon a time, there was a ");
	String c1 = JOptionPane.showInputDialog("What was there?");
	System.out.print(c1);
	System.out.print(".");
	System.out.println(" He wasn't a very normal "+ c1 + " and he had the ability to make birds fly.");
	System.out.print("At one point in his life, he decided to do something with his life. He wanted to become a ");
	String c2 = JOptionPane.showInputDialog("What did he want to become?");
	System.out.print(c2 + ".");
	System.out.println(" Once when he was walking down a street, he came upon a fork in the road.");
	System.out.print("There were three ways which he could go down.");
	int ch1 = JOptionPane.showOptionDialog(null, "Right or Left", "Choice 1", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Right", "Left", "Cliff" }, null);	
	if(ch1 == 0) { //right
		System.out.println("The "+ c1 + " went right and saw, that there was a giant see saw.");
		System.out.print("For some reason, "+ c1 + " got on the see saw, and got killed by the giant who sat on him.");
	}
	else if(ch1 == 1) { //left
		System.out.println("The "+ c1 + " went left, and kept going till dawn. He finally arrived at a town called Mawn");
		System.out.println("And no, the programmer who made this didn't need a rhyme, it was just a good word for its time.");
		System.out.println("When the "+ c1 + " arrived at the town, a ton of people seemed to celebrate his return. ");
		System.out.println("For no good reason. Except...");
		String r1 = JOptionPane.showInputDialog("What was the reason?");
		System.out.println("For the reason of: "+ r1 );
		System.out.println("And he actually did become a "+ c2 + ". Somehow.");
		System.out.print("THE END");
	}
	else if(ch1 == 2) { //Cliff
		System.out.println(" What a mighty mistake this fellow made, as falling off the cliff lead to his demise.");
		System.out.print("This cliff had been enchanted with the falling spell, so anybody who fell off it would not live to tell.");
	}
	
	}

}
