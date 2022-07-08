/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarad
 */
public class ContaCorrente extends Conta{
    
  public void imprimirExtrato(){
    System.out.println("=== Extrato Conta Corrente ==="); 
    super.imprimirInfosComuns();
  }
}
