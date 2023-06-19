package br.com.alura.escola.dominio.aluno;

import java.time.LocalDateTime;

import br.com.alura.escola.dominio.Evento;

public class AlunoMatriculado implements Evento{

	private final CPF cpfDoAluno;
	private LocalDateTime momento;
	
	public AlunoMatriculado(CPF cpfDoAluno) {
		this.cpfDoAluno = cpfDoAluno;
		this.momento = LocalDateTime.now();
	}
	
	@Override
	public LocalDateTime momento() {
		return null;
	}

	public LocalDateTime getMomento() {
		return momento;
	}

	public void setMomento(LocalDateTime momento) {
		this.momento = momento;
	}

	public CPF getCpfDoAluno() {
		return cpfDoAluno;
	}

		
	
}
