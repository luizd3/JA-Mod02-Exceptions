package br.com.mentorama.Mod02Exceptions;

public class AlunosMain {

	public static void main(String[] args) {
		AlunoService alunoService = new AlunoService();
		alunoService.findAll().stream().forEach(System.out::println);
		System.out.println("SUCESSO");
	}

}
