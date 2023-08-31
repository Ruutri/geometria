package br.senai.sp.model;

public class Triangulo {
    double base, altura;

    public void CalcularArea(){

        double area = (base * altura) / 2;
        System.out.println(area);

    }

    public void CalcularPerimetro(){

        double perimetro = base + altura * 2;
        System.out.println(perimetro);
    }


}
