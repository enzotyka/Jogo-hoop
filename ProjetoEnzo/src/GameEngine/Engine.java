package GameEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import Personagens.Dragao;
import Personagens.Personagem;

public class Engine {
	private List<Personagem> personagens = new ArrayList<Personagem>();

	Dragao dragao = new Dragao();
	Scanner input = new Scanner(System.in);
	Random random = new Random();

	int turno = 0, acaoTurno;
	public void start() {
		while(personagens.size() > 0 && dragao.getVida() > 0) {
			turno++;
			//for para decidir a ação de cada personagem em determinado turno
			for(Personagem personagemTurno : personagens) {
				System.out.println("==============================");
				System.out.println("1-Atacar");
				System.out.println("2-Defender");
				System.out.print(personagemTurno.getNick() + " escolha uma ação para o turno " + turno +": ");
				acaoTurno = input.nextInt();
				if(acaoTurno == 1) {
					dragao.setVida(personagemTurno.atacar());
					System.out.println(personagemTurno.getNick()+ " atacou o dragao, vida resultante: " + dragao.getVida());
				}else if(acaoTurno == 2) {
					personagemTurno.setTurnoDefesa(true);
				}
			}
			if(dragao.getVida()>0) {
				int alvo = random.nextInt(personagens.size());
				personagens.get(alvo).defendendoAtaque(dragao.getAtaque());
				if(personagens.get(alvo).getVida()<=0){
					System.out.println(personagens.get(alvo).getNick() + " morreu, seu personagem virou cinzas");
					personagens.remove(alvo);
				}
			}
			resetTurnoDefesa();
		}
		if(personagens.size()==0){
			System.out.println("O dragao derrotou voce !!! GAME OVER");
		} else {
			System.out.println("Voce derrotou o dragao, parabens !!!");
		}
	}
	
	public void addNewPersonagem(Personagem personagem) {
		this.personagens.add(personagem);
	}
	
	public void listarPersonagens() {
		for(Personagem personagem : personagens) {
			personagem.toString();
		}
	}
	
	public void resetTurnoDefesa() {
		for(Personagem personagem : personagens) {
			personagem.setTurnoDefesa(false);
		}
	}
}
