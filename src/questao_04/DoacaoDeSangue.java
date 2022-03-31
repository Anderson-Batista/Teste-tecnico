package questao_04;

import java.util.Scanner;

public class DoacaoDeSangue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sua idade:");
		int idade = sc.nextInt();

		if (idade >= 18 && idade <= 67) {
			System.out.println("você pode doar sangue.");
		} else {
			System.out.println("você não pode doar sangue.");
		}

		sc.close();
	}

}
