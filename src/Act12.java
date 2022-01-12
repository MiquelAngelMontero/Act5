/**
 * 
 * Miquel Angel Montero Act12 12/01/2022 
 * 
 */
import javax.swing.JOptionPane;
public class Act12 {

	public static void main(String[] args) {

		String pass = "contra";
		int cont = 0;
		String passEsc = " ";
		
		do {
			
			passEsc = JOptionPane.showInputDialog("Introduce la contraseña");
			
			if (passEsc.equals(pass)) {
				break;
			}
			cont++;
			
		}while(cont!=3);
		
		if (cont == 3) {
			JOptionPane.showMessageDialog(null, "No ha acertado la contraseña");
		}else{
			JOptionPane.showMessageDialog(null, "Enhorabuena!");
		}
		
	}

}
