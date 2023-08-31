package br.senai.sp.model;

public class Circulo {

    double raio;

    public void CalcularArea(){

        double area = Math.PI * (raio * raio);
        System.out.println(area);

    }

    public void CalcularPerimetro(){

        double perimetro = 2 * Math.PI * raio;
        System.out.println(perimetro);

    }


}
