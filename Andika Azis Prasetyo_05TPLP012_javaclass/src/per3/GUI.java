/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package per3;


/**
 *
 * @author Andika
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GUI() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nil1 = new javax.swing.JTextField();
        nil2 = new javax.swing.JTextField();
        jml = new javax.swing.JTextField();
        cb01 = new javax.swing.JCheckBox();
        cb02 = new javax.swing.JCheckBox();
        cb03 = new javax.swing.JCheckBox();
        cb1 = new javax.swing.JRadioButton();
        cb2 = new javax.swing.JRadioButton();
        cb3 = new javax.swing.JRadioButton();
        cb011 = new javax.swing.JTextField();
        cb022 = new javax.swing.JTextField();
        cb033 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("nilai 1");

        jLabel2.setText("nilai 2");

        jLabel3.setText("HASIL JUMLAH");

        nil2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nil2ActionPerformed(evt);
            }
        });

        jml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlActionPerformed(evt);
            }
        });

        cb01.setText("penjumlahan");
        cb01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb01ActionPerformed(evt);
            }
        });

        cb02.setText("pengurangan");
        cb02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb02ActionPerformed(evt);
            }
        });

        cb03.setText("perkalian");
        cb03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb03ActionPerformed(evt);
            }
        });

        cb1.setText("penjumlahan");
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        cb2.setText("pengurangan");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });

        cb3.setText("perkalian");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });

        cb011.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb011ActionPerformed(evt);
            }
        });

        cb022.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb022ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(70, 70, 70)
                            .addComponent(nil1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nil2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jml, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cb1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(cb2)
                        .addGap(18, 18, 18)
                        .addComponent(cb3)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb01)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb011, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb02)
                                    .addComponent(cb03))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb033, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb022, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nil2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jml, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb1)
                            .addComponent(cb3)
                            .addComponent(cb2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb01)
                            .addComponent(cb011, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb02)
                            .addComponent(cb022, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb03)
                            .addComponent(cb033, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nil2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nil2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nil2ActionPerformed

    private void jmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmlActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
        int n1,n2,hs;
        n1=Integer.parseInt(nil1.getText());
        n2=Integer.parseInt(nil2.getText());
        hs=n1+n2;
        jml.setText(""+hs);
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb011ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb011ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb011ActionPerformed

    private void cb03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb03ActionPerformed
        // TODO add your handling code here:
        int n1,n2,hs;
        n1=Integer.parseInt(nil1.getText());
        n2=Integer.parseInt(nil2.getText());
        hs=n1*n2;
        if(cb03.isSelected())
            cb033.setText(""+hs);
        else
            cb033.setText("");
    }//GEN-LAST:event_cb03ActionPerformed

    private void cb01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb01ActionPerformed
        // TODO add your handling code here:
        int n1,n2,hs;
        n1=Integer.parseInt(nil1.getText());
        n2=Integer.parseInt(nil2.getText());
        hs=n1+n2;
        if(cb01.isSelected())
            cb011.setText(""+hs);
        else
            cb011.setText("");
    }//GEN-LAST:event_cb01ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
        int n1,n2,hs;
        n1=Integer.parseInt(nil1.getText());
        n2=Integer.parseInt(nil2.getText());
        hs=n1-n2;
         jml.setText(""+hs);
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
        int n1,n2,hs;
        n1=Integer.parseInt(nil1.getText());
        n2=Integer.parseInt(nil2.getText());
        hs=n1*n2;
        jml.setText(""+hs);
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb02ActionPerformed
        // TODO add your handling code here:
        int n1,n2,hs;
        n1=Integer.parseInt(nil1.getText());
        n2=Integer.parseInt(nil2.getText());
        hs=n1-n2;
        if(cb02.isSelected())
            cb022.setText(""+hs);
        else
            cb022.setText("");
        
    }//GEN-LAST:event_cb02ActionPerformed

    private void cb022ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb022ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb022ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cb01;
    private javax.swing.JTextField cb011;
    private javax.swing.JCheckBox cb02;
    private javax.swing.JTextField cb022;
    private javax.swing.JCheckBox cb03;
    private javax.swing.JTextField cb033;
    private javax.swing.JRadioButton cb1;
    private javax.swing.JRadioButton cb2;
    private javax.swing.JRadioButton cb3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jml;
    private javax.swing.JTextField nil1;
    private javax.swing.JTextField nil2;
    // End of variables declaration//GEN-END:variables
}
