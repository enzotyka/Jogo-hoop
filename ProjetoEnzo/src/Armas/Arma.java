package Armas;

public class Arma {
	private int ataque;
	private int defesa;
	private String Nome;
	
	public Arma(int atq, int def, String nome) {
		this.ataque = atq;
		this.defesa = def;
		this.Nome = nome;
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
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
}
