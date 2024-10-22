/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duocuc.cl.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class Flota {
    private List<Vehiculo> vehiculos;

    public Flota() {
        vehiculos = new ArrayList<>();
    }

  public boolean agregarVehiculo(Vehiculo vehiculo) {
        for ( Vehiculo v : vehiculos) {
            if (v.getCodigo().equals(vehiculo.getCodigo())) {
                return false; 
            }
        }
        vehiculos.add(vehiculo);
        return true;
    }

    public List<Vehiculo> listarVehiculos() {
        return vehiculos;
    }

    public int cantidadVehiculos() {
        return vehiculos.size();
    }    
}
