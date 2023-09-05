package br.senai.sp.model;

public class Exibir {

    public void ExibirQuadrado(Quadrado objQuadrado){

        System.out.println("/-/-/-/-/-/-/-/-/-/  Exibir -/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("O lado 1 informado é: " + objQuadrado.lado1);
        System.out.println("O lado 2 informado é: " + objQuadrado.lado2);
        System.out.println("------------------------------------------------");
        System.out.println("A area calculada é: " + objQuadrado.area);
        System.out.println("O perimetro calculado é: " + objQuadrado.perimetro);
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

    }

    public void ExibirTriangulo(Triangulo objTriangulo){
        System.out.println("/-/-/-/-/-/-/-/-/-/  Exibir -/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("A base informado é: " + objTriangulo.base);
        System.out.println("A altura informado é: " + objTriangulo.altura);
        System.out.println("------------------------------------------------");
        System.out.println("A area calculada é: " + objTriangulo.area);
        System.out.println("O perimetro calculado é: " + objTriangulo.perimetro);
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
    }

    public void ExibirCirculo(Circulo objCirculo){
        System.out.println("/-/-/-/-/-/-/-/-/-/  Exibir -/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("O raio informado é: " + objCirculo.raio);
        System.out.println("------------------------------------------------");
        System.out.println("A area calculada é: " + objCirculo.area);
        System.out.println("O perimetro calculado é: " + objCirculo.perimetro);
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

    }

    public void ExibirRetangulo(Retangulo objRetangulo){
        System.out.println("/-/-/-/-/-/-/-/-/-/  Exibir -/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println("O lado 1 informado é: " + objRetangulo.lado1);
        System.out.println("O lado 2 informado é: " + objRetangulo.lado2);
        System.out.println("------------------------------------------------");
        System.out.println("A area calculada é: " + objRetangulo.area);
        System.out.println("O perimetro calculado é: " + objRetangulo.perimetro);
        System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

    }

}
