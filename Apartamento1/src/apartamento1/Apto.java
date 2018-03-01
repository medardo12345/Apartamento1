/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apartamento1;

/**
 *
 * @author DELL
 */
public class Apto {
    int metroscuadrados;
    String colorparedes;
    String barrio;

    public void mostrar(){
        System.out.println("Buenos dias el apartamento tiene ");
        System.out.println(metroscuadrados+" metros cuadrados."); 
        System.out.println("Las paredes son "+ colorparedes);
        System.out.println("y esta ubicado en "+ barrio+".");
    
    }   
}
