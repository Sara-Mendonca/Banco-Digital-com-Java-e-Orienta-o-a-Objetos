/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarad
 */
public class Main {
    
    public static void main (String[] args){
      Conta cc = new ContaCorrente();
      Conta poupanca = new ContaPoupanca();
      
      cc.depositar(100);
      cc.transferir(100, poupanca);
      
      cc.imprimirExtrato();
      poupanca.imprimirExtrato();
    }
    
}
