
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Subhakshi Sharma
 */
public class AddStudent extends javax.swing.JFrame {
 Connection con=null;
  Statement pst=null;
  ResultSet rs=null;
  public void selectionall() throws SQLException{

    try {

             con= DriverManager.getConnection("jdbc:derby://localhost:1527/coaching","sakshi","2896");       
             pst = con.createStatement();
             rs=pst.executeQuery("select * from SAKSHI.STUDENTTABLE");
             // rs=st.executeQuery("select * from java.Vcustomer");
 studenttable.setModel(DbUtils.resultSetToTableModel(rs));


    } catch (SQLException ex) {
        ex.printStackTrace();    }
}

    /**
     * Creates new form AddStudent
     */
   public AddStudent() throws SQLException {
        initComponents();
        selectionall();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        studentid = new javax.swing.JTextField();
        lbl_studentid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contactno = new javax.swing.JTextField();
        lbl_contactno = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        lbl_gender = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        courseid = new javax.swing.JTextField();
        lbl_courseid = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        feespaid = new javax.swing.JTextField();
        lbl_feespaid = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        feesleft = new javax.swing.JTextField();
        lbl_feesleft = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        save = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        back = new javax.swing.JButton();
        lbl_address = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        studenttable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ADD STUDENT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 565, 25));

        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 12, -1, -1));

        jLabel2.setText("STUDENT ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 66, 80, 25));

        studentid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                studentidKeyReleased(evt);
            }
        });
        getContentPane().add(studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 66, 137, 25));
        getContentPane().add(lbl_studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 71, 180, 20));

        jLabel3.setText("NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, 80, 25));

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 111, 137, 25));
        getContentPane().add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 116, 180, 20));

        jLabel4.setText("CONTACT NO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 156, 70, 25));

        contactno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactnoActionPerformed(evt);
            }
        });
        contactno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contactnoKeyReleased(evt);
            }
        });
        getContentPane().add(contactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 156, 137, 25));
        getContentPane().add(lbl_contactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 161, 180, 20));

        jLabel5.setText("GENDER");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 201, 70, 25));

        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        gender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                genderKeyReleased(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 201, 137, 25));
        getContentPane().add(lbl_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 201, 180, 20));

        jLabel6.setText("COURSE ID");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 246, 70, 25));

        courseid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseidActionPerformed(evt);
            }
        });
        courseid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                courseidKeyReleased(evt);
            }
        });
        getContentPane().add(courseid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 137, 30));
        getContentPane().add(lbl_courseid, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 256, 180, 20));

        jLabel7.setText("FEES PAID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 301, 70, 25));

        feespaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feespaidActionPerformed(evt);
            }
        });
        feespaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                feespaidKeyReleased(evt);
            }
        });
        getContentPane().add(feespaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 301, 137, 25));
        getContentPane().add(lbl_feespaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 301, 180, 20));

        jLabel8.setText("FEES LEFT");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 346, 70, 25));

        feesleft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feesleftActionPerformed(evt);
            }
        });
        feesleft.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                feesleftKeyReleased(evt);
            }
        });
        getContentPane().add(feesleft, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 346, 137, 25));
        getContentPane().add(lbl_feesleft, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 346, 180, 20));

        jLabel9.setText("ADDRESS");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 391, 70, 25));

        address.setColumns(20);
        address.setRows(5);
        address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addressKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(address);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 391, 137, 56));

        save.setBackground(new java.awt.Color(100, 204, 0));
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 487, -1, -1));

        reset.setBackground(new java.awt.Color(255, 102, 102));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 487, -1, -1));

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 487, -1, -1));
        getContentPane().add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 404, 180, 23));

        studenttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "studentid", "name", "contactno", "gender", "courseid", "fees paid", "fees left", "address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Integer.class, java.lang.Long.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(studenttable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 590, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        HomePage hp=new HomePage();
        hp.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void studentidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentidKeyReleased
        lbl_studentid.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_studentidKeyReleased

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        lbl_name.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyReleased

    private void contactnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnoActionPerformed

    private void contactnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactnoKeyReleased
        lbl_contactno.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnoKeyReleased

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void genderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_genderKeyReleased
        lbl_gender.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_genderKeyReleased

    private void courseidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseidActionPerformed

    private void courseidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_courseidKeyReleased
        lbl_courseid.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_courseidKeyReleased

    private void feespaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feespaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feespaidActionPerformed

    private void feespaidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_feespaidKeyReleased
        lbl_feespaid.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_feespaidKeyReleased

    private void feesleftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feesleftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feesleftActionPerformed

    private void feesleftKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_feesleftKeyReleased
        lbl_feesleft.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_feesleftKeyReleased

    private void addressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addressKeyReleased
        lbl_address.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_addressKeyReleased

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {

             con= DriverManager.getConnection("jdbc:derby://localhost:1527/coaching","sakshi","2896");       
            
 
             String query="insert into SAKSHI.STUDENTTABLE values(?,?,?,?,?,?,?,?)";
             PreparedStatement ps=con.prepareStatement(query);
ps.setString(1,studentid.getText());
ps.setString(2,name.getText());
ps.setString(3,contactno.getText());
ps.setString(4,gender.getText());
ps.setString(5,courseid.getText());
ps.setString(6,feespaid.getText());
ps.setString(7,feesleft.getText());
ps.setString(8,address.getText());
int status=ps.executeUpdate();
if(status==1)
{
    JOptionPane.showMessageDialog(null,"inserted successfully");
//System.out.println(" Data Successfully Inserted");
ps.close();
}
else
{
System.out.println("Inserting failed");
ps.close();
}

//con= DriverManager.getConnection("jdbc:derby://localhost:1527/coaching","sakshi","2896");       
             pst = con.createStatement();
             rs=pst.executeQuery("select * from SAKSHI.STUDENTTABLE");
             // rs=st.executeQuery("select * from java.Vcustomer");
 studenttable.setModel(DbUtils.resultSetToTableModel(rs));
 
 


    } catch (SQLException ex) {
       System.out.println("Exception occur in Add Button "+ex);
        //ex.printStackTrace();    
    }
        
        if(studentid.getText().trim().isEmpty())
        {
            lbl_studentid.setText("student id is mandatory");
        }
        if(name.getText().trim().isEmpty())
        {
            lbl_name.setText("name is mandatory");
        }
        if(contactno.getText().trim().isEmpty())
        {
            lbl_contactno.setText("contact no is mandatory");
        }
        if(gender.getText().trim().isEmpty())
        {
            lbl_gender.setText("gender is mandatory");
        }
        if(courseid.getText().trim().isEmpty())
        {
            lbl_courseid.setText("course id is mandatory");
        }
        if(feespaid.getText().trim().isEmpty())
        {
            lbl_feespaid.setText("fees paid is mandatory");
        }
        /* if(feesleft.getText().trim().isEmpty())
        {
            lbl_feesleft.setText("fees left is mandatory");
        }*/
        if(address.getText().trim().isEmpty())
        {
            lbl_address.setText("address is mandatory");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        studentid.setText(null);
        name.setText(null);
        contactno.setText(null);
        gender.setText(null);
        courseid.setText(null);
        feespaid.setText(null);
        feesleft.setText(null);
        address.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        AdminPage ap=new AdminPage();
        ap.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddStudent().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JButton back;
    private javax.swing.JTextField contactno;
    private javax.swing.JTextField courseid;
    private javax.swing.JTextField feesleft;
    private javax.swing.JTextField feespaid;
    private javax.swing.JTextField gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_contactno;
    private javax.swing.JLabel lbl_courseid;
    private javax.swing.JLabel lbl_feesleft;
    private javax.swing.JLabel lbl_feespaid;
    private javax.swing.JLabel lbl_gender;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_studentid;
    private javax.swing.JButton logout;
    private javax.swing.JTextField name;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JTextField studentid;
    private javax.swing.JTable studenttable;
    // End of variables declaration//GEN-END:variables
}