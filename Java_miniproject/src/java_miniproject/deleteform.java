/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_miniproject;
import java.sql.*;  
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Pratyush
 */
public class deleteform extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public deleteform() {
        initComponents();
    }
    
    viewresult vr = new viewresult();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        nameo = new javax.swing.JLabel();
        rollnoo = new javax.swing.JLabel();
        yoso = new javax.swing.JLabel();
        emao = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ema = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        yos = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        roll = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(565, 620));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(nameo, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 237, 737, -1));
        getContentPane().add(rollnoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 243, 250, -1));
        getContentPane().add(yoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 278, 250, -1));
        getContentPane().add(emao, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 284, 250, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Roll No:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 100, 40));

        jButton5.setBackground(new java.awt.Color(0, 204, 204));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 100, 30));

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setText("Display");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 90, 30));

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 90, 30));
        jPanel1.add(ema, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 240, 30));

        jLabel42.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 255, 255));
        jLabel42.setText("Email:");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 100, 30));

        jLabel41.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(0, 255, 255));
        jLabel41.setText("Year of Study:");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 130, 50));

        yos.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(yos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 240, 30));

        jLabel40.setFont(new java.awt.Font("Trebuchet MS", 0, 20)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 255, 255));
        jLabel40.setText("Name:");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 80, 40));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 240, 30));

        search.setBackground(new java.awt.Color(0, 153, 153));
        search.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        search.setText("Enter");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 90, 30));

        roll.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollActionPerformed(evt);
            }
        });
        jPanel1.add(roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 240, 30));

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setText("Delete Student Info:");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 580, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_rollActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        name.setText(null);
        roll.setText(null);
        ema.setText(null);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      
       try{
        DefaultTableModel tb = (DefaultTableModel)vr.jTable1.getModel(); 
        tb.setRowCount(0);
        Connection con = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from student");
        
        while(rs.next()){
            String name = rs.getString("name");
            String roll = String.valueOf(rs.getLong("rollno"));
            String yos = rs.getString("yearofstudy");
            String ema = rs.getString("email");
            String tmark = String.valueOf(rs.getInt("TotalMarks"));
            String per = String.valueOf(rs.getFloat("Percentage"));
            String grade = rs.getString("Grade");
            
            String tdata[] = {name,roll,yos,ema,tmark,per,grade};
            
            tb.addRow(tdata);
            
            
        }
        vr.jTable1.setAutoCreateRowSorter(true);
       
         
        con.close();
        } catch(Exception e){ System.out.println("ERROR"+ e); } 
       
       vr.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
        PreparedStatement pst=null;
        Connection con = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
        pst = con.prepareStatement("delete from student where rollno=? ");
        long a = Long.parseLong(roll.getText());
        
        
        pst.setLong(1,a);
        
        
        
        int r = pst.executeUpdate();
        pst.close();
        con.close();
        JOptionPane.showMessageDialog(null,"RECORD DELETED");
        
        }catch(Exception e){ System.out.println("ERROR"+ e); } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try{
        Connection con = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
        Statement st = con.createStatement();
        long a = Long.parseLong(roll.getText());
        ResultSet rs = st.executeQuery("select * from student where rollno = '"+a+"'");
        
        if(rs.next()){
            name.setText(rs.getString(1));
            yos.setText(rs.getString(3));
            ema.setText(rs.getString(4));
     
        }
       
         
        con.close();
        } catch(Exception e){ System.out.println("ERROR"+ e); } 
        
    }//GEN-LAST:event_searchActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

  
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
            java.util.logging.Logger.getLogger(deleteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ema;
    private javax.swing.JLabel emao;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameo;
    private javax.swing.JTextField roll;
    private javax.swing.JLabel rollnoo;
    private javax.swing.JButton search;
    private javax.swing.JTextField yos;
    private javax.swing.JLabel yoso;
    // End of variables declaration//GEN-END:variables
}
