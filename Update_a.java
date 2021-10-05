package MyProject;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;

import javax.swing.table.DefaultTableModel;

public final class Update_a extends javax.swing.JFrame {

    Object data;
    DefaultTableModel model;
    Connection con;
    PreparedStatement pst;
    ResultSet r;

    public Update_a() {
        initComponents();
        A();
        quirey_a();

    }

// Table for a_unit
    public void A() {
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Student Name");
        model.addColumn("Course_fee");
        model.addColumn("Cash_payment");
        model.addColumn("Due");
        model.addColumn("Phisics");
        model.addColumn("Chemistry");
        model.addColumn("Mathamatics");
        model.addColumn("Grade");
        model.addColumn("ImagePath");
        table.setModel(model);

    }

    // Update mathod for a_unit
    public void update_a() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_project", "root", "idb122292");
            pst = con.prepareStatement("update a_unit set phisics=?, chemistry=?, mathmatics=?, grade=?,course_fee=?, cash_payment=?, due=? where id=?");
            pst.setString(1, phi.getText());
            pst.setString(2, che.getText());
            pst.setString(3, math.getText());
            pst.setString(4, agrade.getText());
            pst.setString(5, course_fee.getText());
            pst.setString(6, cpayment.getText());
            pst.setString(7, due.getText());

            pst.setInt(8, Integer.parseInt(aid.getText()));
            pst.executeUpdate();

        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }

    // Quirey for a_unit
    public void quirey_a() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_project", "root", "idb122292");
            pst = con.prepareStatement("select * from a_unit");
            r = pst.executeQuery();
            model.setRowCount(0);
            while (r.next()) {
                data = new Object[]{
                    r.getInt(1), r.getString(2), r.getString(15), r.getString(9), r.getString(10),
                    r.getString(11), r.getString(12), r.getString(13), r.getString(14), r.getBlob(16)};
                model.addRow((Object[]) data);

            }

            pst.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

// delete method
    public void delete_a() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_project", "root", "idb122292");
            pst = con.prepareStatement("delete from a_unit where id=?");

            pst.setInt(1, Integer.parseInt(aid.getText()));
            pst.executeUpdate();
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        unita = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        unitb = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        phi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        che = new javax.swing.JTextField();
        math = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        agrade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        course_fee = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        due = new javax.swing.JTextField();
        cpayment = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        woing = new javax.swing.JTextField();
        picture = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update A_unit");

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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Resultsheet Table");

        jLabel6.setText("ID");

        jLabel7.setText("Phisics");

        jLabel8.setText("Chemistry");

        jLabel9.setText("Mathamatics");

        jLabel10.setText("Grade");

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/previousIcon.jpg"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 1020, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jPanel3.setBackground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("Update A");
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

        jLabel11.setText("Course_fee");

        jLabel12.setText("Due");

        jLabel13.setText("Total_payment");

        jLabel14.setText("Deposit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unita)
                    .addComponent(unitb)
                    .addComponent(jLabel2))
                .addGap(175, 175, 175)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(29, 29, 29))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(math, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(che, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(agrade, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(phi)
                            .addComponent(aid, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(course_fee, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(woing, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(due, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(361, 361, 361))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(unita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unitb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(aid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)
                                    .addComponent(course_fee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(phi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(che, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(math, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14)
                                            .addComponent(woing, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13)
                                            .addComponent(cpayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(agrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(due, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unitaMouseClicked

    }//GEN-LAST:event_unitaMouseClicked

    private void unitbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unitbMouseClicked
        Update_b x = new Update_b();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_unitbMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Update_c x = new Update_c();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        HomePage x = new HomePage();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        mouseClickedOnTable_a();


    }//GEN-LAST:event_tableMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (phi.getText().equals("")) {
            phi.setText(String.valueOf(0));

        }
        if (che.getText().equals("")) {
            che.setText(String.valueOf(0));

        }
        if (math.getText().equals("")) {
            math.setText(String.valueOf(0));

        }
        if (course_fee.getText().equals("")) {
            phi.setText(String.valueOf(12000));

        }
        if (cpayment.getText().equals("")) {
            cpayment.setText(String.valueOf(0));

        }
        if (due.getText().equals("")) {
            due.setText(String.valueOf(0));

        }
        if (woing.getText().equals("")) {
            woing.setText(String.valueOf(0));

        }

        int a = Integer.parseInt(phi.getText());
        int b = Integer.parseInt(che.getText());
        int c = Integer.parseInt(math.getText());
        int d = (a + b + c) / 3;
        double add = Double.parseDouble(woing.getText()) + Double.parseDouble(cpayment.getText());

        due.setText(String.valueOf(Double.parseDouble(course_fee.getText()) - add));
        cpayment.setText(String.valueOf(add));

        if (d > 50) {
            agrade.setText("A+");
        }
        if (d < 50) {
            agrade.setText("B+");
        }
        if (d == 0) {
            agrade.setText("0");
        }

        update_a();
        quirey_a();
        woing.setText(String.valueOf(0));
        
        File file;
        InputStream input;
        FileOutputStream output;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_project", "root", "idb122292");
            pst = con.prepareStatement("select image from a_unit where id = ?");

            pst.setInt(1, Integer.parseInt(aid.getText()));
            r = pst.executeQuery();

            file = new File("pic.png");
            output = new FileOutputStream(file);

            if (r.next()) {
                input = r.getBinaryStream(1);
                byte[] buffer = new byte[1024];
                while (input.read(buffer) > 0) {
                    output.write(buffer);
                }
                String path = file.getAbsolutePath();
                ImageIcon myImage = new ImageIcon(path);
                Image img = myImage.getImage();
                Image newImage = img.getScaledInstance(picture.getWidth(), picture.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon imagee = new ImageIcon(newImage);
                picture.setIcon(imagee);
            } else {
                System.out.println("No Image");
            }

        } catch (FileNotFoundException | SQLException e) {
            System.out.println("" + e);
        } catch (IOException ex) {
            System.out.println("" + ex);
        } finally {
            try {
                if (r != null) {
                    r.close();
                }
                pst.close();
                con.close();
            } catch (SQLException e) {
                System.out.println("Close SQLException");
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        delete_a();
        aid.setText("");
        phi.setText("");
        che.setText("");
        math.setText("");
        agrade.setText("");
        quirey_a();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Mouse clicked on table
    public void mouseClickedOnTable_a() {

        aid.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 0)));
        course_fee.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 2)));

        cpayment.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 3)));
        due.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 4)));
        phi.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 5)));
        che.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 6)));
        math.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 7)));
        agrade.setText(String.valueOf(model.getValueAt(table.getSelectedRow(), 8)));
       
       

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_a.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_a().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agrade;
    private javax.swing.JTextField aid;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField che;
    private javax.swing.JTextField course_fee;
    private javax.swing.JTextField cpayment;
    private javax.swing.JTextField due;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField math;
    private javax.swing.JTextField phi;
    private javax.swing.JLabel picture;
    private javax.swing.JTable table;
    private javax.swing.JLabel unita;
    private javax.swing.JLabel unitb;
    private javax.swing.JTextField woing;
    // End of variables declaration//GEN-END:variables
}
