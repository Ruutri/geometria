package br.senai.sp.model;

import java.util.Scanner;

public class Menu {

    public void Menu(){

        /** Instancia Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Instancia Cadastro */
        Cadastro objCadastro = new Cadastro();

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
                    objCadastro.CadastrarCirculo();
                    objCadastro.objCirculo.CalcularArea();
                    objCadastro.objCirculo.CalcularPerimetro();

                    break;
                case 2:
                    objCadastro.CadastrarQuadrado();
                    objCadastro.objQuadrado.CalcularArea();
                    objCadastro.objQuadrado.CalcularPerimetro();

                    break;

                case 3:
                    objCadastro.CadastrarRetangulo();
                    objCadastro.objRetangulo.CalcularArea();
                    objCadastro.objRetangulo.CalcularPerimetro();

                    break;

                case 4:
                    objCadastro.CadastrarTriangulo();
                    objCadastro.objTriangulo.CalcularArea();
                    objCadastro.objTriangulo.CalcularPerimetro();

                    break;

            }

        }



    }


}
