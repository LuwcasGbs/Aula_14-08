package Aula14_08;

public class clientejeto {

	public static void main(String[] args) {
		cliente cliente1 = new cliente();
		cliente cliente2 = new cliente();
		
		cliente1.setId(01);
		cliente1.setNome("Alice");
		cliente1.setTelefone("(15)997997-9797");
		cliente1.setCpf("223.546.458-66");
		cliente1.setRg("435178918-27");
		cliente1.setEndereco("Rua Onde JUdas Perdeu as Botas, nº43");
		cliente1.setIdade(159);
		cliente1.setDatanasc("01/01/1865");
		cliente1.setSexo("F");
		
		cliente2.setId(02);
		cliente2.setNome("Bernadete");
		cliente2.setTelefone("(15)98867-4506");
		cliente2.setCpf("259.669.154-09");
		cliente2.setRg("20.896.626-07");
		cliente2.setEndereco("Rua Onde JUdas Perdeu as Botas, nº21");
		cliente2.setIdade(19);
		cliente2.setDatanasc("09/05/2005");
		cliente2.setSexo("F");
		
		System.out.println("-------------CLIENTE1-------------");
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		System.out.println(cliente1.getEndereco());
		System.out.println(cliente1.getIdade());
		System.out.println(cliente1.Datanasc());
		System.out.println(cliente1.getSexo());
		System.out.println(" ");
		System.out.println(cliente1.comprar());
		System.out.println(cliente1.provar());
		System.out.println(cliente1.reservar());
		System.out.println(cliente1.devolver());
		
		System.out.println("-------------CLIENTE2-------------");
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
		System.out.println(cliente2.getEndereco());
		System.out.println(cliente2.getIdade());
		System.out.println(cliente2.Datanasc());
		System.out.println(cliente2.getSexo());
		System.out.println(" ");
		System.out.println(cliente2.comprar());
		System.out.println(cliente2.provar());
		System.out.println(cliente2.reservar());
		System.out.println(cliente2.devolver());
	}

}
