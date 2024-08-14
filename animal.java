package Aula14_08;

public class animal {
	String nome;
	String especie;
	int idade;
	String cor;
	String tamanho;
	
	public String getNome() {
		return nome;
}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEspecie() {
		return especie;
}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public int getIdade() {
		return idade;
}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCor() {
		return cor;
}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTamanho() {
		return tamanho;
}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String comer() {
		return "Come";
	}
	public String dormir() {
		return "Dorme";
	}
	public String Andar() {
		return "Anda";
	}
}
