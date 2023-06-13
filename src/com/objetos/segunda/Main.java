package com.objetos.segunda;

import java.util.Scanner;

//Crie uma classe base chamada "Animal" que possua atributos como nome, idade e som (o som que ele emite), por fim crie um método chamado "emitirSom" que imprima um som genérico. Em seguida, crie um objeto "cachorro", "gato" e "pássaro", que são do tipo Animal. .
// Cada objeto tem um som diferente, atribua os sons aos objetos e chame o método emitir Som para ver qual som cada objeto faz.
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Animal gato = new Animal();
        Animal cachorro = new Animal();
        Animal passaro = new Animal();

        gato.som = "Miada";
        cachorro.som = "Latido";
        passaro.som = "Canto";

        System.out.println(gato.emitirSom());
        System.out.println(cachorro.emitirSom());
        System.out.println(passaro.emitirSom());


        input.close();
    }

}
