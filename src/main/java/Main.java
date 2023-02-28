package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Introduzca una cadena de 9 caracteres: ");
        Scanner teclado = new Scanner(System.in);
        String entrada = teclado.nextLine();
        int longitud = entrada.length();
        char valido1 = 'X';
        char valido2 = 'O';
        char valido3 = '_';


        if (longitud == 9) {

            char c1 = entrada.charAt(0);
            char c2 = entrada.charAt(1);
            char c3 = entrada.charAt(2);
            char c4 = entrada.charAt(3);
            char c5 = entrada.charAt(4);
            char c6 = entrada.charAt(5);
            char c7 = entrada.charAt(6);
            char c8 = entrada.charAt(7);
            char c9 = entrada.charAt(8);

            if (((c1 == valido1) || (c1 == valido2) || (c1 == valido3)) && ((c2 == valido1) || (c2 == valido2) || (c2 == valido3)) && ((c3 == valido1) || (c3 == valido2) || (c3 == valido3)) && ((c4 == valido1) || (c4 == valido2) || (c4 == valido3)) && ((c5 == valido1) || (c5 == valido2) || (c5 == valido3)) && ((c6 == valido1) || (c6 == valido2) || (c6 == valido3)) && ((c7 == valido1) || (c7 == valido2) || (c7 == valido3)) && ((c8 == valido1) || (c8 == valido2) || (c8 == valido3)) && ((c9 == valido1) || (c9 == valido2) || (c9 == valido3) )) {
                System.out.println(entrada);
                System.out.println("-----");
                System.out.println("|" + c1 + c2 + c3 + "|");
                System.out.println("|" + c4 + c5 + c6 + "|");
                System.out.println("|" + c7 + c8 + c9 + "|");
                System.out.println("-----");
            }
            else {
                System.out.println("Ingrese una cadena de caracteres valida");
            }
        }
        else {
            System.out.println("La longitud de la cadena no es la correcta");
        }
    }



        }




