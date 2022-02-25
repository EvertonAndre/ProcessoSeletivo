package questao5;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma palavra para ver sua inversão:");
		String palavraDigitada = scan.next();
		String palavraInvertida = "";

		for (int i = palavraDigitada.length() - 1; i >= 0; i--) {
			palavraInvertida = palavraInvertida + palavraDigitada.charAt(i);

		}

		System.out.println(palavraInvertida);
		scan.close();
	}

}
