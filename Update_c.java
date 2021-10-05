package MyProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public final class Update_c extends javax.swing.JFrame {

    Object data;
    DefaultTableModel model;
    Connection con;
    PreparedStatement pst;
    ResultSet r;

    public Update_c() {
        initComponents();
        C();
        quirey_c();
    }
// Table for c_unit

    public void C() {
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Student Name");
        model.addColumn("Course_fee");
        model.addColumn("Total_payment");
        model.addColumn("Due");
        model.addColumn("Bangla");
        model.addColumn("English");
        model.addColumn("Management");
        model.addColumn("Accounting");
        model.addColumn("Markating");
        model.addColumn("Grade");
        table.setModel(model);

    }

    // Quirey for c_unit
    public void quirey_c() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_project", "root", "idb122292");
            pst = con.prepareStatement("select * from c_unit");
            r = pst.executeQuery();
            model.setRowCount(0);
            while (r.next()) {
                data = new Object[]{
                    r.getInt(1), r.getString(2), r.getString(17), r.getString(9),
                    r.getString(10), r.getString(11), r.getString(12), r.getString(13), r.getString(14), r.getString(15), r.getString(16)};
                model.addRow((Object[]) data);

            }

            pst.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void update_c() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_project", "root", "idb122292");
            pst = con.prepareStatement("update c_unit set bangla=?, english=?, management=?,"
                    + " accounting=?, markating=?, grade=?,course_fee=?,cash_payment=?,due=? where id=?");
            pst.setString(1, cbangla.getText());
            pst.setString(2, cenglish.getText());
            pst.setString(3, management.getText());
            pst.setString(4, accounting.getText());
            pst.setString(5, markating.getText());
            pst.setString(6, cgrade.getText());
            pst.setString(7, course_fee.getText());
            pst.setString(8, tpayment.getText());
            pst.setString(9, due.getText());

            pst.setInt(10, Integer.parseInt(cid.getText()));
            pst.executeUpdate();

            pst.executeUpdate();
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }

    public void delete_c() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_project", "root", "idb122292");
            pst = con.prepareStatement("delete from c_unit where Id=?");

            pst.setInt(1, Integer.parseInt(cid.getText()));
            pst.executeUpdate();
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }

    public void mouseClickedOnTable_c() {
        cid.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 0)));
        course_fee.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 2)));
        tpayment.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 3)));
        due.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 4)));
        cbangla.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 5)));
        cenglish.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 6)));
        management.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 7)));
        accounting.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 8)));
        markating.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 9)));
        cgrade.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 10)));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        unita = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        unitb = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cid = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cenglish = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        management = new javax.swing.JTextField();
        cgrade = new javax.swing.JTextField();
        cbangla = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        accounting = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        markating = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        diposit = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        course_fee = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tpayment = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        due = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update C_unit\n");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/previousIcon.jpg"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 945, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        unita.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        unita.setForeground(new java.awt.Color(0, 102, 51));
        unita.setText("Unit-A");
        unita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unitaMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Unit-C");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        unitb.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        unitb.setForeground(new java.awt.Color(0, 102, 51));
        unitb.setText("Unit-B");
        unitb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unitb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unitbMouseClicked(evt);
            }
        });

        jLabel16.setText("Bangla");

        jLabel17.setText("Management");

        jLabel18.setText("ID");

        jLabel19.setText("English");

        jLabel20.setText("Grade");

        jLabel21.setText("Accounting");

        jLabel22.setText("Markating");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Resultsheet Table");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel2.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Update C");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel23.setText("Diposit");

        jLabel24.setText("Due");

        jLabel25.setText("Course_fee");

        jLabel26.setText("Total_payment");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(unita)
                                    .addComponent(unitb)
                                    .addComponent(jLabel2))
                                .addGap(208, 208, 208)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel18)
                                                .addComponent(jLabel16))
                                            .addGap(29, 29, 29))
                                        .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(management, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cenglish, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cgrade, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbangla)
                                        .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(accounting, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(markating, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel23))
                                        .addGap(29, 29, 29)))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(due, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(diposit)
                                        .addComponent(course_fee, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jButton2)
                .addGap(318, 318, 318)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(unita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unitb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(cbangla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(cenglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(management, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(accounting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(markating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(cgrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(course_fee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(diposit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(tpayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(due, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        HomePage x = new HomePage();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void unitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unitaMouseClicked
        Update_a x = new Update_a();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_unitaMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void unitbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unitbMouseClicked
        Update_a x = new Update_a();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_unitbMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        mouseClickedOnTable_c();


    }//GEN-LAST:event_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if (cbangla.getText().equals("")) {
            cbangla.setText(String.valueOf(0));

        }
        if (cenglish.getText().equals("")) {
            cenglish.setText(String.valueOf(0));

        }
        if (accounting.getText().equals("")) {
            accounting.setText(String.valueOf(0));

        }
         if (management.getText().equals("")) {
            management.setText(String.valueOf(0));

        }
         if (markating.getText().equals("")) {
            markating.setText(String.valueOf(0));

        }
        if (course_fee.getText().equals("")) {
            course_fee.setText(String.valueOf(0));

        }
        if (tpayment.getText().equals("")) {
            tpayment.setText(String.valueOf(0));

        }
        if (due.getText().equals("")) {
            due.setText(String.valueOf(0));

        }
        if (diposit.getText().equals("")) {
            diposit.setText(String.valueOf(0));

        }
        int a = Integer.parseInt(cbangla.getText());
        int b = Integer.parseInt(cenglish.getText());
        int c = Integer.parseInt(management.getText());
        int d = Integer.parseInt(accounting.getText());
        int e = Integer.parseInt(markating.getText());
        int f = (a + b + c + d + e) / 5;
         if (f > 50) {
            cgrade.setText("A+");
        }
        if (f < 50) {
            cgrade.setText("B+");
        }
        if (f == 0) {
            cgrade.setText("0");
        }
        double add = Double.parseDouble(diposit.getText()) + Double.parseDouble(tpayment.getText());
        due.setText(String.valueOf(Double.parseDouble(course_fee.getText()) - add));
        tpayment.setText(String.valueOf(add));

        update_c();
        quirey_c();
        diposit.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       delete_c();
       cid.setText("");
       cbangla.setText("");
       cenglish.setText("");
       management.setText("");
       accounting.setText("");
       markating.setText("");
       cgrade.setText("");
       quirey_c();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(() -> {
            new Update_c().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accounting;
    private javax.swing.JTextField cbangla;
    private javax.swing.JTextField cenglish;
    private javax.swing.JTextField cgrade;
    private javax.swing.JTextField cid;
    private javax.swing.JTextField course_fee;
    private javax.swing.JTextField diposit;
    private javax.swing.JTextField due;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField management;
    private javax.swing.JTextField markating;
    private javax.swing.JTable table;
    private javax.swing.JTextField tpayment;
    private javax.swing.JLabel unita;
    private javax.swing.JLabel unitb;
    // End of variables declaration//GEN-END:variables
}
