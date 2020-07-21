package exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {
		Veiculo veiculo1 = new Veiculo("Volkswagem", "Preto", "Gol");
		veiculo1.acelerar();
		veiculo1.frear();
		System.out.println("--------------------------------------------");
		Veiculo veiculo2 = new Veiculo("General Motors", "Branco", "Cruze");
		veiculo2.acelerar();
		veiculo2.frear();
		
	}

}
