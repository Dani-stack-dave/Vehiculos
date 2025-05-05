/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transporte;

/**
 *
 * @author SAM
 */
public class Transporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un vehiculo terrestre
        VehiculoTerrestre vehiculoTerrestre= new VehiculoTerrestre("Mattel","Terreneitor",4);
        VehiculoAcuatico vehiculoAcuatico=new VehiculoAcuatico("Lancha","Yamaha","Motor ");
        
        //Mostrar Informacion de lls Vehiculos
        System.out.println("Información del Vehiculo Terrestre: ");
        vehiculoTerrestre.mostrarInfo();
        
        System.out.println("Información del Vehiculo Acuatico: ");
        vehiculoAcuatico.mostrarInfo();
    }
    
}
