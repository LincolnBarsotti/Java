/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista;

import java.util.Scanner;


public class Teste5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double n1, n2, n3, n4, nTotal;
        String nome;
        int faltas, f1,f2,f3,f4;
        
        System.out.println("Qual o nome do aluno? ");
        nome = ler.next();
        
        System.out.println("Digite a nota do primeiro bimestre ");
        n1 = ler.nextDouble();
        System.out.println("Digite a falta do primeiro bimestre ");
        f1 = ler.nextInt();
        
        System.out.println("Digite a nota do segundo bimestre ");
        n2 = ler.nextDouble();
        System.out.println("Digite a falta do segundo bimestre ");
        f2 = ler.nextInt();
      
                
        System.out.println("Digite a nota do terceiro bimestre ");
        n3 = ler.nextDouble();
        System.out.println("Digite a falta do terceiro bimestre ");
        f3 = ler.nextInt();

        
        System.out.println("Digite a nota do quarto bimestre ");
        n4 = ler.nextDouble();
        System.out.println("Digite a falta do quarto bimestre ");
        f4 = ler.nextInt();
        
        
        faltas = f1 + f2 + f3 + f4;
        nTotal = (n1 + n2 + n3 + n4) / 4;
        
        if(nTotal >= 7.0 && nTotal <= 10.0){
            if(faltas <= 36){
                System.out.println("O aluno " + nome + " passou.");
            }else{
                System.out.println("O aluno " + nome + " não passou, ele tem " + faltas + " faltas");
            }
        }else if(nTotal >= 4.0 && nTotal <= 6.9){
            if(faltas <= 36){
                System.out.println("O aluno " + nome + " precisa fazer o exame final.");
            }else{
                System.out.println("O aluno " + nome + " não passou, ele tem " + faltas+ " faltas");
            }
        }else if (nTotal < 4.0 || faltas > 36){
            if(nTotal < 4){
                System.out.println("O aluno " + nome + " REPROVOU.");
            }else{
                System.out.println("O aluno " + nome + " não passou, ele tem " + faltas + " faltas");
            }
        }else{
            System.err.println("Repita o passo a passo novamente");
        }
    }
}
