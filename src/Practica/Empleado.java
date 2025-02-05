/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

/**
 *
 * @author DELL
 */
public abstract class Empleado {
    private String nombre;
    private int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
    
    public abstract double calcularSalario();
    
    public abstract double calcularBonificacion();
    
}
