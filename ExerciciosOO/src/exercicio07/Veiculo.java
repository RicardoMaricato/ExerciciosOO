package exercicio07;

public class Veiculo {
	private String nome;
	private int numeroDeRodas;
	private double capacidadeTanqueLitros;
	private double consumo;
	private double quantidadeDeLitros;
	
	public Veiculo(String nome,int numRodas, double capacidadeTanqueLitros, double consumo) {
		this.nome = nome;
		this.numeroDeRodas = numRodas;
		this.capacidadeTanqueLitros = capacidadeTanqueLitros;
		this.consumo = consumo;
	}
	
	public void abastecer(double quantidadeDeLitros) {
		this.quantidadeDeLitros = quantidadeDeLitros;
		System.out.println("Abastecendo " + this.quantidadeDeLitros + " litros de combustível.");
	}
	
	public void exibirAutonomia() {
		consumo = this.capacidadeTanqueLitros * this.consumo;
		System.out.println("A Autonomia do veículo é  " + consumo + " kilometros.");
	}
}
