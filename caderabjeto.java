package Aula14_08;

public class caderabjeto {

	public static void main(String[] args) {
		cadera cadera1 = new cadera();
		cadera cadera2 = new cadera();
		
		cadera1.setModelo("Cadeira de Escritório");
		cadera1.setCor("Preta");
		cadera1.setMaterial("Couro");
		cadera1.setVidautil("dura até 5 anos");

		cadera2.setModelo("Cadeira de Escritório");
		cadera2.setCor("Branca");
		cadera2.setMaterial("Couro");
		cadera2.setVidautil("dura até 5 anos também");
		
		System.out.println("--------------CADEIRA1--------------");
		System.out.println(cadera1.getModelo());
		System.out.println(cadera1.getCor());
		System.out.println(cadera1.getMaterial());
		System.out.println(cadera1.getVidautil());
		System.out.println("");
		System.out.println(cadera1.abaixar());
		System.out.println(cadera1.Rodar());
		System.out.println(cadera1.subir());
		System.out.println(cadera1.andar());
		
		System.out.println("--------------CADEIRA2--------------");
		System.out.println(cadera1.getModelo());
		System.out.println(cadera1.getCor());
		System.out.println(cadera1.getMaterial());
		System.out.println(cadera1.getVidautil());
		System.out.println("");
		System.out.println(cadera1.abaixar());
		System.out.println(cadera1.Rodar());
		System.out.println(cadera1.subir());
		System.out.println(cadera1.andar());
	}

}
