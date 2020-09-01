package pricipal;

import java.util.Locale;

public class atendimento {

	public static void main(String[] args) {
		
		
		int controle = 0;
		int b1 , b2, b3;
		double valor;
		int n;
		valor = 4.05;
		b3 = 51;
		n = 600;
		int total =0;
		
		
		n = n - b3;
		b1 = n / 3;
		b2 = b1 * 2;
		total = b1 + b2 +b3;
		
		
		
		System.out.println("QUANTIDADE DE VEÍCULOS POR BOMBA:");
		System.out.println();
		System.out.println("BOMBA B1: " + b1 + " VEÍCULOS" + " E ARRECADOU: R$ " + String.format("%.2f", valor*b1));
		System.out.println("BOMBA B2: " + b2 + " VEÍCULOS" + " E ARRECADOU: R$ " + String.format("%.2f",valor*b2));
		System.out.println("BOMBA B3: " + b3 + " VEÍCULOS" + " E ARRECADOU: R$ " + String.format("%.2f",valor*b3));
		System.out.println("N. CARROS: " + total + " E ARRECADOU UM TOTAL DE: R$ " + String.format("%.2f", valor*total));
	}

}
