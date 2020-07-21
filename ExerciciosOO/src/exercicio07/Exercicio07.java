package exercicio07;

public class Exercicio07 {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Porche", 4, 50, 8);
		v1.abastecer(40);
		v1.exibirAutonomia();
		System.out.println("------------------------------------------");
		Veiculo v2 = new Veiculo("Caminhão", 6, 80, 20);
		v2.abastecer(20);
		v2.exibirAutonomia();
	}

}
