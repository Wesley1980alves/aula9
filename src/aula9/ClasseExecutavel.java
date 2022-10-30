package aula9;

import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class ClasseExecutavel {
	public static final String ANSI_RESET = "\u001B[0m";

	public static final String ANSI_RED = "\u001B[41m";

	public static void main(String[] args) {
		Random gerando = new Random();
		int maior = 0;
		String posicao = " ";
		int[][] matriz = new int[3][3];
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				matriz[linha][coluna] = gerando.nextInt(9);
				System.out.print(ANSI_RED + "[" + matriz[linha][coluna] + "]" + ANSI_RESET);
			}
			System.out.println();

		}
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz.length; coluna++) {
				if (matriz[linha][coluna] > maior) {
					maior = matriz[linha][coluna];
					posicao= "Linha  ["+(linha+1)+"] Coluna ["+ (coluna+1)+"]";
					

				}
				

			}

			
		}System.out.println("Maior Numero  [" + maior + "]");
		System.out.println(posicao);
	}
}
