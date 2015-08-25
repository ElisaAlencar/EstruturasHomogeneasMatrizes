package br.com.fiap.algoritmos.matriz;

import java.text.NumberFormat;
import java.util.Scanner;


//ADICIONANDO UM LINHA PELA INTERNET

/*
 * 
 * Faça um programa que preencha:
 * 
 * a. Um vetor com nomes de cinco produtos;
 * b. Uma matriz 5X4 com os preços dos cinco produtos em quatro lojas diferentes;
 * c. Outro vetor com o custo do transporte dos cinco produtos.
 * 
 * O programa deverá preencher uma segunda matriz 5X4 com os valores dos impostos 
 * de cada produto, de acordo com a tabela a seguir.
 * 
 * O programa deverá mostrar ainda um relatório com o nome do produto, o número da loja onde o 
 * produto é encontrado, o valor do imposto a pagar, o custo de transporte, 
 * o preço e o preço final (acrescido do valor do imposto e do custo do transporte).
 * 
 */

public class Exercicio3 {

	public static void main(String[] args) {

		String nomesProdutos[] = new String[2];
		double precosProdutosLojas[][] = new double[2][2];
		double custosTransportesProdutos[] = new double[2];
		double valoresImpostos[][] = new double[2][2];
		
		Scanner entrada = new Scanner(System.in);

		// CARREGA O NOME DOS PRODUTOS
		for (int i = 0; i < nomesProdutos.length; i++) {
			System.out.println("Insira o nome do Produto [" + (i+1) + "]:");
			nomesProdutos[i] = entrada.nextLine();
		}

		// CARREGA OS PRECOS DE CADA PRODUTO CADA LOJA
		for (int produtos = 0; produtos < precosProdutosLojas.length ; produtos++) {
			for (int lojas = 0; lojas < precosProdutosLojas[produtos].length; lojas++) {
				System.out.println("Insira o preço do produto [" + nomesProdutos[produtos] + "] referente a loja [" + (lojas+1) + "]:");
				precosProdutosLojas[produtos][lojas] = entrada.nextDouble();
				
				// CARREGA OS IMPOSTOS DE CADA PRODUTO EM TODAS AS LOJAS
				if(precosProdutosLojas[produtos][lojas] <= 50.00) {
					valoresImpostos[produtos][lojas] = 0.05;
				} else if(precosProdutosLojas[produtos][lojas] > 50.00 && 
						  precosProdutosLojas[produtos][lojas] <= 100.00) {
					valoresImpostos[produtos][lojas] = 0.1;
				} else {
					valoresImpostos[produtos][lojas] = 0.2;
				}
			}
		}
		
		// CARREGA OS CUSTOS DE TRANSPORTE DE CADA PRODUTO
		for (int produtos = 0; produtos < custosTransportesProdutos.length; produtos++) {
			System.out.println("Insira o custo de transporte do produto [" + nomesProdutos[produtos] + "]:");
			custosTransportesProdutos[produtos] = entrada.nextDouble();
		}
		
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		nfMoeda.setMaximumFractionDigits(2);
		
		// EXIBE RELATÓRIO FINAL CONTENDO O NOME DO PRODUTO, NÚMERO DA LOJA, VALOR DO IMPOSTO À PAGAR
		// CUSTO DE TRANSPORTE, PREÇO E PREÇO FINAL (ACRESCIDO DO VALOR DO IMPOSTO E DO CUSTO DO TRANSPORTE)
		System.out.println("Relatório Final de Produtos:\n");
		for (int produtos = 0; produtos < precosProdutosLojas.length ; produtos++) {

			System.out.println("\n\tDados do Produto: " + nomesProdutos[produtos]);
			for (int lojas = 0; lojas < precosProdutosLojas[produtos].length; lojas++) {
				System.out.println("\t\t\tDados da Loja Número: " + (lojas+1) + 
						           "\n\t\t\tValor do Imposto à Pagar: " + nfMoeda.format(valoresImpostos[produtos][lojas] * precosProdutosLojas[produtos][lojas]) +
						           "\n\t\t\tCusto de Transporte: " + nfMoeda.format(custosTransportesProdutos[produtos]) + 
						           "\n\t\t\tPreço do Produto: " + nfMoeda.format(precosProdutosLojas[produtos][lojas]) +
						           "\n\t\t\tPreço Final: " + nfMoeda.format(precosProdutosLojas[produtos][lojas] 
						        		                                   + ((precosProdutosLojas[produtos][lojas] * valoresImpostos[produtos][lojas])) 
						        		                                   + custosTransportesProdutos[produtos]));
				System.out.println("------------------------------------------------------------");
			}
		}
		
		entrada.close();
	}
}
