/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.pedido;
import core.pizzeria.*;
import java.util.ArrayList;
/**
 *
 * @author Gabriela Campo
 */
public abstract class Pedido {
    protected Cliente cliente;
    protected ArrayList<Item> items = new ArrayList<>();

    public Pedido(Cliente cliente, ArrayList<Item> items) {
    this.cliente = cliente;
    this.items = items;
}

    public ArrayList<Item> getItems() {
        return items;
    }

    
    
    
}
