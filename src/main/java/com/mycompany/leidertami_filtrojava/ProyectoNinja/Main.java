
package com.mycompany.leidertami_filtrojava.ProyectoNinja;

import com.mycompany.leidertami_filtrojava.ProyectoNinja.modelo.habilidad.Habilidad;
import com.mycompany.leidertami_filtrojava.ProyectoNinja.modelo.habilidad.HabilidadDAO;
import com.mycompany.leidertami_filtrojava.ProyectoNinja.modelo.ninja.Ninja;
import com.mycompany.leidertami_filtrojava.ProyectoNinja.modelo.ninja.NinjaDAO;
import com.mycompany.leidertami_filtrojava.ProyectoNinja.vista.NinjaHabilidadView;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NinjaDAO ninjaDAO = new NinjaDAO();
        HabilidadDAO habilidadDAO = new HabilidadDAO();
        NinjaHabilidadView view = new NinjaHabilidadView();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 4) {
            System.out.println("Menu:");
            System.out.println("1. Listar ninjas con habilidades");
            System.out.println("2. mostrar las misiones disponibles para  un ninja en especifico");
            System.out.println("3. crear un ninja");
            System.out.println("4. crear una habilidad");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    List<Ninja> ninjas = ninjaDAO.listarNinjas();
                    List<Habilidad> habilidades = habilidadDAO.listarHabilidades();
                    view.listarNinjasConHabilidades(ninjas, habilidades);
                    break;
                    case 2:
                    // aun falta implementar su logica
                    case 3:
                    //esta si funcion
                    System.out.println("Ingrese el nombre del ninja:");
                    String nombreNinjaCrear = scanner.next();
                    System.out.println("Ingrese el rango del ninja:");
                    int rangoNinja = scanner.nextInt();
                    System.out.println("Ingrese la aldea del ninja:");
                    String aldeaNinja = scanner.next();
                    ninjaDAO.crearNinja(new Ninja(4, nombreNinjaCrear, rangoNinja, aldeaNinja));
                    System.out.println("Ninja creado exitosamente.");
                    break;
                    case 4:
                    //funciona
                    System.out.println("Ingrese el nombre de la habilidad:");
                    String nombreHabilidad = scanner.next();
                    System.out.println("Ingrese la descripcioon de la habilidad:");
                    String descripcionHabilidad = scanner.next();
                    habilidadDAO.crearHabilidad(new Habilidad(4, nombreHabilidad, descripcionHabilidad));
                    System.out.println("Habilidad creada exitosamente.");
                    case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }
    }
}