/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

/**
 *
 * @author DELL
 */
public class EmpleadoTemporal extends Empleado{
    private double salario;

    public EmpleadoTemporal(double salario, String nombre, int id) {
        super(nombre, id);
        this.salario = salario;
    }
    
    public double calcularSalario(){
        return salario;
    }
    public double calcularBonificacion(){
        return 100.0;
    }
}
