package disenoNuevo;

import java.awt.BorderLayout;
import javax.swing.JPanel;


public class PanelGerente extends javax.swing.JFrame {

    public PanelGerente() { 
        initComponents();
        initContent();   
        this.setLocationRelativeTo(null);
        
    }

    public void initContent() {
        ShowPaneles(new GerenteVistaTablaUsuarios());
    }

    public void ShowPaneles(JPanel a) {
        a.setSize(910, 520);
        a.setLocation(0, 0);

        jpContenidoGeneral.removeAll();
        jpContenidoGeneral.add(a, BorderLayout.CENTER);
        jpContenidoGeneral.revalidate();
        jpContenidoGeneral.repaint();
    }
    
    public void nombreUsuario(String nombre){
        txtNombreUsuario.setText("Binvenido " + nombre);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFondo = new javax.swing.JPanel();
        TiuloMenu = new javax.swing.JPanel();
        menuLabel = new javax.swing.JLabel();
        btbCerrar = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        banner = new javax.swing.JLabel();
        jpTituloAdmin = new javax.swing.JPanel();
        txtNombreUsuario = new javax.swing.JLabel();
        jpContenidoGeneral = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jpHeader = new javax.swing.JPanel();
        lblTextoTituloMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TiuloMenu.setBackground(new java.awt.Color(84, 166, 234));

        menuLabel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        menuLabel.setForeground(new java.awt.Color(255, 255, 255));
        menuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuLabel.setText("Menu");

        javax.swing.GroupLayout TiuloMenuLayout = new javax.swing.GroupLayout(TiuloMenu);
        TiuloMenu.setLayout(TiuloMenuLayout);
        TiuloMenuLayout.setHorizontalGroup(
            TiuloMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TiuloMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TiuloMenuLayout.setVerticalGroup(
            TiuloMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TiuloMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpFondo.add(TiuloMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 80));

        btbCerrar.setBackground(new java.awt.Color(84, 166, 234));
        btbCerrar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btbCerrar.setForeground(new java.awt.Color(255, 255, 255));
        btbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        btbCerrar.setText("CERRAR SESION");
        btbCerrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 40, 1, 1, new java.awt.Color(0, 0, 0)));
        btbCerrar.setBorderPainted(false);
        btbCerrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btbCerrar.setIconTextGap(25);
        btbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCerrarActionPerformed(evt);
            }
        });
        jpFondo.add(btbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 330, 50));

        btnUsuarios.setBackground(new java.awt.Color(84, 166, 234));
        btnUsuarios.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/account-multiple.png"))); // NOI18N
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 40, 1, 1, new java.awt.Color(0, 0, 0)));
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setIconTextGap(25);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        jpFondo.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 330, 50));

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/blue.jpg"))); // NOI18N
        jpFondo.add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 630));

        jpTituloAdmin.setBackground(new java.awt.Color(84, 166, 234));

        txtNombreUsuario.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpTituloAdminLayout = new javax.swing.GroupLayout(jpTituloAdmin);
        jpTituloAdmin.setLayout(jpTituloAdminLayout);
        jpTituloAdminLayout.setHorizontalGroup(
            jpTituloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTituloAdminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpTituloAdminLayout.setVerticalGroup(
            jpTituloAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTituloAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpFondo.add(jpTituloAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 910, 60));

        jpContenidoGeneral.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpContenidoGeneralLayout = new javax.swing.GroupLayout(jpContenidoGeneral);
        jpContenidoGeneral.setLayout(jpContenidoGeneralLayout);
        jpContenidoGeneralLayout.setHorizontalGroup(
            jpContenidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jpContenidoGeneralLayout.setVerticalGroup(
            jpContenidoGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        jpFondo.add(jpContenidoGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 910, 520));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jpFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 240, 70));

        jpHeader.setBackground(new java.awt.Color(255, 255, 255));

        lblTextoTituloMenu.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lblTextoTituloMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextoTituloMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpHeaderLayout = new javax.swing.GroupLayout(jpHeader);
        jpHeader.setLayout(jpHeaderLayout);
        jpHeaderLayout.setHorizontalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTextoTituloMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        jpHeaderLayout.setVerticalGroup(
            jpHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTextoTituloMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jpFondo.add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 910, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        //ShowPaneles(new HotelesUsuarios());
       
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCerrarActionPerformed
        Loginv2 cerrarSesion = new Loginv2();
        cerrarSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btbCerrarActionPerformed
     
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TiuloMenu;
    private javax.swing.JLabel banner;
    private javax.swing.JButton btbCerrar;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpContenidoGeneral;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpTituloAdmin;
    private javax.swing.JLabel lblTextoTituloMenu;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel txtNombreUsuario;
    // End of variables declaration//GEN-END:variables
}
