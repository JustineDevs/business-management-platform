/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JFrame;

import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TraderG
 */
public class EmployeeDashboard extends javax.swing.JFrame {

    private int userId;

    /**
     * Creates new form Dashboard
     */
    public EmployeeDashboard() {
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
        btnLogout = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        TabbedPane = new javax.swing.JTabbedPane();
        tab1 = new javax.swing.JPanel();
        tab2 = new javax.swing.JPanel();
        tab3 = new javax.swing.JPanel();
        tab4 = new javax.swing.JPanel();
        tab5 = new javax.swing.JPanel();
        tab6 = new javax.swing.JPanel();
        btnUpdateCustomers = new javax.swing.JButton();
        btnViewTasks = new javax.swing.JButton();
        btnViewSales = new javax.swing.JButton();
        btnViewProducts = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        BG.setBackground(new java.awt.Color(0, 55, 119));
        BG.setMaximumSize(new java.awt.Dimension(1200, 700));
        BG.setPreferredSize(new java.awt.Dimension(1200, 700));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogout.setBackground(new java.awt.Color(0, 55, 119));
        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 0, 0));
        btnLogout.setIcon(new javax.swing.ImageIcon("C:\\Users\\TraderG\\Downloads\\PROJECTS\\BizPlatform\\icons\\Employee Profile.png")); // NOI18N
        btnLogout.setBorder(null);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        BG.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblWelcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcome.setText("Admin Dashboard");
        BG.add(lblWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        tab1.setBackground(new java.awt.Color(37, 86, 134));
        tab1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TabbedPane.addTab("tab1", tab1);

        tab2.setBackground(new java.awt.Color(255, 153, 0));
        tab2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TabbedPane.addTab("tab2", tab2);

        tab3.setBackground(new java.awt.Color(255, 153, 0));
        tab3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TabbedPane.addTab("tab3", tab3);

        tab4.setBackground(new java.awt.Color(255, 153, 0));
        tab4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TabbedPane.addTab("tab4", tab4);

        tab5.setBackground(new java.awt.Color(255, 153, 0));
        tab5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TabbedPane.addTab("tab5", tab5);

        tab6.setBackground(new java.awt.Color(255, 153, 0));
        tab6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TabbedPane.addTab("tab6", tab6);

        BG.add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, -37, 1020, 740));

        btnUpdateCustomers.setBackground(new java.awt.Color(37, 86, 134));
        btnUpdateCustomers.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateCustomers.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateCustomers.setText("Update Customers");
        btnUpdateCustomers.setBorder(null);
        btnUpdateCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCustomersActionPerformed(evt);
            }
        });
        BG.add(btnUpdateCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 140, 38));

        btnViewTasks.setBackground(new java.awt.Color(37, 86, 134));
        btnViewTasks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewTasks.setForeground(new java.awt.Color(255, 255, 255));
        btnViewTasks.setText("View Tasks");
        btnViewTasks.setBorder(null);
        btnViewTasks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewTasks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTasksActionPerformed(evt);
            }
        });
        BG.add(btnViewTasks, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 38));

        btnViewSales.setBackground(new java.awt.Color(37, 86, 134));
        btnViewSales.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewSales.setForeground(new java.awt.Color(255, 255, 255));
        btnViewSales.setText("View Sales");
        btnViewSales.setBorder(null);
        btnViewSales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSalesActionPerformed(evt);
            }
        });
        BG.add(btnViewSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, 38));

        btnViewProducts.setBackground(new java.awt.Color(37, 86, 134));
        btnViewProducts.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewProducts.setForeground(new java.awt.Color(255, 255, 255));
        btnViewProducts.setText("View Products");
        btnViewProducts.setBorder(null);
        btnViewProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProductsActionPerformed(evt);
            }
        });
        BG.add(btnViewProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 140, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, 703, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        System.out.println("Logout button clicked");
        int response = JOptionPane.showConfirmDialog(
            this,
            "Are you sure you want to logout?",
            "Logout Confirmation",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        if (response == JOptionPane.OK_OPTION) {
            System.out.println("Confirmed logout");
            LoginForm loginForm = new LoginForm();
            // loginForm.reset(); // Optional: Reset LoginForm fields
            loginForm.setVisible(true); // Show the original LoginForm
            this.dispose(); // Close the current dashboard
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnViewTasksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTasksActionPerformed
        // TODO add your handling code here:
        tab1.removeAll();
    tab1.setLayout(new BorderLayout());

    String[] columns = {"ID", "Description", "Status", "Created At"};
    DefaultTableModel model = new DefaultTableModel(columns, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return column == 2; // Only status column is editable
        }
    };
    JTable table = new JTable(model);
    JComboBox<String> statusCombo = new JComboBox<>(new String[]{"Pending", "In Progress", "Completed"});
    table.getColumnModel().getColumn(2).setCellEditor(new DefaultCellEditor(statusCombo));
    JScrollPane scrollPane = new JScrollPane(table);
    tab1.add(scrollPane, BorderLayout.CENTER);

    // Load tasks
    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(
             "SELECT task_id, description, status, created_at FROM tasks WHERE assigned_to = ?")) {
        pstmt.setInt(1, userId);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("task_id"),
                rs.getString("description"),
                rs.getString("status"),
                rs.getTimestamp("created_at")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading tasks: " + e.getMessage());
    }

    // Update status on cell edit
    table.getModel().addTableModelListener(e -> {
        if (e.getType() == javax.swing.event.TableModelEvent.UPDATE) {
            int row = e.getFirstRow();
            int taskId = (Integer) model.getValueAt(row, 0);
            String newStatus = (String) model.getValueAt(row, 2);
            try (Connection conn = DatabaseConnection.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(
                     "UPDATE tasks SET status = ? WHERE task_id = ? AND assigned_to = ?")) {
                pstmt.setString(1, newStatus);
                pstmt.setInt(2, taskId);
                pstmt.setInt(3, userId);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Task status updated!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error updating task: " + ex.getMessage());
            }
        }
    });

    TabbedPane.setSelectedIndex(0); // Show tab1
    tab1.revalidate();
    tab1.repaint();
    }//GEN-LAST:event_btnViewTasksActionPerformed

    private void btnUpdateCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCustomersActionPerformed
        // TODO add your handling code here:
        tab4.removeAll();
    tab4.setLayout(new java.awt.BorderLayout());

    String[] columns = {"ID", "Name", "Email", "Phone", "Created At"};
    DefaultTableModel model = new DefaultTableModel(columns, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return column == 2 || column == 3; // Email and Phone are editable
        }
    };
    JTable table = new JTable(model);
    JScrollPane scrollPane = new JScrollPane(table);

    try (Connection conn = DatabaseConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM customers")) {
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("customer_id"),
                rs.getString("name"),
                rs.getString("email"),
                rs.getString("phone"),
                rs.getTimestamp("created_at")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading customers: " + e.getMessage());
    }

    table.getModel().addTableModelListener(e -> {
        if (e.getType() == javax.swing.event.TableModelEvent.UPDATE) {
            int row = e.getFirstRow();
            int customerId = (Integer) model.getValueAt(row, 0);
            String newEmail = (String) model.getValueAt(row, 2);
            String newPhone = (String) model.getValueAt(row, 3);
            try (Connection conn = DatabaseConnection.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(
                     "UPDATE customers SET email = ?, phone = ? WHERE customer_id = ?")) {
                pstmt.setString(1, newEmail);
                pstmt.setString(2, newPhone);
                pstmt.setInt(3, customerId);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Customer updated!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error updating customer: " + ex.getMessage());
            }
        }
    });

    tab4.add(scrollPane, BorderLayout.CENTER);
    TabbedPane.setSelectedIndex(3); // Show tab4
    tab4.revalidate();
    tab4.repaint();
    }//GEN-LAST:event_btnUpdateCustomersActionPerformed

    private void btnViewSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSalesActionPerformed
        // TODO add your handling code here:
        tab3.removeAll();
    tab3.setLayout(new java.awt.BorderLayout());

    String[] columns = {"ID", "Product", "Customer", "Quantity", "Total", "Date", "Status"};
    DefaultTableModel model = new DefaultTableModel(columns, 0);
    JTable table = new JTable(model);
    table.setEnabled(false); // Read-only
    JScrollPane scrollPane = new JScrollPane(table);

    try (Connection conn = DatabaseConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(
             "SELECT s.sale_id, p.name AS product_name, c.name AS customer_name, " +
             "s.quantity, s.total, s.sale_date, s.status " +
             "FROM sales s " +
             "JOIN products p ON s.product_id = p.product_id " +
             "JOIN customers c ON s.customer_id = c.customer_id")) {
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("sale_id"),
                rs.getString("product_name"),
                rs.getString("customer_name"),
                rs.getInt("quantity"),
                rs.getDouble("total"),
                rs.getTimestamp("sale_date"),
                rs.getString("status")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading sales: " + e.getMessage());
    }

    tab3.add(scrollPane, BorderLayout.CENTER);
    TabbedPane.setSelectedIndex(2); // Show tab3
    tab3.revalidate();
    tab3.repaint();
    }//GEN-LAST:event_btnViewSalesActionPerformed

    private void btnViewProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProductsActionPerformed
        // TODO add your handling code here:
        tab2.removeAll();
    tab2.setLayout(new java.awt.BorderLayout());

    String[] columns = {"ID", "Name", "Price", "Stock", "Created At"};
    DefaultTableModel model = new DefaultTableModel(columns, 0);
    JTable table = new JTable(model);
    table.setEnabled(false); // Read-only
    JScrollPane scrollPane = new JScrollPane(table);

    try (Connection conn = DatabaseConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery("SELECT * FROM products")) {
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("product_id"),
                rs.getString("name"),
                rs.getDouble("price"),
                rs.getInt("stock"),
                rs.getTimestamp("created_at")
            });
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading products: " + e.getMessage());
    }

    tab2.add(scrollPane, BorderLayout.CENTER);
    TabbedPane.setSelectedIndex(1); // Show tab2
    tab2.revalidate();
    tab2.repaint();
    }//GEN-LAST:event_btnViewProductsActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnUpdateCustomers;
    private javax.swing.JButton btnViewProducts;
    private javax.swing.JButton btnViewSales;
    private javax.swing.JButton btnViewTasks;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JPanel tab3;
    private javax.swing.JPanel tab4;
    private javax.swing.JPanel tab5;
    private javax.swing.JPanel tab6;
    // End of variables declaration//GEN-END:variables
}
