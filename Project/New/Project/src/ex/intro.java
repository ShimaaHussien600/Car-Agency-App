package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class intro extends javax.swing.JFrame {

    static String username="",password="";
    public intro() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customer = new javax.swing.JButton();
        trader = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
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
        trader.setText("Manager");
        trader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traderActionPerformed(evt);
            }
        });
        getContentPane().add(trader, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 180, 80));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/intro.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerActionPerformed
        new customer_menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_customerActionPerformed

    private void traderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traderActionPerformed
        try {
            JTextField name=new JTextField();
            JPasswordField pass=new JPasswordField();
            Object b[]={"User Name : ",name,"Password : ",pass};
            
            JOptionPane.showMessageDialog(null, b,"log in",JOptionPane.QUESTION_MESSAGE);
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/agency", "root", "hi123456789");
            Statement stat=con.createStatement();
            ResultSet res=stat.executeQuery("select * from manager where name='"+name.getText()+"' and password='"+String.valueOf(pass.getPassword())+"'");
            
            if(res.next())
            {
                password=String.valueOf(pass.getPassword());
                new manager_menu().setVisible(true);
                this.dispose();
            }
            else
                JOptionPane.showMessageDialog(null, "Invalid !");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new intro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton customer;
    private javax.swing.JButton trader;
    // End of variables declaration//GEN-END:variables
}
