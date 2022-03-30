package DespesasCadastro;

import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Aplicativo.DadosPessoaisIncompletosException;


public class CadastroDespesas {
	
	private CadastroCategoria Categoria = new CadastroCategoria();
	private ArrayList<String> Subcategorias = new ArrayList();
	private float Valorindividual;
	private float Valor;
	
	public void setVetor(ArrayList<String> a) {
		
		this.Subcategorias = a;
		
	}
    
	public void setValor(float valor) {
		this.Valor = valor;
	}
	
	public float getValor() {
		return this.Valor;
	}
	
	public void setValorindividual(float valor) {
		this.Valorindividual = valor;
	}
	
	public float getValorindividual() {
		return this.Valorindividual;
	}
	public String getCategoria(){
		
		return this.Categoria.getCategoria();
		
	}
	
	public void setCategoria(String categoria) {
		this.Categoria.setCategoria(categoria);
	}
	
	public String getSubcategoria(){
		
		return this.Categoria.getSubcategoria();
		
	}
	
	public void setSubategoria(String Subcategoria) {
		this.Categoria.setSubcategoria(Subcategoria);
	}
	


	public CadastroDespesas Cadastrar() throws IOException, CategoriaNaoInformadaException, SubcategoriaNaoInformadaException, DadosPessoaisIncompletosException {
		
		CadastroDespesas Despesas = new CadastroDespesas();
		ArrayList<String> Sub = new ArrayList();
		int p = 0;
		int q = 0;
		float Valor1 = 0;
		Despesas.setCategoria(JOptionPane.showInputDialog("Qual a Categoria da Despesa"));
		
		String verificaDespesas = Despesas.getCategoria();
		
		// Se espaço está vazio 
		if(Despesas.getCategoria()==null || Despesas.getCategoria().length()==0) {
			throw new CategoriaNaoInformadaException();
		}
		
		// Apenas letras
		if (verificaDespesas.matches("^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*$")){
			int aleatorio=1;
		}
			else{
			throw new CategoriaNaoInformadaException();	
		}
		
		while(true) {
		
			Object[] options = {"Sim",
	                "Não"};
	int n = JOptionPane.showOptionDialog(null,
	"Gostaria de Cadastrar Subcategoria?",
	"Cadastros República",
	JOptionPane.YES_NO_CANCEL_OPTION,
	JOptionPane.QUESTION_MESSAGE,
	null,
	options,
	options[1]);
	
	if(n == -1) {
		break;
	}
	if(n == 0) {
		
	
		Despesas.setSubategoria(JOptionPane.showInputDialog("Qual a Subcategoria da Despesa?"));
		
		String verificaSubcategoria = Despesas.getSubcategoria();
		
		if(Despesas.getSubcategoria()==null || Despesas.getSubcategoria().length()==0) {
			throw new CategoriaNaoInformadaException();
		}
		if (verificaSubcategoria.matches("^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*$")){
			int aleatorio=1;
		}
			else{
			throw new CategoriaNaoInformadaException();
	
		}
		Sub.add("Subcategoria:" + Despesas.getSubcategoria() + " / ");
		
	
		
		try {
		float a = 0;
		String c;
		c = JOptionPane.showInputDialog("Qual o Valor dessa despesa?\n Separe os centavos com ponto");
		if(c == null) {
		}
		else {	
			a = Float.parseFloat(c);
			Despesas.setValorindividual(a);
		}
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Campo incompleto");	
		}
		
		
		Sub.add("Valor:" + Despesas.getValorindividual() + "\n");
		Valor1 = Despesas.getValorindividual() + Valor1;
		p = 1;
		
	}
	else if(n == 1) {	
		q = 1;
		break;
	}	
		}
		
		if(q == 1 && p == 0) {
			
			Despesas.setSubategoria("-1");
	
			try {
				float a = 0;
				String c;
				c = JOptionPane.showInputDialog("Qual o Valor dessa despesa?");
				if(c == null) {
					
				}
				else {	
					a = Float.parseFloat(c);
					Despesas.setValorindividual(a);
				}
				}
				catch(NumberFormatException e) {
											
				}	
			
			Valor1 = Despesas.getValorindividual() + Valor1;
			
		}
		Despesas.setVetor(Sub);
		Despesas.setValor(Valor1);
		
		if (Valor1 == 0) {
			throw new CategoriaNaoInformadaException();
		}
		else {
			
			return Despesas;
		}
	}


public String toString() {
if(this.getSubcategoria() == ("-1")) {
	return ("Categoria : " + this.getCategoria() + " /  "+ "Valor : "+ this.getValorindividual() + "\n");
}else {

return ("Categoria : " + this.getCategoria() +"\n" + this.Subcategorias.toString() + "\n");
}
}
}