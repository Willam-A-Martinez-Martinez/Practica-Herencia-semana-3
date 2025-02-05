/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

/**
 *
 * @author DELL
 */
public class EmpleadoPorHora extends Empleado{
    private double tarifaHora, horasTrabajadas;

    public EmpleadoPorHora(double tarifaHora, double horasTrabajadas, String nombre, int id) {
        super(nombre, id);
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    
    public double calcularSalario(){
        return tarifaHora*horasTrabajadas;
    }
    public double calcularBonificacion(){
        return calcularSalario()*0.05;
    }
}
