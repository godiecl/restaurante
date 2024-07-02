/*
 * Copyright (c) 2024. Departamento de Ingenieria de Sistemas y Computacion
 */

package cl.ucn.disc.poo.restaurante.model;

/**
 * The Interface.
 *
 * @author Programacion Orientada al Objeto.
 */
public interface Facturable {

  /**
   * Metodo para agregar un producto.
   *
   * @param producto a agregar.
   */
  void agregar(Producto producto);

  /**
   * Metodo para calcular el valor total.
   *
   * @return el valor total.
   */
  double calcularTotal();
}
