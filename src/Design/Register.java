package Design;

import Model.RegisterController;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
        RegisterController register = new RegisterController(this);
        this.repaint();
        this.setBackground(new Color(0, 0, 0, 180));
        this.addComponentListener(new ComponentAdapter() { 
            @Override
            public void componentResized(ComponentEvent e) {
                setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
            }
        });
        
        txtSexo.setVisible(false);
        txtActivity.setVisible(false);
    }
    
    public static boolean validarNumeros(String Datos){
        return Datos.matches("[0-9]");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fSGradientPanel1 = new LIB.FSGradientPanel();
        panelRound1 = new Model.PanelRound();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new LIB.FSTexFieldMD();
        txtEdad = new LIB.FSTexFieldMD();
        txtEstatura = new LIB.FSTexFieldMD();
        txtPeso = new LIB.FSTexFieldMD();
        panelRound2 = new Model.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        panelRound3 = new Model.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        rbtHombre = new RSMaterialComponent.RSRadioButtonMaterial();
        rbtMujer = new RSMaterialComponent.RSRadioButtonMaterial();
        rbtOtro = new RSMaterialComponent.RSRadioButtonMaterial();
        txtActivity = new javax.swing.JTextField();
        panelRound4 = new Model.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        rbtMin30 = new RSMaterialComponent.RSRadioButtonMaterial();
        rbtNormal = new RSMaterialComponent.RSRadioButtonMaterial();
        rbtMax30 = new RSMaterialComponent.RSRadioButtonMaterial();
        txtSexo = new javax.swing.JTextField();
        btnGuardar = new rojeru_san.rsbutton.RSButtonRoundEffectIcon();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PanelMinimizeRegister = new Model.PanelRound();
        jLabelMinimizeRegister = new javax.swing.JLabel();
        PanelCloseRegister = new Model.PanelRound();
        jLabelCloseRegister = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fSGradientPanel1.setFSEndColor(new java.awt.Color(57, 228, 185));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(0, 255, 204));
        fSGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(40);
        panelRound1.setRoundBottomRight(40);
        panelRound1.setRoundTopLeft(40);
        panelRound1.setRoundTopRight(40);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 102));
        jLabel4.setText("DATOS PERSONALES");

        txtNombre.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtNombre.setForeground(new java.awt.Color(0, 204, 102));
        txtNombre.setBordeColorFocus(new java.awt.Color(102, 102, 255));
        txtNombre.setBordeColorNoFocus(new java.awt.Color(0, 204, 102));
        txtNombre.setDisabledTextColor(new java.awt.Color(0, 204, 102));
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtNombre.setMaterialDesing(true);
        txtNombre.setPlaceholder("NOMBRE");
        txtNombre.setSelectedTextColor(new java.awt.Color(0, 51, 102));
        txtNombre.setSelectionColor(new java.awt.Color(153, 204, 255));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtEdad.setForeground(new java.awt.Color(0, 204, 102));
        txtEdad.setBordeColorFocus(new java.awt.Color(102, 102, 255));
        txtEdad.setBordeColorNoFocus(new java.awt.Color(0, 204, 102));
        txtEdad.setDisabledTextColor(new java.awt.Color(0, 204, 102));
        txtEdad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEdad.setMaterialDesing(true);
        txtEdad.setPlaceholder("EDAD");
        txtEdad.setSelectedTextColor(new java.awt.Color(0, 51, 102));
        txtEdad.setSelectionColor(new java.awt.Color(0, 51, 102));
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        txtEstatura.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtEstatura.setForeground(new java.awt.Color(0, 204, 102));
        txtEstatura.setBordeColorFocus(new java.awt.Color(102, 102, 255));
        txtEstatura.setBordeColorNoFocus(new java.awt.Color(0, 204, 102));
        txtEstatura.setDisabledTextColor(new java.awt.Color(0, 204, 102));
        txtEstatura.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEstatura.setMaterialDesing(true);
        txtEstatura.setPlaceholder("ESTATURA (CM)");
        txtEstatura.setSelectedTextColor(new java.awt.Color(0, 51, 102));
        txtEstatura.setSelectionColor(new java.awt.Color(153, 204, 255));
        txtEstatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstaturaKeyTyped(evt);
            }
        });

        txtPeso.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtPeso.setForeground(new java.awt.Color(0, 204, 102));
        txtPeso.setBordeColorFocus(new java.awt.Color(102, 102, 255));
        txtPeso.setBordeColorNoFocus(new java.awt.Color(0, 204, 102));
        txtPeso.setDisabledTextColor(new java.awt.Color(0, 204, 102));
        txtPeso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtPeso.setMaterialDesing(true);
        txtPeso.setPlaceholder("PESO (KG)");
        txtPeso.setSelectedTextColor(new java.awt.Color(0, 51, 102));
        txtPeso.setSelectionColor(new java.awt.Color(153, 204, 255));
        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEstatura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addGap(60, 60, 60)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        fSGradientPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 300, 405));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(30);
        panelRound2.setRoundBottomRight(30);
        panelRound2.setRoundTopLeft(30);
        panelRound2.setRoundTopRight(30);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("INFORMACION GENERAL");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jLabel1)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        fSGradientPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 830, 65));

        panelRound3.setBackground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomLeft(40);
        panelRound3.setRoundBottomRight(40);
        panelRound3.setRoundTopLeft(40);
        panelRound3.setRoundTopRight(40);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("SEXO");

        rbtHombre.setForeground(new java.awt.Color(0, 204, 102));
        rbtHombre.setText("HOMBRE");
        rbtHombre.setToolTipText("");
        rbtHombre.setColorCheck(new java.awt.Color(102, 102, 255));
        rbtHombre.setColorUnCheck(new java.awt.Color(0, 204, 102));
        rbtHombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        rbtHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtHombreActionPerformed(evt);
            }
        });

        rbtMujer.setForeground(new java.awt.Color(0, 204, 102));
        rbtMujer.setText("MUJER");
        rbtMujer.setToolTipText("");
        rbtMujer.setColorCheck(new java.awt.Color(102, 102, 255));
        rbtMujer.setColorUnCheck(new java.awt.Color(0, 204, 102));
        rbtMujer.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        rbtOtro.setForeground(new java.awt.Color(0, 204, 102));
        rbtOtro.setText("INDEFINIDO");
        rbtOtro.setToolTipText("");
        rbtOtro.setColorCheck(new java.awt.Color(102, 102, 255));
        rbtOtro.setColorUnCheck(new java.awt.Color(0, 204, 102));
        rbtOtro.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel3))
                    .addGroup(panelRound3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtMujer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtHombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtActivity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(60, 60, 60)
                .addComponent(rbtHombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(rbtMujer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(rbtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtActivity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        fSGradientPanel1.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 150, 250, 405));

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setRoundBottomLeft(40);
        panelRound4.setRoundBottomRight(40);
        panelRound4.setRoundTopLeft(40);
        panelRound4.setRoundTopRight(40);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("ACTIVIDAD FISICA");

        rbtMin30.setForeground(new java.awt.Color(0, 204, 102));
        rbtMin30.setText("MENOS DE 30 MINUTOS");
        rbtMin30.setToolTipText("");
        rbtMin30.setColorCheck(new java.awt.Color(102, 102, 255));
        rbtMin30.setColorUnCheck(new java.awt.Color(0, 204, 102));
        rbtMin30.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        rbtNormal.setForeground(new java.awt.Color(0, 204, 102));
        rbtNormal.setText("30 MINUTOS");
        rbtNormal.setToolTipText("");
        rbtNormal.setColorCheck(new java.awt.Color(102, 102, 255));
        rbtNormal.setColorUnCheck(new java.awt.Color(0, 204, 102));
        rbtNormal.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        rbtMax30.setForeground(new java.awt.Color(0, 204, 102));
        rbtMax30.setText("MAS DE 30 MINUTOS");
        rbtMax30.setToolTipText("");
        rbtMax30.setColorCheck(new java.awt.Color(102, 102, 255));
        rbtMax30.setColorUnCheck(new java.awt.Color(0, 204, 102));
        rbtMax30.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtMin30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbtMax30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addComponent(rbtMin30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(rbtNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(rbtMax30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        fSGradientPanel1.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 250, 405));

        btnGuardar.setBackground(new java.awt.Color(53, 215, 134));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/disk.png"))); // NOI18N
        btnGuardar.setText("GUARDAR DATOS");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setColorHover(new java.awt.Color(0, 204, 153));
        btnGuardar.setEfecto(rojeru_san.rsbutton.RSButtonRoundEffectIcon.EFECTO.MATERIAL);
        btnGuardar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 575, 220, 52));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon1.png"))); // NOI18N
        fSGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Caloric Routine");
        fSGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 50));

        PanelMinimizeRegister.setBackground(new java.awt.Color(89, 239, 202));
        PanelMinimizeRegister.setRoundBottomLeft(20);
        PanelMinimizeRegister.setRoundBottomRight(20);
        PanelMinimizeRegister.setRoundTopLeft(20);
        PanelMinimizeRegister.setRoundTopRight(20);
        PanelMinimizeRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMinimizeRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimizeRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimize1.png"))); // NOI18N
        jLabelMinimizeRegister.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelMinimizeRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMinimizeRegisterMousePressed(evt);
            }
        });
        PanelMinimizeRegister.add(jLabelMinimizeRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        fSGradientPanel1.add(PanelMinimizeRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 40, 40));

        PanelCloseRegister.setBackground(new java.awt.Color(89, 239, 202));
        PanelCloseRegister.setRoundBottomLeft(20);
        PanelCloseRegister.setRoundBottomRight(20);
        PanelCloseRegister.setRoundTopLeft(20);
        PanelCloseRegister.setRoundTopRight(20);
        PanelCloseRegister.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCloseRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCloseRegister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close1.png"))); // NOI18N
        jLabelCloseRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCloseRegisterMousePressed(evt);
            }
        });
        PanelCloseRegister.add(jLabelCloseRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        fSGradientPanel1.add(PanelCloseRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 40, 40));

        getContentPane().add(fSGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtHombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtHombreActionPerformed

    private void jLabelMinimizeRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeRegisterMousePressed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeRegisterMousePressed

    private void jLabelCloseRegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseRegisterMousePressed
        // TODO add your handling code here:
        java.lang.System.exit(0);
    }//GEN-LAST:event_jLabelCloseRegisterMousePressed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        SexoOptions();
        ActivityOptions();
        dispose();
        System sistema = new System();
        sistema.DataPanel1(txtNombre.getText());
        sistema.DataPanel2(txtEdad.getText());
        sistema.DataPanel3(txtEstatura.getText());
        sistema.DataPanel4(txtPeso.getText());
        sistema.DataPanel5(txtSexo.getText());
        sistema.DataPanel6(txtActivity.getText());
        sistema.setVisible(true);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        char validateName = evt.getKeyChar();
        
        if (Character.isDigit(validateName)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        // TODO add your handling code here:
        char validateAge = evt.getKeyChar();
        
        if (Character.isLetter(validateAge)) {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_txtEdadKeyTyped

    private void txtEstaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstaturaKeyTyped
        // TODO add your handling code here:
        char validateSize = evt.getKeyChar();
        
        if (((validateSize < '0' || validateSize > '9')) 
                & (validateSize != KeyEvent.VK_BACK_SPACE) 
                & (validateSize != '.' || txtEstatura.getText().contains("."))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtEstaturaKeyTyped

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        // TODO add your handling code here:
        char validateGravity = evt.getKeyChar();
        
        if (((validateGravity < '0' || validateGravity > '9')) 
                & (validateGravity != KeyEvent.VK_BACK_SPACE) 
                & (validateGravity != '.' || txtPeso.getText().contains("."))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtPesoKeyTyped
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public Model.PanelRound PanelCloseRegister;
    public Model.PanelRound PanelMinimizeRegister;
    private rojeru_san.rsbutton.RSButtonRoundEffectIcon btnGuardar;
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabelCloseRegister;
    public javax.swing.JLabel jLabelMinimizeRegister;
    private Model.PanelRound panelRound1;
    private Model.PanelRound panelRound2;
    private Model.PanelRound panelRound3;
    private Model.PanelRound panelRound4;
    public RSMaterialComponent.RSRadioButtonMaterial rbtHombre;
    public RSMaterialComponent.RSRadioButtonMaterial rbtMax30;
    public RSMaterialComponent.RSRadioButtonMaterial rbtMin30;
    public RSMaterialComponent.RSRadioButtonMaterial rbtMujer;
    public RSMaterialComponent.RSRadioButtonMaterial rbtNormal;
    public RSMaterialComponent.RSRadioButtonMaterial rbtOtro;
    public javax.swing.JTextField txtActivity;
    public LIB.FSTexFieldMD txtEdad;
    public LIB.FSTexFieldMD txtEstatura;
    public LIB.FSTexFieldMD txtNombre;
    public LIB.FSTexFieldMD txtPeso;
    public javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables

    public void SexoOptions() {
        if (rbtHombre.isSelected()) {
            txtSexo.setText("HOMBRE");
        }else if (rbtMujer.isSelected()) {
            txtSexo.setText("MUJER");
        }else if (rbtOtro.isSelected()) {
            txtSexo.setText("INDEFINIDO");
        }
    }
    public void ActivityOptions() {
        if (rbtMin30.isSelected()) {
            txtActivity.setText("MENOS DE 30 MINUTOS");
        }else if (rbtMax30.isSelected()) {
            txtActivity.setText("MAS DE 30 MINUTOS");
        }else if (rbtNormal.isSelected()) {
            txtActivity.setText("30 MINUTOS");
        }
    }
}
