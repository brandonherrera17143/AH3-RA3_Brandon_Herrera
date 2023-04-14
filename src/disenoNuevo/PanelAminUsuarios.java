package disenoNuevo;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class PanelAminUsuarios extends javax.swing.JPanel {

    
    public PanelAminUsuarios() {
        initComponents();
        initContent();
        btnRegresarTablaClientes.setVisible(false);
       
    }
    
     public void initContent() {
        ShowPaneles(new UsuariosTabla());
      
    }

    public void ShowPaneles(JPanel a) {
        a.setSize(860, 410);
        a.setLocation(0, 0);

        jpContenidoClientes.removeAll();
        jpContenidoClientes.add(a, BorderLayout.CENTER);
        jpContenidoClientes.revalidate();
        jpContenidoClientes.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEliminarUsuario = new javax.swing.JButton();
        btbAgregarUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        jpContenidoClientes = new javax.swing.JPanel();
        btnRegresarTablaClientes = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(910, 520));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminarUsuario.setBackground(new java.awt.Color(84, 166, 234));
        btnEliminarUsuario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminarUsuario.setText("ELIMINAR USUARIO");
        btnEliminarUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnEliminarUsuario.setBorderPainted(false);
        btnEliminarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminarUsuario.setIconTextGap(15);
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btbAgregarUsuario.setBackground(new java.awt.Color(84, 166, 234));
        btbAgregarUsuario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btbAgregarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btbAgregarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btbAgregarUsuario.setText("AGREGAR USUARIO");
        btbAgregarUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btbAgregarUsuario.setBorderPainted(false);
        btbAgregarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btbAgregarUsuario.setIconTextGap(15);
        btbAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbAgregarUsuarioActionPerformed(evt);
            }
        });

        btnModificarUsuario.setBackground(new java.awt.Color(84, 166, 234));
        btnModificarUsuario.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        btnModificarUsuario.setText("MODIFICAR USUARIO");
        btnModificarUsuario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnModificarUsuario.setBorderPainted(false);
        btnModificarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificarUsuario.setIconTextGap(15);
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpContenidoClientesLayout = new javax.swing.GroupLayout(jpContenidoClientes);
        jpContenidoClientes.setLayout(jpContenidoClientesLayout);
        jpContenidoClientesLayout.setHorizontalGroup(
            jpContenidoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        jpContenidoClientesLayout.setVerticalGroup(
            jpContenidoClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        btnRegresarTablaClientes.setBackground(new java.awt.Color(84, 166, 234));
        btnRegresarTablaClientes.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnRegresarTablaClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresarTablaClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regresar.png"))); // NOI18N
        btnRegresarTablaClientes.setText("REGRESAR");
        btnRegresarTablaClientes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnRegresarTablaClientes.setBorderPainted(false);
        btnRegresarTablaClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegresarTablaClientes.setIconTextGap(15);
        btnRegresarTablaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarTablaClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btbAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jpContenidoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnRegresarTablaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btbAgregarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jpContenidoClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnRegresarTablaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        ShowPaneles(new EliminarUsuario());
        botonRegresar(true);
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btbAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbAgregarUsuarioActionPerformed
        ShowPaneles(new AgregarUsuario());
        botonRegresar(true);
        
    }//GEN-LAST:event_btbAgregarUsuarioActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
       ShowPaneles(new ActualizarUsuario());
       botonRegresar(true);
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void btnRegresarTablaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarTablaClientesActionPerformed
        ShowPaneles(new UsuariosTabla());
        botonRegresar(false);
    }//GEN-LAST:event_btnRegresarTablaClientesActionPerformed
    
    
    public void ver(boolean en){
        if (en) {
            ShowPaneles(new UsuariosTabla());
        }
    }
    
    public void botonRegresar(boolean click) { 

        if (click) {        
            btnRegresarTablaClientes.setVisible(true);
            
        } else {
            btnRegresarTablaClientes.setVisible(false);
        }
    }

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbAgregarUsuario;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnRegresarTablaClientes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpContenidoClientes;
    // End of variables declaration//GEN-END:variables
}
