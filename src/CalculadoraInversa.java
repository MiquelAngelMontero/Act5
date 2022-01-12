/**
 * 
 * Miquel Angel Montero Act13 12/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class CalculadoraInversa {

	public static void main(String[] args) {

		String num1S = JOptionPane.showInputDialog("Introduce el primer número");
		int num1 = Integer.parseInt(num1S);
		
		String num2S = JOptionPane.showInputDialog("Introduce el segundo número");
		int num2 = Integer.parseInt(num2S);
		
		String op = JOptionPane.showInputDialog("Introduce un signo aritmético");
		
		switch (op) {
		
			case "+":
				JOptionPane.showMessageDialog(null, num1+op+num2+"="+(num1+num2));
				break;
			case "-":
				JOptionPane.showMessageDialog(null, num1+op+num2+"="+(num1-num2));
				break;
			case "*":
				JOptionPane.showMessageDialog(null, num1+op+num2+"="+(num1*num2));
				break;
			case "/":
				JOptionPane.showMessageDialog(null, num1+op+num2+"="+(num1/num2));
				break;
			case "^":
				JOptionPane.showMessageDialog(null, num1+op+num2+"="+Math.pow(num1, num2));
				break;
			case "%":
				JOptionPane.showMessageDialog(null, num1+op+num2+"="+(num1%num2));
				break;
			default:
				JOptionPane.showMessageDialog(null, "No has introducido un operador correcto");
		
		}

	}

}
