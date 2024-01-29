package com.mycompany.leidertami_filtrojava.ProyectoNinja.vista;

import com.mycompany.leidertami_filtrojava.ProyectoNinja.modelo.habilidad.Habilidad;
import com.mycompany.leidertami_filtrojava.ProyectoNinja.modelo.ninja.Ninja;
import java.util.List;

public class NinjaHabilidadView {
    public void listarNinjasConHabilidades(List<Ninja> ninjas, List<Habilidad> habilidades) {
        ninjas.forEach(ninja -> {
            System.out.println("Ninja: " + ninja.getNombre());
            System.out.println("Habilidades:");
            habilidades.stream()
                    .filter(habilidad -> habilidad.getIdNinja() == ninja.getId())
                    .forEach(habilidad -> System.out.println("  - " + habilidad.getNombre()));
        });
    }
    public void mostrarMisionesDisponiblesParaNinja(Ninja ninja, List<String> misiones) {
        System.out.println("Misiones disponibles para el ninja " + ninja.getNombre() + ":");
        for (String mision : misiones) {
            System.out.println("- " + mision);
        }
    }
}