/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasexamen1p;

import java.util.Scanner;

/**
 *
 * @author maast
 */
public class Sistemasexamen1p {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
       
casillas c1= new casillas();
casillas c2= new casillas();
casillas c3= new casillas();

c1.setId(leer.nextInt());
c1.setNombre(leer.nextLine());
c1.setLatitud(leer.nextDouble());
c1.setLongitud(leer.nextDouble());
c1.setListado(leer.nextInt());
c1.setMunicipio(leer.nextInt());
c1.setDistrito(leer.nextInt());
c1.setSeccion(leer.nextInt());
c1.participacion();

c2.setId(leer.nextInt());
c2.setNombre(leer.nextLine());
c2.setLatitud(leer.nextDouble());
c2.setLongitud(leer.nextDouble());
c2.setListado(leer.nextInt());
c2.setMunicipio(leer.nextInt());
c2.setDistrito(leer.nextInt());
c2.setSeccion(leer.nextInt());
c2.participacion();

c3.setId(leer.nextInt());
c3.setNombre(leer.nextLine());
c3.setLatitud(leer.nextDouble());
c3.setLongitud(leer.nextDouble());
c3.setListado(leer.nextInt());
c3.setMunicipio(leer.nextInt());
c3.setDistrito(leer.nextInt());
c3.setSeccion(leer.nextInt());
c3.participacion();
       
       
        
    }
    
}
