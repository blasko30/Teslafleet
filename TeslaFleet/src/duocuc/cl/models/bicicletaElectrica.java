/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duocuc.cl.models;

import static duocuc.cl.models.IVehiculo.VALOR_HORA_ALQUILER;

/**
 *
 * @author Cetecom
 */
 public class bicicletaElectrica extends Vehiculo {
      private String tipoFrenos;
      private int capacidadBateria;

    public bicicletaElectrica() {
    }

    public bicicletaElectrica( String codigo, boolean requerimientoMantenimiento,String tipoFrenos, int capacidadBateria) {
        super(codigo, requerimientoMantenimiento);
        this.tipoFrenos = tipoFrenos;
        this.capacidadBateria = capacidadBateria;
    }

    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    
    @Override
    public String getCodigo() {
        return codigo;
    }
    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    @Override
    public boolean isRequerimientoMantenimiento() {
        return requerimientoMantenimiento;
    }
    @Override
    public void setRequerimientoMantenimiento(boolean requerimientoMantenimiento) {
        this.requerimientoMantenimiento = requerimientoMantenimiento;
    }
      
    
    
    
    @Override
    public double calcularCostoFinal(int horas) {
        double costo = VALOR_HORA_ALQUILER * horas;
        if (capacidadBateria < 20) {
            costo *= 0.95; 
        }
        return costo;
    }
    
    @Override
    public String mostrarDatos() {
        return "Bicicleta Electrica [Codigo: " + codigo + ", Tipo de Frenos: " + tipoFrenos + ", Capacidad Bateria: " + capacidadBateria + " km]";
    }

    
}
