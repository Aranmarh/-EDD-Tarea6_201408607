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
public class EDDTarea6_201408507 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDoble l = new ListaDoble();
        l.Insertar(1, 5, 4, "Producto 1");
        l.Insertar(6, 6, 4, "Producto 2");
        l.Insertar(5, 1, 4, "Producto 3");
        l.Insertar(2, 2, 3, "Producto 4");
        l.Insertar(4, 1, 2, "Producto 5");
        l.Insertar(100, 1, 2, "Producto 5");
        l.Insertar(200, 1, 2, "Producto 5");
        l.Insertar(230, 1, 2, "Producto 5");
        l.Insertar(211, 1, 2, "Producto 5");
        l.mostrar();
       l.mostrar(l.CopiaNodo());
      
       
        l.EliminarProductos();
        l.mostrar();
    }
    
}
