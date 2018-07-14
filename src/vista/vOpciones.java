/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import negocio.Juego;
import negocio.Tablero;

/**
 *
 * @author Jaen,Pedro,Camilo
 */
public class vOpciones extends javax.swing.JFrame {

    Juego juego = new Juego();
    JPanel p = new JPanel();

    int t;

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    /**
     * Creates new form vOpciones
     */
    public vOpciones() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/ima.png")).getImage());
        ((JPanel) getContentPane()).setOpaque(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opcionContrincante = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        tamaños = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jugar = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbPartidas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        tamaños.setFont(new java.awt.Font("Wide Latin", 0, 10)); // NOI18N
        tamaños.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Tamaño", "Tamaño 2X2.", "Tamaño 3X3", "Tamaño 4X4", "Tamaño 5X5", "Tamaño 6X6", "Tamaño 7X7", "Tamaño 8X8", "Tamaño 9X9", "Tamaño 10X10" }));
        tamaños.setBorder(null);
        tamaños.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tamañosItemStateChanged(evt);
            }
        });
        tamaños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamañosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tamaño");

        panel.setPreferredSize(new java.awt.Dimension(247, 219));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/0X0.png"))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(tamaños, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addComponent(tamaños, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Numero de");

        jugar.setBackground(new java.awt.Color(255, 255, 255));
        jugar.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jugar.setText("Jugar");
        jugar.setEnabled(false);
        jugar.setMaximumSize(new java.awt.Dimension(103, 25));
        jugar.setMinimumSize(new java.awt.Dimension(103, 25));
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });

        volver.setBackground(new java.awt.Color(255, 255, 255));
        volver.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        volver.setText("Volver");
        volver.setMaximumSize(new java.awt.Dimension(113, 25));
        volver.setMinimumSize(new java.awt.Dimension(113, 25));
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("partidas");

        cbPartidas.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        cbPartidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(48, 48, 48))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(volver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jugar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(cbPartidas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cbPartidas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tamañosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamañosActionPerformed
        t = tamaños.getSelectedIndex() + 1;
        if (tamaños.getSelectedIndex() > 0) {
            jugar.setEnabled(true);
        } else {
            jugar.setEnabled(false);
        }

    }//GEN-LAST:event_tamañosActionPerformed

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        int cantPartidas;
        cantPartidas = cbPartidas.getSelectedIndex();
        int a = 0;

        vJuego j = new vJuego();
        JPanel p = new JPanel();
        if (juego.elegirPrimerMovimiento() == 0) {
            j.getjLabel1().setBackground(new java.awt.Color(250, 250, 250));
            j.getjLabel1().setFont(new java.awt.Font("Vineta BT", 1, 24));
            j.getjLabel1().setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
            JOptionPane.showMessageDialog(null, "Empiza el jugador 1");
            a = 0;
        } else {
            j.getjLabel2().setBackground(new java.awt.Color(250, 250, 250));
            j.getjLabel2().setFont(new java.awt.Font("Vineta BT", 1, 24));
            j.getjLabel2().setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
            JOptionPane.showConfirmDialog(null, "Empieza el jugador 2");
            a = 1;
        }
        j.setNumJugador(a);
        juego.getTablero().calNumMinas(tamaños.getSelectedIndex() - 1, panel);
        juego.setNumPartidas(cantPartidas);
        juego.mostrarJuego(this, tamaños.getSelectedIndex() + 1, j);
        j.getjLabel1().setText("claus");
        j.getjLabel2().setText("jon");
        j.setJuego(juego);

    }//GEN-LAST:event_jugarActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        InicioJuego i = new InicioJuego();
        i.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_volverActionPerformed

    private void tamañosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tamañosItemStateChanged
        int posicion;
        String lugarImagen;
        URL url = null;
        posicion = tamaños.getSelectedIndex();

        switch (posicion) {
            case 0:
                lugarImagen = "/imagenes/0X0.png";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imagen0 = new ImageIcon(url);
                ImageIcon icono0 = new ImageIcon(imagen0.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
                jLabel7.setIcon(imagen0);
                jLabel7.setIcon(icono0);

                break;
            case 1:
                lugarImagen = "/imagenes/2x2.png";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imagen = new ImageIcon(url);
                ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
                jLabel7.setIcon(imagen);
                jLabel7.setIcon(icono);
                break;
            case 2:
                lugarImagen = "/imagenes/3x3.png";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imagen1 = new ImageIcon(url);
                ImageIcon icono1 = new ImageIcon(imagen1.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
                jLabel7.setIcon(imagen1);
                jLabel7.setIcon(icono1);
                break;
            case 3:
                lugarImagen = "/imagenes/4x4.png";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imagen2 = new ImageIcon(url);
                ImageIcon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
                jLabel7.setIcon(imagen2);
                jLabel7.setIcon(icono2);
                break;
            case 4:
                lugarImagen = "/imagenes/5x5.png";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imagen3 = new ImageIcon(url);
                ImageIcon icono3 = new ImageIcon(imagen3.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
                jLabel7.setIcon(imagen3);
                jLabel7.setIcon(icono3);
                break;
            case 5:
                lugarImagen = "/imagenes/6x6.png";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imagen4 = new ImageIcon(url);
                ImageIcon icono4 = new ImageIcon(imagen4.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
                jLabel7.setIcon(imagen4);
                jLabel7.setIcon(icono4);
                break;
            case 6:
                lugarImagen = "/imagenes/7x7.png";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imagen5 = new ImageIcon(url);
                ImageIcon icono5 = new ImageIcon(imagen5.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
                jLabel7.setIcon(imagen5);
                jLabel7.setIcon(icono5);
                break;
            case 7:
                lugarImagen = "/imagenes/8x8.png";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imagen6 = new ImageIcon(url);
                ImageIcon icono6 = new ImageIcon(imagen6.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
                jLabel7.setIcon(imagen6);
                jLabel7.setIcon(icono6);
                break;
            case 8:
                lugarImagen = "/imagenes/9x9.png";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imagen7 = new ImageIcon(url);
                ImageIcon icono7 = new ImageIcon(imagen7.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
                jLabel7.setIcon(imagen7);
                jLabel7.setIcon(icono7);
                break;
            case 9:
                lugarImagen = "/imagenes/10x10.png";
                url = this.getClass().getResource(lugarImagen);
                ImageIcon imagen8 = new ImageIcon(url);
                ImageIcon icono8 = new ImageIcon(imagen8.getImage().getScaledInstance(jLabel7.getWidth(), jLabel7.getHeight(), Image.SCALE_DEFAULT));
                jLabel7.setIcon(imagen8);
                jLabel7.setIcon(icono8);
                break;
        }
    }//GEN-LAST:event_tamañosItemStateChanged

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
            java.util.logging.Logger.getLogger(vOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vOpciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vOpciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbPartidas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jugar;
    private javax.swing.ButtonGroup opcionContrincante;
    private javax.swing.JPanel panel;
    private javax.swing.JComboBox<String> tamaños;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
