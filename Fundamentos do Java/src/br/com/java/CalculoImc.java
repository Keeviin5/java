package br.com.java;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		// a linha abaixo cria vari�veis num�ricas de precis�o
		// float e double s�o tipos primitivos num�ricos
		double peso,altura,imc;
		// entrada
		System.out.print("Digite seu peso em kg: ");
		// a linha abaixo cria um objeto de nome teclado usando o Scanner
		Scanner teclado = new Scanner(System.in);
		// a linha abaixo usa o objeto teclado para capturar o que foi digitado
		// digitando no console e armazenar no vari�vel peso
		peso = teclado.nextDouble();
		System.out.print("Digite a sua altura em metros: ");
		altura = teclado.nextDouble();
		// processamento 
		imc = peso/(altura * altura);
		//saida
		// o / divide o peso pela altura
		// o * multiplica a alutra pela altura
		System.out.println("resultado de imc : " + imc);	
		
	}
}
