package exercicio01;

public class Veiculo {
	private String fabricante;
	private String cor;
	private String modelo;


	public Veiculo(String fabricante, String cor, String modelo) {
		this.fabricante = fabricante;
		this.cor = cor;
		this.modelo = modelo;
	}

	public void acelerar() {
		System.out.println("O veículo " + this.modelo + " está acelerando!");
	}

	public void frear() {
		System.out.println("O veículo " + this.modelo + " freiou!");
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
