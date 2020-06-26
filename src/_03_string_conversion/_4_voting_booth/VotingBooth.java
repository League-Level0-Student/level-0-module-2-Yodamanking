package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String ageString = JOptionPane.showInputDialog("What is your age? (in years)");
		int age = Integer.parseInt(ageString);
		if (age >= 18) {
			JOptionPane.showInputDialog("Okay. Who do you want to be president?");
			JOptionPane.showMessageDialog(null, "Thank you for voting.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Go away, child.");
		}
	}
}
