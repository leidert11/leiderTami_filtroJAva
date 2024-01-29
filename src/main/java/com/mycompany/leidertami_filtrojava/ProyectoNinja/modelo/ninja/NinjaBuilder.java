package com.mycompany.leidertami_filtrojava.ProyectoNinja.modelo.ninja;


public interface NinjaBuilder {
  NinjaBuilder id(int id);
  NinjaBuilder nombre(String nombre);
  NinjaBuilder rango(int rango);
  NinjaBuilder aldea(String aldea);
  Ninja build(); 
}