/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package duocuc.cl.models;

/**
 *
 * @author Cetecom
 */
 
    interface IVehiculo {
    double VALOR_HORA_ALQUILER = 15000;

    double calcularCostoFinal(int horas);
    String mostrarDatos();

}
