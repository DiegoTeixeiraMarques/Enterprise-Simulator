import java.util.*;

public class Maquina {
	
	//int id;
	int idade;            // atributos avaliados numa escala de 0 - 5, onde 0 p�ssimo e 5 excelente
	int produtividade;
	int depreciacao;
	int manuten��o;
	int sofisticacao;
	
	public Maquina(int idade, int produtividade, int depreciacao, int manutencao) {
		
		this.idade = idade;
		this.produtividade = produtividade;
		this.depreciacao = depreciacao;
		this.manuten��o = manutencao;
		this.sofisticacao = this.produtividade + this.manuten��o + this.depreciacao - this.idade;
		
	}
}
