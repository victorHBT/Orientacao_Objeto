package Pessoas;

import javax.swing.JOptionPane;

public class CadastroPessoas {
	
	private String Nome;
	private String Email;
	private float Rendimento;
	
	
	   public String toString() {
	        return ("*************************" + "\n" + "Nome:"+this.getNome()+ "\n" +
	                    "Email:"+ this.getEmail() + "\n" +
	                    "Rendimento:"+ this.getRendimento() + "\n" + "*************************" + "\n");
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
	
	public CadastroPessoas Cadastrar() {
		
		try {
		CadastroPessoas aluno = new CadastroPessoas();
		
		aluno.setNome(JOptionPane.showInputDialog("Qual � o nome do aluno?"));
		
		aluno.setEmail(JOptionPane.showInputDialog("Qual � o email do aluno?"));
		
		aluno.setRendimento(Float.parseFloat(JOptionPane.showInputDialog("Qual o Rendimento Mensal do Aluno?")));
		

	}
		catch(NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "Digite algo nos campos");
				}
		return null;
	}
}
