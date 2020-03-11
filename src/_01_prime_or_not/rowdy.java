package _01_prime_or_not;

import javax.swing.JOptionPane;

public class rowdy {
public static void main(String[] args) {
	String givenumber = JOptionPane.showInputDialog("Give me a number!");
	int intgivenumber = Integer.parseInt(givenumber);
	for (int i = 0; i < intgivenumber + 1 ; i++) {
		if (intgivenumber%2 == 0) {
			JOptionPane.showMessageDialog(null, "Your number is composite!");
			break;
		}
		else {
			JOptionPane.showMessageDialog(null, "Your number is prime!");
			break;
		}
	}
}
}
