/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.util.*;
/**
 *
 * @author pepe
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Editorial rama=new Editorial("RA-MA EDITORIAL");
        /*
        Informática y comunicaciones grado superior
AÑO DE EDICIÓN
2012

ISBN
978-84-9964-169-0

EDITORIAL
RA-MA EDITORIAL

*/
        Libro l1 = new Libro("978-84-9964-169-0"," Informática y comunicaciones grado superior",2012,30);
        l1.perteneceA(rama);
        
        System.out.println(l1.toString());
        
        /*Nuevos cambios*/
                
    }
    
}
