/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duocuc.cl.models;

/**
 *
 * @author Cetecom
 */
public abstract class Vehiculo {
    public String codigo;
    public boolean requerimientoMantenimiento;

    public Vehiculo() {
    }

    public Vehiculo(String codigo, boolean requerimientoMantenimiento) {
        this.codigo = codigo;
        this.requerimientoMantenimiento = requerimientoMantenimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isRequerimientoMantenimiento() {
        return requerimientoMantenimiento;
    }

    public void setRequerimientoMantenimiento(boolean requerimientoMantenimiento) {
        this.requerimientoMantenimiento = requerimientoMantenimiento;
    }
    
    
    
    
    public abstract String mostrarDatos();

    public double calcularCostoFinal(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
