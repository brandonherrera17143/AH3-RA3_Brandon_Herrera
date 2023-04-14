
package dao;

import java.util.LinkedList;
import model.Usuario;


public interface UsuariosDao {
    
    public LinkedList<Usuario> mostrar();
    public Usuario obtener(int codigo);
    public void crear(Usuario usuario);
    public void modificar(Usuario usuario);
    public void eliminar(int codigo);
    public String verificarCorreo(String correo);
    public boolean inicioSesion(String correo, String pass);
//    public String obetenerNonbreUsuario(String correo, String pass);
    
}
