/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpoo;

import org.control.inmueble.Silla;

/**
 *
 * @author USUARIO
 */
public class TallerPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Silla unaSilla = new Silla();
        unaSilla.limpiar();
        unaSilla.lavar();
        unaSilla.reparar();
        System.out.println("");
        Silla otraSilla = new Silla(4, "Rojo", "Neiva", "PedroCarpintero", "elPepe", "Madera", false);
        System.out.println("Numero de patas: "+otraSilla.getNumeroPatas());
        System.out.println("Color: "+otraSilla.getColor());
        System.out.println("Lugar: "+otraSilla.getLugar());
        System.out.println("Fabricante: "+otraSilla.getFabricante());
        System.out.println("Propietario: "+otraSilla.getPropietario());
        System.out.println("Referencia: "+otraSilla.getReferencia());
        System.out.println("Averiada: "+otraSilla.isAveriada());
    }
    
}