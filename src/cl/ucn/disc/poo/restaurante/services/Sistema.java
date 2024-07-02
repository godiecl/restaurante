/*
 * Copyright (c) 2024. Departamento de Ingenieria de Sistemas y Computacion
 */

package cl.ucn.disc.poo.restaurante.services;

import cl.ucn.disc.poo.restaurante.model.Producto;

/**
 * The Interface Sistema.
 *
 * @author Programacion Orientada al Objeto.
 */
public interface Sistema {

  /**
   * Calcula el total a pagar dado el numero de mesa.
   *
   * @param mesa numero de mesa.
   * @return total a pagar.
   */
  int totalPagar(int mesa);

  /**
   * Agrega un Producto a una mesa.
   *
   * @param producto a agregar.
   * @param mesa numero de la mesa a donde agregar el producto.
   */
  void agregarProductoAMesa(Producto producto, int mesa);
}
