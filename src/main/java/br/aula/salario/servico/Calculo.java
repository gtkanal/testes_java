package br.aula.salario.servico;

import br.aula.salario.servico.br.aula.salario.model.Pessoa;

public class Calculo {

    public double salarioLiquido(Pessoa trabalhador)
    {
        double salarioBruto   = 0.0;
        double salarioLiquido = 0.0;
        double descontoInss   = 0.0;
        double descontoIR    = 0.0;


        salarioBruto = this.salarioBruto(trabalhador);

        descontoInss = this.descontoInss(salarioBruto);

        descontoIR   = this.descontoIR(salarioBruto);

        salarioLiquido = salarioBruto - descontoInss - descontoIR;

        return salarioLiquido;
    }

    public double salarioBruto(Pessoa trabalhador)
    {
        double salarioBruto = trabalhador.getHorasTrabalhadas()*trabalhador.getSalarioHora();

        salarioBruto = salarioBruto + 50 * trabalhador.getNumeroDependentes();

        return salarioBruto;
    }

    public double descontoInss(double salarioBruto)
    {
        if(salarioBruto <= 1000) {

            return salarioBruto * 8.5/100;

        }else{

            return salarioBruto * 9/100;

        }
    }

    public double descontoIR(double salarioBruto)
    {
        if(salarioBruto > 500 && salarioBruto <= 1000) {

            return salarioBruto * 5/100;

        } else if(salarioBruto > 1000) {

            return salarioBruto * 7/100;

        }

        return 0;
    }
}
