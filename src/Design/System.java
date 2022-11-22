package Design;

import Model.SystemController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

public class System extends javax.swing.JFrame {
    private int calorias,F1,F2,F3,F4;
    private int C1,C2,C3,C4;
    private int L1,L2,L3,L4;
    private int CR1,CR2,CR3,CR4;
    private String DataNombre,DataEdad,DataEstatura,DataPeso,DataSexo,DataEjercicio;

    public System() {
        initComponents();
        this.setLocationRelativeTo(null);
        SystemController system = new SystemController(this);
        this.repaint();
        this.setBackground(new Color(0, 0, 0, 180));
        this.addComponentListener(new ComponentAdapter() { 
            @Override
            public void componentResized(ComponentEvent e) {
                setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 30, 30));
            }
        });
        
        chkF1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                F1=52;
            }
        });
        chkF2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                F2=50;
            }
        });
        chkF3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                F3=89;
            }
        });
        chkF4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                F4=30;
            }
        });
        chkC1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                C1=239;
            }
        });
        chkC2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                C2=119;
            }
        });
        chkC3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                C3=206;
            }
        });
        chkC4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                C4=252;
            }
        });
        chkL1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                L1=42;
            }
        });
        chkL2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                L2=59;
            }
        });
        chkL3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                L3=402;
            }
        });
        chkL4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                L4=717;
            }
        });
        chkCR1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CR1=305;
            }
        });
        chkCR2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CR2=353;
            }
        });
        chkCR3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CR3=266;
            }
        });
        chkCR4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                CR4=312;
            }
        });
    }
    
    String [] opciones = {"SI", "CANCELAR"};
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fSGradientPanel1 = new LIB.FSGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelMinimizeSystem = new Model.PanelRound();
        jLabelMinimizeSystem = new javax.swing.JLabel();
        panelCloseSystem = new Model.PanelRound();
        jLabelCloseSystem = new javax.swing.JLabel();
        panelRound1 = new Model.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelEjercicio = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelEdad = new javax.swing.JLabel();
        jLabelEstatura = new javax.swing.JLabel();
        jLabelPeso = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        panelRound2 = new Model.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        panelRound4 = new Model.PanelRound();
        jLabel14 = new javax.swing.JLabel();
        chkL1 = new RSMaterialComponent.RSCheckBoxMaterial();
        chkL2 = new RSMaterialComponent.RSCheckBoxMaterial();
        chkL3 = new RSMaterialComponent.RSCheckBoxMaterial();
        chkL4 = new RSMaterialComponent.RSCheckBoxMaterial();
        jLabel15 = new javax.swing.JLabel();
        chkCR1 = new RSMaterialComponent.RSCheckBoxMaterial();
        chkCR2 = new RSMaterialComponent.RSCheckBoxMaterial();
        chkCR3 = new RSMaterialComponent.RSCheckBoxMaterial();
        chkCR4 = new RSMaterialComponent.RSCheckBoxMaterial();
        panelRound5 = new Model.PanelRound();
        jLabelCalorias = new javax.swing.JLabel();
        jLabelRec = new javax.swing.JLabel();
        jLabelRec1 = new javax.swing.JLabel();
        jLabelRec2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelRound6 = new Model.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        chkC4 = new RSMaterialComponent.RSCheckBoxMaterial();
        chkC3 = new RSMaterialComponent.RSCheckBoxMaterial();
        chkC2 = new RSMaterialComponent.RSCheckBoxMaterial();
        chkC1 = new RSMaterialComponent.RSCheckBoxMaterial();
        jLabel16 = new javax.swing.JLabel();
        chkF4 = new RSMaterialComponent.RSCheckBoxMaterial();
        chkF3 = new RSMaterialComponent.RSCheckBoxMaterial();
        chkF2 = new RSMaterialComponent.RSCheckBoxMaterial();
        chkF1 = new RSMaterialComponent.RSCheckBoxMaterial();
        btnCalcular = new rojeru_san.rsbutton.RSButtonRoundEffectIcon();
        btnLimpiar = new rojeru_san.rsbutton.RSButtonRoundEffectIcon();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fSGradientPanel1.setFSEndColor(new java.awt.Color(153, 204, 255));
        fSGradientPanel1.setFSGradientFocus(280);
        fSGradientPanel1.setFSStartColor(new java.awt.Color(51, 255, 255));
        fSGradientPanel1.setMinimumSize(new java.awt.Dimension(1100, 640));
        fSGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon1.png"))); // NOI18N
        fSGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jLabel6.setFont(new java.awt.Font("Segoe Script", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Caloric Routine");
        fSGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 50));

        panelMinimizeSystem.setBackground(new java.awt.Color(186, 217, 250));
        panelMinimizeSystem.setRoundBottomLeft(20);
        panelMinimizeSystem.setRoundBottomRight(20);
        panelMinimizeSystem.setRoundTopLeft(20);
        panelMinimizeSystem.setRoundTopRight(20);
        panelMinimizeSystem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMinimizeSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimizeSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimize1.png"))); // NOI18N
        jLabelMinimizeSystem.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelMinimizeSystem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMinimizeSystemMousePressed(evt);
            }
        });
        panelMinimizeSystem.add(jLabelMinimizeSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        fSGradientPanel1.add(panelMinimizeSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 40, 40));

        panelCloseSystem.setBackground(new java.awt.Color(186, 217, 250));
        panelCloseSystem.setRoundBottomLeft(20);
        panelCloseSystem.setRoundBottomRight(20);
        panelCloseSystem.setRoundTopLeft(20);
        panelCloseSystem.setRoundTopRight(20);
        panelCloseSystem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCloseSystem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCloseSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/close1.png"))); // NOI18N
        jLabelCloseSystem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelCloseSystemMousePressed(evt);
            }
        });
        panelCloseSystem.add(jLabelCloseSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        fSGradientPanel1.add(panelCloseSystem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 40, 40));

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(40);
        panelRound1.setRoundBottomRight(40);
        panelRound1.setRoundTopLeft(40);
        panelRound1.setRoundTopRight(40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iconProfile.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 102));
        jLabel7.setText("USUARIO");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 102));
        jLabel13.setText("EDAD");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 102));
        jLabel8.setText("ESTATURA");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 102));
        jLabel9.setText("PESO");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 102));
        jLabel10.setText("SEXO");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 102));
        jLabel11.setText("TIEMPO DIARIO DE EJERCICIO");

        jLabelEjercicio.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelEjercicio.setForeground(new java.awt.Color(102, 102, 255));

        jLabelNombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(102, 102, 255));

        jLabelEdad.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelEdad.setForeground(new java.awt.Color(102, 102, 255));

        jLabelEstatura.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelEstatura.setForeground(new java.awt.Color(102, 102, 255));

        jLabelPeso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelPeso.setForeground(new java.awt.Color(102, 102, 255));

        jLabelSexo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelSexo.setForeground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSexo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPeso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEstatura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNombre)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEdad)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEstatura)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelPeso)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSexo)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelEjercicio)
                .addContainerGap())
        );

        fSGradientPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 240, 550));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(30);
        panelRound2.setRoundBottomRight(30);
        panelRound2.setRoundTopLeft(30);
        panelRound2.setRoundTopRight(30);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DIAGNOSTICO");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound2Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        fSGradientPanel1.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 830, 70));

        panelRound4.setBackground(new java.awt.Color(255, 255, 255));
        panelRound4.setRoundBottomLeft(40);
        panelRound4.setRoundBottomRight(40);
        panelRound4.setRoundTopLeft(40);
        panelRound4.setRoundTopRight(40);
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("LACTEOS");
        panelRound4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 5, 226, -1));

        chkL1.setForeground(new java.awt.Color(0, 204, 102));
        chkL1.setText("LECHE");
        chkL1.setColorCheck(new java.awt.Color(102, 102, 255));
        chkL1.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkL1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound4.add(chkL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 33, 226, -1));

        chkL2.setForeground(new java.awt.Color(0, 204, 102));
        chkL2.setText("YOGUR");
        chkL2.setColorCheck(new java.awt.Color(102, 102, 255));
        chkL2.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkL2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound4.add(chkL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 73, 226, -1));

        chkL3.setForeground(new java.awt.Color(0, 204, 102));
        chkL3.setText("QUESO");
        chkL3.setColorCheck(new java.awt.Color(102, 102, 255));
        chkL3.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkL3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound4.add(chkL3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 113, 226, -1));

        chkL4.setForeground(new java.awt.Color(0, 204, 102));
        chkL4.setText("MANTEQUILLA");
        chkL4.setColorCheck(new java.awt.Color(102, 102, 255));
        chkL4.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkL4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound4.add(chkL4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 153, 226, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 102));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("COMIDA RAPIDA");
        panelRound4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 196, 226, -1));

        chkCR1.setForeground(new java.awt.Color(0, 204, 102));
        chkCR1.setText("TORTAS");
        chkCR1.setColorCheck(new java.awt.Color(102, 102, 255));
        chkCR1.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkCR1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound4.add(chkCR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 218, 226, -1));

        chkCR2.setForeground(new java.awt.Color(0, 204, 102));
        chkCR2.setText("GALLETAS");
        chkCR2.setColorCheck(new java.awt.Color(102, 102, 255));
        chkCR2.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkCR2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound4.add(chkCR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 258, 226, -1));

        chkCR3.setForeground(new java.awt.Color(0, 204, 102));
        chkCR3.setText("PIZZA");
        chkCR3.setColorCheck(new java.awt.Color(102, 102, 255));
        chkCR3.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkCR3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound4.add(chkCR3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 298, 226, -1));

        chkCR4.setForeground(new java.awt.Color(0, 204, 102));
        chkCR4.setText("PAPAS FRITAS");
        chkCR4.setColorCheck(new java.awt.Color(102, 102, 255));
        chkCR4.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkCR4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound4.add(chkCR4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 338, 226, -1));

        fSGradientPanel1.add(panelRound4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 250, 410));

        panelRound5.setBackground(new java.awt.Color(255, 255, 255));
        panelRound5.setRoundBottomLeft(40);
        panelRound5.setRoundBottomRight(40);
        panelRound5.setRoundTopLeft(40);
        panelRound5.setRoundTopRight(40);

        jLabelCalorias.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabelCalorias.setForeground(new java.awt.Color(0, 153, 102));
        jLabelCalorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCalorias.setText("0 kcal");

        jLabelRec.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabelRec.setForeground(new java.awt.Color(0, 153, 102));
        jLabelRec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRec.setText("Recomendaciones");

        jLabelRec1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelRec1.setForeground(new java.awt.Color(204, 0, 0));
        jLabelRec1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelRec2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabelRec2.setForeground(new java.awt.Color(51, 102, 255));
        jLabelRec2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logoSystem.png"))); // NOI18N

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelRec2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCalorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelRec, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(jLabelRec1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelCalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRec)
                .addGap(33, 33, 33)
                .addComponent(jLabelRec1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRec2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(49, 49, 49))
        );

        fSGradientPanel1.add(panelRound5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, 310, 410));

        panelRound6.setBackground(new java.awt.Color(255, 255, 255));
        panelRound6.setRoundBottomLeft(40);
        panelRound6.setRoundBottomRight(40);
        panelRound6.setRoundTopLeft(40);
        panelRound6.setRoundTopRight(40);
        panelRound6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("FRUTAS");
        panelRound6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 5, 226, -1));

        chkC4.setForeground(new java.awt.Color(0, 204, 102));
        chkC4.setText("FILETE DE RES");
        chkC4.setColorCheck(new java.awt.Color(102, 102, 255));
        chkC4.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkC4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound6.add(chkC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 338, 226, -1));

        chkC3.setForeground(new java.awt.Color(0, 204, 102));
        chkC3.setText("PESCADO");
        chkC3.setColorCheck(new java.awt.Color(102, 102, 255));
        chkC3.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkC3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound6.add(chkC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 298, 226, -1));

        chkC2.setForeground(new java.awt.Color(0, 204, 102));
        chkC2.setText("GUISADO DE CERDO");
        chkC2.setColorCheck(new java.awt.Color(102, 102, 255));
        chkC2.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkC2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound6.add(chkC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 258, 226, -1));

        chkC1.setForeground(new java.awt.Color(0, 204, 102));
        chkC1.setText("CARNE DE POLLO");
        chkC1.setColorCheck(new java.awt.Color(102, 102, 255));
        chkC1.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkC1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound6.add(chkC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 218, 226, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("CARNE");
        panelRound6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 196, 226, -1));

        chkF4.setForeground(new java.awt.Color(0, 204, 102));
        chkF4.setText("SANDIA");
        chkF4.setColorCheck(new java.awt.Color(102, 102, 255));
        chkF4.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkF4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound6.add(chkF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 153, 226, -1));

        chkF3.setForeground(new java.awt.Color(0, 204, 102));
        chkF3.setText("PLATANO");
        chkF3.setColorCheck(new java.awt.Color(102, 102, 255));
        chkF3.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkF3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound6.add(chkF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 113, 226, -1));

        chkF2.setForeground(new java.awt.Color(0, 204, 102));
        chkF2.setText("PIÑA");
        chkF2.setColorCheck(new java.awt.Color(102, 102, 255));
        chkF2.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkF2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound6.add(chkF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 73, 226, -1));

        chkF1.setForeground(new java.awt.Color(0, 204, 102));
        chkF1.setText("MANZANA");
        chkF1.setColorCheck(new java.awt.Color(102, 102, 255));
        chkF1.setColorUnCheck(new java.awt.Color(0, 204, 102));
        chkF1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        panelRound6.add(chkF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 33, 226, -1));

        fSGradientPanel1.add(panelRound6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 250, 410));

        btnCalcular.setBackground(new java.awt.Color(0, 204, 102));
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/play.png"))); // NOI18N
        btnCalcular.setText("DIAGNOSTICAR");
        btnCalcular.setBorderPainted(false);
        btnCalcular.setColorHover(new java.awt.Color(0, 204, 153));
        btnCalcular.setEfecto(rojeru_san.rsbutton.RSButtonRoundEffectIcon.EFECTO.MATERIAL);
        btnCalcular.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        btnCalcular.setHideActionText(true);
        btnCalcular.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, 220, 50));

        btnLimpiar.setBackground(new java.awt.Color(255, 0, 51));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clean.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setColorHover(new java.awt.Color(255, 102, 102));
        btnLimpiar.setEfecto(rojeru_san.rsbutton.RSButtonRoundEffectIcon.EFECTO.MATERIAL);
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        fSGradientPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, 150, 50));

        getContentPane().add(fSGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinimizeSystemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizeSystemMousePressed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizeSystemMousePressed

    private void jLabelCloseSystemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseSystemMousePressed
        // TODO add your handling code here:
        java.lang.System.exit(0);
    }//GEN-LAST:event_jLabelCloseSystemMousePressed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int confirm = JOptionPane.showOptionDialog(this, "DESEA VOLVER\nA INGRESAR SUS DATOS?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        if (confirm == 0) {
            dispose();
            Register registro = new Register();
            registro.setVisible(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        btnLimpiar.addActionListener(DataClean);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        btnCalcular.addActionListener(TotalCalories);
        btnCalcular.addActionListener(Recomendacion);
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(System.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new System().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsbutton.RSButtonRoundEffectIcon btnCalcular;
    private rojeru_san.rsbutton.RSButtonRoundEffectIcon btnLimpiar;
    private RSMaterialComponent.RSCheckBoxMaterial chkC1;
    private RSMaterialComponent.RSCheckBoxMaterial chkC2;
    private RSMaterialComponent.RSCheckBoxMaterial chkC3;
    private RSMaterialComponent.RSCheckBoxMaterial chkC4;
    private RSMaterialComponent.RSCheckBoxMaterial chkCR1;
    private RSMaterialComponent.RSCheckBoxMaterial chkCR2;
    private RSMaterialComponent.RSCheckBoxMaterial chkCR3;
    private RSMaterialComponent.RSCheckBoxMaterial chkCR4;
    private RSMaterialComponent.RSCheckBoxMaterial chkF1;
    private RSMaterialComponent.RSCheckBoxMaterial chkF2;
    private RSMaterialComponent.RSCheckBoxMaterial chkF3;
    private RSMaterialComponent.RSCheckBoxMaterial chkF4;
    private RSMaterialComponent.RSCheckBoxMaterial chkL1;
    private RSMaterialComponent.RSCheckBoxMaterial chkL2;
    private RSMaterialComponent.RSCheckBoxMaterial chkL3;
    private RSMaterialComponent.RSCheckBoxMaterial chkL4;
    private LIB.FSGradientPanel fSGradientPanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCalorias;
    public javax.swing.JLabel jLabelCloseSystem;
    private javax.swing.JLabel jLabelEdad;
    private javax.swing.JLabel jLabelEjercicio;
    private javax.swing.JLabel jLabelEstatura;
    public javax.swing.JLabel jLabelMinimizeSystem;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelRec;
    private javax.swing.JLabel jLabelRec1;
    private javax.swing.JLabel jLabelRec2;
    private javax.swing.JLabel jLabelSexo;
    public Model.PanelRound panelCloseSystem;
    public Model.PanelRound panelMinimizeSystem;
    private Model.PanelRound panelRound1;
    private Model.PanelRound panelRound2;
    private Model.PanelRound panelRound4;
    private Model.PanelRound panelRound5;
    private Model.PanelRound panelRound6;
    // End of variables declaration//GEN-END:variables

    ActionListener TotalCalories = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            calorias = F1+F2+F3+F4+C1+C2+C3+C4+L1+L2+L3+L4+CR1+CR2+CR3+CR4;
            jLabelCalorias.setText(calorias + " Kcal");
        }
    };
    
    ActionListener DataClean = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            F1 = 0;
            F2 = 0;
            F3 = 0;
            F4 = 0;
            C1 = 0;
            C2 = 0;
            C3 = 0;
            C4 = 0;
            L1 = 0;
            L2 = 0;
            L3 = 0;
            L4 = 0;
            CR1 = 0;
            CR2 = 0;
            CR3 = 0;
            CR4 = 0;
            
            chkF1.setSelected(false);
            chkF2.setSelected(false);
            chkF3.setSelected(false);
            chkF4.setSelected(false);
            chkC1.setSelected(false);
            chkC2.setSelected(false);
            chkC3.setSelected(false);
            chkC4.setSelected(false);
            chkL1.setSelected(false);
            chkL2.setSelected(false);
            chkL3.setSelected(false);
            chkL4.setSelected(false);
            chkCR1.setSelected(false);
            chkCR2.setSelected(false);
            chkCR3.setSelected(false);
            chkCR4.setSelected(false);
            
            jLabelCalorias.setText("0 Kcal");
            jLabelRec1.setText(" ");
            jLabelRec2.setText(" ");
        }
    };
    
    ActionListener Recomendacion = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (calorias == 0) {
                jLabelRec1.setText(" ");
                jLabelRec2.setText(" ");            
            }if(calorias < 1000){
                jLabelRec1.setText("Ingesta calorica Reducida");
                jLabelRec2.setText("Consulte nutriologo");
            }if(calorias >= 1000){
                jLabelRec1.setText("Ingesta calorica muy baja");
                jLabelRec2.setText("Incremente calorias diarias");
            }if(calorias >= 1500){
                jLabelRec1.setText("Ingesta de calorias promedio");
                jLabelRec2.setText("Realice 30 min de ejercicio diario");
            }if(calorias >= 3000){
                jLabelRec1.setText("WOW ¿Mas de 3000 calorias?");
                jLabelRec2.setText("¡Checate, Midete, Muevete!");
            }
        }
    };
    
    public void DataPanel1(String DataNombre){
        this.DataNombre = DataNombre;
        jLabelNombre.setText(DataNombre);
    }
    public void DataPanel2(String DataEdad){
        this.DataEdad = DataEdad;
        jLabelEdad.setText(DataEdad + " AÑOS");
    }
    public void DataPanel3(String DataEstatura){
        this.DataEstatura = DataEstatura;
        jLabelEstatura.setText(DataEstatura + " CM");
    }
    public void DataPanel4(String DataPeso){
        this.DataPeso = DataPeso;
        jLabelPeso.setText(DataPeso + " KG");
    }
    public void DataPanel5(String DataSexo){
        this.DataSexo = DataSexo;
        jLabelSexo.setText(DataSexo);
    }
    public void DataPanel6(String DataEjercicio){
        this.DataEjercicio = DataEjercicio;
        jLabelEjercicio.setText(DataEjercicio);
    }
}
