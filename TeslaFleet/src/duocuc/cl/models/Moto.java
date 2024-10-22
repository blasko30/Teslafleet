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
public class Moto extends Vehiculo {
    private int capacidadBateria;
    private boolean modoEco;

    public Moto() {}

    public Moto(String codigo, boolean requiereMantenimiento, int capacidadBateria, boolean modoEco) {
        super(codigo, requiereMantenimiento);
        this.capacidadBateria = capacidadBateria;
        this.modoEco = modoEco;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public boolean isModoEco() {
        return modoEco;
    }

    public void setModoEco(boolean modoEco) {
        this.modoEco = modoEco;
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
        if (modoEco) {
            costo *= 1.08; 
        }
        return costo;
    }

    @Override
    public String mostrarDatos() {
        return "Moto [Codigo: " + codigo + ", Capacidad Bateria: " + capacidadBateria + ", Modo Eco: " + modoEco + "]";
    }
}
