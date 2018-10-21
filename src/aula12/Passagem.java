package aula12;

public class Passagem {
 
	private int assento;
	private int numero;
	private Viagem viagem; // Passagem **pertence a** uma Viagem
	private boolean comprada = false;

	public Passagem(int assento, Viagem viagem) {
		this.assento = assento;
		this.viagem = viagem;
	}

	public String getCodigo() {
		return "00000" + viagem.getCodigo() 
			+ ".00000" + numero + "." + assento;
	}

	public boolean isDisponivel() {	
		return !comprada;
	}
	
	public boolean isIndisponivel() {
		return comprada;
	}

	public int getAssento() {	
		return assento;
	}

	public void setCodigo(int codigo) {
		this.numero = codigo;
	}

	public void setComprada() {
		this.comprada = true;		
	}

	public void comprar() {
		viagem.comprarPassagem(assento);		
	}

	
	
	
	
	
	
	
	
	
}
