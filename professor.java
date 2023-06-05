package com.mycompany.pessoa;

public class Professor extends Curso {
    private String titulacao;
    private double salario;

    public Professor(String nome, String titulacao, double salario) {
        super(nome);
        this.titulacao = titulacao;
        this.salario = salario;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}



