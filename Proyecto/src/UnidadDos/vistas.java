/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnidadDos;

import UnidadDos.AbsteractTabletModels.Tabla_AbstractadTabletModel_MetodoIntervalo;
import UnidadDos.AbsteractTabletModels.Tabla_AbstractadTabletModel_MetodoAproximaciones;
import UnidadDos.AbsteractTabletModels.Tabla_AbstractadTabletModel_MetodoInterpolacion;
import UnidadDos.AbsteractTabletModels.Tabla_AbstractadTabletModel_MetodoBiseccion;

/**
 *
 * @author Familiadc
 */
public class vistas extends javax.swing.JFrame {

    /**
     * Creates new form vistas
     */
    public vistas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFont(new java.awt.Font("Serif", 0, 10)); // NOI18N
        setPreferredSize(new java.awt.Dimension(347, 350));
        getContentPane().setLayout(null);

        jButton5.setBackground(java.awt.Color.lightGray);
        jButton5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton5.setText("Métodos de intervalo.");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(30, 20, 240, 50);

        jButton6.setBackground(java.awt.Color.lightGray);
        jButton6.setFont(new java.awt.Font("Arial Black", 0, 10)); // NOI18N
        jButton6.setText("SALIR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(100, 260, 90, 40);

        jButton7.setBackground(java.awt.Color.lightGray);
        jButton7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton7.setText("Métodos de bisección.");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(30, 80, 240, 50);

        jButton8.setBackground(java.awt.Color.lightGray);
        jButton8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton8.setText("Métodos de Interpolacion");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(30, 200, 240, 50);

        jButton9.setBackground(java.awt.Color.lightGray);
        jButton9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton9.setText("Métodos de Aproximaciones.");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(30, 140, 260, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       Tabla_AbstractadTabletModel_MetodoIntervalo ejecutar= new Tabla_AbstractadTabletModel_MetodoIntervalo();
       ejecutar.setVisible(true);
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        vistas ejecutar = new vistas();
        ejecutar.setEnabled(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Tabla_AbstractadTabletModel_MetodoBiseccion ejecutar= new Tabla_AbstractadTabletModel_MetodoBiseccion();
        ejecutar.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Tabla_AbstractadTabletModel_MetodoInterpolacion ejecutar= new Tabla_AbstractadTabletModel_MetodoInterpolacion();
        ejecutar.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        Tabla_AbstractadTabletModel_MetodoAproximaciones ejecutar= new Tabla_AbstractadTabletModel_MetodoAproximaciones();
        ejecutar.setVisible(true); // TODO add your handling code here:// TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
