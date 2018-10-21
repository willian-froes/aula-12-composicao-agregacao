package aula12;

public class Empresa {

	private final String nome;
	private final Frota frota;
	
	public Empresa(String nome) {
		this.nome = nome;
		// COMPOSIÇÃO: Empresa é composta de uma Frota
		this.frota = new Frota(); 
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return getNome();
	}

	public Frota getFrota() {
		return frota;
	}

	public void novoOnibus(int prefixo, int lotacao) {
		frota.novoOnibus(prefixo, lotacao);
	}
	
	
	
	
	
	
	
	
	
	
	
}
