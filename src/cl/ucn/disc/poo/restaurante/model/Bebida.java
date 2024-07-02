/*
 * Copyright (c) 2024. Departamento de Ingenieria de Sistemas y Computacion
 */

package cl.ucn.disc.poo.restaurante.model;

/**
 * The Clase Bebida.
 *
 * @author Programacion Orientada al Objeto.
 */
public final class Bebida extends Producto {

  /** Tamanio en ml de la Bebida. */
  private final int tamanio;

  /** tipo de bebida. */
  private final TipoBebida tipoBebida;

  /**
   * Constructor.
   *
   * @param nombre de la bebida.
   * @param precio de la bebida.
   * @param tamanio de la bebida.
   * @param tipoBebida de la bebida.
   */
  public Bebida(String nombre, double precio, int tamanio, TipoBebida tipoBebida) {
    super(nombre, precio);

    // validacion
    if (tamanio <= 0) {
      throw new IllegalArgumentException("No se permite bebida con tamanio 0 o negativo.");
    }
    this.tamanio = tamanio;

    // validacion
    if (tipoBebida == null) {
      throw new IllegalArgumentException("Tipo de bebida no valido.");
    }
    this.tipoBebida = tipoBebida;
  }

  /**
   * @return the tamanio.
   */
  public int getTamanio() {
    return this.tamanio;
  }

  /**
   * @return the tipo de bebida.
   */
  public TipoBebida getTipoBebida() {
    return this.tipoBebida;
  }

  /** {@inheritDoc} */
  @Override
  public double calcularImpuesto() {
    // 15% del precio
    double impuesto = this.getPrecio() * 0.15;

    // calculo del impuesto por ml
    int valorPorMl = 0;

    if (this.tipoBebida == TipoBebida.CERVEZA) {
      valorPorMl = 3;
    } else {
      if (this.tipoBebida == TipoBebida.VINO) {
        valorPorMl = 6;
      }
    }

    // sumo el impuesto por ml
    impuesto += this.tamanio * valorPorMl;

    return impuesto;
  }
}
