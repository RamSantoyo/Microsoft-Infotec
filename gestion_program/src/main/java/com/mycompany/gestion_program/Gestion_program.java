/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestion_program;
import java.util.Scanner;
import java.util.Date;
 
/**
 *
 * @author ramse
 */
public class Gestion_program {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        java.util.Date fecha = new Date();
     
        String name;
        int edad;
        int antigueda;
        int tipo;
        int funcion;
        int producto;
        int opcion;
        int cantidad;
        
        System.out.println("Introduce tu nombre: ");
        name = leer.nextLine();
        System.out.println("Introduce tu edad en numero: ");
        edad = leer.nextInt();
        System.out.println("Introduce tu antiguedad en numero: ");
        antigueda = leer.nextInt();
        System.out.println("Introduce tu tipo de empleado en numero (1, 2 o 3): ");
        tipo = leer.nextInt();
                
        
        Empleado trabajador;
        trabajador = new Empleado(name, edad, antigueda, tipo);
        
        Customer[] arr = new Customer[20];
        
        arr[0] = new Customer(1, "Celular", 20100, 20, "Electronicos");
        arr[1] = new Customer(2, "Tablet", 18778, 15, "Electronicos");
        arr[2] = new Customer(3, "Mause", 678, 66, "Electronicos");
        arr[3] = new Customer(4, "Teclado", 1178, 30, "Electronicos");
        arr[4] = new Customer(5, "Monitor", 23888, 5, "Electronicos");
        arr[5] = new Customer(6, "Laptop", 25122, 12, "Electronicos");
        arr[6] = new Customer(7, "Computadora", 33218, 4, "Electronicos");
        arr[7] = new Customer(8, "Audifonos", 978, 34, "Electronicos");
        arr[8] = new Customer(9, "Alexa", 1220, 66, "Electronicos");
        arr[9] = new Customer(10, "USB", 78, 160, "Electronicos");
        arr[10] = new Customer(11, "Llave", 608, 22, "Herramientas");
        arr[11] = new Customer(12, "Desarmador", 58, 44, "Herramientas");
        arr[12] = new Customer(13, "Martillo", 206, 38, "Herramientas");
        arr[13] = new Customer(14, "Perico", 775, 20, "Herramientas");
        arr[14] = new Customer(15, "Cable", 823, 70, "Herramientas");
        arr[15] = new Customer(16, "Pinzas", 302, 16, "Herramientas");
        arr[16] = new Customer(17, "Cierra", 18, 33, "Herramientas");
        arr[17] = new Customer(18, "Lentes", 155, 42, "Herramientas");
        arr[18] = new Customer(19, "Multimetro", 2234, 8, "Herramientas");
        arr[19] = new Customer(20, "Guantes", 27, 19, "Herramientas");
        
        
        
        
        System.out.println(trabajador.getEmpleador());        
        System.out.println("\nDigita el numero que quieres hacer: ");
        funcion = leer.nextInt();
        
        switch (tipo){

            case 1:{                
            
                if(funcion == 1){
                    System.out.println("\nLista de productos escoge uno: ");
                    for(int i=0; i<arr.length; i++){
                        arr[i].display();
                    }
                    System.out.println("\nDigita el producto que quieres vender: ");
                    producto = leer.nextInt();
                    arr[producto-1].display();
                    System.out.println("\nDeseas venderlo? (1=SI y 2=NO) ");            
                    opcion = leer.nextInt();
                    if(opcion == 1){
                        System.out.println("\nDigita la cantidad de productos: ");            
                        cantidad = leer.nextInt();
                        if(arr[producto-1].stock >= cantidad){
                            arr[producto-1].stock = arr[producto-1].stock-cantidad;
                            System.out.println("\nEl producto se vendio el: "+ fecha +" con exito y el stock cambio a: ");
                            arr[producto-1].display();               
                        }else{
                            System.out.println("\nNo hay sufuciente stock, lo sentimos....");

                        }
                    }
                }
                else if(funcion == 2){
                    System.out.println("\nLista de productos:");
                    for(int i=0; i<arr.length; i++){
                        arr[i].display();
                    }
                }
                else if(funcion == 3){
                    System.out.println("\nDescanso autorizado....");
                }
                else if(funcion == 4){
                    System.out.println("\nTomaste asiento....");
                }
                else if(funcion == 5){
                    System.out.println("El monto de tu pago corresponde a: 8500");
                }else{
                    System.out.println("Opcion incorrecta");
                }
                break;
            }
            case 2:{
                if(funcion == 1){
                    System.out.println("\nLista de productos escoge uno: ");
                    for(int i=0; i<arr.length; i++){
                        arr[i].display();
                    }
                    System.out.println("\nDigita el producto que quieres vender: ");
                    producto = leer.nextInt();
                    arr[producto-1].display();
                    System.out.println("\nDeseas venderlo? (1=SI y 2=NO) ");            
                    opcion = leer.nextInt();
                    if(opcion == 1){
                        System.out.println("\nDigita la cantidad de productos: ");            
                        cantidad = leer.nextInt();
                        if(arr[producto-1].stock >= cantidad){
                            arr[producto-1].stock = arr[producto-1].stock-cantidad;
                            System.out.println("\nEl producto se vendio el: "+ fecha +" con exito y el stock cambio a: ");
                            arr[producto-1].display();               
                        }else{
                            System.out.println("\nNo hay sufuciente stock, lo sentimos....");

                        }
                    }
                }
                else if(funcion == 2){
                    System.out.println("\nDescanso autorizado....");
                }
                else if(funcion == 3){
                    System.out.println("\nEstas corriendo....");
                }
                else if(funcion == 4){
                    System.out.println("El monto de tu pago corresponde a: 6500");
                }else{
                    System.out.println("Opcion incorrecta");
                }
            
                break;
            }
            case 3:{
                if(funcion == 1){
                    System.out.println("El monto de tu pago corresponde a: 4500");
                }else{
                    System.out.println("Opcion incorrecta");
                }                
                break;
            }
            default: {

                System.out.println("Opcion incorrecta");

            }
        }
    }
}
class Customer {
    public int id;
    public String name;    
    public double precio;
    public int stock;
    public String tipo;     
    
    Customer(int id, String name, double precio, int stock, String tipo){
        this.id = id;
        this.name = name;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
    }
    public void display(){
        System.out.println("ID: "+id+" NOMBRE: "+name+" PRECIO: "+precio+ " STOCK: "+stock+" TIPO: "+tipo);
    }
}
