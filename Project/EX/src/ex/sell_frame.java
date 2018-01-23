
package ex;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class sell_frame extends javax.swing.JFrame {

    
    public sell_frame() {
        initComponents();
        setLocationRelativeTo(null);
        try{
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/agency", "root", "hi123456789");
        Statement stat=con.createStatement();
        ResultSet res=stat.executeQuery("select model from car");
        while(res.next())
        {
            model.addItem(res.getString(1)+"");
        }
        }catch(SQLException ex){JOptionPane.showMessageDialog(null, ex.toString());}
        
        for (int i = 0; i < model.getItemCount();i++) {
            for (int j = i+1; j < model.getItemCount();) {
                if(model.getItemAt(i).equals(model.getItemAt(j)))
                {
                    model.removeItemAt(j);
                }
                else
                    j++;
            }
        }
        model.setSelectedItem("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        model = new javax.swing.JComboBox();
        sell = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Model");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 50, 30));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Color");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 50, 30));

        color.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colorKeyTyped(evt);
            }
        });
        getContentPane().add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, 30));

        jLabel6.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Year");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 50, 30));

        year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                yearKeyTyped(evt);
            }
        });
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 170, 30));

        jLabel8.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Price");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 50, 30));

        price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 170, 30));

        model.setEditable(true);
        model.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        model.setMaximumRowCount(12);
        getContentPane().add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 170, 30));

        sell.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sell.setText("SELL");
        sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellActionPerformed(evt);
            }
        });
        getContentPane().add(sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 140, 30));

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/700×400.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new customer_menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellActionPerformed
        if(model.getSelectedItem().equals("")||color.getText().equals("")||year.getText().equals("")||price.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "complete your data");
            return;
        }
        try {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/agency", "root", "hi123456789");
        Statement stat=con.createStatement();
        ResultSet res=stat.executeQuery("select * from car where model='"+model.getSelectedItem()
        +"'AND color='"+color.getText()+"'AND year='"+year.getText()+"'AND price='"+price.getText()
        +"'AND state='used'");
        if(res.next())
        {
            Statement stat1=con.createStatement();
            stat1.execute("update car set amount=amount+1 where model='"+model.getSelectedItem()+"' AND state='used'");
        }
        else{
        stat.execute("insert into car (model,color,year,amount,price,state) values ('"+model.getSelectedItem()
        +"','"+color.getText()+"','"+year.getText()+"','1','"+price.getText()+"','used')");
        }
        JOptionPane.showMessageDialog(null, "Operation Is Done");
        model.setSelectedItem("");
        color.setText("");
        year.setText("");
        price.setText("");
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex.toString());}
    }//GEN-LAST:event_sellActionPerformed

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_PERIOD))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_priceKeyTyped

    private void yearKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yearKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
        if(year.getText().length()==4&&!(c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_yearKeyTyped

    private void colorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colorKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_colorKeyTyped

    
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
            java.util.logging.Logger.getLogger(sell_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sell_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sell_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sell_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sell_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField color;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox model;
    private javax.swing.JTextField price;
    private javax.swing.JButton sell;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
