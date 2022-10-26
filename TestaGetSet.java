/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marco
 */
public class TestaGetSet {
    public static void main(String[] args) {
        Banco conta = new Banco(1, 1);
  
        System.out.println(conta.getNumero());
        
        Cliente titu = new Cliente();
        
        conta.setTitular(titu);
        titu.setNome("Lincoln");
        titu.setCpf("222.222.222-2");
        conta.setTitular(titu);
        
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("programador");
    }
}
