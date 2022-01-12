/**
 * 
 * Miquel Angel Montero Act6 12/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act6 {

	public static void main(String[] args) {

		final double IVA = 0.21;
		
		String numS = JOptionPane.showInputDialog("Introduce un numero");
		double num = Double.parseDouble(numS);
		
		JOptionPane.showMessageDialog(null, "El precio con IVA es de "+(num+(num*IVA))+"€");

	}

}
