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
	private Passagem[] passagens;
	private int cont = 1;
	
	public Viagem(int codigo, Rodoviaria origem, String destino, Date data, Time hora, Onibus onibus) {
		this.codigo = codigo;
		this.destino = destino;
		this.data = data;
		this.hora = hora;
		this.onibus = onibus;
		this.origem = origem;
		this.passagens = new Passagem[onibus.getLotacao()];
		for (int i = 0; i < onibus.getLotacao(); i++) {
			this.passagens[i] = new Passagem(i + 1, this);
		}
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

	public int getTotalPassagens() {		
		return onibus.getLotacao();
	}

	public Passagem comprarPassagem(int assento) {		
		Passagem p = passagens[assento - 1];
		if (p.isIndisponivel()) {
			throw new AssentoIndisponivelException();
		}
		p.setCodigo(cont);
		p.setComprada();
		return p;
	}

	public int getTotalPassagensDisponiveis() {
		return getTotalPassagens() - cont - 1;
	}

	public Passagem[] getPassagens() {
		return passagens;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
