/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo01alu21
 */
public class HiloR implements Runnable{
    /**
     * --------------Creamos hilos mediante la interfaz ----------
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+(i+1)+ " de "+Thread.currentThread().getName());
        }
        System.out.println("Termina el "+ Thread.currentThread().getName());
    }
    

    
}
