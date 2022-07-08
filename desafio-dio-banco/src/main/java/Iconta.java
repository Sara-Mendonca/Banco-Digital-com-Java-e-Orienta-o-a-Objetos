/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author sarad
 */
public interface Iconta {
    
    void sacar(double valor);
    
    void depositar(double valor);
    
    void transferir(double valor, Iconta contaDestino);
    
    void imprimirExtrato();
    
}
