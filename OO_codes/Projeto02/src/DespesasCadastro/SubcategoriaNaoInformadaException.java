package DespesasCadastro;
import javax.swing.JOptionPane;

public class SubcategoriaNaoInformadaException extends Exception{

	public SubcategoriaNaoInformadaException() {
		 JOptionPane.showMessageDialog(null, " Subcategoria nao informada");
	}
	
}
