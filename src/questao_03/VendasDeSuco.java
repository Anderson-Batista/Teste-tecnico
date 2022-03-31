package questao_03;

import java.util.Scanner;

public class VendasDeSuco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escolha o tipo de suco\n L-Limao \n T-tamarindo");
		String tipoDeSuco = sc.next();
		
		if(tipoDeSuco.equals("L")) {
			System.out.println("informe a quantidade de litros de suco de limão vendidos");
			int qtdLitros = sc.nextInt();
			
			if(qtdLitros > 0 && qtdLitros <= 2) {
				System.out.println("O cliente pagará 97% do valor total do suco.");
			}
			else if(qtdLitros > 2 && qtdLitros <= 5) {
				System.out.println("O cliente pagará 100% do valor total do suco.");
			}
			else if(qtdLitros > 5) {
				System.out.println("O cliente pagará 95% do valor total do suco.");
			}
		}
		else if(tipoDeSuco.equals("T")) {
			System.out.println("informe a quantidade de litros de suco de tamarindo vendidos");
			int qtdLitros = sc.nextInt();
			
			if(qtdLitros > 0 && qtdLitros <= 2) {
				System.out.println("O cliente pagará 96% do valor total do suco.");
			}
			else if(qtdLitros > 2 && qtdLitros <= 5) {
				System.out.println("O cliente pagará 100% do valor total do suco.");
			}
			else if(qtdLitros > 5) {
				System.out.println("O cliente pagará 94% do valor total do suco.");
			}
		}
		else {
			System.out.println("Digite uma valor valido L ou T");
		}
		sc.close();
	}
	
}
