package Pessoas;

import java.io.IOException;

import javax.swing.JOptionPane;

import Aplicativo.DadosPessoaisIncompletosException;

public class CadastroPessoas {
	
	private String Nome;
	private String Email;
	private float Rendimento;
	private Object setEmail;
	
	
	   public String toString() {
	        return (    " Nome : "+ this.getNome()  + " / " +
	                    " Email : "+ this.getEmail() + " / " +
	                    " Rendimento : " + this.getRendimento() + "\n");
	   }
	   
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public void setEmail(String email) {
		this.Email = email;
	}
	
	public void setRendimento(float rendimento) {	
		this.Rendimento = rendimento;
	}
	
	
	
	public String getNome() {
		return this.Nome;
	}
	public String getEmail() {
		return this.Email;
	}
	public float getRendimento() {
		return this.Rendimento;
	}
	
	public CadastroPessoas Cadastrar() throws IOException, DadosPessoaisIncompletosException, NumberFormatException {
		
		
		CadastroPessoas aluno = new CadastroPessoas();
		
		// Nome 				
		aluno.setNome(JOptionPane.showInputDialog("Qual é o nome do aluno?"));

		String verificaNome = aluno.getNome();
		
		
		if ( aluno.getNome()== null || aluno.getNome().length()==0) {
			throw new DadosPessoaisIncompletosException();
		}
		
		// Verifica se tem apenas letras 
		if (verificaNome.matches("^[a-zA-ZÁÂÃÀÇÉÊÍÓÔÕÚÜáâãàçéêíóôõúü]*$")){
			int aleatorio=1;
		}
			else{
			throw new DadosPessoaisIncompletosException();
		}
		// Email
		aluno.setEmail(JOptionPane.showInputDialog("Qual é o email do aluno?"));
		
		if (aluno.getEmail() == null || aluno.getEmail().length()==0) {
			throw new DadosPessoaisIncompletosException();
		}
		String verificaEmail =aluno.getEmail();
		if (verificaEmail.contains("@")){
			int aleatorio =1;
		}
			else{
			throw new DadosPessoaisIncompletosException();
		}
		try {
			
		float a = 0;
		String b;
		b = JOptionPane.showInputDialog("Qual o Rendimento Mensal do Aluno?\n Separe os centavos com ponto");
		if(b == null) {
			throw new DadosPessoaisIncompletosException();
		}
		else {	
			a = Float.parseFloat(b);
			aluno.setRendimento(a);
		}
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Deve ser inserido somente n�meros");	
			throw new DadosPessoaisIncompletosException();
			
		}
		return aluno;
		
		

	}

}
