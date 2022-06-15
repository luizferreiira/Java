/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.domicalc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SO2M
 */
public class Jogar extends javax.swing.JFrame {

    /**
     * Creates new form Jogar
     */
    public Jogar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Bt_Jogar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        bt_Menu = new javax.swing.JMenu();
        bt_Progresso = new javax.swing.JMenuItem();
        bt_Dicas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        bt_Sair = new javax.swing.JMenuItem();

        jPanel1.setBackground(new java.awt.Color(255, 235, 147));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/DomiCalc_1.gif"))); // NOI18N

        Bt_Jogar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Bt_Jogar.setText("Jogar");
        Bt_Jogar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 87, 87), new java.awt.Color(255, 87, 87), new java.awt.Color(69, 195, 171), new java.awt.Color(69, 195, 171)));
        Bt_Jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_JogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Bt_Jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)))
                .addGap(134, 134, 134))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(Bt_Jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 87, 87));
        jMenuBar1.setForeground(new java.awt.Color(255, 87, 87));

        bt_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/menu-principal.png"))); // NOI18N

        bt_Progresso.setText("Progresso");
        bt_Progresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ProgressoActionPerformed(evt);
            }
        });
        bt_Menu.add(bt_Progresso);

        bt_Dicas.setText("Dicas");
        bt_Menu.add(bt_Dicas);
        bt_Menu.add(jSeparator1);

        bt_Sair.setText("Sair");
        bt_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_SairActionPerformed(evt);
            }
        });
        bt_Menu.add(bt_Sair);

        jMenuBar1.add(bt_Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_JogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_JogarActionPerformed
       
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Jogar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.dispose();
        
        Fases fases = new Fases();
        fases.setVisible(true);
        
       
        
    }//GEN-LAST:event_Bt_JogarActionPerformed

    private void bt_ProgressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ProgressoActionPerformed
        
    }//GEN-LAST:event_bt_ProgressoActionPerformed

    private void bt_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_SairActionPerformed

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
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jogar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Jogar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Jogar;
    private javax.swing.JMenuItem bt_Dicas;
    private javax.swing.JMenu bt_Menu;
    private javax.swing.JMenuItem bt_Progresso;
    private javax.swing.JMenuItem bt_Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
