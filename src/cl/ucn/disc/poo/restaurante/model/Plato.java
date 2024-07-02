/*
 * Copyright (c) 2024. Departamento de Ingenieria de Sistemas y Computacion
 */

package cl.ucn.disc.poo.restaurante.model;

/**
 * The Plato.
 *
 * @author Programacion Orientada al Objeto.
 */
public final class Plato extends Producto {

  /** Peso en gramos del Plato. */
  private final double peso;

  /** tipo de plato. */
  private final TipoPlato tipo;

  /**
   * Constructor de un Plato.
   *
   * @param nombre del plato.
   * @param precio del plato.
   * @param peso del plato.
   * @param tipoPlato del plato.
   */
  public Plato(String nombre, double precio, double peso, TipoPlato tipoPlato) {
    super(nombre, precio);

    // validacion
    if (peso <= 0) {
      throw new IllegalArgumentException("No se permite plato con peso 0 o negativo.");
    }
    this.peso = peso;

    // validacion
    if (tipoPlato == null) {
      throw new IllegalArgumentException("Tipo de plato no valido.");
    }
    this.tipo = tipoPlato;
  }

  /**
   * @return the peso.
   */
  public double getPeso() {
    return this.peso;
  }

  /**
   * @return the tipo de plato.
   */
  public TipoPlato getTipoPlato() {
    return this.tipo;
  }

  /** {@inheritDoc} */
  @Override
  public double calcularImpuesto() {
    // 10% del precio
    double impuesto = this.getPrecio() * 0.10;

    // calculo del impuesto por gramo
    int valorGramo = 0;

    if (this.tipo == TipoPlato.ENTRADA) {
      valorGramo = 5;
    } else if (this.tipo == TipoPlato.FONDO) {
      valorGramo = 12;
    } else if (this.tipo == TipoPlato.POSTRE) {
      valorGramo = 7;
    }

    // sumo el impuesto por gramo
    impuesto += this.peso * valorGramo;

    return impuesto;
  }
}
