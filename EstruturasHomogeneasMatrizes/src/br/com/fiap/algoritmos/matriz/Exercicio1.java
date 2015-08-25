package br.com.fiap.algoritmos.matriz;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		int m[][] = new int[2][2];
		int r[][] = new int[2][2];
		
		// Carregar matriz M
		m[0][0] = 7;
		m[0][1] = 3;
		m[1][0] = 10;
		m[1][1] = 1;
		
		// Seto o menor numero inteiro possivel
		int maiorNumero = Integer.MIN_VALUE;
		
		// PERCORRER MATRIZ M E OBTER MAIOR NUMERO
		for(int linhas = 0; linhas < m.length; linhas++) {
			
			for(int colunas = 0; colunas < m[linhas].length; colunas++) {
				
				if(m[linhas][colunas] > maiorNumero) {
					maiorNumero = m[linhas][colunas]; 
				}
			}
		}
		
		// PERCORRER MATRIZ M E CALCULAR VALOR PARA MATRIZ R
		for(int linhas = 0; linhas < m.length; linhas++) {
			
			for(int colunas = 0; colunas < m[linhas].length; colunas++) {
				
				r[linhas][colunas] = m[linhas][colunas] * maiorNumero;
				
				System.out.println("Matriz R [" + linhas + "] " + 
				                            "[" + colunas + "] = " +
						             r[linhas][colunas]);
			}
		}
		
		
	}
}
