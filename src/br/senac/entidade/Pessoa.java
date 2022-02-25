package br.senac.entidade;

public class Pessoa {

    private String nome;
    private Integer idade;
    private String cpf;
    private Trabalho trabalho;

    public Pessoa(String nome, Integer idade, String cpf, Trabalho trabalho) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.trabalho = trabalho;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

}
