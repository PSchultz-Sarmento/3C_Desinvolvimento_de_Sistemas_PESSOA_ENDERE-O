
public class Main {
	
	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		Pessoa pessoa = new Pessoa();
		
		endereco.setRua("Rua 123");
		endereco.setCidade("Florianópolis");
		endereco.setBairro("Centro");
		endereco.setNumero(123);
		
		pessoa.setNome("Big pedro");
		pessoa.setDataNascimento("12/03/2004");
		
		System.out.println(endereco);
		System.out.println(pessoa);
		
		
	}

}
