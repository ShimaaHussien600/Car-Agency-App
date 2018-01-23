package ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class buy_frame extends javax.swing.JFrame {

    DefaultTableModel DTM;
    Connection con;
    public buy_frame() {
        initComponents();
        setLocationRelativeTo(null);
        
        try{
        con=DriverManager.getConnection("jdbc:mysql://localhost/agency", "root", "hi123456789");
        update_table();
        }catch(SQLException ex){JOptionPane.showMessageDialog(null, ex.toString());}
    }

    void update_table()
    {
        for (int i = 0; i < table.getRowCount();) {
            DTM.removeRow(i);
        }
        try{
        Statement stat=con.createStatement();
        ResultSet res=stat.executeQuery("select * from car");
        DTM=(DefaultTableModel)table.getModel();
        while(res.next())
        {
            DTM.addRow(new Object[]{res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});
        }
        }catch(SQLException ex){JOptionPane.showMessageDialog(null, ex.toString());}
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        buy = new javax.swing.JButton();
        back = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MODEL", "COLOR", "YEAR", "AMOUNT", "PRICE", "STATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 180));

        buy.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        buy.setText("BUY");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });
        getContentPane().add(buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 140, 30));

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 300, 270));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/buy.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new customer_menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try{
        int row=table.getSelectedRow();
        img.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/"+table.getValueAt(row, 0)+".jpg")));
        }catch(Exception ex){img.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/default.jpg")));}
    }//GEN-LAST:event_tableMouseClicked

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
        try {
            if(table.getSelectedRow()!=-1)
            {
                if(table.getValueAt(table.getSelectedRow(), 3).equals("0"))
                {
                    JOptionPane.showMessageDialog(null, "We Don`t Have This Car");
                    return;
                }
                Statement stat=con.createStatement();
                stat.execute("update car set amount=(amount-1) where id='"+(table.getSelectedRow()+1)+"'");
            
                stat.execute("insert into customer_transaction (type,customer_ssn,car_id,money) "+
                        "values ('buy','"+new customer_menu().SSN+"','"+(table.getSelectedRow()+1)+"','"+(table.getValueAt((table.getSelectedRow()+1), 4))+"')");
            
                update_table();
                img.setIcon(null);
            
                JOptionPane.showMessageDialog(null, "Operation Is Done");
            }
            else
                JOptionPane.showMessageDialog(null, "Select a car");
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex.toString());}
    }//GEN-LAST:event_buyActionPerformed

    
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
            java.util.logging.Logger.getLogger(buy_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buy_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buy_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buy_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buy_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buy;
    private javax.swing.JLabel img;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
