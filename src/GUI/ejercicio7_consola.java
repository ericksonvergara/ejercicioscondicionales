/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.util.Scanner;

/**
 *
 * @author noskcire
 */
public class ejercicio7_consola {
    
    public static void main (String[] ars){
        
         Scanner sc = new Scanner(System.in);
         
        int cedula, clase, num_pasaje, tipo_viaje, destino, valor, costo_pasaje;
        String nombre ;
        double descuento, descuento2, descuento_parcial, valor_total;
        valor = 0;
        valor_total = 0;
        descuento = 0;
        descuento2 = 0;
        descuento_parcial = 0;
        
                
        System.out.println("Digite los sigientes campos; ");
        
        System.out.println(" ");
        
        System.out.println("Digite el nombre: ");
        nombre = sc.next();
        
        System.out.println(" ");
        
        System.out.println("Cedula: ");
        cedula = sc.nextInt();
        
        System.out.println(" ");
        
        System.out.println("Digite la clase en la que va a viajar: " 
                           + "\n1.(Primera clase)" + "\n2.(Segunda clase)" 
                           + "\n3.(Tercera clase)");
        clase = sc.nextInt();
        
        System.out.println(" ");
        
        System.out.println("Digite el destino del viaje: " + "\n1. Miami" + "\n2. Madrid");
        destino = sc.nextInt();
        
        System.out.println(" ");
        
        System.out.println("Seleccione el tipo de viaje: " + "\n1. De negocios" + "\n2. Familiar" + "\n3. Turistico");
        tipo_viaje = sc.nextInt();
        
        System.out.println(" ");
        
        System.out.println("Digite el número de pasajes: ");
        num_pasaje = sc.nextInt();
       
         System.out.println(" ");
         
         
         
         if((clase == 1) && (destino == 1)){
             valor = 1300000;
         }
         if((clase == 1) && (destino == 2)){
             valor = 2700000;
         }
         if((clase == 2) && (destino == 1)){
             valor = 1120000;
         }
         if((clase == 2) && (destino == 2)){
             valor = 2500000;
         }
         if ((clase == 3) && (destino == 1)){
             valor = 1100000;
         }
         if ((clase == 3) && (destino == 2)){
             valor = 2320000;
         }
         
         if(tipo_viaje == 1){
             descuento = 0;
         }else{
             if (tipo_viaje == 2){
             descuento = (valor * num_pasaje) * 0.07;
         }else{
               if (tipo_viaje == 3){
             descuento = (valor * num_pasaje) * 0.0475;
         }  
             }
         }
         
         descuento2 = (descuento_parcial * 0.026);
         descuento_parcial = (valor * num_pasaje) - descuento;
         
         if((num_pasaje >= 3) && (num_pasaje <=5)){
             valor_total = (descuento_parcial * 0.026); 
             System.out.println(descuento_parcial - valor_total);
         }else{
             if((num_pasaje >= 6) && (num_pasaje <= 10)){
                 valor_total = (descuento_parcial * 0.0538);
                 System.out.println(descuento_parcial - valor_total);
            }else{
                 if(num_pasaje >= 11){
                 valor_total = (descuento_parcial * 0.0724);
                 System.out.println(descuento_parcial - valor_total);
             }else{
                     System.out.println(descuento_parcial);
                 }
         }
              
    }
    
}
}
        