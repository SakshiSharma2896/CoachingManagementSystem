
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
public class TSResult extends javax.swing.JFrame {
Connection con=null;
  Statement pst=null;
  ResultSet rs=null;
  public void selectionall() throws SQLException{
    try {

             con= DriverManager.getConnection("jdbc:derby://localhost:1527/coaching","sakshi","2896");       
             pst = con.createStatement();
             rs=pst.executeQuery("select * from SAKSHI.RESULT");
             teacherresulttable.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (SQLException ex) {
        ex.printStackTrace();    
    }}
    /**
     * Creates new form TSResult
     */
    public TSResult() throws Exception{
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
        jScrollPane1 = new javax.swing.JScrollPane();
        teacherresulttable = new javax.swing.JTable();
        save = new javax.swing.JButton();
        back = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        studentid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        courseid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        coursename = new javax.swing.JTextField();
        jlabel = new javax.swing.JLabel();
        marks = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText(" TEACHER RESULT(STUDENT)");

        teacherresulttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STUDENT ID", "NAME", "COURSE ID", "COURSE NAME", "MARKS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        teacherresulttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherresulttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(teacherresulttable);

        save.setBackground(new java.awt.Color(102, 204, 0));
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jLabel2.setText("STUDENT ID");

        studentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentidActionPerformed(evt);
            }
        });
        studentid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                studentidKeyReleased(evt);
            }
        });

        jLabel3.setText("NAME");

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

        jLabel4.setText("COURSE ID");

        courseid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                courseidKeyReleased(evt);
            }
        });

        jLabel5.setText("COURSE NAME");

        coursename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                coursenameKeyReleased(evt);
            }
        });

        jlabel.setText("MARKS");

        marks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                marksKeyReleased(evt);
            }
        });

        update.setBackground(new java.awt.Color(153, 255, 153));
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 51, 51));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(780, 780, 780)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(courseid, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(coursename, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(marks, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(779, 779, 779))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout)
                .addGap(187, 187, 187))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(save)
                        .addGap(47, 47, 47)
                        .addComponent(back)
                        .addGap(36, 36, 36)
                        .addComponent(update)
                        .addGap(29, 29, 29)
                        .addComponent(reset))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logout)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coursename, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(back)
                    .addComponent(update)
                    .addComponent(reset))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
TeacherPage tp=new TeacherPage();
tp.setVisible(true);
this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
HomePage hp=new HomePage();
hp.setVisible(true);
this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void studentidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentidKeyReleased
        //lbl_studentid.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_studentidKeyReleased

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        //lbl_name.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyReleased

    private void courseidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_courseidKeyReleased
       // lbl_courseid.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_courseidKeyReleased

    private void coursenameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_coursenameKeyReleased
       // lbl_coursename.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_coursenameKeyReleased

    private void marksKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marksKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_marksKeyReleased

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
      try {

             con= DriverManager.getConnection("jdbc:derby://localhost:1527/coaching","sakshi","2896");       
             String query="insert into SAKSHI.RESULT values(?,?,?,?,?)";
             PreparedStatement ps=con.prepareStatement(query);
ps.setString(1,studentid.getText());
ps.setString(2,name.getText());
ps.setString(3,courseid.getText());
ps.setString(4,coursename.getText());
ps.setString(5,marks.getText());
int status=ps.executeUpdate();
if(status==1)
{
System.out.println(" Data Successfully Inserted");
ps.close();
}
else
{
System.out.println("Inserting failed");
ps.close();
}

//con= DriverManager.getConnection("jdbc:derby://localhost:1527/coaching","sakshi","2896");       
             pst = con.createStatement();
             rs=pst.executeQuery("select * from SAKSHI.RESULT");
             teacherresulttable.setModel(DbUtils.resultSetToTableModel(rs));
  } catch (SQLException ex) {
       System.out.println("Exception occur in Add Button "+ex);
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_saveActionPerformed

    private void teacherresulttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherresulttableMouseClicked
   int selectRow=teacherresulttable.getSelectedRow();
       DefaultTableModel model=(DefaultTableModel)teacherresulttable.getModel();
       studentid.setText(model.getValueAt(selectRow,0).toString());
       name.setText(model.getValueAt(selectRow,1).toString());
       courseid.setText(model.getValueAt(selectRow,2).toString());
       coursename.setText(model.getValueAt(selectRow,3).toString());
       marks.setText(model.getValueAt(selectRow,4).toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherresulttableMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
   try{
        con= DriverManager.getConnection("jdbc:derby://localhost:1527/coaching","sakshi","2896");
        PreparedStatement ps=con.prepareStatement("update RESULT set NAME=?,COURSEID=?,COURSENAME=?,MARKS=? where STUDENTID=?");
        ps.setString(1,name.getText());
        ps.setString(2,courseid.getText());
        ps.setString(3,coursename.getText());
        ps.setString(4,marks.getText());
        ps.setString(5,studentid.getText());
        ps.executeUpdate();      
        con= DriverManager.getConnection("jdbc:derby://localhost:1527/coaching","sakshi","2896");       
             pst = con.createStatement();
             rs=pst.executeQuery("select * from SAKSHI.RESULT");
            teacherresulttable.setModel(DbUtils.resultSetToTableModel(rs));
           JOptionPane.showMessageDialog(null,"Record Updated");    
        }        
        catch(SQLException e){        
        System.out.println("Exception in Update button"+e);
        }
        /* int i=teacherresulttable.getSelectedRow();
     DefaultTableModel model=(DefaultTableModel)teacherresulttable.getModel();
     if(i>=0)
     {
         model.setValueAt(studentid.getText(),i,0);
          model.setValueAt(name.getText(),i,1);
           model.setValueAt(courseid.getText(),i,2);
            model.setValueAt(coursename.getText(),i,3);
            model.setValueAt(marks.getText(),i,4);
            JOptionPane.showMessageDialog(null,"successfully updated");
     }else{
         JOptionPane.showMessageDialog(null,"unsuccessful");
     }*/
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void studentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentidActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
     studentid.setText(null);
        name.setText(null);
        courseid.setText(null);
        coursename.setText(null);
        marks.setText(null);
       // address.setText(null);
        //salary.setText(null);
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(TSResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TSResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TSResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TSResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TSResult().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TSResult.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField courseid;
    private javax.swing.JTextField coursename;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JButton logout;
    private javax.swing.JTextField marks;
    private javax.swing.JTextField name;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JTextField studentid;
    private javax.swing.JTable teacherresulttable;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
