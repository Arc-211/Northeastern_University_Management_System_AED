/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package university;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import university.Model.Professor;
import university.Model.Student;

/**
 *
 * @author Team AAJ
 */
public class staffAdmin extends javax.swing.JFrame {

    /**
     * Creates new form staffAdmin
     */
    public staffAdmin(){
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtStudName = new javax.swing.JTextField();
        txtStudPassword = new javax.swing.JTextField();
        txtStudUsername = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStud = new javax.swing.JTable();
        addStudents = new javax.swing.JButton();
        btnUpdateStud = new javax.swing.JButton();
        btnStudDelete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtStudMail = new javax.swing.JTextField();
        txtStudAge = new javax.swing.JTextField();
        btnStudView = new javax.swing.JButton();
        jLabelLogoAddstudents = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProfPassword = new javax.swing.JTextField();
        txtProfName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnProfDelete = new javax.swing.JButton();
        txtProfUsername = new javax.swing.JTextField();
        btnAddProf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProf = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtProfMail = new javax.swing.JTextField();
        txtProfAge = new javax.swing.JTextField();
        btnProfView = new javax.swing.JButton();
        txtSubTeach = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnUniAdminLogout = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabelLogoActionpage = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(153, 0, 0));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("ADD STUDENTS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("NAME:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("PASSWORD:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("USERNAME:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, -1, -1));

