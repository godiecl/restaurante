/*
 * Copyright (c) 2024. Departamento de Ingenieria de Sistemas y Computacion
 */

package cl.ucn.disc.poo.restaurante.model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Pedido Class.
 *
 * @author Programacion Orientada al Objeto.
 */
public final class Pedido implements Facturable {

  /** Mesa. */
  private final int mesa;

  /** Productos */
  private final List<Producto> productos = new ArrayList<>();

  /**
   * Constructor de un Pedido.
   *
   * @param mesa del Pedido.
   */
  public Pedido(int mesa) {
    if (mesa <= 0) {
      throw new IllegalArgumentException("Mesa no valida");
    }
    this.mesa = mesa;
  }

  /**
   * @return la mesa.
   */
  public int getMesa() {
    return this.mesa;
  }

  /**
   * @return la cantidad de productos.
   */
  public int getCantidadProductos() {
    return this.productos.size();
  }

  /** {@inheritDoc} */
  @Override
  public void agregar(final Producto producto) {
    this.productos.add(producto);
  }

  /** {@inheritDoc} */
  @Override
  public double calcularTotal() {
    // valor total de la mesa
    double total = 0.0;

    // por cada producto sumo su precio y su impuesto
    for (Producto producto : this.productos) {
      total += producto.getPrecio() + producto.calcularImpuesto();
    }

    // retorno el total
    return total;
  }
}
