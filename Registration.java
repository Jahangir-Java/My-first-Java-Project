package MyProject;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public final class Registration extends javax.swing.JFrame {

    Object data;
    DefaultTableModel model;
    Connection con;
    PreparedStatement pst;
    ResultSet r;
    String gender = "";
    String skill = "";
    String unit = "";

    byte[] image;
    String imagepath = "";
    ImageIcon myimage;

    int a = 122312;
    String p;

    public Registration() {

        initComponents();

    }

    public void a_fee() {

        addfee.setText(String.valueOf(15000));
        afterdiscount.setText(String.valueOf(12000));

    }

    public void b_fee() {

        addfee.setText(String.valueOf(13000));
        afterdiscount.setText(String.valueOf(10000));

    }

    public void c_fee() {

        addfee.setText(String.valueOf(14000));
        afterdiscount.setText(String.valueOf(11000));

    }

    public void Check() {
        // gender
        if (male.isSelected()) {
            gender = "Male";
        }
        if (female.isSelected()) {
            gender = "Female";

        }
        // acadamic select
        if (sss.isSelected()) {
            skill += "SSC ";
        }
        if (hsc.isSelected()) {
            skill += "HSC ";
        }
        if (dakhil.isSelected()) {
            skill += "Dakhil ";
        }
        if (alim.isSelected()) {
            skill += "Alim ";
        }
        // unit select
        if (unit_a.isSelected()) {
            unit = "A";
        }

        if (unit_b.isSelected()) {
            unit = "B";
        }
        if (unit_c.isSelected()) {
            unit = "C";
        }

    }

    public void insert_a() {

        String date = ((JTextField) da.getDateEditor().getUiComponent()).getText();
        Check();

        try {
            InputStream in = new FileInputStream(p);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_project", "root", "idb122292");
            pst = con.prepareStatement("select id from a_unit ORDER BY id DESC LIMIT 1");
            r = pst.executeQuery();
            int id = 122200;
            while (r.next()) {
                id = r.getInt(1);
            }

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_project", "root", "idb122292");
            pst = con.prepareStatement("insert into a_unit values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, Integer.parseInt(String.valueOf(id + 1)));
            pst.setString(2, name.getText());
            pst.setString(3, email.getText());
            pst.setString(4, number.getText());
            pst.setString(5, unit);
            pst.setString(6, gender);
            pst.setString(7, skill);
            pst.setString(8, date);
            pst.setString(9, "");
            pst.setString(10, "");
            pst.setString(11, "");
            pst.setString(12, "");
            pst.setString(13, "");
            pst.setString(14, "");
            pst.setString(15, afterdiscount.getText());
            pst.setBlob(16, in);

            pst.executeUpdate();

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Provide unique mobile number");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insert_b() {

        String date = ((JTextField) da.getDateEditor().getUiComponent()).getText();
        Check();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_project", "root", "idb122292");
            pst = con.prepareStatement("select id from b_unit ORDER BY id DESC LIMIT 1");
            r = pst.executeQuery();
            int id = 122300;
            while (r.next()) {
                id = r.getInt(1);
            }

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_project", "root", "idb122292");
            pst = con.prepareStatement("insert into b_unit values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, Integer.parseInt(String.valueOf(id + 1)));
            pst.setString(2, name.getText());
            pst.setString(3, email.getText());
            pst.setString(4, number.getText());
            pst.setString(5, unit);
            pst.setString(6, gender);
            pst.setString(7, skill);
            pst.setString(8, date);
            pst.setString(9, "");
            pst.setString(10, "");
            pst.setString(11, "");
            pst.setString(12, "");
            pst.setString(13, "");
            pst.setString(14, "");
            pst.setString(15, afterdiscount.getText());

            pst.executeUpdate();

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Provide unique mobile number");
        }
    }

    public void insert_c() {

        String date = ((JTextField) da.getDateEditor().getUiComponent()).getText();
        Check();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_project", "root", "idb122292");
            pst = con.prepareStatement("select id from c_unit ORDER BY id DESC LIMIT 1");
            r = pst.executeQuery();
            int id = 122400;
            while (r.next()) {
                id = r.getInt(1);
            }

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_project", "root", "idb122292");
            pst = con.prepareStatement("insert into c_unit values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, Integer.parseInt(String.valueOf(id + 1)));
            pst.setString(2, name.getText());
            pst.setString(3, email.getText());
            pst.setString(4, number.getText());
            pst.setString(5, unit);
            pst.setString(6, gender);
            pst.setString(7, skill);
            pst.setString(8, date);
            pst.setString(9, "");
            pst.setString(10, "");
            pst.setString(11, "");
            pst.setString(12, "");
            pst.setString(13, "");
            pst.setString(14, "");
            pst.setString(15, "");
            pst.setString(16, "");
            pst.setString(17, afterdiscount.getText());

            pst.executeUpdate();

        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Provide unique mobile number");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        sss = new javax.swing.JCheckBox();
        dakhil = new javax.swing.JCheckBox();
        hsc = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        alim = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        da = new com.toedter.calendar.JDateChooser();
        ilabel = new javax.swing.JLabel();
        cfile = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addfee = new javax.swing.JTextField();
        cfile1 = new javax.swing.JLabel();
        cfile2 = new javax.swing.JLabel();
        cfile3 = new javax.swing.JLabel();
        cfile4 = new javax.swing.JLabel();
        cfile5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        afterdiscount = new javax.swing.JTextField();
        cfile6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        unit_a = new javax.swing.JRadioButton();
        unit_b = new javax.swing.JRadioButton();
        unit_c = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registration form\n");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Student resistration form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel2.setText("Name");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel3.setText("Email");

        jLabel5.setText("Gender");

        buttonGroup2.add(male);
        male.setText("Male");

        buttonGroup2.add(female);
        female.setText("Female");

        jLabel6.setText("Acadamic");

        sss.setText("SSC");

        dakhil.setText("Dakhil");

        hsc.setText("HSC");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        alim.setText("Alim");

        jLabel7.setText("Phone number");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/previousIcon.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setText("Addmission date");

        cfile.setText("Choise file");
        cfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cfileMouseClicked(evt);
            }
        });

        jLabel10.setText("Addmission fee");

        cfile1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cfile1.setForeground(new java.awt.Color(153, 0, 0));
        cfile1.setText("Payment");
        cfile1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cfile1MouseClicked(evt);
            }
        });

        cfile2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cfile2.setText("bekash");
        cfile2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cfile2MouseClicked(evt);
            }
        });

        cfile3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cfile3.setText("Nagad");
        cfile3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cfile3MouseClicked(evt);
            }
        });

        cfile4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cfile4.setText("01781941682");
        cfile4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cfile4MouseClicked(evt);
            }
        });

        cfile5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cfile5.setText("01728873198");
        cfile5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cfile5MouseClicked(evt);
            }
        });

        jLabel13.setText("After discount");

        cfile6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        cfile6.setForeground(new java.awt.Color(0, 153, 0));
        cfile6.setText("3000 tk discount if admitted this month");
        cfile6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cfile6MouseClicked(evt);
            }
        });

        jLabel14.setText("Unit");

        buttonGroup1.add(unit_a);
        unit_a.setText("Unit-A");
        unit_a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_aMouseClicked(evt);
            }
        });

        buttonGroup1.add(unit_b);
        unit_b.setText("Unit-B");
        unit_b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_bMouseClicked(evt);
            }
        });

        buttonGroup1.add(unit_c);
        unit_c.setText("Unit-C");
        unit_c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unit_cMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cfile6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel13))
                                        .addGap(102, 102, 102)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(afterdiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(addfee, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(unit_a)
                                                .addGap(18, 18, 18)
                                                .addComponent(unit_b)
                                                .addGap(18, 18, 18)
                                                .addComponent(unit_c))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(number, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(da, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)))))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sss)
                                    .addComponent(male)
                                    .addComponent(hsc))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(female)
                                    .addComponent(dakhil)
                                    .addComponent(alim))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ilabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cfile)
                                        .addGap(32, 32, 32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(cfile2)
                                                    .addComponent(cfile3))
                                                .addGap(93, 93, 93)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cfile4)
                                                    .addComponent(cfile5)))
                                            .addComponent(cfile1))
                                        .addGap(176, 176, 176))))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(male)
                                .addComponent(female)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(sss)
                            .addComponent(dakhil))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hsc)
                                .addComponent(alim)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(da, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ilabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cfile)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(unit_a)
                            .addComponent(unit_b)
                            .addComponent(unit_c)
                            .addComponent(jLabel14))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(addfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(afterdiscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(cfile1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cfile2)
                            .addComponent(cfile5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cfile4)
                            .addComponent(cfile3))))
                .addGap(14, 14, 14)
                .addComponent(cfile6)
                .addGap(64, 64, 64)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (unit_a.isSelected()) {
            insert_a();
            A_unit x = new A_unit();
            x.setVisible(true);
            dispose();
        }
        if (unit_b.isSelected()) {
            insert_b();
            B_unit x = new B_unit();
            x.setVisible(true);
            dispose();
        }
        if (unit_c.isSelected()) {
            insert_c();
            C_unit x = new C_unit();
            x.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        HomePage x = new HomePage();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked
    public ImageIcon seticon(String m, byte[] image) {
        if (m != null) {
            myimage = new ImageIcon(m);
        } else {
            myimage = new ImageIcon(image);
        }
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(ilabel.getWidth(), ilabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        return i;

    }
    private void cfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cfileMouseClicked
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File("user.dir"));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("All Pic", "png", "jpg", "jpeg", "gif");
        file.addChoosableFileFilter(filter);
        int ab = file.showSaveDialog(null);
        if (ab == JFileChooser.APPROVE_OPTION) {
            File f = file.getSelectedFile();
            p = f.getAbsolutePath();
            ilabel.setIcon(seticon(p, null));

        }

    }//GEN-LAST:event_cfileMouseClicked

    private void cfile1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cfile1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cfile1MouseClicked

    private void cfile2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cfile2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cfile2MouseClicked

    private void cfile3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cfile3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cfile3MouseClicked

    private void cfile4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cfile4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cfile4MouseClicked

    private void cfile5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cfile5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cfile5MouseClicked

    private void cfile6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cfile6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cfile6MouseClicked

    private void unit_aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_aMouseClicked
        a_fee();
    }//GEN-LAST:event_unit_aMouseClicked

    private void unit_bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_bMouseClicked
        b_fee();
    }//GEN-LAST:event_unit_bMouseClicked

    private void unit_cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unit_cMouseClicked
        c_fee();
    }//GEN-LAST:event_unit_cMouseClicked

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Registration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addfee;
    private javax.swing.JTextField afterdiscount;
    private javax.swing.JCheckBox alim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel cfile;
    private javax.swing.JLabel cfile1;
    private javax.swing.JLabel cfile2;
    private javax.swing.JLabel cfile3;
    private javax.swing.JLabel cfile4;
    private javax.swing.JLabel cfile5;
    private javax.swing.JLabel cfile6;
    private com.toedter.calendar.JDateChooser da;
    private javax.swing.JCheckBox dakhil;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JCheckBox hsc;
    private javax.swing.JLabel ilabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JCheckBox sss;
    private javax.swing.JRadioButton unit_a;
    private javax.swing.JRadioButton unit_b;
    private javax.swing.JRadioButton unit_c;
    // End of variables declaration//GEN-END:variables
}
