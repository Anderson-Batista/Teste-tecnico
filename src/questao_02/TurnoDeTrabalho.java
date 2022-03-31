package questao_02;

import java.util.Scanner;

public class TurnoDeTrabalho {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Em que turno você trabalha:\nM-matutino\nV-vespertino\nN-noturno");
		System.out.println("OBS: digitar valores M, V ou N em maisculo.");
		String turno = sc.next();

		switch (turno) {
		case "M":
			System.out.println("Bom dia!");
			break;
		case "V":
			System.out.println("Bom tarde!");
			break;
		case "N":
			System.out.println("Bom noite!");
			break;
		default:
			System.out.println("Valor inválido!");
			break;
		}
		sc.close();
	}
}
