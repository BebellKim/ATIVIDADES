package aula_3;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner ler =  new Scanner (System.in);
		double valor;
		
		 System.out.println("Informe um valor: ");
		 valor= ler.nextDouble();
		 
		 String mensagem = valor % 5 == 0 ? "O número é multiplo de 5" : "O Número não é multiplo de 5";
	     System.out.println(mensagem);
	}

}
