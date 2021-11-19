package Personagens;


public class Dragao{

	private double vida;
	private int ataque;
	private int defesa;
	private String nick;

	public double getVida() {
		return vida;
	}

	public void setVida(double damage) {
		this.vida = this.vida-(damage-this.defesa);
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	
	public String getNome() {
		return nick;
	}

	public void setNome(String nome) {
		this.nick = nome;
	}
	
	public Dragao() {
		this.vida = 300;
		this.nick ="LazyProg";
		this.ataque = 60;
		this.defesa = 30;
	}
	
}
