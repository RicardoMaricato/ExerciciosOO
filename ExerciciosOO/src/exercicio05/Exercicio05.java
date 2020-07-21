package exercicio05;

public class Exercicio05 {

	public static void main(String[] args) {
		Caneta caneta = new Caneta("Plastico", "Tinta");
		caneta.escrever();
		Lapis lapis = new Lapis("Madeira", "Grafite");
		lapis.escrever();
		PenaMosquito penaMosquito = new PenaMosquito("Metal", "Nanquim");
		penaMosquito.escrever();
	}
}
