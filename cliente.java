package Aula14_08;

public class cliente {
	
	int id;
	String nome;
	String telefone;
	String cpf;
	String rg;
	
	String endereco;
	int idade;
	String datanasc;
	String sexo;
	
	public int getId() {
		return id;
}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf (String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg (String rg) {
		this.rg = rg;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco (String endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade (int idade) {
		this.idade = idade;
	}
	public String Datanasc() {
		return datanasc;
	}
	public void setDatanasc (String datanasc) {
		this.datanasc = datanasc;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo (String sexo) {
		this.sexo = sexo;
	}
	public String comprar() {
		return "Compra";
	}
	public String provar(){
		return "Prova";
	}
	public String reservar() {
		return "Reserva";
	}
	public String devolver() {
		return "Devolve";
	}
}

