package ex;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class customer_menu extends javax.swing.JFrame {

    static String name="",SSN="",phone="",address="";
    Connection con;

    public customer_menu() {
        initComponents();
        setLocationRelativeTo(null);
        nametxt.setText(name);
        phonetxt.setText(phone);
        SSNtxt.setText(SSN);
        addresstxt.setText(address);
        if(!(name.equals("")||SSN.equals("")||phone.equals("")||address.equals("")))
        {
            nametxt.setEditable(false);nametxt.setEnabled(true);
            SSNtxt.setEditable(false);SSNtxt.setEnabled(true);
            phonetxt.setEditable(false);phonetxt.setEnabled(true);
            addresstxt.setEditable(false);addresstxt.setEnabled(true);
            save.setEnabled(false);
            save.setSelected(true);
            New.setSelected(true);
            New.setEnabled(false);
            Old.setEnabled(false);
        }
        else if(!(SSN.equals("")))
        {
            SSNtxt.setEnabled(true);
            SSNtxt.setEditable(false);
            save.setEnabled(false);
            Old.setSelected(true);
            New.setEnabled(false);
            Old.setEnabled(false);
        }
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/agency", "root", "hi123456789");
        }catch(SQLException ex){JOptionPane.showMessageDialog(null, ex.toString());}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buy = new javax.swing.JButton();
        sell = new javax.swing.JButton();
        replace = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        SSNtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phonetxt = new javax.swing.JTextField();
        addresstxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        save = new javax.swing.JCheckBox();
        New = new javax.swing.JRadioButton();
        Old = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buy.setText("BUY");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });
        getContentPane().add(buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 140, 30));

        sell.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sell.setText("SELL");
        sell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellActionPerformed(evt);
            }
        });
        getContentPane().add(sell, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 140, 30));

        replace.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        replace.setText("REPLACE");
        replace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceActionPerformed(evt);
            }
        });
        getContentPane().add(replace, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 140, 30));

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 50, 30));

        nametxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nametxt.setEnabled(false);
        nametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nametxtKeyTyped(evt);
            }
        });
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 170, 30));

        SSNtxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SSNtxt.setEnabled(false);
        SSNtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SSNtxtKeyTyped(evt);
            }
        });
        getContentPane().add(SSNtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 170, 30));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("SSN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 50, 30));

        jLabel4.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Phone");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 50, 30));

        phonetxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        phonetxt.setEnabled(false);
        phonetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phonetxtKeyTyped(evt);
            }
        });
        getContentPane().add(phonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 170, 30));

        addresstxt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        addresstxt.setEnabled(false);
        getContentPane().add(addresstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 170, 30));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, 30));

        save.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        save.setForeground(new java.awt.Color(255, 102, 0));
        save.setText("Save");
        save.setEnabled(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        buttonGroup1.add(New);
        New.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        New.setForeground(new java.awt.Color(255, 153, 0));
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        getContentPane().add(New, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        buttonGroup1.add(Old);
        Old.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        Old.setForeground(new java.awt.Color(255, 153, 0));
        Old.setText("Old");
        Old.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OldActionPerformed(evt);
            }
        });
        getContentPane().add(Old, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/700×400.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
        SSN=SSNtxt.getText();
        if(save.isSelected())
        {
            new buy_frame().setVisible(true);
            this.dispose();
        }
        else if(Old.isSelected()&&!(SSN.equals("")))
        {
            if(SSNtxt.isEditable()){
            try{
            Statement stat=con.createStatement();
            ResultSet res=stat.executeQuery("select SSN from customer where SSN='"+SSN+"'");
            if(res.next()){
            new buy_frame().setVisible(true);
            this.dispose();
            }
            else
                JOptionPane.showMessageDialog(null, "SSN isn`t found");
            }catch(SQLException ex) {JOptionPane.showMessageDialog(null, ex.toString());}
            }
            else{
            new buy_frame().setVisible(true);
            this.dispose();
            }
        }
        else
            JOptionPane.showMessageDialog(null, "SomeThing Is Missed");
    }//GEN-LAST:event_buyActionPerformed

    private void sellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellActionPerformed
        SSN=SSNtxt.getText();
        if(save.isSelected())
        {
            new sell_frame().setVisible(true);
            this.dispose();
        }
        else if(Old.isSelected()&&!(SSN.equals("")))
        {
            if(SSNtxt.isEditable()){
            try{
            Statement stat=con.createStatement();
            ResultSet res=stat.executeQuery("select SSN from customer where SSN='"+SSN+"'");
            if(res.next()){
            new sell_frame().setVisible(true);
            this.dispose();
            }
            else
                JOptionPane.showMessageDialog(null, "SSN isn`t found");
            }catch(SQLException ex) {JOptionPane.showMessageDialog(null, ex.toString());}
            }
            else{
            new sell_frame().setVisible(true);
            this.dispose();
            }
        }
        else
            JOptionPane.showMessageDialog(null, "SomeThing Is Missed");  
    }//GEN-LAST:event_sellActionPerformed

    private void replaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceActionPerformed
        SSN=SSNtxt.getText();
        if(save.isSelected())
        {
            new replace_frame().setVisible(true);
            this.dispose();
        }
        else if(Old.isSelected()&&!(SSN.equals("")))
        {
            if(SSNtxt.isEditable()){
            try{
            Statement stat=con.createStatement();
            ResultSet res=stat.executeQuery("select SSN from customer where SSN='"+SSN+"'");
            if(res.next()){
            new replace_frame().setVisible(true);
            this.dispose();
            }
            else
                JOptionPane.showMessageDialog(null, "SSN isn`t found");
            }catch(SQLException ex) {JOptionPane.showMessageDialog(null, ex.toString());}
            }
            else{
            new replace_frame().setVisible(true);
            this.dispose();
            }
        }
        else
            JOptionPane.showMessageDialog(null, "SomeThing Is Missed");
    }//GEN-LAST:event_replaceActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        SSN="";phone="";name="";address="";
        new intro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void nametxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametxtKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_nametxtKeyTyped

    private void SSNtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SSNtxtKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
        if(SSNtxt.getText().length()==14&&!(c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_SSNtxtKeyTyped

    private void phonetxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonetxtKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
        if(phonetxt.getText().length()==11&&!(c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_phonetxtKeyTyped

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            phone=phonetxt.getText();SSN=SSNtxt.getText();name=nametxt.getText();address=addresstxt.getText();
        if(save.isSelected())
        {
            if(!(name.equals("")||SSN.equals("")||phone.equals("")||address.equals("")))
            {    
            Statement stat=con.createStatement();
            stat.execute("insert into customer (name,SSN,phone,address) values ('"+name+"','"+SSN+"','"+phone+"','"+address+"')");
            JOptionPane.showMessageDialog(null, "Data Is Saved");
            nametxt.setEditable(false);
            SSNtxt.setEditable(false);
            phonetxt.setEditable(false);
            addresstxt.setEditable(false);
            New.setEnabled(false);
            Old.setEnabled(false);
            }
            else
            {
            JOptionPane.showMessageDialog(null, "complete your data");
            save.setSelected(false);
            }
        }
        else 
        {
            if(JOptionPane.showConfirmDialog(null, "Data Will Be Deleted","",JOptionPane.OK_CANCEL_OPTION)==0)
            {
            Statement stat=con.createStatement();
            stat.execute("delete from customer where SSN='"+SSN+"'");
            JOptionPane.showMessageDialog(null, "Data Is Deleted");
            nametxt.setEditable(true);
            SSNtxt.setEditable(true);
            phonetxt.setEditable(true);
            addresstxt.setEditable(true);
            New.setEnabled(true);
            Old.setEnabled(true);
            }
            else
                save.setSelected(true);
        }
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex.toString());}

    }//GEN-LAST:event_saveActionPerformed

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        nametxt.setEnabled(true);
        SSNtxt.setEnabled(true);
        phonetxt.setEnabled(true);
        addresstxt.setEnabled(true);
        save.setEnabled(true);
    }//GEN-LAST:event_NewActionPerformed

    private void OldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OldActionPerformed
        nametxt.setEnabled(false);
        SSNtxt.setEnabled(true);
        phonetxt.setEnabled(false);
        addresstxt.setEnabled(false);
        save.setEnabled(false);
    }//GEN-LAST:event_OldActionPerformed

    
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
            java.util.logging.Logger.getLogger(customer_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JRadioButton New;
    private static javax.swing.JRadioButton Old;
    private javax.swing.JTextField SSNtxt;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JButton back;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JButton replace;
    private javax.swing.JCheckBox save;
    private javax.swing.JButton sell;
    // End of variables declaration//GEN-END:variables
}
