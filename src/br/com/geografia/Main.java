package br.com.geografia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String entrada = sc.nextLine();

		Cidade cidadeEntrada = new Cidade(entrada);
		ListaCidades listaCidades = new ListaCidades();

		Cidade cidadeEncontrada = listaCidades.encontrarCidades(cidadeEntrada);

		System.out.println(cidadeEncontrada);

		sc.close();
	}
}
