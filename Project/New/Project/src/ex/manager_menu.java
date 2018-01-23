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


public class manager_menu extends javax.swing.JFrame {

    DefaultTableModel DTM;
    Connection con;

    public manager_menu() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        model = new javax.swing.JComboBox();
        color = new javax.swing.JTextField();
        year = new javax.swing.JComboBox();
        price = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        instruct = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        add = new javax.swing.JRadioButton();
        update = new javax.swing.JRadioButton();
        delete = new javax.swing.JRadioButton();
        op = new javax.swing.JButton();
        back = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
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
        table.setEnabled(false);
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
        model.setEnabled(false);
        getContentPane().add(model, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 160, 30));

        color.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        color.setEnabled(false);
        color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colorKeyTyped(evt);
            }
        });
        getContentPane().add(color, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 160, 30));

        year.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        year.setMaximumRowCount(12);
        year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990" }));
        year.setEnabled(false);
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 160, 30));

        price.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        price.setEnabled(false);
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 160, 30));

        amount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        amount.setEnabled(false);
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });
        getContentPane().add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 160, 30));

        jLabel3.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Model");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 50, 30));

        jLabel5.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Color");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 50, 30));

        jLabel6.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Year");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 50, 30));

        jLabel8.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Price");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 50, 30));

        jLabel9.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Amount");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 50, 30));

        instruct.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        instruct.setForeground(new java.awt.Color(153, 0, 153));
        instruct.setText("Choose Operation");
        getContentPane().add(instruct, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 130, 30));
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 300, 270));

        buttonGroup1.add(add);
        add.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        add.setForeground(new java.awt.Color(153, 0, 153));
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 70, -1));

        buttonGroup1.add(update);
        update.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        update.setForeground(new java.awt.Color(153, 0, 153));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 70, -1));

        buttonGroup1.add(delete);
        delete.setFont(new java.awt.Font("Impact", 0, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(153, 0, 153));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 70, -1));

        op.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        op.setText("operation ");
        op.setEnabled(false);
        op.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opActionPerformed(evt);
            }
        });
        getContentPane().add(op, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 120, 30));

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background/760×490.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new intro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if(table.isEnabled()){
            try{
            int row=table.getSelectedRow();
            
            model.setSelectedItem(table.getValueAt(row, 0)+"");
            color.setText(table.getValueAt(row, 1)+"");
            year.setSelectedItem(table.getValueAt(row, 2)+"");
            amount.setText(table.getValueAt(row, 3)+"");
            price.setText(table.getValueAt(row, 4)+"");
            
            img.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/"+table.getValueAt(row, 0)+".jpg")));
            }catch(Exception ex){img.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Images/default.jpg")));}
        }
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

    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||c==KeyEvent.VK_DELETE||c==KeyEvent.VK_BACK_SPACE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_amountKeyTyped

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        table.setEnabled(false);
        
        model.setEnabled(true);model.setSelectedItem("");
        color.setEnabled(true);color.setText("");
        year.setEnabled(true);year.setSelectedItem("2016");
        price.setEnabled(true);price.setText("");
        amount.setEnabled(true);amount.setText("");
        
        op.setEnabled(true);op.setText("ADD");
        
        instruct.setText("Enter Car Data!");
        img.setIcon(null);
        
        update_table();
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        table.setEnabled(true);
        
        model.setEnabled(true);model.setSelectedItem("");
        color.setEnabled(true);color.setText("");
        year.setEnabled(true);year.setSelectedItem("2016");
        price.setEnabled(true);price.setText("");
        amount.setEnabled(true);amount.setText("");
        
        op.setEnabled(true);op.setText("UPDATE");
        
        instruct.setText("Select Car To Update");
        img.setIcon(null);
        
        update_table();
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        table.setEnabled(true);
        
        model.setEnabled(false);model.setSelectedItem("");
        color.setEnabled(false);color.setText("");
        year.setEnabled(false);year.setSelectedItem("2016");
        price.setEnabled(false);price.setText("");
        amount.setEnabled(false);amount.setText("");
        
        op.setEnabled(true);op.setText("DELETE");
        
        instruct.setText("Select Car To Delete");
        img.setIcon(null);
        
        update_table();
    }//GEN-LAST:event_deleteActionPerformed

    private void opActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opActionPerformed
        if(model.getSelectedItem().equals("")||color.getText().equals("")||amount.getText().equals("")||price.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Follow The Instructions");
            return;
        }
        try {
            if(add.isSelected())
            {
                Statement stat=con.createStatement();
                stat.execute("insert into car (model,color,year,amount,price,state) values ('"+model.getSelectedItem()
                    +"','"+color.getText()+"','"+year.getSelectedItem()+"','"+amount.getText()+"','"+price.getText()+"','new')");
            
                stat.execute("insert into manager_transaction (type,manager_password,car_id) "+
                    " values ('add','"+new intro().password+"','"+(table.getRowCount()+1)+"')");
            }
            else if(update.isSelected())
            {
                if(table.getSelectedRow()==-1)
                {
                    JOptionPane.showMessageDialog(null, "Select A Car");
                    return;
                }
                Statement stat=con.createStatement();
                stat.execute("update car set model='"+model.getSelectedItem()+"',color='"+color.getText()
                    +"',year='"+year.getSelectedItem()+"',amount='"+amount.getText()
                    +"',price='"+price.getText()+"' where id='"+(table.getSelectedRow()+1)+"'");
                
                stat.execute("insert into manager_transaction (type,manager_password,car_id) "+
                    " values ('update','"+new intro().password+"','"+(table.getSelectedRow()+1)+"')");
            }
            else if(delete.isSelected())
            {
                if(table.getSelectedRow()==-1)
                {
                    JOptionPane.showMessageDialog(null, "Select A Car");
                    return;
                }
                Statement stat=con.createStatement();
                stat.execute("update car set amount='0' where id='"+(table.getSelectedRow()+1)+"'");
                
                stat.execute("insert into manager_transaction (type,manager_password,car_id) "+
                    " values ('delete','"+new intro().password+"','"+(table.getSelectedRow()+1)+"')");
            }
            JOptionPane.showMessageDialog(null, "Operation Is Done");
            
            img.setIcon(null);
            
            model.setSelectedItem("");color.setText("");
            year.setSelectedItem("2016");price.setText("");
            amount.setText("");
            
            update_table();
            update_combobox();
        } catch (SQLException ex) {JOptionPane.showMessageDialog(null, ex.toString());}
    }//GEN-LAST:event_opActionPerformed

    
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
            java.util.logging.Logger.getLogger(manager_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manager_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manager_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manager_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manager_menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton add;
    private javax.swing.JTextField amount;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField color;
    private javax.swing.JRadioButton delete;
    private javax.swing.JLabel img;
    private javax.swing.JLabel instruct;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox model;
    private javax.swing.JButton op;
    private javax.swing.JTextField price;
    private javax.swing.JTable table;
    private javax.swing.JRadioButton update;
    private javax.swing.JComboBox year;
    // End of variables declaration//GEN-END:variables
}
