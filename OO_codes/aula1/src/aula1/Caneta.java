package aula1;

public class Caneta {

		String cor;
		String modelo;
		float ponta;
		int carga;
		boolean tampada;
		void status() {
			System.out.println("uma caneta " + this.cor);			
			System.out.println("numero da ponta " + this.ponta);
			System.out.println("qual modelo " + this.modelo);
			System.out.println("qual a carga " + this.carga);
			System.out.println("esta tampada? " + this.tampada);
		}
		void rasbiscar() {
			if( this.tampada == true ){
				System.out.println("nao posso escrever, caneta tampada");
			} else {
				System.out.println("escrevendo!");
			}
		}
		
		void tampar() {
			this.tampada = true;
			
		}
		void destampar() {
			this.tampada = false;
			
		}

}
