package addguipac;

import javax.swing.JOptionPane;

public class AdditionGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, result;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter an integer: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter another integer : "));
		result = num1 + num2;
		JOptionPane.showMessageDialog(null, "The result is " + result + ".");
	}

}
