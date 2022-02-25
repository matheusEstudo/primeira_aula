package br.senac.entidade;

public class Trabalho {
    private String nomeTrabalho;
    private Double salario;
    private String cargoHorario;

    public Trabalho(String nomeTrabalho, Double salario, String cargoHorario) {
        this.nomeTrabalho = nomeTrabalho;
        this.salario = salario;
        this.cargoHorario = cargoHorario;
    }

    public String getNomeTrabalho() {
        return nomeTrabalho;
    }

    public void setNomeTrabalho(String nomeTrabalho) {
        this.nomeTrabalho = nomeTrabalho;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargoHorario() {
        return cargoHorario;
    }

    public void setCargoHorario(String cargoHorario) {
        this.cargoHorario = cargoHorario;
    }
    
    
}
