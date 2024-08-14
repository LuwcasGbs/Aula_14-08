package Aula14_08;

public class aviao {
	String companhia;
	String capacidade;
	String porte;
	String cor;
	
	public String getCompanhia() {
		return companhia;
}
	public void setCompanhia(String companhia) {
		this.companhia = companhia;
	}
	public String getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String voar() {
		return "Voando";
	}
	public String pousar() {
		return "pousando";
	}
	public String planar() {
		return "planando";
	}
}
