/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Sergio Ramos
 */
public class Almacen {
    private Paquete[][] muelleFisico;
    private HashSet<String> registroSeguridad;
    private ArrayList<Paquete> colaSalida;
    public HashMap<String, Integer> estadisticas;

    public Almacen() {
        this.muelleFisico = new Paquete[3][3];
        this.registroSeguridad = new HashSet<>();
        this.colaSalida = new ArrayList<>();
        this.estadisticas = new HashMap<>();
    }
    
    public void recepcionarPaquete(Paquete p, int fila, int col) {
        // Verifica si el código del paquete ya existe y en ese caso generamos error y salimos
        if (registroSeguridad.contains(p.getCodigo())) {
            System.out.println("Error: el código " + p.getCodigo() + " ya existe");
            return;
        }
        
        // Si la posición está libre, almacena el paquete y registra su código
        if (muelleFisico[fila][col] == null) {
            muelleFisico[fila][col] = p;
            registroSeguridad.add(p.getCodigo());
            System.out.println("El paquete se ha almacenado en la posición " + fila + "," + col);
        } else {
            System.out.println("Error. La posición " + fila + "," + col + "ya está ocupada");
        }
    }
    
    public void enviarACamion(int fila, int col) {
        int contador = 0;
        Paquete p = muelleFisico[fila][col];
        muelleFisico[fila][col] = null;
        colaSalida.add(p);
        
        // Actualizamos las estadísticas
        contador = estadisticas.getOrDefault(p.getDestino(), 0);
        estadisticas.put(p.getDestino(), contador + 1);
        
        
    }
}
