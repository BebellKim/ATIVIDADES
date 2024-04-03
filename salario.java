package aula_3;

import java.util.Scanner;

public class salario {

	public static void main(String[] args) {
		
		Scanner ler =  new Scanner (System.in);
		double Salario, Tempo,Bonus,valor ;
		
		 System.out.println("Informe seu salário: ");
		 Salario= ler.nextDouble();
		 
		 System.out.println("Informe a quanto tempo você esta na empresa : ");
		 Tempo= ler.nextDouble();
		 
		 double resultado= Tempo % 7 >= 3 ? (Salario*0.07)+ Salario: (Salario*0.05)+ Salario;
		 System.out.println(resultado);
		 
		 
		 
	}

}
