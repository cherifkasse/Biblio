/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base_de_donnees;
import java.util.*;
/**
 *
 * @author cherif
 */
public class Bienvenue extends javax.swing.JFrame {

    /**
     * Creates new form Bienvenue
     */
    public Bienvenue() {
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
        lecteur = new javax.swing.JButton();
        livre = new javax.swing.JButton();
        emprunt = new javax.swing.JButton();
        Retour = new javax.swing.JButton();
        quitter = new javax.swing.JButton();
        Date = new javax.swing.JLabel();
        heure = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel1.setText("            GESTION DE BIBILOTHEQUE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 0, 260, 56);

        lecteur.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lecteur.setText("LECTEURS");
        lecteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecteurActionPerformed(evt);
            }
        });
        getContentPane().add(lecteur);
        lecteur.setBounds(270, 150, 190, 40);

        livre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        livre.setText("LIVRES");
        livre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livreActionPerformed(evt);
            }
        });
        getContentPane().add(livre);
        livre.setBounds(270, 220, 190, 40);

        emprunt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        emprunt.setText("EMPRUNTS");
        emprunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empruntActionPerformed(evt);
            }
        });
        getContentPane().add(emprunt);
        emprunt.setBounds(270, 290, 190, 40);

        Retour.setBackground(new java.awt.Color(0, 51, 255));
        Retour.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Retour.setText("Retour");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });
        getContentPane().add(Retour);
        Retour.setBounds(20, 460, 100, 30);

        quitter.setBackground(new java.awt.Color(51, 51, 255));
        quitter.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        quitter.setText("Quitter");
        quitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitterActionPerformed(evt);
            }
        });
        getContentPane().add(quitter);
        quitter.setBounds(580, 460, 100, 30);
        getContentPane().add(Date);
        Date.setBounds(434, 4, 200, 30);
        getContentPane().add(heure);
        heure.setBounds(0, 0, 110, 30);

        setSize(new java.awt.Dimension(716, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lecteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecteurActionPerformed
        Lecteur l=new Lecteur();
         l.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_lecteurActionPerformed

    private void quitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitterActionPerformed
         this.dispose();
    }//GEN-LAST:event_quitterActionPerformed

    private void livreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livreActionPerformed
         Livre l=new Livre();
         l.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_livreActionPerformed

    private void empruntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empruntActionPerformed
         Emprunt e=new Emprunt();
         e.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_empruntActionPerformed

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
         Login l=new Login();
         l.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_RetourActionPerformed
  
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
            java.util.logging.Logger.getLogger(Bienvenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bienvenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bienvenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bienvenue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JButton Retour;
    private javax.swing.JButton emprunt;
    private javax.swing.JLabel heure;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lecteur;
    private javax.swing.JButton livre;
    private javax.swing.JButton quitter;
    // End of variables declaration//GEN-END:variables
}
