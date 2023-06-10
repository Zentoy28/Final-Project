    
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
        
public class Peripheral extends javax.swing.JFrame {

    /**
     * Creates new form Peripheral
     */
    public Peripheral() {
        initComponents();
        setTitle("Company Inventory System");
        fetch();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
      String url = "jdbc:derby://localhost:1527/C:/Derby/zen";    
     private void fetch(){
  
   

      try (Connection conn = DriverManager.getConnection(url);
           Statement stmt = conn.createStatement();
           ResultSet rs = stmt.executeQuery("select * from database")) {

         // create a table model from the result set
         DefaultTableModel model = (DefaultTableModel)table.getModel();
         ResultSetMetaData metadata = rs.getMetaData();
         int columnCount =
    metadata.getColumnCount();
         for (int i = 1; i <= columnCount; i++) {
            model.addColumn(metadata.getColumnName(i));
         }
         while (rs.next()) {
            Object[] row = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++) {
               row[i - 1] = rs.getObject(i);
            }
            model.addRow(row);
         }

        
        
        
      } catch (SQLException e) {
         e.printStackTrace();
      }
  }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        Remove = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        t1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        t2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Component Name:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Component Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 41, 120, 30));

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel1.add(t3, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 125, 172, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Peripheral Type: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 125, 110, 30));

        t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });
        jPanel1.add(t4, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 177, 172, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee Name: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 177, 110, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.setRowHeight(25);
        table.setShowGrid(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 15, 458, 241));

        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-add-new-20.png"))); // NOI18N
        Add.setText("Add");
        Add.setToolTipText("Add to table");
        Add.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel1.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 225, -1, 34));

        Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-remove-20.png"))); // NOI18N
        Remove.setText("Delete");
        Remove.setToolTipText("Click the row you want to Delete ");
        Remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveActionPerformed(evt);
            }
        });
        jPanel1.add(Remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-available-updates-20.png"))); // NOI18N
        Update.setText("Update");
        Update.setToolTipText("click the Row you want to update ");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel1.add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 41, 172, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-back-red-arrow-25.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 298, -1, 34));

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel1.add(t2, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 83, 172, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Code : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 83, 120, 30));

        jButton2.setText("Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 100, 27));

        jButton3.setText("View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 100, 27));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t4ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_t4ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

   
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
      String url="jdbc:derby://localhost:1527/C:/Derby/zen";
        String qu="insert into DATABASE (NAME,COMNAME,TYPE,EMPLOYEE) VALUES(?,?,?,?)";
        
        try{
       Connection con=DriverManager.getConnection(url);
       PreparedStatement st=con.prepareStatement(qu);
       
       if(t1.getText().length()<=0||t2.getText().length()<=0||t3.getText().length()<=0||t4.getText().length()<=0){
        JOptionPane.showMessageDialog(null, "Blank");   
       }else{
           st.setString(1, t1.getText());
           st.setString(2, t2.getText());
           st.setString(3, t3.getText());
           st.setString(4, t4.getText());
           st.executeUpdate();
           JOptionPane.showMessageDialog(null, "Successful");
           t1.setText(" ");
           t2.setText(" ");
           t3.setText(" ");
           t4.setText(" ");
           
           
       }
            
            
            
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_AddActionPerformed

    private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveActionPerformed
          String url="jdbc:derby://localhost:1527/C:/Derby/zen";
        String qu="delete from DATABASE where name=?";
        
        try{
            Connection con=DriverManager.getConnection(url);
            PreparedStatement t=con.prepareStatement(qu);
            
            
            if(t1.getText().length()<=0){
                
                 JOptionPane.showMessageDialog(null, "Blank");
            }else{
                t.setString(1, t1.getText());
                t.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Deleted");
                t1.setText(" ");
            }
        }catch(Exception e){
            
        }        
        
        
    }//GEN-LAST:event_RemoveActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
        String url="jdbc:derby://localhost:1527/C:/Derby/zen";
        String qu="update database set comname=?,type=?,employee=? where name=?";
        
        try{
            Connection con=DriverManager.getConnection(url);
            PreparedStatement t=con.prepareStatement(qu);
            if(t1.getText().length()<=0||t2.getText().length()<=0||t3.getText().length()<=0||t4.getText().length()<=0){
                JOptionPane.showMessageDialog(null, "Blank");
            }else{
                t.setString(1, t2.getText());
                t.setString(2, t3.getText());
                t.setString(3, t4.getText());
                t.setString(4, t1.getText());
                t.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Updated");
                t1.setText(" ");
                t2.setText(" ");
                t3.setText(" ");
                t4.setText(" ");
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.hide();
        HomeFrame hf1 = new HomeFrame();
        hf1.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
        
        String componentName = modelTable.getValueAt(table.getSelectedRow(), 1).toString();
        t1.setText(componentName);
        String PeripheralType = modelTable.getValueAt(table.getSelectedRow(), 2).toString();
        t3.setText(PeripheralType);
        String EmployeeName = modelTable.getValueAt(table.getSelectedRow(), 3).toString();
        t4.setText(EmployeeName);

        

    }//GEN-LAST:event_tableMouseClicked

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        report r=new report();
        r.show();
        dispose();
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        view v=new view();
        v.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Peripheral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peripheral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peripheral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peripheral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peripheral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Remove;
    private javax.swing.JButton Update;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
