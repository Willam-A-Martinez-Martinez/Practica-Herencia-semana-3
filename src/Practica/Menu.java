/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Menu {
   ArrayList<Empleado> emp = new ArrayList<>();
   
   public Menu(){
        Scanner lea = new Scanner(System.in);
        
        while(true){
            System.out.println("Menu"
                    + "\n1- Agregar empleados"
                    + "\n2- Mostrar empleados"
                    + "\n3- Asignar horas de trabajo"
                    + "\n4- Pagar empleados"
                    + "\n5- Salir");
            int opc = lea.nextInt();

            switch(opc){
                case 1:
                    System.out.println("Ingrese nombre del empleado:");
                    String nombre= lea.next();
                    
                    System.out.println("Ingrese ID del empleado:");
                    int id= lea.nextInt();
                    
                    System.out.println("Ingrese tipo de empleado (Empleado por hora, Empleado por ventas y Empleado temporal):");
                    String tipoEmp = lea.next();
                    
                    while(!tipoEmp.equalsIgnoreCase("Empleado por hora") && !tipoEmp.equalsIgnoreCase("Empleado por ventas") && !tipoEmp.equalsIgnoreCase("Empleado temporal")){
                        System.out.println("Ingrese tipo de empleado (Empleado por hora, Empleado por ventas y Empleado temporal):");
                        tipoEmp = lea.next();
                    }
                    
                    if (tipoEmp.equalsIgnoreCase("Empleado por hora")){
                        System.out.println("Ingrese la tarifa por hora:");
                        double tarifa = lea.nextInt();
                        
                        System.out.println("Ingrese las horas trabajadas:");
                        double horasTrabajadas = lea.nextInt();
                        
                        emp.add(new EmpleadoPorHora(tarifa, horasTrabajadas, nombre, id));
                        
                    }else if (tipoEmp.equalsIgnoreCase("Empleado por ventas")){
                        System.out.println("Ingrese ventas realizadas:");
                        int ventas = lea.nextInt();
                        
                        System.out.println("Ingrese porcentaje de comision");
                        double porcenta = lea.nextInt();
                        
                        emp.add(new EmpleadoPorVentas(ventas, porcenta, nombre, id));
                        System.out.println("Ingrese porcentaje de comision");
                        double salario = lea.nextInt();
                        
                        emp.add(new EmpleadoTemporal(salario, nombre, id));
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;

            }
        }
   }
}
