package exercicio04;

public class Funcionario extends Pessoa {
	private int numeroDaMatricula;
	
	public Funcionario(String nome, int idade,String cidadeDeNascimento, int numeroDaMatricula) {
		super(nome, idade, cidadeDeNascimento);
		this.numeroDaMatricula = numeroDaMatricula;
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Numero da Matricula: " + this.numeroDaMatricula);
	}
	
}
