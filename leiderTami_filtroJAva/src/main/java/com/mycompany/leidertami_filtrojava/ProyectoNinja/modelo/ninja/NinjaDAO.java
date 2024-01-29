
package com.mycompany.leidertami_filtrojava.ProyectoNinja.modelo.ninja;
import com.mycompany.leidertami_filtrojava.ProyectoNinja.modelo.ConexionBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NinjaDAO {

    public void crearNinja (Ninja ninja) {
      Connection conexion = ConexionBD.getConexion ();
      PreparedStatement ps = null;
      String sql = "INSERT INTO ninja (id, nombre, rango, aldea) VALUES (?, ?, ?, ?)";
      try {
        ps = conexion.prepareStatement (sql);
        ps.setInt (1, ninja.getId ());
        ps.setString (2, ninja.getNombre ());
        ps.setInt (3, ninja.getRango ());
        ps.setString (4, ninja.getAldea());
        ps.executeUpdate ();
      } catch (SQLException e) {
        e.printStackTrace ();
      } finally {
        try {
          if (ps != null) {
            ps.close ();
          }
        } catch (SQLException e) {
          e.printStackTrace ();
        }
      }
    }
public List<Ninja> listarNinjas() {
    Connection conexion = ConexionBD.getConexion();
    PreparedStatement ps = null;
    ResultSet rs = null;
    List<Ninja> ninjas = new ArrayList<>();
    String sql = "SELECT id, nombre, rango, aldea FROM ninja";
    try {
        ps = conexion.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            NinjaBuilder builder = new NinjaBuilderImpl()
                    .id(rs.getInt("id"))
                    .nombre(rs.getString("nombre"))
                    .rango(rs.getInt("rango"))
                    .aldea(rs.getString("aldea"));
            Ninja ninja = builder.build();
            ninjas.add(ninja);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return ninjas;
}
  
    public void actualizarNinja (Ninja ninja) {
      Connection conexion = ConexionBD.getConexion ();
      PreparedStatement ps = null;
      String sql = "UPDATE ninja SET nombre = ?, rango = ?, aldea = ? WHERE id = ?";
      try {
        ps = conexion.prepareStatement (sql);
        ps.setInt (1, ninja.getId ());
        ps.setString (2, ninja.getNombre ());
        ps.setInt (3, ninja.getRango ());
        ps.setString (4, ninja.getAldea ());
        ps.executeUpdate ();
      } catch (SQLException e) {
        e.printStackTrace ();
      } finally {
        try {
          if (ps != null) {
            ps.close ();
          }
        } catch (SQLException e) {
          e.printStackTrace ();
        }
      }
    }
  
    public void borrarNinja (int id) {
      Connection conexion = ConexionBD.getConexion ();
      PreparedStatement ps = null;
      String sql = "DELETE FROM ninja WHERE id = ?";
      try {
        ps = conexion.prepareStatement (sql);
        ps.setInt (1, id);
        ps.executeUpdate ();
      } catch (SQLException e) {
        e.printStackTrace ();
      } finally {
        try {
          if (ps != null) {
            ps.close ();
          }
        } catch (SQLException e) {
          e.printStackTrace ();
        }
      }
    }
  }
  
