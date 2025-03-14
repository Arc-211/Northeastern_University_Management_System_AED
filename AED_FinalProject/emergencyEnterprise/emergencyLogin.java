/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package emergencyEnterprise;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import main.signUp;
import university.student;

/**
 *
 * @author Team AAJ
 */
public class emergencyLogin extends javax.swing.JFrame {

    /**
     * Creates new form emergencyLogin
     */
    public emergencyLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        selectEmerRole = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabelTitleEmergencyLogin = new javax.swing.JLabel();
        jLabelSymbolEmergencyLogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JTextField();
        btnPoliceBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        selectEmerRole.setForeground(new java.awt.Color(255, 255, 255));
        selectEmerRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Police", "Police Admin" }));
        selectEmerRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectEmerRoleActionPerformed(evt);
            }
        });
        jPanel1.add(selectEmerRole);
        selectEmerRole.setBounds(420, 470, 140, 23);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.setBorderPainted(false);
        jButton1.setMaximumSize(new java.awt.Dimension(76, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(76, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(76, 23));
        jButton1.setSize(new java.awt.Dimension(110, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 530, 110, 30);

        jLabelTitleEmergencyLogin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabelTitleEmergencyLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitleEmergencyLogin.setText("EMERGENCY LOGIN ");
        jPanel1.add(jLabelTitleEmergencyLogin);
        jLabelTitleEmergencyLogin.setBounds(320, 300, 250, 29);

        jLabelSymbolEmergencyLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/NUPD-login logo.png"))); // NOI18N
        jPanel1.add(jLabelSymbolEmergencyLogin);
        jLabelSymbolEmergencyLogin.setBounds(360, 20, 140, 190);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USERNAME:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 370, 90, 17);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PASSWORD:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(320, 420, 90, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ROLE:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 470, 72, 17);

        lblUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(lblUsername);
        lblUsername.setBounds(420, 370, 140, 23);
        jPanel1.add(lblPassword);
        lblPassword.setBounds(420, 420, 140, 23);

        btnPoliceBack.setBackground(new java.awt.Color(0, 0, 0));
        btnPoliceBack.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnPoliceBack.setForeground(new java.awt.Color(255, 255, 255));
        btnPoliceBack.setText("BACK");
        btnPoliceBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoliceBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnPoliceBack);
        btnPoliceBack.setBounds(30, 20, 72, 22);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/police login.jpeg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-70, 0, 1600, 940);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1606, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username = lblUsername.getText();
        String password = lblPassword.getText();
        String role = selectEmerRole.getSelectedItem().toString();
        
        
        if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter details correctly");
        return;
        }
        if(role.equals("Police")){
         try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String studentQuery = "SELECT * FROM universitysystem.police WHERE username = '"+username+"' and password = '"+password+"'";
            java.sql.ResultSet studentData = statement.executeQuery(studentQuery);
            
            if(!studentData.next()){
                JOptionPane.showMessageDialog(null,"Invalid Credentials");
            }
            
//            while(studentData.next()){
                else{
                String policeUName = studentData.getString("username");
                String name = capitalizeFirstLetter(studentData.getString("Name"));
                JOptionPane.showMessageDialog(null, "Welcome, " + name + "!");
                crimeAction pol = new crimeAction();
                pol.setName(policeUName);
                setVisible(false);
                pol.setVisible(true);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }   
        }else if(role.equals("Police Admin")){
            if(username.equals("POLADM") && password.equals("7890")){
                
                JOptionPane.showMessageDialog(null, "Welcome Admin");
                policeAdmin policeAdminObj = new policeAdmin();
                setVisible(false);
                policeAdminObj.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"Invalid Credentials");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private String capitalizeFirstLetter(String original) {
    if (original == null || original.length() == 0) {
        return original;
    }
    return original.substring(0, 1).toUpperCase() + original.substring(1).toLowerCase();
}
    private void btnPoliceBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoliceBackActionPerformed
        // TODO add your handling code here:
        signUp signUpObj = new signUp();
        setVisible(false);
        signUpObj.setVisible(true);
    }//GEN-LAST:event_btnPoliceBackActionPerformed

    private void lblUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblUsernameActionPerformed

    private void selectEmerRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectEmerRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectEmerRoleActionPerformed

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
            java.util.logging.Logger.getLogger(emergencyLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emergencyLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emergencyLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emergencyLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emergencyLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPoliceBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelSymbolEmergencyLogin;
    private javax.swing.JLabel jLabelTitleEmergencyLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lblPassword;
    private javax.swing.JTextField lblUsername;
    private javax.swing.JComboBox<String> selectEmerRole;
    // End of variables declaration//GEN-END:variables
}
