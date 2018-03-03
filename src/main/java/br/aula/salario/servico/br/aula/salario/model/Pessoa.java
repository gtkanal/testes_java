package br.aula.salario.servico.br.aula.salario.model;

public class Pessoa {

    private int id;
    private String nome;
    private int horasTrabalhadas;
    private double salarioHora;
    private int numeroDependentes;

    public Pessoa() {}


    public Pessoa(String nome, int horasTrabalhadas, double salarioHora, int numeroDependentes) {
        this.nome              = nome;
        this.salarioHora       = salarioHora;
        this.horasTrabalhadas  = horasTrabalhadas;
        this.numeroDependentes = numeroDependentes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(Integer numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }
}
