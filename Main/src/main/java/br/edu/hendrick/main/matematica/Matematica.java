package br.edu.hendrick.main.matematica;

public abstract class Matematica implements IMatematica {
    private Double a;
    private Double b;
    private String nomeOperacao;

    public Matematica(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    protected void setNomeOperacao(String nome){
        this.nomeOperacao = nome;
    }

    @Override
    public String toString() {
        return nomeOperacao + String.format(" {a= %.2g , b= %.2g , result= %.2g }", a, b, Calcular());
    }

}
