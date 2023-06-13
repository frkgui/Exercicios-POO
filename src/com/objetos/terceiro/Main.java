package com.objetos.terceiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Funcionario gerente = new Funcionario();
        Funcionario desenvolvedor = new Funcionario();

        gerente.calcularSalario(10,15);
        desenvolvedor.calcularSalario(0, 10);

        System.out.println("gerente: " + gerente.salario + ", dev: " + desenvolvedor.salario);

    }
}
