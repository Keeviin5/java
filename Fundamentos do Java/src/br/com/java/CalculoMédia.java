package br.com.java;

import java.util.Scanner;

public class CalculoM�dia {

	public static void main(String[] args) {
		// a linha a abaixo cria vari�veis do tipo real
		float nota1,nota2,media;
		// entrada 
		System.out.print("Digite a nota1: ");
		// a linha abaixo cria um objeto de nome teclado usando o Scanner
		Scanner teclado = new Scanner(System.in);
		// a linha abaixo usa o objeto teclado para capturar o que foi digitado
		// digitado no console e armazenar na vari�vel nota1
		nota1 = teclado.nextFloat();
		System.out.print("Digite a nota2: ");
		nota2 = teclado.nextFloat();
		// processamento
		media = (nota1+nota2) / 2;
		//saida
		// + concatena(junta) um texto com o conte�do da variavel media
		System.out.println("M�dia final:" + media);
		// estrutura condicional encadeada para verificar o status do aluno :
		// menor ou igual a 2 REPROVADO
		// entre 2 e 5 - RECUPERA�AO
		// maior ou igual a 5 - APROVADO 
		
		if (media <= 2) {
			System.out.println("REPROVADO");
		} else if (media > 2 && media < 5) {
			System.out.println("RECUPERA�AO");
		} else if (media >= 5) {
			System.out.println();
			 
		} else {
			
		}
	}

}
