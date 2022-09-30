package primeiro_projeto;

public class PrimeiraClasse {

	public static void main(String[] args) {
		int a = 1;
		int b = 20;
		System.out.println("O resultado da soma entre "+ a + " e " + b + " eh igual a "+ (a+b));
	
	Contas con = new Contas(555,7575);
	
	con.setMaiores(32);
	con.setMenores(12);
	System.out.println(con);
	
Contas con2 = new Contas(555,7575);
	
	con2.setMaiores(987987);
	con2.setMenores(45);
	System.out.println(con2);
	
	}
}
