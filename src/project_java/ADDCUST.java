/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_java;

/**
 *
 * @author amiratechnologier
 */
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ADDCUST extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
        
    public ADDCUST() {
        setUndecorated(true);
        setLocationRelativeTo(null);
        initComponents();
        conn=javaconnect.ConnecrDb();
    }

    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButtonDashbord = new javax.swing.JButton();
        jButtonADDCustomer = new javax.swing.JButton();
        jButtViecCustomer = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();
        jButtonProfile = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelExist = new javax.swing.JLabel();
        mail_customer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JlabelDB = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cmd = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        customer_role = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        name_customer = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        pass_customer = new javax.swing.JPasswordField();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        date_birth = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Administrator");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boss.png"))); // NOI18N

        jButtonDashbord.setBackground(new java.awt.Color(51, 51, 51));
        jButtonDashbord.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonDashbord.setForeground(new java.awt.Color(204, 204, 204));
        jButtonDashbord.setText("Dashbord");
        jButtonDashbord.setBorder(null);
        jButtonDashbord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDashbord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDashbordActionPerformed(evt);
            }
        });

        jButtonADDCustomer.setBackground(new java.awt.Color(51, 51, 51));
        jButtonADDCustomer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonADDCustomer.setForeground(new java.awt.Color(204, 204, 204));
        jButtonADDCustomer.setText("Add Customer");
        jButtonADDCustomer.setBorder(null);
        jButtonADDCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonADDCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDCustomerActionPerformed(evt);
            }
        });

        jButtViecCustomer.setBackground(new java.awt.Color(51, 51, 51));
        jButtViecCustomer.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtViecCustomer.setForeground(new java.awt.Color(204, 204, 204));
        jButtViecCustomer.setText("View Customers");
        jButtViecCustomer.setBorder(null);
        jButtViecCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtViecCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtViecCustomerActionPerformed(evt);
            }
        });

        jButtonLogOut.setBackground(new java.awt.Color(51, 51, 51));
        jButtonLogOut.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonLogOut.setForeground(new java.awt.Color(204, 204, 204));
        jButtonLogOut.setText("Log Out");
        jButtonLogOut.setBorder(null);
        jButtonLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });

        jButtonProfile.setBackground(new java.awt.Color(51, 51, 51));
        jButtonProfile.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButtonProfile.setForeground(new java.awt.Color(204, 204, 204));
        jButtonProfile.setText("Profile");
        jButtonProfile.setBorder(null);
        jButtonProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProfileActionPerformed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.png"))); // NOI18N

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/layout.png"))); // NOI18N

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/man-user.png"))); // NOI18N

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout (1).png"))); // NOI18N

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pharmacy (1).png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MYPHARMACY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel28))
                                        .addComponent(jLabel29))
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonDashbord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtViecCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(jButtonADDCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel32)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonDashbord, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonADDCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtViecCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(44, 44, 44)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 310, 590);

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        jLabelExist.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabelExist.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExist.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExist.setText("X");
        jLabelExist.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelExist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelExistMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelExist, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelExist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(1101, 6, 46, 36);

        mail_customer.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        mail_customer.setForeground(new java.awt.Color(51, 51, 51));
        mail_customer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        mail_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mail_customerActionPerformed(evt);
            }
        });
        jPanel1.add(mail_customer);
        mail_customer.setBounds(750, 170, 250, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(330, 230, 100, 16);

        JlabelDB.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        JlabelDB.setForeground(new java.awt.Color(51, 51, 51));
        JlabelDB.setText("Date of Birth ");
        jPanel1.add(JlabelDB);
        JlabelDB.setBounds(330, 330, 100, 16);

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setText("Reset");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(900, 390, 140, 50);

        cmd.setBackground(new java.awt.Color(102, 153, 255));
        cmd.setText("Sign up");
        cmd.setBorder(null);
        cmd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActionPerformed(evt);
            }
        });
        jPanel1.add(cmd);
        cmd.setBounds(740, 390, 140, 50);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("By Signing in i accept the terms of service and privacy policy");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(670, 470, 460, 60);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(1110, 70, 70, 70);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1080, 520, 70, 70);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(1100, 440, 70, 70);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(1090, 250, 70, 70);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(1110, 370, 70, 70);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(1110, 160, 70, 70);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(1110, 70, 70, 70);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel22);
        jLabel22.setBounds(1010, 530, 70, 70);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_java/pills.png"))); // NOI18N
        jPanel1.add(jLabel23);
        jLabel23.setBounds(1010, 530, 70, 70);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ADD CUSTOMER");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(320, 60, 250, 60);

        customer_role.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(customer_role);
        customer_role.setBounds(340, 170, 180, 20);

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Customer Role");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(330, 140, 100, 16);

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Password");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(740, 300, 100, 20);

        name_customer.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        name_customer.setForeground(new java.awt.Color(51, 51, 51));
        name_customer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        name_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_customerActionPerformed(evt);
            }
        });
        jPanel1.add(name_customer);
        name_customer.setBounds(750, 250, 250, 30);

        name.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(51, 51, 51));
        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(330, 270, 230, 30);

        jLabel24.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Email Address");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(740, 140, 100, 20);

        pass_customer.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        pass_customer.setForeground(new java.awt.Color(51, 51, 51));
        pass_customer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel1.add(pass_customer);
        pass_customer.setBounds(750, 330, 250, 30);

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("Customer Name");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(740, 220, 100, 20);

        jPanel4.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(690, 70, 10, 430);
        jPanel1.add(date_birth);
        date_birth.setBounds(330, 350, 190, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDashbordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDashbordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDashbordActionPerformed

    private void jButtonADDCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonADDCustomerActionPerformed

    private void jButtViecCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtViecCustomerActionPerformed
        // TODO add your handling code here:
        //close();
        setVisible(false);
        ViewCarte Vc = new ViewCarte();
        Vc.setVisible(true);
    }//GEN-LAST:event_jButtViecCustomerActionPerformed

    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        // TODO add your handling code here:
        //close();
        setVisible(false);
        login lg = new login();
        lg.setVisible(true);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jButtonProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonProfileActionPerformed

    private void mail_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mail_customerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mail_customerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        name.setText("");
        date_birth.setDate(null);
        mail_customer.setText("");
        name_customer.setText("");
        pass_customer.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActionPerformed
        // TODO add your handling code here:
        String sql ="Insert into customer (name,customer_birth,customer_mail,customer_name,customer_pass) values (?,?,?,?,?)";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, name.getText());
            pst.setString(2, ((JTextField)date_birth.getDateEditor().getUiComponent()).getText());
            pst.setString(3, mail_customer.getText());
            pst.setString(4, name_customer.getText());
            pst.setString(5, pass_customer.getText());
            //pst.setString(6, (String) customer_role.getSelectedItem());

            pst.execute();
            JOptionPane.showMessageDialog(null, "Saved");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cmdActionPerformed

    private void name_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_customerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_customerActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jLabelExistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelExistMouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabelExistMouseClicked

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
            java.util.logging.Logger.getLogger(ADDCUST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADDCUST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADDCUST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADDCUST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADDCUST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelDB;
    private javax.swing.JButton cmd;
    private javax.swing.JComboBox customer_role;
    private com.toedter.calendar.JDateChooser date_birth;
    private javax.swing.JButton jButtViecCustomer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonADDCustomer;
    private javax.swing.JButton jButtonDashbord;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonProfile;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelExist;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField mail_customer;
    private javax.swing.JTextField name;
    private javax.swing.JTextField name_customer;
    private javax.swing.JPasswordField pass_customer;
    // End of variables declaration//GEN-END:variables
}