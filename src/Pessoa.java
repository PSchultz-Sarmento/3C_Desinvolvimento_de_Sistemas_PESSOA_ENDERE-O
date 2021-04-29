
public class Pessoa { // PESSOA ABSTRATA

	//ATRIBUTOS DA PESSOA
	private String nome;
	private String dataNascimento;
	private Endereco endereco;
	
	//GETTERS E SETTERS
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {//TOSTRING DOS ATRIBUTOS DA PESSOA
		return "\n\nNome: " + nome + "\nData de nascimento: " + dataNascimento;
	}

	
	
}
