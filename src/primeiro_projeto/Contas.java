package primeiro_projeto;

public class Contas {

	int menores;
	int maiores;
	
	public Contas(int menores, int maiores) {
		this.menores = menores;
		this.maiores = maiores;
	}
	public int getMenores() {
		return menores;
	}
	public void setMenores(int menores) {
		this.menores = menores;
	}
	public int getMaiores() {
		return maiores;
	}
	public void setMaiores(int maiores) {
		this.maiores = maiores;
	}
	@Override
	public String toString() {
		return "Contas [menores=" + menores + ", maiores=" + maiores + "]";
	}
	
	
	
}
