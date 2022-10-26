/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */




public class Banco {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    
    public Banco(int agencia, int numero){
        Banco.total++;
       // System.out.println("O total de comtas é " + Banco.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Sua agencia é: " + this.agencia + ""
                + " e seu número é: " + this.numero);
    }
    
    public void deposita(double valor){
    this.saldo += valor;
    }
    public boolean saca(double valor){
        if(this.saldo >= valor){
        this.saldo -= valor;
        return true;
        }else{
        return false;
        }
    }
    
    public boolean transfere(double valor, Banco destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
        
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    public int getNumero (){
        return this.numero;
    }
    
    public void setNumero(int numero){
        if(numero <= 0){
            System.out.println("Não pode um número <= a zero");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
        if(agencia <= 0){
            System.out.println("não pode um numero menor que 0");
        }
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
    public static int getTotal() {
    return Banco.total;
    }
    
    
}
