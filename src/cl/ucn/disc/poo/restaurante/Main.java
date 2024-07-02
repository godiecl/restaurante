/*
 * Copyright (c) 2024. Departamento de Ingenieria de Sistemas y Computacion
 */

package cl.ucn.disc.poo.restaurante;

import cl.ucn.disc.poo.restaurante.model.Bebida;
import cl.ucn.disc.poo.restaurante.model.Plato;
import cl.ucn.disc.poo.restaurante.model.TipoBebida;
import cl.ucn.disc.poo.restaurante.model.TipoPlato;
import cl.ucn.disc.poo.restaurante.services.Sistema;
import cl.ucn.disc.poo.restaurante.services.SistemaImpl;

/**
 * The Main.
 *
 * @author Programacion Orientada al Objeto.
 */
public final class Main {

  /**
   * The Main.
   *
   * @param args to use.
   */
  public static void main(String[] args) {
    // instanciacion de Sistema.
    Sistema sistema = new SistemaImpl();

    // se agrega un agua sin gas a la mesa 4
    Bebida aguaSinGas = new Bebida("Agua sin gas", 1500, 500, TipoBebida.AGUA);
    sistema.agregarProductoAMesa(aguaSinGas, 4);

    // se agrega un plato de ensalada cesar a la mesa 4
    Plato ensalada = new Plato("Ensalada Cesar", 5500, 350, TipoPlato.ENTRADA);
    sistema.agregarProductoAMesa(ensalada, 4);

    // total a pagar de la mesa 4
    System.out.println("Valor de mesa 4: " + sistema.totalPagar(4));
  }
}
