package aula_3;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner ler =  new Scanner (System.in);
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Informe a primeira nota: ");
		nota1 = ler.nextInt();
		
		System.out.println("Informe a segunda nota: ");
		nota2 = ler.nextInt();
		
		System.out.println("Informe a terceira nota: ");
		nota3 = ler.nextInt();
		
		System.out.println("Informe a quarta nota: ");
		nota4 = ler.nextInt();
		
		media = (nota1+nota2+nota3+nota4) /4;
		
		String mensagem = media >= 6 ? "Aprovado" : "Reprovado";
		System.out.println(mensagem);





	}

}
