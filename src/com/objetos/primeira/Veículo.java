package com.objetos.primeira;

public class Veículo {

    String nome,cor;
    int numeroDeRodas, velocidade = 0;

    public void mover(){
        this.velocidade += 50;
    }
    public void frear(){
        this.velocidade -= 10;
    }

    @Override
    public String toString() {
        return "Modelo do veículo: " + this.nome +
                "\nCor do veículo: " + this.cor +
                "\nNúmero de rodas: " + this.numeroDeRodas +
                "\nVelocidade: " + this.velocidade + " km/h";
    }
}
