package br.senai.sp.model;

import java.util.Scanner;

public class Menu {

    public void Menu(){

        /** Instancia Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Instancia Cadastro */
        Cadastro objCadastro = new Cadastro();

        /** Instancia Exibir */
        Exibir objExibir = new Exibir();

        while (true) {

            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("/-              Bem Vindo              -/");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("/-          Formas Geometricas         -/");
            System.out.println("/-  1- Circulo                         -/");
            System.out.println("/-  2- Quadrado                        -/");
            System.out.println("/-  3- Retangulo                       -/");
            System.out.println("/-  4- Triangulo                       -/");
            System.out.println("/-                                     -/");
            System.out.println("/-  Selecione uma opção:               -/");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

            int opcao = teclado.nextInt();

            switch (opcao) {

                case 1:
                    Circulo objCirculo = objCadastro.CadastrarCirculo();
                    objCirculo.CalcularArea();
                    objCirculo.CalcularPerimetro();
                    objExibir.ExibirCirculo(objCirculo);

                    break;
                case 2:
                    Quadrado objQuadrado = objCadastro.CadastrarQuadrado();
                    objQuadrado.CalcularArea();
                    objQuadrado.CalcularPerimetro();
                    objExibir.ExibirQuadrado(objQuadrado);

                    break;

                case 3:
                    Retangulo objRetangulo = objCadastro.CadastrarRetangulo();
                    objRetangulo.CalcularArea();
                    objRetangulo.CalcularPerimetro();
                    objExibir.ExibirRetangulo(objRetangulo);

                    break;

                case 4:
                    Triangulo objTriangulo = objCadastro.CadastrarTriangulo();
                    objTriangulo.CalcularArea();
                    objTriangulo.CalcularPerimetro();
                    objExibir.ExibirTriangulo(objTriangulo);

                    break;

            }

        }



    }


}
