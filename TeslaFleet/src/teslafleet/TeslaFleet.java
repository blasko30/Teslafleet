/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teslafleet;

import duocuc.cl.models.Auto;
import duocuc.cl.models.Flota;
import duocuc.cl.models.Moto;
import duocuc.cl.models.Vehiculo;
import java.util.List;
import duocuc.cl.models.bicicletaElectrica;
/**
 *
 * @author Cetecom
 */
public class TeslaFleet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
  
        Flota flota = new Flota();

       
        flota.agregarVehiculo(new Auto("A01", true, 4, true));
        flota.agregarVehiculo(new Auto("A02", false, 5, false));
        flota.agregarVehiculo(new Auto("A03", true, 3, true));
        
        flota.agregarVehiculo(new Moto("M01", true, 10, true));
        flota.agregarVehiculo(new Moto("M02", false, 12, false));
        
        flota.agregarVehiculo(new bicicletaElectrica("B01", true, "Freno de disco", 15));
        flota.agregarVehiculo(new bicicletaElectrica("B02", false, "Freno de tambor", 18));

        
        System.out.println("Vehículos en la flota:  ");
        List<Vehiculo> vehiculos = flota.listarVehiculos();
           for (Vehiculo v : vehiculos) {
             System.out.println(v.mostrarDatos());
        }
        
        System.out.println("Cantidad total de vehículos:  " + flota.cantidadVehiculos());

        
        System.out.println("Costo total de alquiler por vehículo:  ");
            for (Vehiculo v : vehiculos) {
               double costo = v.calcularCostoFinal(2); 
               System.out.println(v.getCodigo() + " : $ " + costo);
        }
    }
    
    }
    
    
    
