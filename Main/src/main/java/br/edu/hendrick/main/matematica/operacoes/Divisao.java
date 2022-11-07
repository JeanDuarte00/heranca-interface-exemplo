package br.edu.hendrick.main.matematica.operacoes;

import br.edu.hendrick.main.matematica.Matematica;

import java.math.BigDecimal;

public class Divisao<Type> extends Matematica {

    public Divisao(Double a, Double b) {
        super(a, b);
        setNomeOperacao(this.getClass().getSimpleName());
    }

    @Override
    public Double Calcular() {
        return super.getA() / super.getB();
    }
}
