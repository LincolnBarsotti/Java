/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaswitch;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class ListaSwitch {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int num;
        double primeiro, segundo, resultado = 0.0;
        
        
        System.out.println("Digite 1 para somar, 2 subtrair, 3 multiplicar, 4 dividir ");
        num = ler.nextInt();
        
        switch(num){
            case 1:
                System.out.println("Primeiro número da soma: ");
                primeiro = ler.nextDouble();
                System.out.println("Segundo número da soma: ");
                segundo = ler.nextDouble();
                resultado = primeiro + segundo;
                break;
            case 2:
                System.out.println("Primeiro número da subtração: ");
                primeiro = ler.nextDouble();
                System.out.println("Segundo número da subtração: ");
                segundo = ler.nextDouble();
                resultado = primeiro - segundo;
                break;
            case 3:
                System.out.println("Primeiro número da multiplicação: ");
                primeiro = ler.nextDouble();
                System.out.println("Segundo número da multiplicação: ");
                segundo = ler.nextDouble();
                resultado = primeiro * segundo;
                break;
            case 4:
                System.out.println("Primeiro número da divisão: ");
                primeiro = ler.nextDouble();
                System.out.println("Segundo número da divisão: ");
                segundo = ler.nextDouble();
                resultado = primeiro / segundo;
                break;
            default:
                System.out.println("Número digitado inválido, por favor tente novamente");
                break;
        }
        System.out.println("O resultado é:  " + resultado );
        
    }
}
