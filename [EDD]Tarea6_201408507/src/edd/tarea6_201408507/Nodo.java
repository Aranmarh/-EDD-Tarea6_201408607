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
public class Nodo {
    int Códigodeproducto;
    int Stock;
    int StockMínimo;
    String CódigoProveedor;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(int Códigodeproducto, int Stock, int StockMínimo, String CódigoProveedor) {
        this.Códigodeproducto = Códigodeproducto;
        this.Stock = Stock;
        this.StockMínimo = StockMínimo;
        this.CódigoProveedor = CódigoProveedor;
        this.siguiente = null;
        this.anterior = null;
    }

    public int getCódigodeproducto() {
        return Códigodeproducto;
    }

    public void setCódigodeproducto(int Códigodeproducto) {
        this.Códigodeproducto = Códigodeproducto;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getStockMínimo() {
        return StockMínimo;
    }

    public void setStockMínimo(int StockMínimo) {
        this.StockMínimo = StockMínimo;
    }

    public String getCódigoProveedor() {
        return CódigoProveedor;
    }

    public void setCódigoProveedor(String CódigoProveedor) {
        this.CódigoProveedor = CódigoProveedor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    
    
    
}
