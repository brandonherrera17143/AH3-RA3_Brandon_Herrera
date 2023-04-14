package disenoNuevo;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import model.Usuario;
import model.UsuariosDaoRelacional;

public class ActualizarUsuario extends javax.swing.JPanel {

    PanelAminUsuarios regresar;
    public int buscar;

    public ActualizarUsuario() {
        initComponents();
        agregarDatosCombobox();

    }

    private void agregarDatosCombobox() {
        jcEstado.addItem("Activo");
        jcEstado.addItem("Inactivo");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jcEstado = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jdFechaNac = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        btnInsertar1 = new javax.swing.JButton();
        btnCancelarBusqueda = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(860, 410));

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo.setPreferredSize(new java.awt.Dimension(860, 410));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ACTUALIZAR USUARIO");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jpFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 210, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Codigo");
        jpFondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 50, 20));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Telefono");
        jpFondo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 70, 20));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Apellido");
        jpFondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 60, 20));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Direccion");
        jpFondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 70, 20));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jpFondo.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 240, -1));

        txtApellido.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtApellido.setBorder(null);
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jpFondo.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 240, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 240, 6));

        btnBuscar.setBackground(new java.awt.Color(84, 166, 234));
        btnBuscar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BUSCAR.png"))); // NOI18N
        btnBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnBuscar.setBorderPainted(false);
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar.setIconTextGap(15);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jpFondo.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 60, 40));

        btnCancelar.setBackground(new java.awt.Color(84, 166, 234));
        btnCancelar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCancelar.setBorderPainted(false);
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar.setIconTextGap(15);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jpFondo.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 150, 40));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 240, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 240, -1));

        txtTelefono.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtTelefono.setBorder(null);
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jpFondo.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 240, -1));

        txtDireccion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtDireccion.setBorder(null);
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionMousePressed(evt);
            }
        });
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jpFondo.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 240, -1));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 240, 6));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("Correo");
        jpFondo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 70, 20));

        txtCorreo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtCorreo.setBorder(null);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jpFondo.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 240, -1));

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 240, 6));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Fecha Nacimiento");
        jpFondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 120, 20));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setText("Estado");
        jpFondo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 60, 20));

        txtPass.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPass.setBorder(null);
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jpFondo.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 240, -1));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 240, 6));

        jcEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcEstadoActionPerformed(evt);
            }
        });
        jpFondo.add(jcEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 100, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setText("Contraseña");
        jpFondo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 90, 20));
        jpFondo.add(jdFechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 180, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Nombre");
        jpFondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 70, 20));

        txtUserId.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtUserId.setBorder(null);
        txtUserId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserIdMousePressed(evt);
            }
        });
        txtUserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIdActionPerformed(evt);
            }
        });
        jpFondo.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 80, -1));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jpFondo.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 80, 10));

        btnInsertar1.setBackground(new java.awt.Color(84, 166, 234));
        btnInsertar1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnInsertar1.setForeground(new java.awt.Color(255, 255, 255));
        btnInsertar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        btnInsertar1.setText("ACTUALIZAR");
        btnInsertar1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnInsertar1.setBorderPainted(false);
        btnInsertar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInsertar1.setIconTextGap(15);
        btnInsertar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertar1ActionPerformed(evt);
            }
        });
        jpFondo.add(btnInsertar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 150, 40));

        btnCancelarBusqueda.setBackground(new java.awt.Color(84, 166, 234));
        btnCancelarBusqueda.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnCancelarBusqueda.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btnCancelarBusqueda.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCancelarBusqueda.setBorderPainted(false);
        btnCancelarBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelarBusqueda.setIconTextGap(15);
        btnCancelarBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarBusquedaActionPerformed(evt);
            }
        });
        jpFondo.add(btnCancelarBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 60, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed

    }//GEN-LAST:event_txtNombreMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoMousePressed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int id_user = Integer.parseInt(txtUserId.getText());
        mostrar(id_user);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
 
              
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoMousePressed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionMousePressed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassMousePressed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void jcEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcEstadoActionPerformed

    private void txtUserIdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserIdMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdMousePressed

    private void txtUserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIdActionPerformed

    private void btnInsertar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertar1ActionPerformed
        if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtCorreo.getText().isEmpty() || txtPass.getText().isEmpty()) {
            camposVacios();
        }
        else {
            modificarUsuario();    
        }
    }//GEN-LAST:event_btnInsertar1ActionPerformed

    private void btnCancelarBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarBusquedaActionPerformed
        vaciarCampos();
    }//GEN-LAST:event_btnCancelarBusquedaActionPerformed

    public void mostrar(int idUser) {
        UsuariosDaoRelacional buscar = new UsuariosDaoRelacional();
        Usuario user = buscar.obtener(idUser);
        txtNombre.setText(user.getNombre());
        txtApellido.setText(user.getApellido());
        txtTelefono.setText(user.getTelefono() + "");
        txtDireccion.setText(user.getDireccion());
        txtCorreo.setText(user.getCorreo());

        String ls_fecha = String.valueOf(user.getFecha_nac());
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date fecha;
        try {
            fecha = (java.util.Date) s.parse(ls_fecha);
            jdFechaNac.setDate(fecha);
        } catch (ParseException e) {
        }

        if (user.getActivo() == 0) {
            jcEstado.setSelectedItem("Inactivo");
        } else if (user.getActivo() == 1) {
            jcEstado.setSelectedItem("Activo");
        }

        txtPass.setText(user.getContrasenia());
        txtUserId.setEnabled(false);
    }

    private void vaciarCampos() {
        txtUserId.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        jdFechaNac.setDate(null);
        txtPass.setText("");
        txtUserId.setEnabled(true);
    }

    
    private void modificarUsuario(){
        int estado = 0;
        int id_usuario = Integer.parseInt(txtUserId.getText());
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int telefono = Integer.parseInt(txtTelefono.getText());
        String direccion = txtDireccion.getText();
        String correo = txtCorreo.getText();

        SimpleDateFormat fecha = new SimpleDateFormat("yyyy-MM-dd");
        String date = fecha.format(jdFechaNac.getDate());
       
        int rol_id = 1;
        String pass = txtPass.getText();

        var activo = jcEstado.getSelectedItem();
        if (activo.equals("Activo")) {
            estado = 1;
        } else if (activo.equals("Inactivo")) {
            estado = 0;
        }
 
        Usuario user = new Usuario(id_usuario, nombre, apellido, telefono, direccion, correo, date,rol_id, estado, pass);
        UsuariosDaoRelacional in = new UsuariosDaoRelacional();
        in.modificar(user);
        JOptionPane.showMessageDialog(null, "El usuario " + nombre + " fue actualizado exitosamente! ");
        vaciarCampos();

    }
    private void camposVacios() {

        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No te olvides del nombre es muy importante! ");
        } else if (txtApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Aun no colocaste apellido al usuario");
        } else if (txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El numero de telefono es muy importante no te olvides de el");
        } else if (txtDireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Coloca una direccion");
        } else if (txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Colocaste el correo del cliente?");
        } else if (jdFechaNac.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Agrega la fecha de nacimiento");
        } else if (txtPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingresa una contrasenia");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarBusqueda;
    private javax.swing.JButton btnInsertar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JComboBox<String> jcEstado;
    private com.toedter.calendar.JDateChooser jdFechaNac;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}
