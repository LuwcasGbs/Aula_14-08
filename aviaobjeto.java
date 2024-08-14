package Aula14_08;

public class aviaobjeto {

	public static void main(String[] args) {
		aviao aviao1 = new aviao();
		aviao aviao2 = new aviao();
		
		aviao1.setCompanhia("Azul Brazilian Airlines");
		aviao1.setCapacidade("4 - 19 passageiros");
		aviao1.setPorte("Pequeno porte");
		aviao1.setCor("Branco");
		
		
		aviao2.setCompanhia("Azul Brazilian Airlines");
		aviao2.setCapacidade("23 toneladas de carga");
		aviao2.setPorte("Médio porte");
		aviao2.setCor("Azul");
		
		System.out.println("--------------AVIÃO1--------------");
		System.out.println(aviao1.getCompanhia());
		System.out.println(aviao1.getCapacidade());
		System.out.println(aviao1.getPorte());
		System.out.println(aviao1.getCor());
		System.out.println(aviao1.voar());
		
		System.out.println("--------------AVIÃO2--------------");
		System.out.println(aviao1.getCompanhia());
		System.out.println(aviao1.getCapacidade());
		System.out.println(aviao1.getPorte());
		System.out.println(aviao1.getCor());
		System.out.println(aviao1.pousar());
	}

}
