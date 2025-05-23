/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;


import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author TraderG
 */
public class LoginForm extends javax.swing.JFrame {
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPasswordField txtPassword;
    // Other components and logic
    public void reset() {
        txtUsername.setText("");
        txtPassword.setText("");
    }

   
    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
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

        BG = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Title2 = new javax.swing.JLabel();
        Title7 = new javax.swing.JLabel();
        Title9 = new javax.swing.JLabel();
        fldName = new javax.swing.JTextField();
        fldPass = new javax.swing.JPasswordField();
        btnconfirm = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        Title = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        Title3 = new javax.swing.JLabel();
        Title4 = new javax.swing.JLabel();
        Title6 = new javax.swing.JLabel();
        Title5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BG.setBackground(new java.awt.Color(0, 55, 119));
        BG.setMaximumSize(new java.awt.Dimension(1200, 700));
        BG.setPreferredSize(new java.awt.Dimension(1200, 700));

        Logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\TraderG\\Downloads\\PROJECTS\\BizPlatform\\icons\\Podio.png")); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\TraderG\\Downloads\\PROJECTS\\BizPlatform\\icons\\white-and-blue-abstract-background-210-700.png")); // NOI18N

        Title2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title2.setForeground(new java.awt.Color(0, 0, 0));
        Title2.setText("Login your Account");

        Title7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title7.setForeground(new java.awt.Color(0, 0, 0));
        Title7.setText("Name");

        Title9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title9.setForeground(new java.awt.Color(0, 0, 0));
        Title9.setText("PASSWORD");

        fldName.setBackground(new java.awt.Color(255, 255, 255));

        fldPass.setBackground(new java.awt.Color(255, 255, 255));

        btnconfirm.setBackground(new java.awt.Color(37, 86, 134));
        btnconfirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnconfirm.setForeground(new java.awt.Color(255, 255, 255));
        btnconfirm.setText("Sign Up");
        btnconfirm.setBorder(null);
        btnconfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Login");
        btnLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(Title2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Title7)
                            .addComponent(Title9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(Title2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Title7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Title9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Title.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("BizPlatform");

        Title1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("Welcom to");

        Title3.setForeground(new java.awt.Color(255, 255, 255));
        Title3.setText("BizPlatform is a comprehensive, desktop-based Business Management Platform designed to streamline core   ");

        Title4.setForeground(new java.awt.Color(255, 255, 255));
        Title4.setText("business operations, including inventory, sales, customer relationship management (CRM) employee");

        Title6.setForeground(new java.awt.Color(255, 255, 255));
        Title6.setText("management, financial tracking, and advanced analytics empowers small to medium-sized ");

        Title5.setForeground(new java.awt.Color(255, 255, 255));
        Title5.setText(" improve operational efficiency. enterprises (SMEs) to optimize workflows");

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("©BizPlatform copyright All Rights Reserved.");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(Title1))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(Logo))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Title3)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Title4))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(Title6))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(Title5))
                    .addGroup(BGLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel2)))
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Logo)
                .addGap(6, 6, 6)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(Title3)
                .addGap(6, 6, 6)
                .addComponent(Title4)
                .addGap(6, 6, 6)
                .addComponent(Title6)
                .addGap(6, 6, 6)
                .addComponent(Title5)
                .addGap(192, 192, 192)
                .addComponent(jLabel2))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        // TODO add your handling code here:
        // Create and show UserInterface
        UserInterface userInterface = new UserInterface();
        userInterface.setVisible(true);
    
        // Close the current LandingPage
        this.dispose();
    }//GEN-LAST:event_btnconfirmActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String username = fldName.getText().trim();
        String password = new String(fldPass.getPassword()).trim();

        // Validate input
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username and password are required!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Authenticate against MySQL
        try {
            String url = "jdbc:mysql://localhost:3306/business_management?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String dbPassword = "admin123";

            try (Connection conn = DriverManager.getConnection(url, user, dbPassword)) {
                String sql = "SELECT password, role FROM users WHERE username = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, username);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    String hashedPassword = rs.getString("password");
                    String role = rs.getString("role");

                    // Verify password
                    if (BCrypt.checkpw(password, hashedPassword)) {
                        JOptionPane.showMessageDialog(this, 
                            "Login successful! Welcome, " + role + "!", 
                            "Success", 
                            JOptionPane.INFORMATION_MESSAGE);
                        
                     
                        
                        // Open role-specific dashboard
                        try {
                            switch (role) {
                                case "Admin":
                                    System.out.println("Opening AdminDashboard");
                                    new AdminDashboard().setVisible(true);
                                    break;
                                case "Manager":
                                    System.out.println("Opening ManagerDashboard");
                                    new ManagerDashboard().setVisible(true);
                                    break;
                                case "Employee":
                                    System.out.println("Opening EmployeeDashboard");
                                    new EmployeeDashboard().setVisible(true);
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(this, 
                                        "Invalid role: " + role, 
                                        "Error", 
                                        JOptionPane.ERROR_MESSAGE);
                                    return;
                            }
                            dispose(); // Close login frame
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(this, 
                                "Error opening dashboard: " + ex.getMessage(), 
                                "Error", 
                                JOptionPane.ERROR_MESSAGE);
                            ex.printStackTrace();
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, 
                            "Invalid username or password!", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, 
                        "Invalid username or password!", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            String errorMsg = e.getMessage();
            if (errorMsg.contains("No suitable driver")) {
                errorMsg = "MySQL driver not found! Ensure MySQL Connector/J is included.";
            } else if (errorMsg.contains("Unknown database")) {
                errorMsg = "Database 'business_management' not found!";
            } else if (errorMsg.contains("Access denied")) {
                errorMsg = "Invalid database credentials!";
            }
            JOptionPane.showMessageDialog(this, "Database error: " + errorMsg, "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
        
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private javax.swing.JLabel Title5;
    private javax.swing.JLabel Title6;
    private javax.swing.JLabel Title7;
    private javax.swing.JLabel Title9;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnconfirm;
    private javax.swing.JTextField fldName;
    private javax.swing.JPasswordField fldPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
