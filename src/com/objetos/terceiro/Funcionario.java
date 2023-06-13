package com.objetos.terceiro;

public class Funcionario {
    String nome;
    double salario = 1500;

    public double calcularSalario(int bonusFuncionario, int descontoFuncionario){
        this.salario += (this.salario*bonusFuncionario)/100;
        this.salario -= (this.salario*descontoFuncionario)/100;

        return this.salario;
    }

}
