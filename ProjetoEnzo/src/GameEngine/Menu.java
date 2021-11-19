package GameEngine;

import java.util.Scanner;
import Personagens.criacaoPersonagens;

public class Menu {

	public static void main(String[] args) {
		
		criacaoPersonagens criacao = new criacaoPersonagens();
		Engine engine = new Engine();
		Scanner input = new Scanner(System.in);
		
		int opcaoMenu = 0;

		while(opcaoMenu != 3) {
			System.out.println("\n\n\n");
			System.out.println("=========================================");
			System.out.println("==============Heroes of OOP==============");
			System.out.println("=========================================");
	
			System.out.println("1-Criar novo personagem");
			System.out.println("2-Iniciar jogo");
			System.out.println("3-Encerrar o jogo");
			
			System.out.print("Escolha uma opção para iniciar o jogo: ");
			opcaoMenu = input.nextInt();
			
			switch (opcaoMenu) {
				case 1: {
					engine.addNewPersonagem(criacao.criaJogador());
					break;
				}
				case 2: {
					engine.start();
					break;
				}
				case 3: {
					opcaoMenu=3;
					break;
				}
				case 4:{
					engine.listarPersonagens();
				}
			}
		}
	}

}
