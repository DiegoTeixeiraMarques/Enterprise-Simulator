import java.util.*;

public class Empresa {

	ArrayList<Pessoa> funcionarios;
	int inovacao;
	int culturaOrg;
	int atendimento;
	int satisfacaoCliente;
	int qualidade;
	int tecnologia;
	
	public Empresa(ArrayList<Pessoa> funcionarios) {
		
		this.funcionarios = funcionarios;
		this.contratar();
		
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
	
	public void contratar() {
		
		int B = 1;
		int C = 10;

		for(int index = 0; index < this.funcionarios.size(); index++) {
			
			this.tecnologia += (this.funcionarios.get(index).habilidades.resultado * C) + 
								(this.funcionarios.get(index).habilidades.resiliencia) + 
									(this.funcionarios.get(index).habilidades.relacionamento) +
										(this.funcionarios.get(index).habilidades.intelTecnica * C) +
											(this.funcionarios.get(index).habilidades.criatividade * C) +
												(this.funcionarios.get(index).habilidades.comunicacao * C) +
													(this.funcionarios.get(index).habilidades.comprometimento * C) +
														(this.funcionarios.get(index).habilidades.adaptacao);
			this.satisfacaoCliente += (this.funcionarios.get(index).habilidades.resultado * C) + 
					(this.funcionarios.get(index).habilidades.resiliencia) + 
						(this.funcionarios.get(index).habilidades.relacionamento) +
							(this.funcionarios.get(index).habilidades.intelTecnica * 3) +
								(this.funcionarios.get(index).habilidades.criatividade) +
									(this.funcionarios.get(index).habilidades.comunicacao * C) +
										(this.funcionarios.get(index).habilidades.comprometimento * C) +
											(this.funcionarios.get(index).habilidades.adaptacao);
			this.qualidade += (this.funcionarios.get(index).habilidades.resultado * C) + 
					(this.funcionarios.get(index).habilidades.resiliencia) + 
						(this.funcionarios.get(index).habilidades.relacionamento * C) +
							(this.funcionarios.get(index).habilidades.intelTecnica * C) +
								(this.funcionarios.get(index).habilidades.criatividade * B) +
									(this.funcionarios.get(index).habilidades.comunicacao) +
										(this.funcionarios.get(index).habilidades.comprometimento * C) +
											(this.funcionarios.get(index).habilidades.adaptacao);
			this.inovacao += (this.funcionarios.get(index).habilidades.resultado * C) + 
					(this.funcionarios.get(index).habilidades.resiliencia * B) + 
						(this.funcionarios.get(index).habilidades.relacionamento * B) +
							(this.funcionarios.get(index).habilidades.intelTecnica * C) +
								(this.funcionarios.get(index).habilidades.criatividade * C) +
									(this.funcionarios.get(index).habilidades.comunicacao * C) +
										(this.funcionarios.get(index).habilidades.comprometimento * C) +
											(this.funcionarios.get(index).habilidades.adaptacao);
			this.culturaOrg += (this.funcionarios.get(index).habilidades.resultado) + 
					(this.funcionarios.get(index).habilidades.resiliencia * C) + 
						(this.funcionarios.get(index).habilidades.relacionamento * C) +
							(this.funcionarios.get(index).habilidades.intelTecnica) +
								(this.funcionarios.get(index).habilidades.criatividade) +
									(this.funcionarios.get(index).habilidades.comunicacao * C) +
										(this.funcionarios.get(index).habilidades.comprometimento * B) +
											(this.funcionarios.get(index).habilidades.adaptacao * C);
			this.atendimento += (this.funcionarios.get(index).habilidades.resultado * B) + 
					(this.funcionarios.get(index).habilidades.resiliencia) + 
						(this.funcionarios.get(index).habilidades.relacionamento * C) +
							(this.funcionarios.get(index).habilidades.intelTecnica) +
								(this.funcionarios.get(index).habilidades.criatividade * C) +
									(this.funcionarios.get(index).habilidades.comunicacao * C) +
										(this.funcionarios.get(index).habilidades.comprometimento * C) +
											(this.funcionarios.get(index).habilidades.adaptacao);
		}
		
		this.tecnologia = this.tecnologia / 100;
		this.satisfacaoCliente = this.satisfacaoCliente / 100;
		this.qualidade = this.qualidade / 100;
		this.inovacao = this.inovacao / 100;
		this.culturaOrg = this.culturaOrg / 100;
		this.atendimento = this.atendimento / 100;
	}
	
	
}
