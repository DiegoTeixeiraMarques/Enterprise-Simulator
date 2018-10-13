import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Personalidade reflexivoExt = new Personalidade("ReflexivoExt", 8, 3, 9, 5, 6, 7, 9, 7);
		Personalidade reflexivoInt = new Personalidade("ReflexivoInt", 6, 2, 8, 5, 9, 10, 6, 4);
		Personalidade sentimentalExt = new Personalidade("SentimentalExt", 7, 10, 2, 10, 6, 7, 8, 2);
		Personalidade sentimentalInt = new Personalidade("SentimentalInt", 8, 2, 3, 2, 8, 8, 9, 4);
		Personalidade perceptivoExt = new Personalidade("PerceptivoExt", 5, 7, 6, 6, 10, 9, 8, 7);
		Personalidade perceptivoInt = new Personalidade("PerceptivoInt", 6, 8, 7, 8, 9, 8, 6, 5);
		Personalidade intuitivoExt = new Personalidade("IntuitivoExt", 8, 3, 8, 3, 9, 8, 10, 6);
		Personalidade intuitivoInt = new Personalidade("IntuitivoInt", 6, 9, 9, 7, 10, 8, 9, 8);
		
		Personalidade max = new Personalidade("Maximo", 5, 5, 5, 5, 5, 5, 5, 5);
		Maquina maquina = new Maquina(0, 5, 5, 5);
		
		//ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		ArrayList<Pessoa> reflexivoExt1 = new ArrayList<Pessoa>();
		ArrayList<Pessoa> reflexivoInt2 = new ArrayList<Pessoa>();
		ArrayList<Pessoa> sentimentalExt3 = new ArrayList<Pessoa>();
		ArrayList<Pessoa> sentimentalInt4 = new ArrayList<Pessoa>();
		ArrayList<Pessoa> perceptivoExt5 = new ArrayList<Pessoa>();
		ArrayList<Pessoa> perceptivoInt6 = new ArrayList<Pessoa>();
		ArrayList<Pessoa> intuitivoExt7 = new ArrayList<Pessoa>();
		ArrayList<Pessoa> intuitivoInt8 = new ArrayList<Pessoa>();
		ArrayList<Maquina> maquinas = new ArrayList<Maquina>();
		
		
		ArrayList<Pessoa> maximo = new ArrayList<Pessoa>();
	
		
		reflexivoExt1.add(new Pessoa("ReflexivoExt", reflexivoExt));
		reflexivoInt2.add(new Pessoa("ReflexivoInt", reflexivoInt));
		sentimentalExt3.add(new Pessoa("SentimentalExt", sentimentalExt));
		sentimentalInt4.add(new Pessoa("SentimentalInt", sentimentalInt));
		perceptivoExt5.add(new Pessoa("PerceptivoExt", perceptivoExt));
		perceptivoInt6.add(new Pessoa("PerceptivoInt", perceptivoInt));
		intuitivoExt7.add(new Pessoa("IntuitivoExt", intuitivoExt));
		intuitivoInt8.add(new Pessoa("IntuitivoInt", intuitivoInt));
		maquinas.add(maquina);
		/*
		for(int i=0;i<20;i++) {
			maximo.add(new Pessoa("Maximo0", max));
		//maximo.add(new Pessoa("Maximo1", max));
		//maximo.add(new Pessoa("Maximo2", max));
		//maximo.add(new Pessoa("Maximo3", max));
		
		}
		*/
		maximo.add(new Pessoa("Maximo4", max));
		//maximo.add(new Pessoa("Maximo4", max));
		/*
		for(int index = 0; index < pessoas.size(); index++) {
			Pessoa pes = (Pessoa) pessoas.get(index);
			System.out.println(pes.nome + " : " + pes.habilidades.tipo + " --> " + pes.somarHabilidades());	
		}
		*/
		
		Empresa A1 = new Empresa(reflexivoExt1);
		System.out.println();
		Pessoa B1 = A1.funcionarios.get(0);
		System.out.println(B1.nome);
		A1.status();
		
		Empresa A2 = new Empresa(reflexivoInt2);
		System.out.println();
		Pessoa B2 = A2.funcionarios.get(0);
		System.out.println(B2.nome);
		A2.status();
		
		Empresa A3 = new Empresa(sentimentalExt3);
		System.out.println();
		Pessoa B3 = A3.funcionarios.get(0);
		System.out.println(B3.nome);
		A3.status();
		
		Empresa A4 = new Empresa(sentimentalInt4);
		System.out.println();
		Pessoa B4 = A4.funcionarios.get(0);
		System.out.println(B4.nome);
		A4.status();
		
		Empresa A5 = new Empresa(perceptivoExt5);
		System.out.println();
		Pessoa B5 = A5.funcionarios.get(0);
		System.out.println(B5.nome);
		A5.status();
		
		Empresa A6 = new Empresa(perceptivoInt6);
		System.out.println();
		Pessoa B6 = A6.funcionarios.get(0);
		System.out.println(B6.nome);
		A6.status();
		
		Empresa A7 = new Empresa(intuitivoExt7);
		System.out.println();
		Pessoa B7 = A7.funcionarios.get(0);
		System.out.println(B7.nome);
		A7.status();
		
		Empresa A8 = new Empresa(intuitivoInt8);
		System.out.println();
		Pessoa B8 = A8.funcionarios.get(0);
		System.out.println(B8.nome);
		A8.status();
		
		Empresa A9 = new Empresa(maximo);
		//A9.comprarMaquina(maquinas);
		System.out.println();
		Pessoa B9 = A9.funcionarios.get(0);
		System.out.println(B9.nome);
		A9.status();
		
		System.out.println();
		System.out.println(maquina.sofisticacao);
		
		
		
	}

}
