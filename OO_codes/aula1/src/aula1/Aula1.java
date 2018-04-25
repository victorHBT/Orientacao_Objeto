package aula1;

public class Aula1 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "bic";
		c1.cor = "azul";
		c1.carga = 90;
		c1.ponta = 0.5f;
		c1.status();
		c1.destampar();		
		c1.rasbiscar();
		
		Caneta c2 = new Caneta();
		
		c2.modelo = "faber castle";
		c2.cor = "vermelha";
		c2.status();
		c2.tampar();
		c2.rasbiscar();
	}
}
