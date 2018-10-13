import java.util.*;

public class Empresa {

	ArrayList<Pessoa> funcionarios;
	ArrayList<Maquina> maquinas;
	int inovacao;
	int culturaOrg;
	int atendimento;
	int satisfacaoCliente;
	int qualidade;
	int tecnologia;
	
	
	public Empresa(ArrayList<Pessoa> funcionarios) {
		this.funcionarios = funcionarios;
		this.contratar(funcionarios);
		
	}
	
	public void status() {
		
		System.out.println("Inovação: " + this.inovacao);
		System.out.println("Cultura Org: " + this.culturaOrg);
		System.out.println("Atendimento: " + this.atendimento);
		System.out.println("Satisfacao Cliente: " + this.satisfacaoCliente);
		System.out.println("Qualidade: " + this.qualidade);
		System.out.println("Tecnologia: " + this.tecnologia);
		
		System.out.println("Quoeficiente Total: " 
								+ (this.tecnologia + this.satisfacaoCliente + 
										this.qualidade + this.inovacao + this.culturaOrg + 
											this.atendimento));
	}
	
	public void contratar(ArrayList<Pessoa> funcionarios) {
		
		int B = 2;
		int C = 3;

		for(int index = 0; index < funcionarios.size(); index++) {
			
			this.tecnologia += (funcionarios.get(index).habilidades.resultado * C) + 
								(funcionarios.get(index).habilidades.resiliencia) + 
									(funcionarios.get(index).habilidades.relacionamento) +
										(funcionarios.get(index).habilidades.intelTecnica * C) +
											(funcionarios.get(index).habilidades.criatividade * C) +
												(funcionarios.get(index).habilidades.comunicacao * C) +
													(funcionarios.get(index).habilidades.comprometimento * C) +
														(funcionarios.get(index).habilidades.adaptacao);
			this.satisfacaoCliente += (funcionarios.get(index).habilidades.resultado * C) + 
					(funcionarios.get(index).habilidades.resiliencia) + 
						(funcionarios.get(index).habilidades.relacionamento) +
							(funcionarios.get(index).habilidades.intelTecnica * 3) +
								(funcionarios.get(index).habilidades.criatividade) +
									(funcionarios.get(index).habilidades.comunicacao * C) +
										(funcionarios.get(index).habilidades.comprometimento * C) +
											(funcionarios.get(index).habilidades.adaptacao);
			this.qualidade += (funcionarios.get(index).habilidades.resultado * C) + 
					(funcionarios.get(index).habilidades.resiliencia) + 
						(funcionarios.get(index).habilidades.relacionamento * C) +
							(funcionarios.get(index).habilidades.intelTecnica * C) +
								(funcionarios.get(index).habilidades.criatividade * B) +
									(funcionarios.get(index).habilidades.comunicacao) +
										(funcionarios.get(index).habilidades.comprometimento * C) +
											(funcionarios.get(index).habilidades.adaptacao);
			this.inovacao += (funcionarios.get(index).habilidades.resultado * C) + 
					(funcionarios.get(index).habilidades.resiliencia * B) + 
						(funcionarios.get(index).habilidades.relacionamento * B) +
							(funcionarios.get(index).habilidades.intelTecnica * C) +
								(funcionarios.get(index).habilidades.criatividade * C) +
									(funcionarios.get(index).habilidades.comunicacao * C) +
										(funcionarios.get(index).habilidades.comprometimento * C) +
											(funcionarios.get(index).habilidades.adaptacao);
			this.culturaOrg += (funcionarios.get(index).habilidades.resultado) + 
					(funcionarios.get(index).habilidades.resiliencia * C) + 
						(funcionarios.get(index).habilidades.relacionamento * C) +
							(funcionarios.get(index).habilidades.intelTecnica) +
								(funcionarios.get(index).habilidades.criatividade) +
									(funcionarios.get(index).habilidades.comunicacao * C) +
										(funcionarios.get(index).habilidades.comprometimento * B) +
											(funcionarios.get(index).habilidades.adaptacao * C);
			this.atendimento += (funcionarios.get(index).habilidades.resultado * B) + 
					(funcionarios.get(index).habilidades.resiliencia) + 
						(funcionarios.get(index).habilidades.relacionamento * C) +
							(funcionarios.get(index).habilidades.intelTecnica) +
								(funcionarios.get(index).habilidades.criatividade * C) +
									(funcionarios.get(index).habilidades.comunicacao * C) +
										(funcionarios.get(index).habilidades.comprometimento * C) +
											(funcionarios.get(index).habilidades.adaptacao);
		}
		
			
		//this.tecnologia = this.tecnologia / 100;
		//this.satisfacaoCliente = this.satisfacaoCliente / 100;
		//this.qualidade = this.qualidade / 100;
		//this.inovacao = this.inovacao / 100;
		//this.culturaOrg = this.culturaOrg / 100;
		//this.atendimento = this.atendimento / 100;
	}
	
	public void comprarMaquina(ArrayList<Maquina> maquinas) {
		
		int B = 2;
		int C = 3;
		
		for(int index = 0; index < maquinas.size(); index++) {
			this.tecnologia += (maquinas.get(index).sofisticacao * C);			
			this.satisfacaoCliente += (maquinas.get(index).sofisticacao * C);				
			this.qualidade += (maquinas.get(index).sofisticacao * C);			
			this.inovacao += (maquinas.get(index).sofisticacao * B);									
			this.culturaOrg += (maquinas.get(index).sofisticacao);					
			this.atendimento += (maquinas.get(index).sofisticacao * B);
						
							
		}
	}
	
}
