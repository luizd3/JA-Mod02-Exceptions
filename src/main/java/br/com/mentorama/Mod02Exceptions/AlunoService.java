package br.com.mentorama.Mod02Exceptions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class AlunoService {

    public List<String> findAll() {
        // Pegar o caminho de um arquivo que está dentro da pasta Resources e salvar numa variável:
//        String caminho = AlunoService.class.getClassLoader()
//                .getResource("alunos.txt").getPath();

        Path caminho = new File(getClass()
                .getResource("/alunos.txt")
                .getFile()).toPath();

        try {
            List<String> alunos = Files.readAllLines(Path.of("teste")); // Alternativa: Paths.get(caminho)
            return alunos;
        } catch (IOException ioexception) {
            throw new RuntimeException("Arquivo não encontrado");
//            return Collections.singletonList(String.valueOf(10 / 0));
        }
    }


}
