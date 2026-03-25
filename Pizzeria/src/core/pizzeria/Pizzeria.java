/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.pizzeria;
import core.pedido.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gabriela Campo
 */
public class Pizzeria {
    private String nombre;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Pizzeria() {
        this.nombre = "Pepe pizzeria";
        this.clientes = new ArrayList<>();
        this.items = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }
    
    public Boolean addCliente(Cliente cliente){
        if (!this.clientes.contains(cliente)) {
            this.clientes.add(cliente);
            return true;
        }
        return false;
    }
    public Boolean addItem(Item item){
        if (!this.items.contains(item)) {
            this.items.add(item);
            return true;
        }
        return false;
    }
    public Boolean addPedido(Pedido pedido){
        if (!this.pedidos.contains(pedido)) {
            this.pedidos.add(pedido);
            return true;
        }
        return false;
    }

    public Cliente getCliente(int index) {
        return clientes.get(index);
    }

    public Item getItem(int index) {
        return items.get(index);
    }
    
    public int calcProdMasVendidoCliente(int numCliente) {
        System.out.println("num_cliente = " + numCliente);
        
        ArrayList<String> itemsName = new ArrayList<>();
        for (Item item : this.items) {
            itemsName.add(item.getNombre());
        }
        
        HashMap<String, Integer> frecuenciaPedidos = this.clientes.get(numCliente).getFrecuenciaPedidos(itemsName);
        for (String name : itemsName) {
            System.out.println("El producto " + name + " se vendio " + frecuenciaPedidos.get(name));
        }
        
        if ((new ArrayList<>(frecuenciaPedidos.values())).stream().mapToInt(Integer::intValue).sum() > 0) {
            String itemName = Collections.max(frecuenciaPedidos.entrySet(), Map.Entry.comparingByValue()).getKey();
            for (Item item : this.items) {
                if (item.getNombre().equals(itemName)) {
                    return this.items.indexOf(item);
                }
            }
        }
        return -1;
    }
    
}
