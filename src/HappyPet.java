import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for(int i = 0; i < 5; i++) {
	int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Feed", "Take on a walk", "Lock in crate" }, null);	
	if(task == 0) {
		feed();
	}
	else if(task == 1) {
		walk();
	}
	else if(task == 2) {
		lock();
	}
	else if(task == -1) {
		JOptionPane.showMessageDialog(null, "Why did you press that ?!");
	}
	if(happinessLevel == 3) {
		JOptionPane.showMessageDialog(null, "You made your pet happy!");
		break;
	}
}
	}
	// 5. Use user input to call the appropriate method created in step 4.

	// 6. If you determine the happiness level is large enough, tell the
	//    user that he loves his pet and use break; to exit for loop.
public static void feed() {
	try {
		Clip clip = AudioSystem.getClip();
		clip.open(AudioSystem.getAudioInputStream(HappyPet.class.getResource("HappyDog.wav")));
		clip.start();
		Thread.sleep(3600);
		happinessLevel++;
	} catch (Exception ex) {
		ex.printStackTrace();
	}
}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

public static void walk() {
	try {
		Clip clip = AudioSystem.getClip();
		clip.open(AudioSystem.getAudioInputStream(HappyPet.class.getResource("HappyDog.wav")));
		clip.start();
		Thread.sleep(3600);
		happinessLevel++;
	} catch (Exception ex) {
		ex.printStackTrace();
	};
}

public static void lock() {
	try {
		Clip clip = AudioSystem.getClip();
		clip.open(AudioSystem.getAudioInputStream(HappyPet.class.getResource("MadDog.wav")));
		clip.start();
		Thread.sleep(3600);
		happinessLevel++;
	} catch (Exception ex) {
		ex.printStackTrace();
	}
}
}