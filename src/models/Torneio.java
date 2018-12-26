package models;

public class Torneio {

	private long id;
	private String nome;
	private int qtdRodadas;
	private int qtdJogadores;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtdRodadas() {
		return qtdRodadas;
	}

	public void setQtdRodadas(int qtdRodadas) {
		this.qtdRodadas = qtdRodadas;
	}

	public int getQtdJogadores() {
		return qtdJogadores;
	}

	public void setQtdJogadores(int qtdJogadores) {
		this.qtdJogadores = qtdJogadores;
	}

}
