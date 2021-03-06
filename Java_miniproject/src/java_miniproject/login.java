/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package java_miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author praty
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        student = new javax.swing.JRadioButton();
        teacher = new javax.swing.JRadioButton();
        Login = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        pemail = new javax.swing.JLabel();
        pemail1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 51, -1, -1));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel1.setText("STUDENT GRADING");
        jLabel1.setMaximumSize(new java.awt.Dimension(257, 240));
        jLabel1.setMinimumSize(new java.awt.Dimension(257, 240));
        jLabel1.setPreferredSize(new java.awt.Dimension(257, 240));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 240, 70));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel2.setText("SYSTEM");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 170, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 430));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordField1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(0, 204, 204));
        jPasswordField1.setBorder(null);
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 270, 30));

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 204, 204));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 270, 30));

        student.setBackground(new java.awt.Color(0, 0, 0));
        student.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        student.setForeground(new java.awt.Color(0, 204, 204));
        student.setText("Student login");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });
        jPanel3.add(student, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 210, 42));

        teacher.setBackground(new java.awt.Color(0, 0, 0));
        teacher.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        teacher.setForeground(new java.awt.Color(0, 204, 204));
        teacher.setText("Teacher login");
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });
        jPanel3.add(teacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 200, 50));

        Login.setBackground(new java.awt.Color(0, 204, 204));
        Login.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel3.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 140, 34));
        jPanel3.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        pemail.setBackground(new java.awt.Color(0, 204, 204));
        pemail.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        pemail.setForeground(new java.awt.Color(0, 204, 204));
        pemail.setText("Email:");
        jPanel3.add(pemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 80, 40));

        pemail1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        pemail1.setForeground(new java.awt.Color(0, 204, 204));
        pemail1.setText("Password:");
        jPanel3.add(pemail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 110, 40));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LOGIN PAGE");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 220, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 550, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        try{
        PreparedStatement pst=null;
        Connection con = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/new?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
        Statement st = con.createStatement();
        pst = con.prepareStatement("select * from logindet where Email=? and Password=?");
        
        pst.setString(1,jTextField2.getText());
        pst.setString(2,jPasswordField1.getText());
        
        ResultSet rs = pst.executeQuery();
        if(rs.next()){
            if(teacher.isSelected()){
            perform p = new perform();
            p.setVisible(true);
            setVisible(false);
            }
            else if(student.isSelected()){
                
                try{
                    DefaultTableModel tb = (DefaultTableModel)vr.jTable1.getModel(); 
                    tb.setRowCount(0);
                   
                    ResultSet r = st.executeQuery("select * from student");
                    while(r.next()){
                        String name = r.getString("name");
                        String roll = String.valueOf(r.getLong("rollno"));
                        String yos = r.getString("yearofstudy");
                        String ema = r.getString("email");
                        String tmark = String.valueOf(r.getInt("TotalMarks"));
                        String per = String.valueOf(r.getFloat("Percentage"));
                        String grade = r.getString("Grade");
                        String tdata[] = {name,roll,yos,ema,tmark,per,grade};
                        tb.addRow(tdata);
                    }
       
         
        con.close();
        } catch(Exception e){ System.out.println("ERROR"+ e); } 
                vr.setVisible(true);
                setVisible(false);
            }
        }
        else{
            JOptionPane.showMessageDialog(this,"EMAIL PASSWORD NOT MATCHED");
            jTextField2.setText(null);
            jTextField2.setText(null);
            jPasswordField1.setText(null);
        }
       
         
        con.close();
        } catch(Exception e){ System.out.println("ERROR"+ e); } 
    }//GEN-LAST:event_LoginActionPerformed

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        // TODO add your handling code here:
        if(teacher.isSelected()){
            student.setSelected(false);
        }
    }//GEN-LAST:event_teacherActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        // TODO add your handling code here:
        if(student.isSelected()){
            teacher.setSelected(false);
        }
    }//GEN-LAST:event_studentActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel pemail;
    private javax.swing.JLabel pemail1;
    private javax.swing.JRadioButton student;
    private javax.swing.JRadioButton teacher;
    // End of variables declaration//GEN-END:variables
}
