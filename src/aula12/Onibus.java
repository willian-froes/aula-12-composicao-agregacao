package aula12;

public class Onibus {

	private final int prefixo;
	private final int lotacao;
	
	public Onibus(int prefixo, int lotacao) {
		this.prefixo = prefixo;
		this.lotacao = lotacao;
	}

	public int getPrefixo() {
		return prefixo;
	}
	
	public int getLotacao() {
		return lotacao;
	}

	@Override
	public String toString() {
		return "Onibus prefixo " + prefixo + " lotação: " + lotacao;
	}
	
	
	
	
	
	
	
}


