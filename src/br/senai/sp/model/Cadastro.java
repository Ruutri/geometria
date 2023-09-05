package br.senai.sp.model;

import java.util.Scanner;

public class Cadastro {

    /** Instancia Todas as formas  */
    Triangulo objTriangulo = new Triangulo();
    Quadrado objQuadrado = new Quadrado();
    Circulo objCirculo = new Circulo();
    Retangulo objRetangulo = new Retangulo();

    /** Instanciar o Teclado */
    Scanner teclado = new Scanner(System.in);


    public Triangulo CadastrarTriangulo(){
        System.out.println("-----------  Triangulo   ----------");
        System.out.println("Informe o valor da Base: ");
        objTriangulo.base = teclado.nextDouble();
        System.out.println("Informe o valor da Altura: ");
        objTriangulo.altura = teclado.nextDouble();
        System.out.println("-----------------------------------");

        return objTriangulo;

    }

    public Quadrado CadastrarQuadrado(){
        System.out.println("-----------  Quadrado   ----------");
        System.out.println("Informe o valor do lado 1: ");
        objQuadrado.lado1 = teclado.nextDouble();
        System.out.println("Informe o valor do lado 2: ");
        objQuadrado.lado2 = teclado.nextDouble();
        System.out.println("-----------------------------------");

        return objQuadrado;
    }

    public Circulo CadastrarCirculo(){
        System.out.println("-----------  Circulo   ----------");
        System.out.println("Informe o valor do raio: ");
        objCirculo.raio = teclado.nextDouble();
        System.out.println("---------------------------------");

        return objCirculo;

    }

    public Retangulo CadastrarRetangulo(){
        System.out.println("-----------  Retangulo   ----------");
        System.out.println("Informe o valor do lado 1: ");
        objRetangulo.lado1 = teclado.nextDouble();
        System.out.println("Informe o valor do lado 2: ");
        objRetangulo.lado2 = teclado.nextDouble();
        System.out.println("-----------------------------------");

        return objRetangulo;

    }




}
