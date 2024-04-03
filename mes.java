package aula_3;

import java.util.Scanner;

public class mes {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int valor;
		
		System.out.print("Digite o mês (1-12): ");
		valor= ler.nextInt();
		
		if (valor == 1) {
			System.out.println("Janeiro");
		}
		else if (valor == 2) {
			System.out.println("Fevereiro");
		}
		else if (valor == 3) {
			System.out.println("Março");
		}
		else if (valor == 4) {
			System.out.println("Abril");
		}
		else if (valor == 5) {
			System.out.println("Maio");
		}
		else if (valor == 6) {
			System.out.println("Junho");
		}
		else if (valor == 7) {
			System.out.println("Julho");
		}
		else if (valor == 8) {
			System.out.println("Agosto");
		}
		else if (valor == 9) {
			System.out.println("Setembro");
		}
		else if (valor == 10) {
			System.out.println("Outubro");
		}
		else if (valor == 11) {
			System.out.println("Novembro");
		}
		else if (valor == 11) {
			System.out.println("Dezembro");
		}
		else {
			System.out.println("Mês Invalido");
		}
	}

}
