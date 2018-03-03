package br.aula.salario;

import br.aula.salario.servico.Calculo;
import br.aula.salario.servico.br.aula.salario.model.Pessoa;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculoTest {

    private Pessoa zeDasCouves;
    private double salarioMinimo;
    private int horasTrabalhadasMediaMes;
    private Calculo calculador;
    private Pessoa trabalhadorMedio;
    private double salarioBruto;

    @Before
    public void init()
    {
        calculador = new Calculo();

        salarioMinimo = 17.0;

        horasTrabalhadasMediaMes = 160;

        trabalhadorMedio = new CriadorDePessoa()
                                .nome("Zé ninguem")
                                .salario(salarioMinimo)
                                .horas(horasTrabalhadasMediaMes)
                                .dependentes(2)
                                .constroi();
        salarioBruto = 2820;

    }

    @After
    public void finished()
    {

    }

    @Test
    public void deveRetornarSalarioBruto(){

        assertEquals(salarioBruto, calculador.salarioBruto(trabalhadorMedio), 0.00001);

    }

    @Test
    public void deveDescontoInss(){

        assertEquals(253.8, calculador.descontoInss(salarioBruto), 0.00001);

    }

    @Test
    public void deveDescontoIR(){

        assertEquals(197.4, calculador.descontoIR(salarioBruto), 0.00001);

    }

    @Test
    public void deveRetornarSalarioLiquido(){

        assertEquals(2368.8, calculador.salarioLiquido(trabalhadorMedio), 0.00001);

    }
}
