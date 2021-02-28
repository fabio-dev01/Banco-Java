/*
@autor: José Fábio
Github: fabio-dev01
*/

import java.util.Scanner;

public class Principal
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner (System.in);

		String nome;
		double saldo, valor;
		int opt;
			
		System.out.println("####################################");
		System.out.println("      Programa de Banco");
		System.out.println("####################################");

		System.out.println("Nome: ");
		nome = input.nextLine();
		System.out.println("-----------------");

		System.out.println("Saldo: ");
		saldo = input.nextDouble();
		System.out.println("-----------------");

		//instanciado objeto
		Usuario user = new Usuario(nome, saldo);
			
			user.setNome(nome);
			user.setSaldo(saldo);
do{


		System.out.println("####################################");
		System.out.println("      Nome: " +user.getNome());
		System.out.println("      Saldo:" +user.getSaldo());
		System.out.println("####################################");
		System.out.println("1 - Depositar");
		System.out.println("2 - Sacar");
		System.out.println("3 - Consultar");
		System.out.println("0 - Sair");
		System.out.println("-----------------------");
		System.out.println("  Escolha a opção: ");
		System.out.println("-----------------------");
		opt = input.nextInt();

		switch(opt){
			case 1:
				System.out.println("####################################");			
				System.out.println("      DEPOSITAR");
				System.out.println("####################################");
				System.out.println("Valor a depositar R$ ");
				System.out.println("-----------------------");
				valor = input.nextDouble();
				user.depositar(valor);
				System.out.println(valor + " Depositado!");
				System.out.println("-> Saldo atual: " +user.getSaldo());
				break;
			case 2:
				System.out.println("####################################");			
				System.out.println("      SACAR");
				System.out.println("####################################");
				System.out.println("Valor a sacar R$ ");
				System.out.println("-----------------------");
				valor = input.nextDouble();
				user.sacar(valor);
				System.out.println(valor + " Sacado!");
				System.out.println("-> Saldo atual: " +user.getSaldo());
				break;
			case 3:
				System.out.println("      SALDO ATUAL = " +user.getSaldo());
				break;
			default:
				System.out.println("Programa Encerrado.");
				System.exit(0);
		}
}while(opt > 0 && opt < 4);

	}
}