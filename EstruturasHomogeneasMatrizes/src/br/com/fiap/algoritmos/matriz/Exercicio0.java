package br.com.fiap.algoritmos.matriz;

import java.util.Scanner;

public class Exercicio0 {

	public static void main(String[] args) {
		
		double alunosNotas[][] = new double[3][3];
		Scanner entrada = new Scanner(System.in);
		String nomesAlunos[] = new String[3];
		double soma = 0.0;
		
		// CADASTRAR NOMES DOS ALUNOS
		for(int i = 0; i < nomesAlunos.length; i++) {
			System.out.println("Insira o nome do aluno [" + (i+1) + "]:");
			nomesAlunos[i] = entrada.nextLine();
		}
		
		// CADASTRAR NOTAS DOS ALUNOS
		// Primeiro FOR utilizado para linhas
		for(int linhas = 0; linhas < alunosNotas.length; linhas++) {
			
			// Segundo FOR utilizado para colunas
			for(int colunas = 0; colunas < alunosNotas[linhas].length; colunas ++) {
				System.out.println("Insira a nota [" + (colunas+1) + "]:");
				alunosNotas[linhas][colunas] = entrada.nextDouble();
			}
		}
		
		// EXIBE RELATORIO DE NOTAS DOS ALUNOS
		// Primeiro FOR utilizado para linhas
		
		System.out.println("Relatório de Notas dos Alunos:\n");
		
		for(int linhas = 0; linhas < alunosNotas.length; linhas++) {

			System.out.println("Aluno [" + nomesAlunos[linhas] + "]:");
			
			// Segundo FOR utilizado para colunas
			for(int colunas = 0; colunas < alunosNotas[linhas].length; colunas ++) {
				System.out.println("\tNota [" + (colunas+1) + 
						           "] = " + alunosNotas[linhas][colunas]);
				soma = soma + alunosNotas[linhas][colunas];
			}
			
			System.out.println("\tMédia Final = " + (soma / alunosNotas[linhas].length));
			
			System.out.println("------------------------------------------------------");
			
			soma = 0.0;
		}
		
		entrada.close();
	}
}
