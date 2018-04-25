package get_set;

public class Aula4 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("BIC", "AZUL", 0.3f);
		c1.status();
		
		Caneta c2 = new Caneta("FaberCastel", "Verde", 0.5f);
		c2.status();
		
		
		

		
/*    
 *** comentando pois estou utilizando o metodo consruct****		
		
		
		c1.setModelo("BIC");
		//c1.modelo = "BIC";          //consigo ver poq o atributo é publico
		
		c1.setPonta(0.5f);
		//c1.ponta = 0.5f;		//não consigor ver porq o atributo é privado
		
		System.out.println("Modelo: " + c1.getModelo() + ", Ponta: " + c1.getPonta());
*/	
	}

}
