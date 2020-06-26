package _01_random._6_lottery_numbers;
import java.util.Random;


import javax.swing.JOptionPane;
public class LotteryNumbers {
	public static void main(String[] args) {
		Random ran = new Random();
		int randomone = ran.nextInt(99);
		int randomtwo = ran.nextInt(99);
		int randomthree = ran.nextInt(99);
		int randomfour = ran.nextInt(99);
		int randomfive = ran.nextInt(99);
		int randomsix = ran.nextInt(99);
		JOptionPane.showMessageDialog(null, randomone + " " + randomtwo + " " +randomthree + " " +randomfour + " " + randomfive + " " +randomsix);
	}
}
