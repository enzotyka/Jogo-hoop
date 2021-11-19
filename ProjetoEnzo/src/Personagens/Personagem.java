package Personagens;

public class Personagem {
	private int ataque;
	private int defesa;
	private String nick;
	private double vida;
	private boolean turnoDefesa = false;
	
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
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public double getVida() {
		return vida;
	}
	public void setVida(double d) {
		this.vida = d;
	}
	public int atacar(){
		return 0;
	}
	
	public boolean isTurnoDefesa() {
		return turnoDefesa;
	}
	
	public void setTurnoDefesa(boolean turnoDefesa) {
		this.turnoDefesa = turnoDefesa;
	}
	
	public Personagem(int ataque, int defesa, String nick, double vida) {
		this.ataque = ataque;
		this.defesa = defesa;
		this.nick = nick;
		this.vida = vida;
	}
	
	public void defendendoAtaque(double damage) {
	}
	
	public String toString() {
		System.out.println("===============================");
		System.out.println("Nick   =  " + this.nick);
		System.out.println("Vida   =  " + this.vida);
		System.err.println("Ataque =  " + this.ataque);
		System.out.println("Defesa =  " + this.defesa);
		System.out.println("===============================");
		return null;
	}
}
