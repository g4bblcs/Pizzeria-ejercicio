/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.pedido;

import core.pizzeria.Cliente;
import core.pizzeria.Item;
import java.util.ArrayList;

/**
 *
 * @author Gabriela Campo
 */
public class PedidoTelefono extends Pedido {
    private String telefono;

    public PedidoTelefono(Cliente cliente, String telefono, ArrayList<Item> items) {
        super(cliente, items);
        this.telefono = telefono;
        
        this.cliente.addPedido(this);
    }    
}
