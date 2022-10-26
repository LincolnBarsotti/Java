/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marco
 */
public class TesteValores {
    
    public static void main(String[] args) {
        
        Banco conta = new Banco(2,2);
        Banco conta2 = new Banco(2,4);
        Banco conta3 = new Banco(0,7);        

        
        System.out.println(Banco.getTotal());
    }
}
