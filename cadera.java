package Aula14_08;

public class cadera {
	String modelo;
	String cor;
	String material;
	String vidautil;
	
	public String getModelo() {
		return modelo;
}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;
}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getVidautil() {
		return vidautil;
}
	public void setVidautil(String vidautil) {
		this.vidautil = vidautil;
	}
	public String abaixar() {
	return "Abaixa";
}
	public String Rodar() {
		return "Roda";
	}
	public String subir() {
		return "Sobe";
	}
	public String andar() {
		return "Andar";
	}

}