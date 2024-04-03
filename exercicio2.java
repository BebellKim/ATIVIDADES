package aula_3;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
	
		Scanner ler =  new Scanner (System.in);

		System.out.println("Informe um dia da semana de Domingoa Sabado: ");
		String dia = ler.next();
		
		switch (dia) {

		case "domingo":
			System.out.println("Domingo é equivalente ao dia 1");
			break;

		case "segunda":
			System.out.println("Segunda é equivalente ao dia 2");
		    break;
		    
		case "terça":
			System.out.println("Terça é equivalente ao dia 3");
		    break;
		    
		case "quarta" :
			System.out.println("Quarta é equivalente ao dia 4");
		    break;
		    
		case "quinta" :
			System.out.println("Quinta é equivalente ao dia 5");
		    break;
		    
		case "sexta" :
			System.out.println("Sexta é equivalente ao dia 6");
		    break;
		    
		case "sabado" :
			System.out.println("sabado é equivalente ao dia 7 ");
		    break;
		    
		default:
			System.out.println("Dia inválido");
		    
		   



	}

}
