package get_set;

public class Caneta {

	//criando os atributos:
	
	public String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	
	//criando os metodos:
	//o metodo get e set é utilizado para protejer o atributo. Para o codigo principal nao acessar o atributo diretamente.	
	
	
	public String getModelo() {				
		return this.modelo;
		
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}

	public Float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(Float p) {
		this.ponta = p;
	}
	
	/*public void status() {
		System.out.println("Sobre a caneta:");
		System.out.println("Modelo: " + this.modelo);   **comentado pois estou utilizando o metodo get() no codigo principal que ja printa diretamente. 
		System.out.println("Ponta: " + this.ponta);
	}*/
	
	
	
	//utilizando o metodo construtor:
	
	public Caneta(String mod, String cor, float pont) {		//nesse metodo utiliza-se o msm nome da minha classe "Caneta".		
		this.tampar();
		this.cor = cor;
		this.modelo = mod;
		this.ponta = pont;
		
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
		
	
	public void status() {
		System.out.println("Sobre a caneta:");
		System.out.println("Modelo: " + this.getModelo());   //**utilizando para o metodo construtor.Utilizando esse metodo, no codigo principal so ira precisar fazer a chamada de systen().  
		System.out.println("Ponta: " + this.getPonta());
		System.out.println("Cor: " + this.cor);
		System.out.println("tampada: " + this.tampada);


	}
}
