package br.senai.sp.model;

public class Quadrado {

    double lado1, lado2;


    public void CalcularArea() {

        double area = lado1 * lado2;
        System.out.println(area);

    }

    public void CalcularPerimetro() {

        double perimetro = lado1 * 2 + lado2 * 2;
        System.out.println(perimetro);


    }


}
