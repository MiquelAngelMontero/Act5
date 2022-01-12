/**
 * 
 * Miquel Angel Montero Act5 12/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act5 {

	public static void main(String[] args) {

		String numS = JOptionPane.showInputDialog("Introduce un numero: ");
		int num = Integer.parseInt(numS);
		
		if (num % 2 == 0) {
			
			JOptionPane.showMessageDialog(null, "El numero introducido es par");
			
		}else {
			
			JOptionPane.showMessageDialog(null, "El numero introducido es impar");
			
		}

	}

}
