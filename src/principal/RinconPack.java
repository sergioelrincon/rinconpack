/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Sergio Ramos
 */
public class RinconPack {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Paquete paquete1 = new Paquete("COD-01", 3, "Madrid");
        Paquete paquete2 = new Paquete("COD-02", 36, "Barcelona");
        Paquete paquete3 = new Paquete("COD-03", 37, "Madrid");
        
        almacen.recepcionarPaquete(paquete1, 0, 2);
        almacen.recepcionarPaquete(paquete2, 1, 2);
        almacen.recepcionarPaquete(paquete3, 2, 2);
        
        almacen.enviarACamion(0, 2);
        almacen.enviarACamion(1, 2);
        almacen.enviarACamion(2, 2);
        
        
    }
}
