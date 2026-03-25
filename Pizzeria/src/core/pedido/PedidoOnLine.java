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
public class PedidoOnLine extends Pedido {

    private String email;

    public PedidoOnLine(Cliente cliente, String email, ArrayList<Item> items) {
        super(cliente, items);
        this.email = email;

        this.cliente.addPedido(this);
    }

    public ArrayList<Item> getItems() {
        return items; 
    }
}
