
package model;

import java.util.Date;

public class Usuario extends Roles {
    private int usuario_id;
    private String nombre;
    private String apellido;
    private int telefono;
    private String direccion;
    private String correo;
    private String fecha_nac;
    private int rol_id;
    private int activo;
    private String contrasenia;
    
    public Usuario(){}

    public Usuario(int usuario_id, String nombre, String apellido, int telefono, String direccion, String correo, String fecha_nac, int rol_id, int activo, String contrasenia) {
        this.usuario_id = usuario_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.fecha_nac = fecha_nac;
        this.rol_id= rol_id;
        this.activo = activo;
        this.contrasenia = contrasenia;
        
    }

    public Usuario(String nombre, String apellido, int telefono, String direccion, String correo, String fecha_nac,int rol_id, String contrasenia, int activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.rol_id = rol_id;
        this.fecha_nac = fecha_nac;
        this.contrasenia = contrasenia;
        this.activo = activo;
    }

    public Usuario(int usuario_id, String nombre, String apellido, String nombreRol, String correo, int telefono) {
        super(nombreRol);
        this.usuario_id = usuario_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        
    }

    public Usuario(int usuario_id) {
        this.usuario_id = usuario_id;
    }
    
    
  

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public int getRol() {
        return rol_id;
    }

    public void setRol(int rol_id) {
        this.rol_id = rol_id;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    @Override
    public String getNombreRol() {
        return nombreRol;
    }
    
    
    
}
