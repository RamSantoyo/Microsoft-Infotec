/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestion_program;

/**
 *
 * @author ramse
 */
public class Empleado {
    String nombre;
    String funciones;
    int edad;
    int antiguedad;
    int tipo;
    
    Empleado( String nombre, int edad, int antiguedad, int tipo){
        this.nombre = nombre;
        this.edad = edad;
        this.antiguedad = antiguedad;        
        this.tipo = tipo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
     public String getEmpleador(){
         if(tipo == 1){
            funciones = "•	1-Vender productos\n" +
                        "•	2-Acomodar productos\n" +
                        "•	3-Descansar\n" +
                        "•	4-Sentarse\n"+
                        "•	5-Recibir pago\n";
        }else if(tipo == 2){
            funciones = "•	1-Vender productos\n" +
                        "•	2-Descansar\n" +
                        "•	3-Correr"+
                        "•	4-Recibir pago\n";
        }else{
            funciones = "No tienes funciones\n"+
                        "•	1-Recibir pago";
        }
         return "Bienvenido: " + nombre.toUpperCase() + ", tienes el tipo:"+ tipo +"\n Tus funciones son: \n" + funciones;
    }
    
    
    
}

