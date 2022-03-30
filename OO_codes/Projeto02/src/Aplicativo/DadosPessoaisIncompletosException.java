package Aplicativo;
import javax.swing.JOptionPane;

public class DadosPessoaisIncompletosException extends Exception {
	public DadosPessoaisIncompletosException() {
		 JOptionPane.showMessageDialog(null, " Obrigatorio o preenchimento de todos os campos");
	}
}
