
package ex;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class intro extends javax.swing.JFrame {

    
    public intro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customer = new javax.swing.JButton();
        trader = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        customer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        customer.setText("Customer");
        customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerActionPerformed(evt);
            }
        });
        getContentPane().add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 180, 80));

        trader.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        trader.setText("Trader");
        trader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traderActionPerformed(evt);
            }
        });
        getContentPane().add(trader, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 180, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/intro.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        
        new customer_menu().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_customerActionPerformed

    private void traderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traderActionPerformed
        JTextField username=new JTextField();
        JPasswordField password=new JPasswordField();
        Object b[]={"User Name : ",username,"Password : ",password};
        if(JOptionPane.showConfirmDialog(null, b,"log in",JOptionPane.OK_CANCEL_OPTION)==0
                &&username.getText().equals("agency")
                &&String.valueOf(password.getPassword()).equals("agency"))
        {
            new trader_menu().setVisible(true);
            this.dispose();
        }
        else
            JOptionPane.showMessageDialog(null, "Wrong username or password");
    }//GEN-LAST:event_traderActionPerformed

    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(intro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new intro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton trader;
    // End of variables declaration//GEN-END:variables
}
