package aula12;

public class Frota {
	
	private Onibus[] onibus = new Onibus[1000];
	private int cont;
	
	public int getQuantidade() {
		return cont;
	}

	public Onibus novoOnibus(int prefixo, int lotacao) {
		Onibus onibus = new Onibus(prefixo, lotacao);
		this.onibus[cont++] = onibus;
		return onibus;
	}

	
	
	
	
	
	
	
	
	
}
