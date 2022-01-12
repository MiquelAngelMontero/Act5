/**
 * 
 * Miquel Angel Montero Act4 12/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act4 {

	public static void main(String[] args) {
		
		String numS = JOptionPane.showInputDialog("Introduce el radio: ");
		double num = Double.parseDouble(numS);
		double area = Math.PI * Math.pow(num, 2);
		
		JOptionPane.showMessageDialog(null, "El area del circulo es "+area);

	}

}
