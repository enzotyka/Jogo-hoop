package Personagens;
import Armas.Arma;

public class Magos extends Personagem {
	
	private Arma arma;
	
	public Magos(int vida, int ataque, int defesa, String nick) {
		super(ataque, defesa, nick, vida);
		// TODO Auto-generated constructor stub
	}
	
	public int atacar() {
		int finalDamage = super.getAtaque() + arma.getAtaque();
		return finalDamage;
	}
	
	public Arma getArma() {
		return arma;
	}

	public void setArma(int opcaoArma) {
		switch (opcaoArma) {
			case 1: {
				this.arma = new Arma(16, 9, "Varinha");
				break;
			}
			case 2: {
				this.arma = new Arma(13, 12, "cajado");
				break;
			}
		}
	}

	public void defendendoAtaque(double damage) {
		if(isTurnoDefesa()) {
			this.setVida(this.getVida()-(damage-((this.getDefesa()+arma.getDefesa())*1.1)));
		}else {
			this.setVida(this.getVida()-(damage-(this.getDefesa()+arma.getDefesa())));
		}
		System.out.println("O dragao atacou voce, vida resultante: " + this.getVida());
	}
	
	@Override
	public String toString() {
		System.out.println("===============================");
		System.out.println("Nick    =  " + this.getNick());
		System.out.println("Vida    =  " + this.getVida());
		System.out.println("Ataque  =  " + this.getAtaque());
		System.out.println("Defesa  =  " + this.getDefesa());
		System.out.println("Arma    =  " + arma.getNome());
		System.out.println("Atq arma=  " + arma.getAtaque());
		System.out.println("Def arma=  " + arma.getDefesa());
		System.out.println("===============================");
		return null;
	}
	
	}