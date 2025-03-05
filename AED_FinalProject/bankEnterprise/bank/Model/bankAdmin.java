/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankEnterprise;

import bankEnterprise.bank.Model.bankEmployee;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Team AAJ
 */
public class bankAdmin extends javax.swing.JFrame {

    /**
     * Creates new form bankAdmin
     */
    public bankAdmin() {
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
        genderTxt = new javax.swing.JComboBox<>();
        phoneTxt = new javax.swing.JTextField();
        addTxt = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        viewBtn = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ageTxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        viewBtn1 = new javax.swing.JButton();
        btnStudLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        genderTxt.setForeground(new java.awt.Color(255, 255, 255));
        genderTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel1.add(genderTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 150, -1));
        jPanel1.add(phoneTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 150, -1));

        addTxt.setBackground(new java.awt.Color(0, 0, 0));
        addTxt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addTxt.setForeground(new java.awt.Color(255, 255, 255));
        addTxt.setText("ADD");
        addTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTxtActionPerformed(evt);
            }
        });
        jPanel1.add(addTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 440, 90, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("USERNAME:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("PASSWORD:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, -1));
        jPanel1.add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 150, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD BANK EMPLOYEE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 280, -1));
        jPanel1.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 150, -1));

        employeeTable.setBackground(new java.awt.Color(153, 153, 153));
        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Gender", "Phone", "Age"
            }
        ));
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 700, 190));

        viewBtn.setBackground(new java.awt.Color(0, 0, 0));
        viewBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        viewBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewBtn.setText("VIEW");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 90, -1));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/northeastern-university-student-financial-services-2-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, 69));

        updateBtn.setBackground(new java.awt.Color(0, 0, 0));
        updateBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 520, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("GENDER:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("NAME:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, 20));
        jPanel1.add(ageTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 150, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("PHONE:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, -1, -1));
        jPanel1.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 150, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("AGE:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        viewBtn1.setBackground(new java.awt.Color(0, 0, 0));
        viewBtn1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        viewBtn1.setForeground(new java.awt.Color(255, 255, 255));
        viewBtn1.setText("DELETE");
        viewBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(viewBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 560, 90, -1));

        btnStudLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnStudLogout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnStudLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnStudLogout.setText("LOGOUT");
        btnStudLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudLogoutActionPerformed(evt);
            }
        });
        jPanel1.add(btnStudLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FINANCE 2.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 1060));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
