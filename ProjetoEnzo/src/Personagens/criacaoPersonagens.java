package Personagens;

import java.util.Scanner;

import Armas.Arma;

public class criacaoPersonagens {
	public Personagem criaJogador() {
		
		Scanner input = new Scanner(System.in);

		int opcaoClasse, opcaoArma;
		String nomePers;
		System.out.println("1-Mago");
		System.out.println("2-Guerreiro");
		System.out.println("3-Arqueiro");
		System.out.print("Escolha uma classe: ");
		opcaoClasse = input.nextInt();
		while(opcaoClasse != 1 && opcaoClasse != 2 && opcaoClasse != 3) {
			System.out.println("Opção invalida, tente novamente: ");
			opcaoClasse = input.nextInt();
		}
		switch (opcaoClasse) {
			case 1: {
				System.out.print("Escolha um nome para seu MAGO: ");
				nomePers = input.next();
				System.out.println("\n\n");
				System.out.println("1-VARINHA ATQ:16 || DEF:9");
				System.out.println("2-CAJADO  ATQ:13 || DEF:12");
				System.out.println("Escolha uma arma para " + nomePers + ": ");
				opcaoArma = input.nextInt();
				while(opcaoArma != 1 && opcaoArma != 2) {
					System.out.println("Opção invalida, tente novamente: ");
					opcaoArma = input.nextInt();
				}
				Magos mago = new Magos(200, 20, 10, nomePers);
				mago.setArma(opcaoArma);
				return mago;
			}
			case 2: {
				System.out.print("Escolha um nome para seu GUERREIRO: ");
				nomePers = input.next();
				System.out.println("\n\n");
				System.out.println("1-MACHADO ATQ:17 || DEF:8");
				System.out.println("2-ESPADA  ATQ:10 || DEF:15");
				System.out.println("Escolha uma arma para " + nomePers + ": ");
				opcaoArma = input.nextInt();
				while(opcaoArma != 1 && opcaoArma != 2) {
					System.out.println("Opção invalida, tente novamente: ");
					opcaoArma = input.nextInt();
				}
				Guerreiros guerreiro = new Guerreiros(180, 30, 20, nomePers);
				guerreiro.setArma(opcaoArma);
				return guerreiro;
			}
			case 3: {
				System.out.print("Escolha um nome para seu ARQUEIRO: ");
				nomePers = input.next();
				System.out.println("\n\n");
				System.out.println("1-LongBow ATQ:12 || DEF:13");
				System.out.println("2-Balestra  ATQ:15 || DEF:10");
				System.out.println("Escolha uma arma para " + nomePers + ": ");
				opcaoArma = input.nextInt();
				while(opcaoArma != 1 && opcaoArma != 2) {
					System.out.println("Opção invalida, tente novamente: ");
					opcaoArma = input.nextInt();
				}
				Arqueiros arqueiro = new Arqueiros(160, 200, 30, nomePers);
				arqueiro.setArma(opcaoArma);
				return arqueiro;
			}
		}
		return null;
	}
}
