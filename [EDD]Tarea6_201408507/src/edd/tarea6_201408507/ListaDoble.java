/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.tarea6_201408507;

/**
 *
 * @author Aran
 */
public class ListaDoble {
    Nodo primero;
    Nodo ultimo;

    public ListaDoble() {
        primero=null;
        ultimo=null;
        
        
    }
    
    public void Insertar(int Códigodeproducto, int Stock, int StockMínimo, String CódigoProveedor){
        Nodo nuevo = new Nodo(Códigodeproducto, Stock, StockMínimo, CódigoProveedor);
          if (primero==null) {
            
            primero= nuevo;
            ultimo=primero;
            
            
        }else{
        
            if (primero.Códigodeproducto>Códigodeproducto) {
                nuevo.siguiente=primero;
                primero=nuevo;
            }else{
                Nodo aux=primero;
                while(aux.siguiente!=null && aux.siguiente.Códigodeproducto<=Códigodeproducto){
                   aux= aux.siguiente;
                }
                nuevo.anterior=aux;
                nuevo.siguiente=aux.siguiente;
                aux.siguiente=nuevo;
            }
            
        }
    
    
    }
    
    
    public void mostrar(){
        Nodo actual;
        actual=primero;
        System.out.println(actual.Códigodeproducto);
        actual=actual.siguiente;
        while(actual !=null){
            System.out.println(actual.Códigodeproducto);
  
        actual=actual.siguiente;
        
        }
     
    
    }
    
       public void mostrar(ListaDoble copia){
        Nodo actual;
        actual=copia.primero;
       System.out.println("codigo Producto "+actual.Códigodeproducto+"  codigo Proveedor  "+actual.CódigoProveedor);

        actual=actual.siguiente;
        while(actual !=null){
            System.out.println("codigo Producto "+actual.Códigodeproducto+"  codigo Proveedor  "+actual.CódigoProveedor);
  
        actual=actual.siguiente;
        
        }
     
    
    }
    
    
    
    public ListaDoble CopiaNodo(){
        ListaDoble copia = new ListaDoble();
        Nodo actual = primero;
        while(actual!=null){
            if (actual.Stock<actual.StockMínimo) {
                copia.Insertar(actual.Códigodeproducto, actual.Stock, actual.StockMínimo, actual.CódigoProveedor);
            }
            actual = actual.siguiente;
            
        
        }
    
        return copia;
    }
    
      public void eliminar(int cod){
    
            Nodo actual = primero;
            Nodo atras = null;
            
            while (actual!=null) {               
                if (actual.Códigodeproducto==cod) {
                    if (actual==primero) {
                      
                        primero=primero.siguiente;
                        primero.anterior=null;
                        
                    }else if(actual.siguiente==null){
                        atras=actual.anterior;
                        atras.siguiente=null;
                        ultimo=atras;
                    
                    }else{
                        
                        atras.siguiente=actual.siguiente;
                        actual.siguiente.anterior=actual.anterior;
                    
                    }
               
                }
                atras = actual;
                actual=actual.siguiente;
                
           }
    
    }
      
      public void EliminarProductos(){
            Nodo actual = primero;
            System.out.println("-------------------");
            while (actual!=null) {              
                if (actual.Códigodeproducto>=100) {
                    
                    eliminar(actual.Códigodeproducto);
                    
                }
                actual = actual.siguiente;
          }
            
      
      }
    
}
