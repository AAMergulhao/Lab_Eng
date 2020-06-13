package model;

import model.Operacoes;

public class Calculadora implements Operacoes {

    @Override
    public double somar(double operando1, double operando2) {
        return operando1 + operando2;
    }

    @Override
    public double subtrair(double operando1, double operando2) {
        return operando1 - operando2;
    }

    @Override
    public double multiplicar(double operando1, double operando2) {
        return operando1 * operando2;
    }

    @Override
    public double dividir(double operando1, double operando2) {
        if (operando2 == 0.0) {
            return 0.0;
        }
        return operando1 / operando2;
    }

}