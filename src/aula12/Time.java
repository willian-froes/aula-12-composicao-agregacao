package aula12;

public class Time {

	private int horas;
	
	public Time(int horas) {
		this.horas = horas;
	}
	
	@Override
	public String toString() {
		return horas + ":00:00";
	}
}
