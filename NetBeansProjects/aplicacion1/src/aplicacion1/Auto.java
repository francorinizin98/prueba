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
public class Auto {

    private String patente;
    private String color;
    private double gasoil;
    
    
    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
        this.gasoil = 50;
    }
    
    public Auto(){
        
    }
    
    public String avanzar(int metros){
        double consumido = metros * 0.1;
        String msg ; 
        if(gasoil>=consumido){
            gasoil = gasoil - consumido;
            msg = "Ha avanzado "+metros + "!!!. gaoil:"+gasoil;
            return msg;
        }
        else{
            msg = "no tiene combustible. Llenar tanque!!";
            return msg;
        }
    }
    public String retroceder(int metros){
        double consumido = metros*0.1;
        String msg ; 
        if(gasoil!=0){
            gasoil = gasoil - consumido;
            msg = "Ha retrocedido "+metros + "!!!. gaoil:"+gasoil;
            return msg;
        }
        else{
            msg = "no tiene combustible. Llenar tanque!!";
            return msg;
        }
    }
    public String llenarTanque(double gas){
        gasoil = gas;
        return "tanque cargado";
    }
     
    public void setGasoil(double gasoil) {
        this.gasoil = gasoil;
    }

    public double getGasoil() {
        return gasoil;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
