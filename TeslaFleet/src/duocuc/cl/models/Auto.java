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
 public class Auto extends Vehiculo {
    private int cantidadPasajeros;
    private boolean modoAutopilot; 

    public Auto() {
    }

    public Auto( String codigo, boolean requerimientoMantenimiento, int cantidadPasajeros, boolean modoAutopilot) {
        super(codigo, requerimientoMantenimiento);
        this.cantidadPasajeros = cantidadPasajeros;
        this.modoAutopilot = modoAutopilot;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public boolean isModoAutopilot() {
        return modoAutopilot;
    }

    public void setModoAutopilot(boolean modoAutopilot) {
        this.modoAutopilot = modoAutopilot;
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
        if (modoAutopilot) {
            costo *= 1.1; 
        }
        return costo;
    }
    
     @Override
    public String mostrarDatos() {
        return "Auto [Codigo: " + codigo + ", Pasajeros: " + cantidadPasajeros + ", Modo Autopilot: " + modoAutopilot + "]";
    }
}

