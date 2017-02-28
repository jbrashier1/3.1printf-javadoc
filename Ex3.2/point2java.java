import javax.swing.JOptionPane;

/**
 * Name: Jack Brashier Date: 02/28/2017 Purpose: To show knowledge of printf
 * commands and javadoc.
 */
public class point2java {
	public static void main(String[] args) {
		String[] buttons = { "Println", "Printf" };
		String fOutput = "this string should be capitalized if you picked printf.";
		// JOptionPane allows a more user friendly method of selecting an
		// option. Rather than typing "1" or "0" into the console.
		int opt = JOptionPane.showOptionDialog(null, "Would you like to use println or printf?", "Option Selection",
				JOptionPane.YES_NO_OPTION, 0, null, buttons, buttons[1]);
		// If / else - if statement allows user to somewhat dictate the outcome
		// of the program.
		if (opt == 0) {
			System.out.println("This sentence will show up if you press the \"println\" option.");
		} else if (opt == 1) {
			System.out.printf("%S", fOutput);
			/*
			 * System.out.printf("%C", fOutput); would have capitalized only one character. 
			 * System.out.printf("%4d", <int>); would have formatted decimals onto an integer.
			 */
		}
	}
}