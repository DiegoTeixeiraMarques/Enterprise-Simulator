import java.util.*;

public class Maquina {
	
	//int id;
	int idade;            // atributos avaliados numa escala de 0 - 5, onde 0 péssimo e 5 excelente
	int produtividade;
	int depreciacao;
	int manutenção;
	int sofisticacao;
	
	public Maquina(int idade, int produtividade, int depreciacao, int manutencao) {
		
		this.idade = idade;
		this.produtividade = produtividade;
		this.depreciacao = depreciacao;
		this.manutenção = manutencao;
		this.sofisticacao = this.produtividade + this.manutenção + this.depreciacao - this.idade;
		
	}
}
