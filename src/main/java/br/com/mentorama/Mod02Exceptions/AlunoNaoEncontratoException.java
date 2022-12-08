package br.com.mentorama.Mod02Exceptions;

public class AlunoNaoEncontratoException extends Exception {
    public AlunoNaoEncontratoException(String nome) {
        super("Nome " + nome + " não encontrado.");
    }
}
