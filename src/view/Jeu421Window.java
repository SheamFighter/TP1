package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author csnd2350
 */
public class Jeu421Window extends javax.swing.JFrame {

    /**
     * Creates new form Jeu421Window
     */
    public Jeu421Window() {
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

        Title = new javax.swing.JLabel();
        De1 = new javax.swing.JLabel();
        De2 = new javax.swing.JLabel();
        De3 = new javax.swing.JLabel();
        resD1 = new javax.swing.JLabel();
        resD2 = new javax.swing.JLabel();
        resD3 = new javax.swing.JLabel();
        lanceDesBouton = new javax.swing.JButton();
        relanceDe1 = new javax.swing.JButton();
        relanceDe2 = new javax.swing.JButton();
        relanceDe3 = new javax.swing.JButton();
        compteurLancer = new javax.swing.JLabel();
        nbCoup = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title.setText("Jeu421");

        De1.setText("Dé 1 :");

        De2.setText("Dé 2 :");

        De3.setText("Dé 3 :");

        resD1.setText("Résulat Dé 1");

        resD2.setText("Résultat Dé 2");

        resD3.setText("Résultat Dé 3");

        lanceDesBouton.setText("Lancer tous les dés");
        lanceDesBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanceDesBoutonActionPerformed(evt);
            }
        });

        relanceDe1.setText("Relancer Dé 1");
        relanceDe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relanceDe1ActionPerformed(evt);
            }
        });

        relanceDe2.setText("Relancer Dé 2");
        relanceDe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relanceDe2ActionPerformed(evt);
            }
        });

        relanceDe3.setText("Relancer Dé 3");
        relanceDe3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relanceDe3ActionPerformed(evt);
            }
        });

        compteurLancer.setText("Nombre de coups :");

        nbCoup.setText("resultat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(relanceDe3)
                    .addComponent(lanceDesBouton)
                    .addComponent(relanceDe1)
                    .addComponent(relanceDe2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(De1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(De3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(De2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resD1)
                    .addComponent(resD2)
                    .addComponent(resD3))
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(Title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(compteurLancer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nbCoup)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Title)
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(De1)
                            .addComponent(resD1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(De2)
                            .addComponent(resD2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(De3)
                            .addComponent(resD3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(lanceDesBouton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relanceDe1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relanceDe2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(relanceDe3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compteurLancer)
                    .addComponent(nbCoup))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lanceDesBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanceDesBoutonActionPerformed
       
    }//GEN-LAST:event_lanceDesBoutonActionPerformed

    private void relanceDe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relanceDe1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relanceDe1ActionPerformed

    private void relanceDe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relanceDe2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relanceDe2ActionPerformed

    private void relanceDe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relanceDe3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_relanceDe3ActionPerformed

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
            java.util.logging.Logger.getLogger(Jeu421Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jeu421Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jeu421Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jeu421Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jeu421Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel De1;
    private javax.swing.JLabel De2;
    private javax.swing.JLabel De3;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel compteurLancer;
    private javax.swing.JButton lanceDesBouton;
    private javax.swing.JLabel nbCoup;
    private javax.swing.JButton relanceDe1;
    private javax.swing.JButton relanceDe2;
    private javax.swing.JButton relanceDe3;
    private javax.swing.JLabel resD1;
    private javax.swing.JLabel resD2;
    private javax.swing.JLabel resD3;
    // End of variables declaration//GEN-END:variables
}
