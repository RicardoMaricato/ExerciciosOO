package exercicio04;

public class Cliente extends Pessoa {
	private String cpf;
	
	public Cliente(String nome, int idade, String cidadeDeNascimento, String cpf) {
		super(nome, idade, cidadeDeNascimento);
		this.cpf = cpf;
		
	}

	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("CPF: " + this.cpf);
	}
	
}
