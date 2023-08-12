package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        Integer numero=0;
        Integer acumulador=0;

        do{
            System.out.print("Digita un numero: ");
            numero= teclado.nextInt();
            if (numero<0){
                acumulador=acumulador+numero;
            }
    }while (numero<0);
        System.out.println("el resultado fue: "+acumulador);


        }
    }
