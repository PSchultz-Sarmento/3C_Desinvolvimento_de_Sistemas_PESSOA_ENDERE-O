
public class Endereco { //CLASSE ABSTRATA DO ENDEREÇO

	//ATRIBUTOS
	private String cidade;
	private String rua;
	private String bairro;
	private int numero;
	
	//GETTER E SETTERS
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String toString() { // TOSTRING DOS ATRIBUTOS
		return "Endereço: " + rua + "\nnúmero: " + numero + "\nBairro: " + bairro + "\nCidade: " + cidade; 
	}
	
	
}
