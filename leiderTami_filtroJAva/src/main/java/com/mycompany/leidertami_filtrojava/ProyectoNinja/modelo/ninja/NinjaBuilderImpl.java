package com.mycompany.leidertami_filtrojava.ProyectoNinja.modelo.ninja;

public class NinjaBuilderImpl implements NinjaBuilder {

  private Ninja ninja = new Ninja(0, "", 0, "");

  public NinjaBuilder id(int id) {
    ninja.setId(id);
    return this;
  }

  public NinjaBuilder nombre(String nombre) {
    ninja.setNombre(nombre);
    return this;
  }

  public NinjaBuilder rango(int rango) {
    ninja.setRango(rango);
    return this;
  }

  public NinjaBuilder aldea(String aldea) {
    ninja.setAldea(aldea);
    return this;
  }

  public Ninja build() {
    return ninja;
  }
}