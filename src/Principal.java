import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];
		
		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Produto (nome, preco);	
		}
		
		double soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
			}
		
		double media = soma / vetor.length;
		
		System.out.printf("Media de preços: %.2f%n", media);
	}

}
