package br.edu.hendrick.main;

import br.edu.hendrick.main.matematica.Matematica;
import br.edu.hendrick.main.matematica.operacoes.Adicao;
import br.edu.hendrick.main.matematica.operacoes.Divisao;
import br.edu.hendrick.main.matematica.operacoes.Multiplicacao;
import br.edu.hendrick.main.matematica.operacoes.Subtracao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        List<Matematica> listaMatematica = new ArrayList<>();

        listaMatematica.add(new Adicao(2.0,20.0));
        listaMatematica.add(new Subtracao(2.0,20.0));
        listaMatematica.add(new Multiplicacao(2.0,20.0));
        listaMatematica.add(new Divisao(22.0,9.0));

        for(Matematica operador : listaMatematica){
            System.out.println(operador);
        }
    }
}
