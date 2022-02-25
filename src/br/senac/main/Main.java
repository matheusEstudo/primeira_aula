package br.senac.main;

import br.senac.entidade.Pessoa;
import br.senac.entidade.Trabalho;
import br.senac.util.GeradorUtil;

public class Main {

    public static void main(String[] args) {
        Trabalho trabalho = new Trabalho(GeradorUtil.trabalhoAleatorio(),
                Double.valueOf((int) (Math.random() * 1000000)), 
                String.valueOf((int) (Math.random() * 25)) + " hora");

        Pessoa pessoa = new Pessoa(GeradorUtil.nomeAleatorio(),
                (int) (Math.random() * 100), "12345678998", trabalho);

        System.out.println("nome: " + pessoa.getNome());
        System.out.println("cpf: " + pessoa.getCpf());
        System.out.println("idade: " + pessoa.getIdade());
        System.out.println("trabalho: " + pessoa.getTrabalho().getNomeTrabalho());
        System.out.println("salário: " + pessoa.getTrabalho().getSalario());
        System.out.println("cargo horario: " + pessoa.getTrabalho().getCargoHorario());
    }

}
