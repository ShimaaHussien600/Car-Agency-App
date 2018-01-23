
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class selllist extends javax.swing.JFrame {
    
    public selllist() {
        initComponents();
       setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        prtxt = new javax.swing.JTextField();
        ctxt = new javax.swing.JTextField();
        ytxt = new javax.swing.JTextField();
        mtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vtxt = new javax.swing.JTextField();
        ttxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jLabel5.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel5.setText("Type");

        jLabel6.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel6.setText("Model");

        jLabel7.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel7.setText("Color");

        jLabel8.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel8.setText("Year");

        jLabel10.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel10.setText("Price");

        jLabel4.setFont(new java.awt.Font("Wide Latin", 0, 12)); // NOI18N
        jLabel4.setText("VID ");

        prtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prtxtActionPerformed(evt);
            }
        });

        ctxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ctxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxtActionPerformed(evt);
            }
        });

        ytxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ytxtActionPerformed(evt);
            }
        });

        mtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Wide Latin", 0, 24)); // NOI18N
        jLabel3.setText("Car Details");

        vtxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vtxtActionPerformed(evt);
            }
        });

        ttxt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttxtActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sell");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Replace");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Home");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 55, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(ttxt)
                            .addComponent(mtxt)
                            .addComponent(ctxt)
                            .addComponent(ytxt)
                            .addComponent(prtxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(ttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(mtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(ctxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(ytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(prtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prtxtActionPerformed

    private void ctxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxtActionPerformed

    private void ytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ytxtActionPerformed

    private void mtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mtxtActionPerformed

    private void vtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vtxtActionPerformed

    private void ttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String vid,typ,model,price,year,color;
        vid= vtxt.getText();
            typ= ttxt.getText();
            model=mtxt.getText();
            color= ctxt.getText();
            year= ytxt.getText();
            price=prtxt.getText();
            if(vid.equals("")||typ.equals("")||model.equals("")||price.equals("")||year.equals("")||price.equals(""))
            {
            JOptionPane.showMessageDialog(rootPane,"invalide please enter again");
            }
        else
            {
       try {
       Connection c=DriverManager.getConnection("jdbc:mysql://localhost/car_agency","root","");
 //  PreparedStatement pp=con.prepareStatement("update  newcars set type=? where NID=? ");
        PreparedStatement pp=c.prepareStatement("insert into old_vehicle (id,type,model,color,year,price) values (?,?,?,?,?,?)");
      //      PreparedStatement pp=con.prepareStatement("delete from  newcars where  NID=? ");
            pp.setString(1, vtxt.getText());
            pp.setString(2, ttxt.getText());
            pp.setString(3, mtxt.getText());
            pp.setString(4, ctxt.getText());
            pp.setString(5, ytxt.getText());
               pp.setString(6, prtxt.getText());
            pp.executeUpdate();
 
          
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
      
        JOptionPane.showMessageDialog(rootPane, "thanks for buying this car");
        setVisible(false);
        
        
        
        
        new choose().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new cars().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String vid,typ,model,price,year,color;
        vid= vtxt.getText();
            typ= ttxt.getText();
            model=mtxt.getText();
            color= ctxt.getText();
            year= ytxt.getText();
            price=prtxt.getText();
            if(vid.equals("")||typ.equals("")||model.equals("")||color.equals("")||year.equals("")||price.equals(""))
            {
            JOptionPane.showMessageDialog(rootPane,"invalide please enter again");
            }
        else
            {
        try {
       Connection conc=DriverManager.getConnection("jdbc:mysql://localhost/car_agency","root","");
       
 //  PreparedStatement pp=con.prepareStatement("update  newcars set type=? where NID=? ");
        PreparedStatement pr=conc.prepareStatement("insert into old_vehicle (id,type,model,color,year,price) values (?,?,?,?,?,?)");
      //      PreparedStatement pp=con.prepareStatement("delete from  newcars where  NID=? ");
            pr.setString(1, vtxt.getText());
            pr.setString(2, ttxt.getText());
            pr.setString(3, mtxt.getText());
            pr.setString(4, ctxt.getText());
            pr.setString(5, ytxt.getText());
               pr.setString(6, prtxt.getText());
               pr.executeUpdate();
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
  
        
        
        
        
        
        
        
        
        
        JOptionPane.showMessageDialog(rootPane, "thanks for buying this car");
        setVisible(false);
        new user().setVisible(true);
        setVisible(false);
    }
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
            java.util.logging.Logger.getLogger(selllist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selllist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selllist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selllist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selllist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ctxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField mtxt;
    private javax.swing.JTextField prtxt;
    private javax.swing.JTextField ttxt;
    private javax.swing.JTextField vtxt;
    private javax.swing.JTextField ytxt;
    // End of variables declaration//GEN-END:variables
}
