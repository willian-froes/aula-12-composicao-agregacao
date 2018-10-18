package aula12;

public class Rodoviaria {
	
	private final String localidade;
	private final Viagem[] viagens = new Viagem[1000];
	private int cont = 0;

	public Rodoviaria(String localidade) {
		this.localidade = localidade;
	}

	public String getLocalidade() {
		return localidade;
	}
	
	@Override
	public String toString() {
		return getLocalidade();
	}

	public Viagem criarViagem(String destino, Date data, 
			                  Time hora, Onibus onibus) {
		Viagem viagem = new Viagem(cont + 1, this, destino, data, hora, onibus);
		viagens[cont++] = viagem;
		return viagem;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
