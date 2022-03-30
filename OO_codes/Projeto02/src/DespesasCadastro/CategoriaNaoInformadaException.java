package DespesasCadastro;
import javax.swing.JOptionPane;

public class CategoriaNaoInformadaException extends Exception {
	
	public CategoriaNaoInformadaException() {
		 JOptionPane.showMessageDialog(null, " Categoria nao informada");
	}
	
}
