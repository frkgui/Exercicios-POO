package com.objetos.primeira;

//Crie uma classe base chamada "Veículo" que possua atributos: nome, cor, número de rodas, e velocidade. .
// Crie também um método chamado mover e outro chamado frear, sendo que o método mover aumenta 50km/h a velocidade,
// já o metodo frear diminui 25km/h a velocidade. Criei também outro método que imprima todos os atributos da classe.
// Crie ao menos 2 objetos e teste os métodos.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("*** Sistema de Carros ***");

        Veiculo carro1 = new Veiculo();

        System.out.print("\nDigite o nome do carro: ");
        carro1.nome = input.nextLine();

        System.out.print("Digite a cor do carro: ");
        carro1.cor = input.nextLine();

        System.out.print("Digite o numero de rodas do veículo: ");
        carro1.numeroDeRodas = Integer.parseInt(input.nextLine());

        System.out.println("\nCarro criado! \nVelocidade Inicial: " + carro1.velocidade);

        //

        Veiculo carro2 = new Veiculo();

        System.out.print("\nDigite o nome do carro: ");
        carro2.nome = input.nextLine();

        System.out.print("Digite a cor do carro: ");
        carro2.cor = input.nextLine();

        System.out.print("Digite o numero de rodas do veículo: ");
        carro2.numeroDeRodas = Integer.parseInt(input.nextLine());

        System.out.println("\nCarro criado! \nVelocidade Inicial: " + carro2.velocidade);

        // Testando métodos

        carro1.mover();
        carro1.mover();
        carro1.frear();
        System.out.println("\n"+carro1.toString());

        carro2.mover();
        carro2.frear();
        carro2.mover();
        carro2.frear();
        System.out.println("\n"+carro2.toString());


    }

}
