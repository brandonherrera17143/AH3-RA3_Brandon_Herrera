package disenoNuevo;


import javax.swing.table.DefaultTableModel;

import model.Usuario;
import model.UsuariosDaoRelacional;


public class UsuariosTabla extends javax.swing.JPanel {
    DefaultTableModel tablaBandera;
    
    public UsuariosTabla() {
        initComponents();
        llenarTablaClientes();
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(860, 410));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(860, 410));

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaClientes.setMinimumSize(new java.awt.Dimension(860, 410));
        TablaClientes.setPreferredSize(new java.awt.Dimension(860, 410));
        TablaClientes.setShowGrid(true);
        jScrollPane1.setViewportView(TablaClientes);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 410));
    }// </editor-fold>//GEN-END:initComponents

     public void llenarTablaClientes() {
        String columnas[] = {"No.", "Nombre", "Apellido", "Nombre Rol", "Correo", "Telefono"};
        tablaBandera = new DefaultTableModel(null, columnas);
        UsuariosDaoRelacional ver = new UsuariosDaoRelacional();
        for (Usuario user:ver.mostrar()) {
            Object mostrar[] = new Object[6];
            mostrar[0] = user.getUsuario_id();
            mostrar[1] = user.getNombre();
            mostrar[2] = user.getApellido();
            mostrar[3] = user.getNombreRol();
            mostrar[4] = user.getCorreo();
            mostrar[5] = user.getTelefono();
            tablaBandera.addRow(mostrar);
            
        }
        TablaClientes.setModel(tablaBandera);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaClientes;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
