/**
 * 
 * Miquel Angel Montero Act10 12/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act10 {
	
	public static void main(String[] args) {
		
		double suma=0;
		
		String numS = JOptionPane.showInputDialog("Introduce el numero de ventas");
		int num = Integer.parseInt(numS);
		
		for (int i = 1; i<(num+1); i++) {
			String valorS = JOptionPane.showInputDialog("Introduce el valor de la venta numero "+i);
			double valor = Double.parseDouble(valorS);
			suma += valor;
		}
		
		JOptionPane.showMessageDialog(null, "La suma de todas las compras es de "+suma+"€");

	}

}
