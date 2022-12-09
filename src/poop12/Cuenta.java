/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author poo01alu21
 */
public class Cuenta extends Thread{
    
    /**
     * VARIABLE COMPARTIDA, ALMACENA EL SALDO DE LA CUENTA BANCARIA.
     */
    private static double saldo;       //variable compartida

    /**
     * CONSTRUCTOR, RECIBE NOMBRE DEL HILO A CREAR
     * @param name 
     */
    public Cuenta(String name) {
        super(name);
        saldo = 0;
    }

    /**
     * REGRESA EL VALOR DE LA VARIABLE 'saldo'.
     * @return saldo
     */
    public static double consultaSaldo() {
        return saldo;
    }
    
    /**
     * INCREMENTA EL VALOR DE 'saldo' EN LA CANTIDAD DE 'monto'.
     * @param monto 
     */
    public synchronized void depositarDinero(double monto){
        saldo += monto;
        System.out.println(getName()+" depositando saldo.... saldo: "+saldo);
        notifyAll();
    }
    
    /**
     * DISMINUYE EL VALOR DE 'saldo' EN LA CANTIDAD DE 'monto'. 
     * @param monto 
     */
    public synchronized void retirarDinero(double monto){
        if(saldo<=0 || monto>saldo){
            System.out.println(getName()+" debe esperar un deposito Saldo: "+saldo);
            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        else{
            saldo-=monto;
            System.out.println(getName()+" extrajo la cantidad: $"+monto+"Saldo actual: $"+saldo);
        }
        notifyAll();
    }
    
    
    /**
     * MËTODO QUE EJECUTA LAS FUNCIONES 'depositaDinero' y 'retiraDinero'. ES LLAMADO por 'start'.
     */
    public void run(){
        if(getName().equals("Deposito 1")||getName().equals("Deposito 2")){
            for (int i = 0; i < 25; i++) {
                this.depositarDinero(100);
        }
            
        }
        else{
            for (int i = 0; i < 25; i++) {
                this.retirarDinero(50);
        }
        }
            
    }
}
