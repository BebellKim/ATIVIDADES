package aula_3;

import java.util.Scanner;

public class idade {
	public static void main(String[] args) {
		
		Scanner ler =  new Scanner (System.in);
		int idade;
		
		System.out.println("Informe sua idade:");
		idade = ler.nextInt();
		
		String mensagem = idade >= 18? "Maior de idade" : "Menor de idade";
		System.out.println(mensagem); // imprime "Maior de idade"
	}
}
