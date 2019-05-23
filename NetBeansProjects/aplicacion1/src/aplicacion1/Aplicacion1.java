/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion1;


/**
 *
 * @author programador
 */
public class Aplicacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a1 = new Auto("abc 345","verde");
        System.out.println(a1.avanzar(200));
        System.out.println(a1.avanzar(200));
        System.out.println(a1.avanzar(200));
        System.out.println(a1.llenarTanque(50));
        System.out.println(a1.retroceder(500));
        System.out.println(a1.getGasoil());
    }
    
}
