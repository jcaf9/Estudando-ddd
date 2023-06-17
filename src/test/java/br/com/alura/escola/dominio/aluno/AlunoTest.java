package br.com.alura.escola.dominio.aluno;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AlunoTest {

	private Aluno aluno;

	@BeforeEach
	void beforeEach() {
		this.aluno = new Aluno(new CPF("448.825.298-23"), "João", new Email("jcaferreira9@gmail.com"));
	}

	// Criar métodos para adicionar 1,2 e 3 telefones

	@Test
	public void adiciona1Telefone() {
		this.aluno.adicionarTelefone("15", "981857694");
		org.junit.jupiter.api.Assertions.assertEquals(1, this.aluno.getTelefones().size());
	}

	@Test
	public void adiciona2Telefones() {
		this.aluno.adicionarTelefone("15", "981857694");
		this.aluno.adicionarTelefone("15", "981857694");
		org.junit.jupiter.api.Assertions.assertEquals(2, this.aluno.getTelefones().size());
	}

	@Test
	public void adiciona3Telefones() {
		this.aluno.adicionarTelefone("15", "981857694");
		this.aluno.adicionarTelefone("15", "981857694");
		this.aluno.adicionarTelefone("15", "981857694");
		org.junit.jupiter.api.Assertions.assertEquals(3, this.aluno.getTelefones().size());
	}

}
