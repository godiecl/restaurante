/*
 * Copyright (c) 2024. Departamento de Ingenieria de Sistemas y Computacion
 */

package cl.ucn.disc.poo.restaurante.services;

import cl.ucn.disc.poo.restaurante.model.Pedido;
import cl.ucn.disc.poo.restaurante.model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * The Sistema Implementation.
 *
 * @author Programacion Orientada al Objeto.
 */
public final class SistemaImpl implements Sistema {

  /** The Pedidos. */
  private final List<Pedido> pedidos = new ArrayList<>();

  /** The Empty constructor. */
  public SistemaImpl() {
    // nothing here!
  }

  /** {@inheritDoc} */
  @Override
  public int totalPagar(int mesa) {
    // recorro los pedidos busca el total de la mesa.
    for (Pedido pedido : pedidos) {
      // si encontre la mesa
      if (pedido.getMesa() == mesa) {
        // calculo el total de la mesa
        return (int) pedido.calcularTotal();
      }
    }
    // en caso de no encontrar la mesa.
    throw new IllegalArgumentException("No se encontro Pedido para mesa " + mesa);
  }

  /** {@inheritDoc} */
  @Override
  public void agregarProductoAMesa(Producto producto, int mesa) {
    // recorro los pedidos buscando la mesa
    for (Pedido pedido : pedidos) {
      // si encontre la mesa
      if (pedido.getMesa() == mesa) {
        // agrego el producto a la mesa
        pedido.agregar(producto);
        return;
      }
    }
    // en caso de no encontrar la mesa:
    // 1. creo un nuevo pedido
    Pedido pedido = new Pedido(mesa);
    // 2. agrego el producto
    pedido.agregar(producto);
    // 3. agrego el pedido a la lista de pedidos
    this.pedidos.add(pedido);
  }
}