        txtStudName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtStudName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 140, -1));
        jPanel2.add(txtStudPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 160, 130, -1));
        jPanel2.add(txtStudUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 130, -1));

        tblStud.setBackground(new java.awt.Color(153, 0, 0));
        tblStud.setForeground(new java.awt.Color(255, 255, 255));
        tblStud.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Subject Taken", "Email", "Age"
            }
        ));
        tblStud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblStud);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 780, 180));

        addStudents.setBackground(new java.awt.Color(0, 0, 0));
        addStudents.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addStudents.setForeground(new java.awt.Color(255, 255, 255));
        addStudents.setText("ADD");
        addStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentsActionPerformed(evt);
            }
        });
        jPanel2.add(addStudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 450, -1, -1));

        btnUpdateStud.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdateStud.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpdateStud.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateStud.setText("UPDATE");
        btnUpdateStud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStudActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpdateStud, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, -1, -1));

        btnStudDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnStudDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnStudDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnStudDelete.setText("DELETE");
        btnStudDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("AGE:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("EMAIL ID:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        txtStudMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudMailActionPerformed(evt);
            }
        });
        jPanel2.add(txtStudMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 140, 20));
        jPanel2.add(txtStudAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 140, -1));

        btnStudView.setBackground(new java.awt.Color(0, 0, 0));
        btnStudView.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnStudView.setForeground(new java.awt.Color(255, 255, 255));
        btnStudView.setText("VIEW");
        btnStudView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudViewActionPerformed(evt);
            }
        });
        jPanel2.add(btnStudView, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, -1, -1));

        jLabelLogoAddstudents.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Northeastern_University_Logo-White.png"))); // NOI18N
        jPanel2.add(jLabelLogoAddstudents, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 19, 120, 116));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/university background image.jpeg"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 990));

        jTabbedPane1.addTab("Students", jPanel2);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("ADD PROFESSOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 210, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("NAME:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("SUBJECT TEACHING:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("PASSWORD:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("USERNAME:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, -1, -1));
        jPanel1.add(txtProfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 170, -1));
        jPanel1.add(txtProfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 178, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, -1));

        btnProfDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnProfDelete.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnProfDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnProfDelete.setText("DELETE");
        btnProfDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnProfDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, -1, -1));
        jPanel1.add(txtProfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 60, 170, -1));

        btnAddProf.setBackground(new java.awt.Color(0, 0, 0));
        btnAddProf.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnAddProf.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProf.setText("ADD");
        btnAddProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProfActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddProf, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        tblProf.setBackground(new java.awt.Color(153, 0, 0));
        tblProf.setForeground(new java.awt.Color(255, 255, 255));
        tblProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Subject Teaching", "Age", "Email"
            }
        ));
        tblProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProfMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProf);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 750, 150));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("AGE:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("EMAIL ID:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));
        jPanel1.add(txtProfMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 178, -1));

        txtProfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfAgeActionPerformed(evt);
            }
        });
        jPanel1.add(txtProfAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 140, 170, -1));

        btnProfView.setBackground(new java.awt.Color(0, 0, 0));
        btnProfView.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        btnProfView.setForeground(new java.awt.Color(255, 255, 255));
        btnProfView.setText("VIEW");
        btnProfView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfViewActionPerformed(evt);
            }
        });
        jPanel1.add(btnProfView, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 370, -1, -1));

        txtSubTeach.setForeground(new java.awt.Color(255, 255, 255));
        txtSubTeach.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Web Design", "AED", "DMDD", "PSA" }));
        jPanel1.add(txtSubTeach, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 180, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/university background image.jpeg"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 940));

        jTabbedPane1.addTab("Professors", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUniAdminLogout.setBackground(new java.awt.Color(0, 0, 0));
        btnUniAdminLogout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUniAdminLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnUniAdminLogout.setText("LOGOUT");
        btnUniAdminLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniAdminLogoutActionPerformed(evt);
            }
        });
        jPanel3.add(btnUniAdminLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 270, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Want to end the current session?");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, -1, -1));

        jLabelLogoActionpage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo_Northeastern-University-300x222.png"))); // NOI18N
        jPanel3.add(jLabelLogoActionpage, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, -1, 89));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/university/university background image.jpeg"))); // NOI18N
        jLabel17.setText("jLabel17");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 600));

        jTabbedPane1.addTab("Action", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    public class Students{
        public static void createStudents(String name, String subjectTaken, String email, int age, String studUsername, String studPassword){
            try{
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
                java.sql.Statement statement = connection.createStatement();
                
                statement.executeUpdate("insert into universitysystem.students" + "(Name, SubjectTaken, Email, Age, username, password)" + "values ('"+name+"','"+subjectTaken+"', '"+email+"', '"+age+"', '"+studUsername+"', '"+studPassword+"')");
                JOptionPane.showMessageDialog(null, "Student successfully added!");
            }catch(Exception e){
                 System.out.println(e);
                 JOptionPane.showMessageDialog(null,"please add data in correct format!");
            }
        }
    }
    
    private void addStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentsActionPerformed
        // TODO add your handling code here:
        String name = txtStudName.getText();
        String subjectTaken = "xyz";
        String email = txtStudMail.getText();
        int age = Integer.parseInt(txtStudAge.getText());
        String studUsername = txtStudUsername.getText();
        String studPassword = txtStudPassword.getText();
        
        if(name.isEmpty()|| subjectTaken.isEmpty()|| email.isEmpty()||studUsername.isEmpty() || age == 0 || studPassword.isEmpty()){
                 JOptionPane.showMessageDialog(null, "Plz Enter Details!");
        }else{
            Students.createStudents(name, subjectTaken, email, age, studUsername, studPassword);
        }
        
        txtStudName.setText("");
        txtStudMail.setText("");
        txtStudAge.setText("");
        txtStudUsername.setText("");
        txtStudPassword.setText("");
        
        
//        String profname = txtProfName.getText();
//        String subjectTeach = txtSubTeach.getSelectedItem().toString();
//        String profEmail = txtProfMail.getText();
//        int profAge = Integer.parseInt(txtProfAge.getText());
//        String profUsername = txtProfUsername.getText();
//        String profPassword = txtProfPassword.getText();
//
//        if(profname.isEmpty()|| subjectTeach.isEmpty()|| profEmail.isEmpty()|| profAge == 0 || profUsername.isEmpty() || profPassword.isEmpty()){
//            JOptionPane.showMessageDialog(null, "Plz Enter Details!");
//        }else{
//            Professor professor = new Professor(profname, subjectTeach, profEmail, profAge, profUsername, profPassword);
//            professor.addProfessor();
//
//        }
//
//        txtProfName.setText("");
//        //        txtSubTeach.setText("");
//        txtProfMail.setText("");
//        txtProfAge.setText("");
//        txtProfUsername.setText("");
//        txtProfPassword.setText("");
        
        
    }//GEN-LAST:event_addStudentsActionPerformed

    private void btnStudViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudViewActionPerformed
        // TODO add your handling code here:
        DefaultTableModel studModel = (DefaultTableModel)tblStud.getModel();
        studModel.setRowCount(0);
        
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String studentQuery = "SELECT * FROM universitysystem.students";
            java.sql.ResultSet studentData = statement.executeQuery(studentQuery);

            while(studentData.next()){
                String studName = studentData.getString("Name");
                String subject = studentData.getString("SubjectTaken");
                String email = studentData.getString("Email");
                String age = studentData.getString("Age");
                
                String tbData[] = {studName,subject, email, age};
                
                studModel.addRow(tbData);
            }
            
         }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         }
    }//GEN-LAST:event_btnStudViewActionPerformed

    private void btnUpdateStudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStudActionPerformed
        // TODO add your handling code here:
        DefaultTableModel studModel = (DefaultTableModel)tblStud.getModel();
        studModel.setRowCount(0);
        
        String studName = txtStudName.getText();
        String subjectTaken = "xyz";
        String studMail = txtStudMail.getText();
        int age = Integer.parseInt(txtStudAge.getText());
        
        if(studUsername.isEmpty()){
            JOptionPane.showMessageDialog(null,"Student name is empty");
        }else{
            try{
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
                java.sql.Statement statement = connection.createStatement();
                String profQuery = "UPDATE universitysystem.students SET Name = '"+studName+"', subjectTaken = '"+subjectTaken+"', Email = '"+studMail+"', Age = '"+age+"' WHERE username = '"+studUsername+"'";
                statement.executeUpdate(profQuery);
                JOptionPane.showMessageDialog(null,"Updated successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
//        if(profModel.getRowCount() == 1){
//            String name = txtProfName.getText();
//            System.out.println(name);
//        }
    }//GEN-LAST:event_btnUpdateStudActionPerformed
    String profUserame = "";    
    String studUsername = "";
    private void tblStudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudMouseClicked
        // TODO add your handling code here:
        DefaultTableModel studModel = (DefaultTableModel)tblStud.getModel();
        String studNameTxt = tblStud.getValueAt(tblStud.getSelectedRow(), 0).toString();
        txtStudName.setText(tblStud.getValueAt(tblStud.getSelectedRow(), 0).toString());        
        txtStudMail.setText(tblStud.getValueAt(tblStud.getSelectedRow(), 2).toString());
        txtStudAge.setText(tblStud.getValueAt(tblStud.getSelectedRow(), 3).toString());
        
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String studQuery = "SELECT * FROM universitysystem.students WHERE Name = '"+studNameTxt+"'";
            java.sql.ResultSet studData = statement.executeQuery(studQuery);
            while(studData.next()){
                studUsername = studData.getString("username");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_tblStudMouseClicked

    private void btnStudDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudDeleteActionPerformed
        // TODO add your handling code here:
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
                
            statement.executeUpdate("DELETE FROM universitysystem.students WHERE username = '"+studUsername+"'");
            JOptionPane.showMessageDialog(null, "Student Deleted added!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
        txtProfName.setText("");
        txtProfMail.setText("");
        txtProfAge.setText("");
    }//GEN-LAST:event_btnStudDeleteActionPerformed

    private void btnUniAdminLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUniAdminLogoutActionPerformed
        // TODO add your handling code here:
        uniLogin uniLoginObj = new uniLogin();
        setVisible(false);
        uniLoginObj.setVisible(true);
    }//GEN-LAST:event_btnUniAdminLogoutActionPerformed

    private void btnProfViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfViewActionPerformed
        // TODO add your handling code here:
        DefaultTableModel profModel = (DefaultTableModel)tblProf.getModel();
        profModel.setRowCount(0);

        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String profQuery = "SELECT * FROM universitysystem.professors";
            java.sql.ResultSet profData = statement.executeQuery(profQuery);

            while(profData.next()){
                String profName = profData.getString("Name");
                String subject = profData.getString("SubjectTeach");
                String email = profData.getString("Email");
                int age = profData.getInt("Age");

                Object tbData[] = {profName,subject, email, age};

                profModel.addRow(tbData);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnProfViewActionPerformed

    private void tblProfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProfMouseClicked
        // TODO add your handling code here:
        DefaultTableModel profModel = (DefaultTableModel)tblProf.getModel();
        String profNameTxt = tblProf.getValueAt(tblProf.getSelectedRow(), 0).toString();
        txtProfName.setText(tblProf.getValueAt(tblProf.getSelectedRow(), 0).toString());
        txtSubTeach.setSelectedItem(tblProf.getValueAt(tblProf.getSelectedRow(), 1));
        txtProfMail.setText(tblProf.getValueAt(tblProf.getSelectedRow(), 2).toString());
        txtProfAge.setText(tblProf.getValueAt(tblProf.getSelectedRow(), 3).toString());

        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();
            String profQuery = "SELECT * FROM universitysystem.professors WHERE Name = '"+profNameTxt+"'";
            java.sql.ResultSet profData = statement.executeQuery(profQuery);
            while(profData.next()){
                profUserame = profData.getString("username");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_tblProfMouseClicked

    private void btnAddProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProfActionPerformed
        // TODO add your handling code here:
        String profname = txtProfName.getText();
        String subjectTeach = txtSubTeach.getSelectedItem().toString();
        String profEmail = txtProfMail.getText();
        int profAge = Integer.parseInt(txtProfAge.getText());
        String profUsername = txtProfUsername.getText();
        String profPassword = txtProfPassword.getText();

        if(profname.isEmpty()|| subjectTeach.isEmpty()|| profEmail.isEmpty()|| profAge == 0 || profUsername.isEmpty() || profPassword.isEmpty()){
            JOptionPane.showMessageDialog(null, "Plz Enter Details!");
        }else{
            Professor professor = new Professor(profname, subjectTeach, profEmail, profAge, profUsername, profPassword);
            professor.addProfessor();

        }

        txtProfName.setText("");
        //        txtSubTeach.setText("");
        txtProfMail.setText("");
        txtProfAge.setText("");
        txtProfUsername.setText("");
        txtProfPassword.setText("");
    }//GEN-LAST:event_btnAddProfActionPerformed

    private void btnProfDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfDeleteActionPerformed
        // TODO add your handling code here:
        try{
            java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
            java.sql.Statement statement = connection.createStatement();

            statement.executeUpdate("DELETE FROM universitysystem.professors WHERE username = '"+profUserame+"'");
            JOptionPane.showMessageDialog(null, "Professors Deleted added!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }

        txtProfName.setText("");
        txtProfMail.setText("");
        txtProfAge.setText("");
    }//GEN-LAST:event_btnProfDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel profModel = (DefaultTableModel)tblProf.getModel();
        String profName = txtProfName.getText();
        String subjectTeach = txtSubTeach.getSelectedItem().toString();
        String profMail = txtProfMail.getText();
        int age = Integer.parseInt(txtProfAge.getText());

        if(profUserame.isEmpty()){
            JOptionPane.showMessageDialog(null,"Professor name is empty");
        }else{
            try{
                java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitysystem", "root", "user@1234");
                java.sql.Statement statement = connection.createStatement();
                String profQuery = "UPDATE universitysystem.professors SET Name = '"+profName+"', subjectTeach = '"+subjectTeach+"', Email = '"+profMail+"', Age = '"+age+"' WHERE username = '"+profUserame+"'";
                statement.executeUpdate(profQuery);
                JOptionPane.showMessageDialog(null,"Updated successfully");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }

        txtProfName.setText("");
        txtProfMail.setText("");
        txtProfAge.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtProfAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfAgeActionPerformed

    private void txtStudNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudNameActionPerformed

    private void txtStudMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudMailActionPerformed

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
            java.util.logging.Logger.getLogger(staffAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staffAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staffAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staffAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staffAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudents;
    private javax.swing.JButton btnAddProf;
    private javax.swing.JButton btnProfDelete;
    private javax.swing.JButton btnProfView;
    private javax.swing.JButton btnStudDelete;
    private javax.swing.JButton btnStudView;
    private javax.swing.JButton btnUniAdminLogout;
    private javax.swing.JButton btnUpdateStud;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLogoActionpage;
    private javax.swing.JLabel jLabelLogoAddstudents;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblProf;
    private javax.swing.JTable tblStud;
    private javax.swing.JTextField txtProfAge;
    private javax.swing.JTextField txtProfMail;
    private javax.swing.JTextField txtProfName;
    private javax.swing.JTextField txtProfPassword;
    private javax.swing.JTextField txtProfUsername;
    private javax.swing.JTextField txtStudAge;
    private javax.swing.JTextField txtStudMail;
    private javax.swing.JTextField txtStudName;
    private javax.swing.JTextField txtStudPassword;
    private javax.swing.JTextField txtStudUsername;
    private javax.swing.JComboBox<String> txtSubTeach;
    // End of variables declaration//GEN-END:variables
}
