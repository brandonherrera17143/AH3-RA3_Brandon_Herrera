package model;

import dao.UsuariosDao;
import disenoNuevo.Loginv2;
import disenoNuevo.PanelGerente;
import java.util.LinkedList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class UsuariosDaoRelacional implements UsuariosDao {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion acceso = new Conexion();

    @Override
    public LinkedList<Usuario> mostrar() {
        String sql = "select usuarios.usuario_id, usuarios.nombre, usuarios.apellido, rol.nombre, usuarios.correo, usuarios.telefono\n"
                + "from evalti.usuarios\n"
                + "inner join evalti.rol\n"
                + "on usuarios.rol_id = rol.rol_id";
        LinkedList<Usuario> mostrar = new LinkedList();
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                mostrar.add(new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6)));

            }
            return mostrar;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public Usuario obtener(int codigo) {
        String sql = "select * from usuarios where usuario_id= ?";

        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                return new Usuario(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getDate(7).toString(), rs.getInt(8), rs.getInt(9), rs.getString(10));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron Resultados");
            }
            return null;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    @Override
    public void crear(Usuario usuario) {
        String sql = "insert into usuarios(nombre,apellido,telefono,direccion,correo,fecha_nac,rol_id,activo,contrasenia) values (?,?,?,?,?,?,?,?,?);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setInt(3, usuario.getTelefono());
            ps.setString(4, usuario.getDireccion());
            ps.setString(5, usuario.getCorreo());
            ps.setString(6, usuario.getFecha_nac());
            ps.setInt(7, 1);
            ps.setInt(8, usuario.getActivo());
            ps.setString(9, usuario.getContrasenia());
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void modificar(Usuario usuario) {
        String sql = "update usuarios set nombre=?, apellido=?, telefono=?, direccion=?, correo=?, fecha_nac=?, rol_id=?, activo=?, contrasenia=? where usuario_id=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setInt(3, usuario.getTelefono());
            ps.setString(4, usuario.getDireccion());
            ps.setString(5, usuario.getCorreo());
            ps.setString(6, usuario.getFecha_nac());
            ps.setInt(7, 1);
            ps.setInt(8, usuario.getActivo());
            ps.setString(9, usuario.getContrasenia());
            ps.setInt(10, usuario.getUsuario_id());
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void eliminar(int codigo) {
        String sql = "delete from usuarios where usuario_id=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    @Override
    public String verificarCorreo(String correo) {
        String correoEncontrado = null;
        String correoUser = null;
        String sql = "SELECT * FROM usuarios WHERE correo='" + correo + "'";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                correoUser = rs.getString(6);
            }
            if (correo.equals(correoUser)) {
                correoEncontrado = correoUser;
            } else if (!correo.equals(correoUser)) {
                correoEncontrado = "";
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return correoEncontrado;
    }

    @Override
    public boolean inicioSesion(String correo, String pass) {
        boolean intentos = false;
        String nombreUser = null;
        String correoUser = null;
        String passUser = null;
        int isActivo = 0;
        String sql = "SELECT * FROM usuarios WHERE correo='" + correo + "' and contrasenia='" + pass + "'";
      
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                nombreUser = rs.getString(2);
                correoUser = rs.getString(6);
                isActivo = rs.getInt(9);
                passUser = rs.getString(10);
            }

            if (isActivo != 0) {
                if (correo.equals(correoUser) && pass.equals(passUser)) {
                    PanelGerente panel = new PanelGerente();
                    panel.nombreUsuario(nombreUser);
                    panel.setVisible(true);
                    intentos = true;
                } else if (!correo.equals(correoUser) || pass.equals(passUser)) {
                    intentos = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario inactivo");
                Loginv2 limpiar = new Loginv2();
                limpiar.limpiarTexto(true);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        if (isActivo == 0) {
            Loginv2 limpiar = new Loginv2();
            limpiar.limpiarTexto(true);
            return true;
        } else {
            return intentos;
        }
        
    }

}
