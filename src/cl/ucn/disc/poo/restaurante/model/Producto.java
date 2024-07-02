/*
 * Copyright (c) 2024. Departamento de Ingenieria de Sistemas y Computacion
 */

package cl.ucn.disc.poo.restaurante.model;

/**
 * The Producto.
 *
 * @author Programacion Orientada al Objeto.
 */
public abstract class Producto {

  /** Nombre. */
  private final String nombre;

  /** Precio. */
  private final double precio;

  /**
   * Constructor de un Producto.
   *
   * @param nombre del Producto.
   * @param precio del Producto.
   */
  public Producto(String nombre, double precio) {
    // validacion
    if (nombre == null || nombre.isBlank()) {
      throw new IllegalArgumentException("Nombre no valido");
    }
    this.nombre = nombre;

    if (precio < 1) {
      throw new IllegalArgumentException("Precio menor a $1");
    }
    this.precio = precio;
  }

  /**
   * @return the nombre.
   */
  public String getNombre() {
    return this.nombre;
  }

  /**
   * @return the precio.
   */
  public double getPrecio() {
    return this.precio;
  }

  /**
   * Metodo para calcular el impuesto.
   *
   * @return el impuesto.
   */
  public abstract double calcularImpuesto();
}
