package calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int a, b;
		
		System.out.println("primeiro valor: ");
		a = teclado.nextInt();
		System.out.println("segundo valor: ");
		b = teclado.nextInt();
		
		int soma = soma(a,b);
		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao(a, b);
		double divisao = divisao(a, b);
		
		System.out.println("soma:"+soma);
		System.out.println("subtração"+subtracao);
		System.out.println("multiplicação"+multiplicacao);
		System.out.println("divisão"+divisao);
		
		
	}

	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int multiplicacao (int a, int b) {
		return a * b;
	}
	public static float divisao(float a, float b) {
		return a / b;
	}
	
}
