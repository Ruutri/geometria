package br.senai.sp.model;

public class Exibir {

    public void ExibirQuadrado(Quadrado objQuadrado){

        System.out.println("/-/-/-/-  Exibir -/-/-/-/");

        System.out.println("O lado informado é:" + objQuadrado.lado1);
        System.out.println("O lado informado é:" + objQuadrado.lado2);
        System.out.println("------------------------------------------------");
        System.out.println("A area calculada é: " + objQuadrado.area);
        System.out.println("O perimetro calculado é: " + objQuadrado.perimetro);

        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/");



    }

    public void ExibirTriangulo(){

    }

    public void ExibirCirculo(){

    }

    public void ExibirRetangulo(){

    }

}
