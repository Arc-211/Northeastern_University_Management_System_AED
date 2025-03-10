/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pharmacy;

/**
 *
 * @author Team AAJ
 */


import Pharmacy.model.EmployeeModel;
import com.mysql.cj.xdevapi.Statement;
import com.sun.jdi.connect.spi.Connection;
//import java.sql.Connection;
//import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import connection.JDBCconnection;
//import hospital.model.Patient;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.signUp;
import university.Model.Student;
import university.student;

public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    public Employee() {
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicine = new javax.swing.JTable();
        btnViewMedicine = new javax.swing.JButton();
        btnBuy = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblMed = new javax.swing.JTextField();
        lblPrice = new javax.swing.JTextField();
        lblQuant = new javax.swing.JTextField();
        lblCompany = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMedTaken = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEDICINE AVAILABLE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 440, -1));

        tblMedicine.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MEDICINE_NAME", "PRICE", "QUANTITY", "COMPANY"
            }
        ));
        tblMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMedicine);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 500, 320));

        btnViewMedicine.setBackground(new java.awt.Color(0, 0, 0));
        btnViewMedicine.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewMedicine.setForeground(new java.awt.Color(255, 255, 255));
        btnViewMedicine.setText("VIEW");
        btnViewMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMedicineActionPerformed(evt);
            }
        });
        jPanel1.add(btnViewMedicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, -1, -1));

        btnBuy.setBackground(new java.awt.Color(0, 0, 0));
        btnBuy.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBuy.setForeground(new java.awt.Color(255, 255, 255));
        btnBuy.setText("BUY");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 580, 90, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("MEDICINE NAME:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("PRICE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, 95, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("QUANTITY:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 340, 95, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("COMPANY:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, 80, -1));
        jPanel1.add(lblMed, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 260, 190, -1));
        jPanel1.add(lblPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 300, 190, -1));

        lblQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblQuantActionPerformed(evt);
            }
        });
        jPanel1.add(lblQuant, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 340, 190, -1));
        jPanel1.add(lblCompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 380, 190, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 30));

        tblMedTaken.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(tblMedTaken);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 510, 370, 130));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("VIEW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 650, 100, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("MEDICINE TAKEN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 480, 170, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pharmacy/Medicine manage page.jpeg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 1920, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String currStudUsername = "";
    public void setUsername(String studUsername){
        currStudUsername = studUsername;
    }
    
    private void btnViewMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMedicineActionPerformed
        // TODO add your handling code here:  
        DefaultTableModel medModel = (DefaultTableModel)tblMedicine.getModel();
        medModel.setRowCount(0);
        
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String getMedQuery = "SELECT * FROM universitysystem.medicine";
            java.sql.ResultSet medData = statement.executeQuery(getMedQuery);
            
            while(medData.next()){
                String medName = medData.getString("MEDICINE_NAME");
                String price = medData.getString("PRICE");
                String quantity = medData.getString("QUANTITY");
                String company = medData.getString("COMPANY");
                
                String tbData[] = {medName,price, quantity, company};
                
                medModel.addRow(tbData);
            }
            
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         }
    }//GEN-LAST:event_btnViewMedicineActionPerformed

    int currentSelectedCount = 0;
    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        // TODO add your handling code here:
        String medName = lblMed.getText();
        String medPrice = lblPrice.getText();
        int medQuant = Integer.parseInt(lblQuant.getText());
        String medComp = lblCompany.getText();
        if(medQuant > currentSelectedCount){
            JOptionPane.showMessageDialog(null,"Not enough Quantity");
        }else{
            try{
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
                java.sql.Statement statement = connection.createStatement();
//                statement.executeUpdate("UPDATE universitysystem.students SET medicineTaken = '"+medName+"', medicineQuant = medicineQuant + '"+medQuant+"' where username ='"+currStudUsername+"'");
                statement.executeUpdate("UPDATE universitysystem.students SET medicine = '"+medName+"', quantity = quantity + '"+medQuant+"' where username ='"+currStudUsername+"'");
                statement.executeUpdate("UPDATE universitysystem.medicine SET QUANTITY = QUANTITY - '"+medQuant+"'");
                JOptionPane.showMessageDialog(null,"Thank you for Purchase");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_btnBuyActionPerformed

    private void tblMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicineMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tb1Model = (DefaultTableModel)tblMedicine.getModel();
        
        String medName = tb1Model.getValueAt(tblMedicine.getSelectedRow(),0).toString();
        String price = tb1Model.getValueAt(tblMedicine.getSelectedRow(),1).toString();
        String quant = tb1Model.getValueAt(tblMedicine.getSelectedRow(),2).toString();
        String comp = tb1Model.getValueAt(tblMedicine.getSelectedRow(),3).toString();
       
        currentSelectedCount = Integer.parseInt(quant);
        lblMed.setText(medName);
        lblPrice.setText(price);
        lblQuant.setText(quant);
        lblCompany.setText(comp);
    }//GEN-LAST:event_tblMedicineMouseClicked

    private void lblQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblQuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblQuantActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        signUp stud = new signUp();
        setVisible(false);
        stud.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel medModel = (DefaultTableModel)tblMedTaken.getModel();
        medModel.setRowCount(0);
        
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String getMedQuery = "SELECT * FROM universitysystem.students where username = '"+currStudUsername+"'";
            java.sql.ResultSet medData = statement.executeQuery(getMedQuery);
            
            while(medData.next()){
                String medName = medData.getString("medicine");
                String quantity = medData.getString("quantity");
                
                String tbData[] = {medName,quantity};
                
                medModel.addRow(tbData);
            }
            
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnViewMedicine;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lblCompany;
    private javax.swing.JTextField lblMed;
    private javax.swing.JTextField lblPrice;
    private javax.swing.JTextField lblQuant;
    private javax.swing.JTable tblMedTaken;
    private javax.swing.JTable tblMedicine;
    // End of variables declaration//GEN-END:variables
}
