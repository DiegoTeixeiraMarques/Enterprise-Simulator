import java.util.*;

public class Pessoa {
	
	//public int id;
	//public Date dataNascimento;
	public String nome;
	public Personalidade habilidades;
	
	public Pessoa(String nome, Personalidade habilidades) {
		this.nome = nome;
		this.habilidades = habilidades;
		
	}
	
	/*
	public int somarHabilidades() {
		int A = this.habilidades.resultado;
		int B = this.habilidades.resiliencia;
		int C = this.habilidades.relacionamento;
		int D = this.habilidades.intelTecnica;
		int E = this.habilidades.criatividade;
		int F = this.habilidades.comunicacao;
		int G = this.habilidades.comprometimento;
		int H = this.habilidades.adaptacao;
		
		return (A + B + C + D + E + F + G + H);
	}
	*/
}
