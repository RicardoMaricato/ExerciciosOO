package exercicio04;

public class Exercicio04 {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Ivo La Puma", 33, "São Paulo", "369.258.147-33");
		c1.exibirDados();
		System.out.println("------------------------------------------------------");
		Funcionario f1 = new Funcionario("Leonardo Barbosa", 34, "Campinas", 208040);
		f1.exibirDados();

	}

}
