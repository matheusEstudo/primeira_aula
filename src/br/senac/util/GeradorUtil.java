package br.senac.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeradorUtil {

    public static String gerarNmero() {
        String cpf = "";

        for (int i = 0; i < 11; i++) {
            cpf += (int) (Math.random() * 10);
        }
        return cpf;
    }

    public static String nomeAleatorio() {
        List<String> listaNome = Arrays.asList("matheus", "jonathas", "vitor",
                "nataly", "luiza", "maria", "silvio",
                "joão", "vinicius", "heloisa", "livia",
                "luciana", "carlos", "carla", "mário");
        Collections.sort(listaNome);
        return listaNome.get(0);
        
    }
    
    public static String trabalhoAleatorio() {
        List<String> listaTrabalho = Arrays.asList("dev", "engenheiro", "tecnico",
                "professor", "cozinheiro", "cantor", "dancaria",
                "caixa", "eletricista");
        Collections.sort(listaTrabalho);
        return listaTrabalho.get(0);
    }
    
    public static String formatarCpf() {
        return null;
    }


    public static void main(String[] args) {
    }
}
