/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

/**
 *
 * @author DELL
 */
public class EmpleadoPorVentas extends Empleado{
    private int cantVentas;
    private double comision;

    public EmpleadoPorVentas(int cantVentas, double comision, String nombre, int id) {
        super(nombre, id);
        this.cantVentas = cantVentas;
        this.comision = comision;
    }
    
    public double calcularSalario(){
        return cantVentas*comision;
    }
    public double calcularBonificacion(){
        return calcularSalario()*0.1;
    }
}
