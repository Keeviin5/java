package br.com.java;

import java.util.Scanner;

public class CalculadoraServico {

	public static void main(String[] args) {
		double remuneracao, custo, horas, servico, total, estimativa;
		Scanner teclado = new Scanner(System.in);
		System.out.println("_____Calculadora do Servi�o______");
		System.out.print("Remunera��o mensal: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo operacional mensal: ");
		custo =  teclado.nextDouble();
		System.out.print("Carga hor�ria mensal de trabalho: ");
		horas = teclado.nextDouble();
		servico = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / horas;
		System.out.print("valor da hora de servi�o: " + servico);
		System.out.println("");
		System.out.print("Estimativa de horas deste servi�o: ");
		estimativa = teclado.nextDouble();
		total = estimativa * servico;
		System.out.print("Valor a ser cobrado deste cliente: " + total);

	}

}
