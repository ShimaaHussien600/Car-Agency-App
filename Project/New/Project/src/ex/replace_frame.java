package ex;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class replace_frame extends javax.swing.JFrame {

    DefaultTableModel DTM;
    Connection con;
    
    public replace_frame() {
        initComponents();
        setLocationRelativeTo(null);
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost/agency", "root", "hi123456789");
            update_table();
            update_combobox();
        }catch(SQLException ex){JOptionPane.showMessageDialog(null, ex.toString());}
    }

    void update_combobox()
    {
        for (int i = 0; i < table.getRowCount(); i++) {
            model.addItem(table.getValueAt(i, 0)+"");
        }
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

        replace = new javax.swing.JButton();
        back = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        model = new javax.swing.JComboBox();
        color = new javax.swing.JTextField();
        year = new javax.swing.JComboBox();
        price = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        instruct = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        replace.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        replace.setText("REPLACE");
        replace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                replaceActionPerformed(evt);
            }
        });
        getContentPane().add(replace, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 120, 30));

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 300, 270));

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
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 180));

        model.setEditable(true);
        model.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        model.setMaximumRowCount(12);
        getContentPane().add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 160, 30));

        color.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colorKeyTyped(evt);
            }
        });
        getContentPane().add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 160, 30));

        year.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        year.setMaximumRowCount(12);
        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990" }));
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 160, 30));

        price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 160, 30));

        jLabel8.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Price");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 40, 30));

        jLabel6.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Year");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 40, 30));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Color");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 40, 30));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Model");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 30));

        instruct.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        instruct.setForeground(new java.awt.Color(153, 0, 153));
        instruct.setText("Select Car From Table");
        getContentPane().add(instruct, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 130, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/760×490.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
       new customer_menu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void replaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replaceActionPerformed
        if(model.getSelectedItem().equals("")||color.getText().equals("")||price.getText().equals("")||table.getValueAt(table.getSelectedRow(), 3).equals("0"))
        {
            JOptionPane.showMessageDialog(null, "Check Your Data or Car Selection");
            return;
        }
        try {
            Statement stat=con.createStatement();
            
            stat.execute("update car set amount=(amount-1) where id='"+(table.getSelectedRow()+1)+"'");
            
            ResultSet res=stat.executeQuery("select * from car where model='"+model.getSelectedItem()
            +"'AND color='"+color.getText()+"'AND year='"+year.getSelectedItem()+"'AND price='"+price.getText()
            +"'AND state='used'");
            
            double f_car=Double.valueOf(table.getValueAt(table.getSelectedRow(), 4)+"");
            double r_car=Double.valueOf(price.getText());
            if(f_car>r_car)
                JOptionPane.showMessageDialog(null, "Must Pay : "+(f_car-r_car));
            else if(f_car<r_car)
                JOptionPane.showMessageDialog(null, "Must Take : "+(r_car-f_car));
            
            if(res.next())
            {
                Statement stat1=con.createStatement();
                stat1.execute("update car set amount=amount+1 where model='"+model.getSelectedItem()+"' AND state='used'");
            
                stat.execute("insert into customer_transaction (type,customer_ssn,car_id,replaced_car_id,money) "+
                    " values ('sell','"+new customer_menu().SSN+"',(SELECT id FROM car where model='"+
                    model.getSelectedItem()+"' AND state='used'),'"+(table.getSelectedRow()+1)+"','"+(f_car-r_car)+"')");
            }
            else{
                stat.execute("insert into car (model,color,year,amount,price,state) values ('"+model.getSelectedItem()
                +"','"+color.getText()+"','"+year.getSelectedItem()+"','1','"+price.getText()+"','used')");
            
                stat.execute("insert into customer_transaction (type,customer_ssn,car_id,replaced_car_id,money) "+
                    " values ('sell','"+new customer_menu().SSN+"',(SELECT COUNT(*) FROM car),'"+
                    (table.getSelectedRow()+1)+"','"+(f_car-r_car)+"')");
            }
            
            model.setSelectedItem("");color.setText("");
            year.setSelectedItem("2015");price.setText("");
            
            update_table();
            update_combobox();
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex.toString());}
    }//GEN-LAST:event_replaceActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        try{
        int row=table.getSelectedRow();
        img.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/"+table.getValueAt(row, 0)+".jpg")));
        }catch(Exception ex){img.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/default.jpg")));}
    }//GEN-LAST:event_tableMouseClicked

    private void colorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colorKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isAlphabetic(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_colorKeyTyped

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_PERIOD))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_priceKeyTyped

   
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
            java.util.logging.Logger.getLogger(replace_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(replace_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(replace_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(replace_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new replace_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JTextField color;
    private javax.swing.JLabel img;
    private javax.swing.JLabel instruct;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox model;
    private javax.swing.JTextField price;
    private javax.swing.JButton replace;
    private javax.swing.JTable table;
    private javax.swing.JComboBox year;
    // End of variables declaration//GEN-END:variables
}
