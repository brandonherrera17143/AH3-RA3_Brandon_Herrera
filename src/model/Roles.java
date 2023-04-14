
package model;

public class Roles {
    private int rol_id;
    protected String nombreRol;
    
    public Roles(){}

    public Roles(int rol_id, String nombreRol) {
        this.rol_id = rol_id;
        this.nombreRol = nombreRol;
    }

    public Roles(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    
    
}
