package br.com.mentorama.Mod02Exceptions;

public class AlunosMain {

	public static void main(String[] args) {
		AlunoService alunoService = new AlunoService();
		alunoService.findAll().stream().forEach(System.out::println);
//		System.out.println("SUCESSO");

//		String stringX = null;
//		String stringX = args[3];

//		if (args.length > 0) {
//			String stringX = args[0];
//			System.out.println(stringX.contains("x"));
//		} else {
//			System.out.println("Não tem nada");
//		}

	}

}
