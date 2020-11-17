/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiita.gproject.automaticelevatorsys;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bluelord
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public boolean flag=false;
    public MainWindow() {
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

        jLabel1 = new javax.swing.JLabel();
        jconfig = new javax.swing.JButton();
        jstatus = new javax.swing.JButton();
        Jlogs = new javax.swing.JButton();
        jquit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Automatic Elevator System");
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(204, 255, 153));

        jLabel1.setFont(new java.awt.Font("FreeSans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 0));
        jLabel1.setText("Available Options:");

        jconfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/config.png"))); // NOI18N
        jconfig.setText("Configure Threshold");
        jconfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconfigActionPerformed(evt);
            }
        });

        jstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lift.png"))); // NOI18N
        jstatus.setText("Initiate Elevator");
        jstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstatusActionPerformed(evt);
            }
        });

        Jlogs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/report.png"))); // NOI18N
        Jlogs.setText("Log Report");
        Jlogs.setVerifyInputWhenFocusTarget(false);
        Jlogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JlogsActionPerformed(evt);
            }
        });

        jquit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quit.png"))); // NOI18N
        jquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jquitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Jlogs, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(225, 225, 225)
                            .addComponent(jquit))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jconfig, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jconfig)
                .addGap(12, 12, 12)
                .addComponent(jstatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jlogs)
                .addGap(26, 26, 26)
                .addComponent(jquit)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    ConfigureSys conf;
    Initiate init;
    LogRange log;
    
    private void jstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstatusActionPerformed

        try {
            init= new Initiate();
        } catch (IOException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        init.setVisible(true);    
    }//GEN-LAST:event_jstatusActionPerformed

    private void jconfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconfigActionPerformed

        if(flag == false){
            conf= new ConfigureSys("8", "700");
            conf.setVisible(true);
            flag = true;
            System.out.println("flag was false");
        }
        else
            conf.setVisible(true);
       
    }//GEN-LAST:event_jconfigActionPerformed

    private void jquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jquitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jquitActionPerformed

    private void JlogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JlogsActionPerformed
        
        log= new LogRange();
        log.setVisible(true);
    }//GEN-LAST:event_JlogsActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jlogs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jconfig;
    private javax.swing.JButton jquit;
    private javax.swing.JButton jstatus;
    // End of variables declaration//GEN-END:variables
}
