package models;

public class Rodadas {

	private long id;
	private Jogador jogador;
	private int qtdrodadas;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Jogador getJogador() {
		return jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public int getQtdrodadas() {
		return qtdrodadas;
	}

	public void setQtdrodadas(int qtdrodadas) {
		this.qtdrodadas = qtdrodadas;
	}

}