String EmployeeUsername = "";
    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
         DefaultTableModel profModel = (DefaultTableModel)employeeTable.getModel();
        String EnameTxt = employeeTable.getValueAt(employeeTable.getSelectedRow(), 0).toString();
        nameTxt.setText(employeeTable.getValueAt(employeeTable.getSelectedRow(), 0).toString());        
        genderTxt.setSelectedItem(employeeTable.getValueAt(employeeTable.getSelectedRow(), 1).toString());
        ageTxt.setText(employeeTable.getValueAt(employeeTable.getSelectedRow(), 2).toString());
        phoneTxt.setText(employeeTable.getValueAt(employeeTable.getSelectedRow(), 3).toString());



        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String profQuery = "SELECT * FROM universitysystem.bankemployee WHERE Name = '"+EnameTxt+"'";
            java.sql.ResultSet profData = statement.executeQuery(profQuery);
            while(profData.next()){
                EmployeeUsername = profData.getString("username");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         }
    }//GEN-LAST:event_employeeTableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
       DefaultTableModel profModel = (DefaultTableModel)employeeTable.getModel();

        String Name = nameTxt.getText();
        String Gender = (String) genderTxt.getSelectedItem();

        int age = Integer.parseInt(ageTxt.getText());
        int phone = Integer.parseInt(phoneTxt.getText());


        if(EmployeeUsername.isEmpty()){
            JOptionPane.showMessageDialog(null,"Employee name is empty");
        }else{
            try{
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
                java.sql.Statement statement = connection.createStatement();
            String profQuery = "UPDATE universitysystem.bankemployee SET Name = '"+Name+"', Gender = '"+Gender+"', Age = '"+age+"', Phone = '"+phone+"' WHERE username = '"+EmployeeUsername+"'";
            statement.executeUpdate(profQuery);
                JOptionPane.showMessageDialog(null,"Updated successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
}
    }//GEN-LAST:event_updateBtnActionPerformed

    
    
    
    
    
    
    
    private void addTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTxtActionPerformed
        // TODO add your handling code here:

        String name = nameTxt.getText();
        String gender = (String) genderTxt.getSelectedItem();
        int age = Integer.parseInt(ageTxt.getText());
        int phone = Integer.parseInt(phoneTxt.getText());

        String username = usernameTxt.getText();
        String password = passwordTxt.getText();



        if(usernameTxt.getText().isEmpty()|| nameTxt.getText().isEmpty()||ageTxt.getText().isEmpty()||passwordTxt.getText().isEmpty()           ){
            JOptionPane.showMessageDialog(null, "Plz Enter Details!");

        } else{

            // Community.CreateCommunity(house,person,community,city,hospital);
           // Bankemployee.CreateBankemployee(name,gender,age,phone,username,password);
           bankEmployee employee =  new bankEmployee(name,gender,age,phone,username,password);
               employee.addEmployee();
        }

        //JOptionPane.showMessageDialog(this,"New Employ details Added");

        genderTxt.setSelectedItem("");
        nameTxt.setText("");
        ageTxt.setText("");
        phoneTxt.setText("");
        usernameTxt.setText("");
        passwordTxt.setText("");


        //employee_table();
    }//GEN-LAST:event_addTxtActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
         DefaultTableModel tb1Model = (DefaultTableModel)employeeTable.getModel();
        tb1Model.setRowCount(0);
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String studentQuery = "SELECT * FROM universitysystem.bankemployee";
            java.sql.ResultSet studentData = statement.executeQuery(studentQuery);

            while(studentData.next()){
                String  name = studentData.getString("Name");
                String gender = studentData.getString("Gender");
                String phone = studentData.getString("Phone");
                String age = studentData.getString("Age");

                
                String tbData[] = {name, gender, phone,age};
                
                tb1Model.addRow(tbData);
            }
            
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
         }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void viewBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtn1ActionPerformed
        // TODO add your handling code here:
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
                
            statement.executeUpdate("DELETE FROM universitysystem.bankemployee WHERE username = '"+EmployeeUsername+"'");
            JOptionPane.showMessageDialog(null, "Employee Deleted !");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        nameTxt.setText("");
        phoneTxt.setText("");
        ageTxt.setText("");
    }//GEN-LAST:event_viewBtn1ActionPerformed

    private void btnStudLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudLogoutActionPerformed
        // TODO add your handling code here:
        financialLogin emergencyLoginObj = new financialLogin();
        setVisible(false);
        emergencyLoginObj.setVisible(true);
    }//GEN-LAST:event_btnStudLogoutActionPerformed

//    public void employee_table(){
//        try{
//            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
//            
//            System.out.println("connection open");
//            java.sql.Statement statement = connection.createStatement();
//            String sql = "SELECT * FROM universitysystem.bankemployee;";
//           // statement.executeUpdate("insert into hospitalsystem.login" + "(role, username, password)" + "values ('"+role+"','"+username+"', '"+password+"')");
//            //JOptionPane.showMessageDialog(null, "User successfully added!");
//            java.sql.ResultSet rs = statement.executeQuery(sql);
//            while(rs.next()){
//                String id = rs.getString("Id");
//                String name = rs.getString("Name");
//                String gender = rs.getString("Gender");
//                String age = rs.getString("Age");
//                String phone = rs.getString("Phone");
//                String salary = rs.getString("Salary");
//                String account = rs.getString("AccountType");
//
//                
//                
//                String tbData[] = {id,name,gender,age,phone,salary,account};
//                DefaultTableModel tb1Model = (DefaultTableModel)employeeTable.getModel();
//                
//                tb1Model.addRow(tbData);
//                 System.out.println("Ashish well done");
//                
//            }
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(null,"please add data in correct format!");
//    }                                 
//    }
    
    
    
    
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
            java.util.logging.Logger.getLogger(bankAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bankAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bankAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bankAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bankAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTxt;
    private javax.swing.JTextField ageTxt;
    private javax.swing.JButton btnStudLogout;
    private javax.swing.JTable employeeTable;
    private javax.swing.JComboBox<String> genderTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField phoneTxt;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField usernameTxt;
    private javax.swing.JButton viewBtn;
    private javax.swing.JButton viewBtn1;
    // End of variables declaration//GEN-END:variables
}
