/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_project;

/**
 *
 * @author FBc
 */
public class MENU extends javax.swing.JFrame {

    /**
     * Creates new form MENU
     */
    public MENU() {
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
        TEAMSBTN = new javax.swing.JButton();
        SCHDBTN = new javax.swing.JButton();
        KITSBTN = new javax.swing.JButton();
        SALARYBTN = new javax.swing.JButton();
        TOURBTN = new javax.swing.JButton();
        WICKETSBTN = new javax.swing.JButton();
        STAFFBTN = new javax.swing.JButton();
        PLAYERSBTN = new javax.swing.JButton();
        RUNBTNS = new javax.swing.JButton();
        SPONSORSBTN = new javax.swing.JButton();
        POINTSBTN = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" WELCOME TO MENU SELECT YOUR DESIRED OPTION:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        TEAMSBTN.setBackground(new java.awt.Color(0, 0, 0));
        TEAMSBTN.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        TEAMSBTN.setForeground(new java.awt.Color(255, 255, 255));
        TEAMSBTN.setText("TEAMS");
        TEAMSBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEAMSBTNActionPerformed(evt);
            }
        });

        SCHDBTN.setBackground(new java.awt.Color(0, 0, 0));
        SCHDBTN.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        SCHDBTN.setForeground(new java.awt.Color(255, 255, 255));
        SCHDBTN.setText("SCHEDULE");
        SCHDBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SCHDBTNActionPerformed(evt);
            }
        });

        KITSBTN.setBackground(new java.awt.Color(0, 0, 0));
        KITSBTN.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        KITSBTN.setForeground(new java.awt.Color(255, 255, 255));
        KITSBTN.setText("KITS");
        KITSBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KITSBTNActionPerformed(evt);
            }
        });

        SALARYBTN.setBackground(new java.awt.Color(0, 0, 0));
        SALARYBTN.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        SALARYBTN.setForeground(new java.awt.Color(255, 255, 255));
        SALARYBTN.setText("SALARY");
        SALARYBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALARYBTNActionPerformed(evt);
            }
        });

        TOURBTN.setBackground(new java.awt.Color(0, 0, 0));
        TOURBTN.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        TOURBTN.setForeground(new java.awt.Color(255, 255, 255));
        TOURBTN.setText("TOURNAMENT");
        TOURBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOURBTNActionPerformed(evt);
            }
        });

        WICKETSBTN.setBackground(new java.awt.Color(0, 0, 0));
        WICKETSBTN.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        WICKETSBTN.setForeground(new java.awt.Color(255, 255, 255));
        WICKETSBTN.setText("MOST WICKETS");
        WICKETSBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WICKETSBTNActionPerformed(evt);
            }
        });

        STAFFBTN.setBackground(new java.awt.Color(0, 0, 0));
        STAFFBTN.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        STAFFBTN.setForeground(new java.awt.Color(255, 255, 255));
        STAFFBTN.setText("STAFF LIST");
        STAFFBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STAFFBTNActionPerformed(evt);
            }
        });

        PLAYERSBTN.setBackground(new java.awt.Color(0, 0, 0));
        PLAYERSBTN.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        PLAYERSBTN.setForeground(new java.awt.Color(255, 255, 255));
        PLAYERSBTN.setText("PLAYERS LIST");
        PLAYERSBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PLAYERSBTNActionPerformed(evt);
            }
        });

        RUNBTNS.setBackground(new java.awt.Color(0, 0, 0));
        RUNBTNS.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        RUNBTNS.setForeground(new java.awt.Color(255, 255, 255));
        RUNBTNS.setText("MOST RUNS");
        RUNBTNS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RUNBTNSActionPerformed(evt);
            }
        });

        SPONSORSBTN.setBackground(new java.awt.Color(0, 0, 0));
        SPONSORSBTN.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        SPONSORSBTN.setForeground(new java.awt.Color(255, 255, 255));
        SPONSORSBTN.setText("SPONSORS");
        SPONSORSBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SPONSORSBTNActionPerformed(evt);
            }
        });

        POINTSBTN.setBackground(new java.awt.Color(0, 0, 0));
        POINTSBTN.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        POINTSBTN.setForeground(new java.awt.Color(255, 255, 255));
        POINTSBTN.setText("POINTS TABLE");
        POINTSBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                POINTSBTNActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("BACK TO LOGIN");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 0, 51));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("QUIT!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SALARYBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TOURBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KITSBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TEAMSBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SCHDBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(POINTSBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SPONSORSBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PLAYERSBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(STAFFBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WICKETSBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RUNBTNS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TEAMSBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RUNBTNS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCHDBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WICKETSBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KITSBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(STAFFBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TOURBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PLAYERSBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SPONSORSBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(POINTSBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SALARYBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TEAMSBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEAMSBTNActionPerformed
        // TODO add your handling code here:
        TEAMS T=new TEAMS();
        T.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TEAMSBTNActionPerformed

    private void SCHDBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SCHDBTNActionPerformed
        // TODO add your handling code here:
        SCHEDULE S=new SCHEDULE();
        S.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SCHDBTNActionPerformed

    private void KITSBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KITSBTNActionPerformed
        // TODO add your handling code here:
        KITS K=new KITS();
        K.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_KITSBTNActionPerformed

    private void TOURBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOURBTNActionPerformed
        // TODO add your handling code here:
        TOURNAMENT T=new TOURNAMENT();
        T.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TOURBTNActionPerformed

    private void POINTSBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_POINTSBTNActionPerformed
        // TODO add your handling code here:
        POINTS_TABLE PT=new POINTS_TABLE();
        PT.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_POINTSBTNActionPerformed

    private void SALARYBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALARYBTNActionPerformed
        // TODO add your handling code here:
        SALARY SAL=new SALARY();
        SAL.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SALARYBTNActionPerformed

    private void RUNBTNSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RUNBTNSActionPerformed
        // TODO add your handling code here:
        MOST_RUNS MR=new MOST_RUNS();
        MR.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RUNBTNSActionPerformed

    private void WICKETSBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WICKETSBTNActionPerformed
        // TODO add your handling code here:
        MOST_WICKETS MW=new MOST_WICKETS();
        MW.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_WICKETSBTNActionPerformed

    private void STAFFBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STAFFBTNActionPerformed
        // TODO add your handling code here:
        STAFF_LIST SL=new STAFF_LIST();
        SL.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_STAFFBTNActionPerformed

    private void PLAYERSBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PLAYERSBTNActionPerformed
        // TODO add your handling code here:
         PLAYER_LIST pl= new PLAYER_LIST();
        pl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PLAYERSBTNActionPerformed

    private void SPONSORSBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SPONSORSBTNActionPerformed
        // TODO add your handling code here:
        SPONSORS SPN=new SPONSORS();
        SPN.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_SPONSORSBTNActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        LOGIN L=new LOGIN();
        L.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KITSBTN;
    private javax.swing.JButton PLAYERSBTN;
    private javax.swing.JButton POINTSBTN;
    private javax.swing.JButton RUNBTNS;
    private javax.swing.JButton SALARYBTN;
    private javax.swing.JButton SCHDBTN;
    private javax.swing.JButton SPONSORSBTN;
    private javax.swing.JButton STAFFBTN;
    private javax.swing.JButton TEAMSBTN;
    private javax.swing.JButton TOURBTN;
    private javax.swing.JButton WICKETSBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
