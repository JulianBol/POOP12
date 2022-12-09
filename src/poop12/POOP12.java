/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author poo01alu21
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos desde la clase thread
        /**
        HiloT primero = new HiloT("Primer hilo");
        primero.start();
        
        new HiloT("Segundo hilo").start();
       
        
        //creamos desde interfaz
        
        
        new Thread(new HiloR(),"Tercer hilo").start();
        new Thread(new HiloR(),"Cuarto hilo").start();
       */
        
        //Simulacion cuenta
        Cuenta hilo1 =new Cuenta("Deposito 1");
        Cuenta hilo2 =new Cuenta("Deposito 2");
        Cuenta hilo3 =new Cuenta("Retiro 1");
        Cuenta hilo4 =new Cuenta("Retiro 2");
        
  /**
        new Cuenta("Retiro 1").start();
        new Cuenta("Retiro 2").start();
        new Cuenta("Deposito 2").start();
  */
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
        

        
        
        //actividad: hacer al menos 50 depositos y retiros con 4 hilos
        
    }
    
}
