package br.aula.salario;

import br.aula.salario.servico.br.aula.salario.model.Pessoa;

public class CriadorDePessoa {
    private Pessoa pessoa;

    public CriadorDePessoa() {
        this.pessoa = new Pessoa();
    }

    public CriadorDePessoa nome(String nome) {
        this.pessoa.setNome(nome);
        return this;
    }

    public CriadorDePessoa salario(double valor) {
        pessoa.setSalarioHora(valor);
        return this;
    }

    public CriadorDePessoa horas(int valor) {
        pessoa.setHorasTrabalhadas(valor);
        return this;
    }

    public CriadorDePessoa dependentes(int valor) {
        pessoa.setNumeroDependentes(valor);
        return this;
    }

    public Pessoa constroi() {
        return pessoa;
    }
}
