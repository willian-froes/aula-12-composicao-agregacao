package aula12;

public class Viagem {

	private int codigo;
	private String destino; 
	private Date data;
	private Time hora; 
	private Onibus onibus;
	// RELACIONAMENTO BI-DIRECIONAL
	// Rodoviaria TEM Viagem e Viagem tem Rodoviaria
	private Rodoviaria origem;
	
	public Viagem(int codigo, Rodoviaria origem, String destino, Date data, Time hora, Onibus onibus) {
		this.codigo = codigo;
		this.destino = destino;
		this.data = data;
		this.hora = hora;
		this.onibus = onibus;
		this.origem = origem;
	}

	public String getDestino() { return destino; }
	public Date getData() { return data; }
	public Time getHora() { return hora; }
	public Onibus getOnibus() { return onibus; }

	public int getCodigo() {
		return codigo;
	}
	
	public String getOrigem() {
		return origem.getLocalidade();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
