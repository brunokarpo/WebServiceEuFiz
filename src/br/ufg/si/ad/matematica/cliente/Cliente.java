package br.ufg.si.ad.matematica.cliente;

import java.util.Scanner;

import br.ufg.si.ad.matematica.webservices.Matematica;
import br.ufg.si.ad.matematica.webservices.MatematicaService;



public class Cliente {

	public static void main(String[] args) {
		MatematicaService mat = new MatematicaService();
		Matematica x = mat.getPort(Matematica.class);

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o primeiro numero ");
		double num1 = entrada.nextDouble();
		entrada.nextLine();

		System.out.print("Digite o segundo numero ");
		double num2 = entrada.nextDouble();
		entrada.nextLine();

		System.out.println("Somando: " + x.somar(num1, num2));
		System.out.println("Subrair: " + x.subtrair(num1, num2));
		System.out.println("Multiplicar: " + x.multiplicar(num1, num2));
		System.out.println("Dividir: " + x.dividir(num1, num2));

	}

}
