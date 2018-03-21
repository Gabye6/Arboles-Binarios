/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles.binarios;

public class Nodo<T>{
    T info;
    Nodo<T> izq;
    Nodo<T> der;
    Nodo<T> Padre;

    public Nodo(T info) {
        this.info = info;
        this.izq = izq;
        this.der = der;
        this.Padre = Padre;
    }
    
    public void insertarNodoizq(T data){
        if (this.izq == null){
             this.izq = new Nodo(data);
             this.izq.Padre=this;
        }else{
             this.izq.insertarNodoizq(data);
        }
    }   
    
    public void insertarNododer(T data){
    if(this.der == null){
        this.der = new Nodo(data);
        this.der.Padre=this;
    }else{
        this.der.insertarNododer(data);
    }
    }
    
    public void enOrden(){
        if (this.izq != null){
            this.izq.enOrden();
        }else{
            System.out.println();
        }
        System.out.println(this.info);
        
        if (this.der!=null) {
            this.der.enOrden();
        }else{
            System.out.println();
        }
    }
}


