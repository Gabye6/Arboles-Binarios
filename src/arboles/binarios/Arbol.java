/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles.binarios;

/**
 *
 * @author green
 */
public class Arbol {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo nodo=new Nodo("info");
        nodo.insertarNodoizq(4);
        nodo.insertarNododer(1);
    
        nodo.enOrden();
        
    }
    
}
