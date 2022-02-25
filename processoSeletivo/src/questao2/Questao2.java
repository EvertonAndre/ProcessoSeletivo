package questao2;

import java.util.Scanner;

public class Questao2 {
	


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a=1;
		int b=0;
		int aux;
	
		
		System.out.println("Digite um número para saber se faz parte da sequencia de Fibonacci:");
		int numero = scanner.nextInt();
		
		for(int i=0; i<=numero; i++) {
			System.out.println(a);
			aux=a;
			a=a+b;
			b=aux;
			if(a == numero|| b == numero) {
				System.out.println(numero);
				System.out.println("O número " + numero +  " pertence a sequencia de fibonnaci");
				break;
			} else if(i == numero) {
				System.out.println("O número " + numero + " não pertence a sequencia de fibonnaci");
			}
				
			
			
	
		}
		
		
		
		
		
		
		scanner.close();
	}

}
