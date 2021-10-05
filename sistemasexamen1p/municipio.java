/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasexamen1p;

/**
 *
 * @author maast
 */
public class municipio {
private int id;
private String nombre;
private double latitud;
private double longitud;
private int listado;

double x;
    public municipio() {
    }

    public municipio(int id, String nombre, double latitud, double longitud, int listado) {
        this.id = id;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.listado = listado;
    }
    
public double participacion( int votantes){

x=600/70000*100;    
return x;    
}    




    
    
}
