package aula12;

public class Date {

	private final int dia;
	private final int mes;
	private final int ano;

	public Date(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
	
	
	
	
	
}
