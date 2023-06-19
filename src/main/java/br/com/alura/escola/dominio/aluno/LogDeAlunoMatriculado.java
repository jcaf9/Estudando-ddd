package br.com.alura.escola.dominio.aluno;

public class LogDeAlunoMatriculado {

	public void reageAo(AlunoMatriculado evento) {
		System.out.println(
				String.format("Aluno com CPF %s matriculado em %s", 
						evento.getCpfDoAluno(), evento.getMomento()));
	}

}
