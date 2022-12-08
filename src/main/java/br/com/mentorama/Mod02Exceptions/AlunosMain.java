package br.com.mentorama.Mod02Exceptions;

public class AlunosMain {

	public static void main(String[] args) {
		AlunoService alunoService = new AlunoService();
		try {
			final String aluno = alunoService.findAluno("Aluno 1");
			System.out.println(aluno);
		} catch (AlunoNaoEncontratoException e) {
			e.printStackTrace();
		}
	}
}
