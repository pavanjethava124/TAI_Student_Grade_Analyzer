
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pavan
 */
public class Gradecal extends javax.swing.JFrame {

    /**
     * Creates new form Gradecal
     */
    public Gradecal() {
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

        jLabel1 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        lblenglish = new javax.swing.JLabel();
        lblchemistry = new javax.swing.JLabel();
        lblsn = new javax.swing.JLabel();
        lblgrade = new javax.swing.JLabel();
        lblphysics = new javax.swing.JLabel();
        lblsid = new javax.swing.JLabel();
        lblmaths = new javax.swing.JLabel();
        lblper = new javax.swing.JLabel();
        lblsection = new javax.swing.JLabel();
        txtsection = new javax.swing.JTextField();
        txtstdname = new javax.swing.JTextField();
        txtstdid = new javax.swing.JTextField();
        txtphysics = new javax.swing.JTextField();
        txtgrade = new javax.swing.JTextField();
        txtchemistry = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        txtmaths = new javax.swing.JTextField();
        txtenglish = new javax.swing.JTextField();
        txtper = new javax.swing.JTextField();
        btnclr = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btncalc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(425, 125));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("ABC Public School, Mumbai");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 18, 252, 37));

        lbltotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbltotal.setText("Total Marks");
        getContentPane().add(lbltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, -1));

        lblenglish.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblenglish.setText("English");
        getContentPane().add(lblenglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 70, -1));

        lblchemistry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblchemistry.setText("Chemistry");
        getContentPane().add(lblchemistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 70, -1));

        lblsn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblsn.setText("Student Name:");
        getContentPane().add(lblsn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 90, -1));

        lblgrade.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblgrade.setText("Grade");
        getContentPane().add(lblgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 70, -1));

        lblphysics.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblphysics.setText("Physics");
        getContentPane().add(lblphysics, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 70, -1));

        lblsid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblsid.setText("Student ID:");
        getContentPane().add(lblsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 70, -1));

        lblmaths.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblmaths.setText("Maths");
        getContentPane().add(lblmaths, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 70, -1));

        lblper.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblper.setText("Percentage");
        getContentPane().add(lblper, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 70, -1));

        lblsection.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblsection.setText("Section");
        getContentPane().add(lblsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 70, 20));

        txtsection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsectionActionPerformed(evt);
            }
        });
        getContentPane().add(txtsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 80, -1));

        txtstdname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstdnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtstdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 130, -1));

        txtstdid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstdidActionPerformed(evt);
            }
        });
        getContentPane().add(txtstdid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 80, -1));

        txtphysics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphysicsActionPerformed(evt);
            }
        });
        getContentPane().add(txtphysics, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 80, -1));

        txtgrade.setEditable(false);
        txtgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgradeActionPerformed(evt);
            }
        });
        getContentPane().add(txtgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 80, -1));

        txtchemistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtchemistryActionPerformed(evt);
            }
        });
        getContentPane().add(txtchemistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 80, -1));

        txttotal.setEditable(false);
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });
        getContentPane().add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 80, -1));

        txtmaths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmathsActionPerformed(evt);
            }
        });
        getContentPane().add(txtmaths, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 80, -1));

        txtenglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtenglishActionPerformed(evt);
            }
        });
        getContentPane().add(txtenglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 80, -1));

        txtper.setEditable(false);
        txtper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtperActionPerformed(evt);
            }
        });
        getContentPane().add(txtper, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 80, -1));

        btnclr.setBackground(new java.awt.Color(102, 0, 102));
        btnclr.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnclr.setForeground(new java.awt.Color(255, 255, 255));
        btnclr.setText("Clear");
        btnclr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclrActionPerformed(evt);
            }
        });
        getContentPane().add(btnclr, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        btnexit.setBackground(new java.awt.Color(102, 0, 102));
        btnexit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnexit.setForeground(new java.awt.Color(255, 255, 255));
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        btncalc.setBackground(new java.awt.Color(102, 0, 102));
        btncalc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btncalc.setForeground(new java.awt.Color(255, 255, 255));
        btncalc.setText("Calculate");
        btncalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcActionPerformed(evt);
            }
        });
        getContentPane().add(btncalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsectionActionPerformed

    private void txtstdnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstdnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstdnameActionPerformed

    private void txtstdidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstdidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstdidActionPerformed

    private void txtphysicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphysicsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphysicsActionPerformed

    private void txtgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgradeActionPerformed

    private void txtchemistryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtchemistryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtchemistryActionPerformed

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalActionPerformed

    private void txtmathsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmathsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmathsActionPerformed

    private void txtenglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtenglishActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtenglishActionPerformed

    private void txtperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtperActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtperActionPerformed

    private void btncalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcActionPerformed
        // TODO add your handling code here:
        
        double physics,chemistry,maths,english,total,avg;
        String grade;
      
        physics= Integer.parseInt(txtphysics.getText());
        chemistry= Integer.parseInt(txtchemistry.getText());
        maths= Integer.parseInt(txtmaths.getText());
        english= Integer.parseInt(txtenglish.getText());
        
        total=physics+chemistry+maths+english;
        avg=total/4;
        
        if(avg>=85)
        {
        grade="A";    
        }
        
        else if(avg>=75)
        {
        grade="B";    
        }
        
       else if(avg>=65)
        {
        grade="C";    
        }
        
        else if(avg>=45)
        {
        grade="S";    
        }
        
        else
        {
        grade="F";    
        }
        txttotal.setText(String.valueOf(total));
        txtper.setText(String.valueOf(avg));
        txtgrade.setText(grade);
        
        String nm=txtstdname.getText();
        String cls=txtsection.getText();
        String grader=txtgrade.getText();
        
        JOptionPane.showMessageDialog(null,"Hello "+nm +" of class:" +cls+"\nYour Grade is:"+grader);
       
       
        
    }//GEN-LAST:event_btncalcActionPerformed

    private void btnclrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclrActionPerformed
        // TODO add your handling code here:
        
        txtstdid.setText("");
        txtstdname.setText("");
        txtchemistry.setText("");
        txtphysics.setText("");
        txtsection.setText("");
        txtmaths.setText("");
        txtenglish.setText("");
        txtper.setText("");
        txttotal.setText("");
        txtgrade.setText("");
    }//GEN-LAST:event_btnclrActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

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
            java.util.logging.Logger.getLogger(Gradecal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gradecal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gradecal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gradecal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gradecal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalc;
    private javax.swing.JButton btnclr;
    private javax.swing.JButton btnexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblchemistry;
    private javax.swing.JLabel lblenglish;
    private javax.swing.JLabel lblgrade;
    private javax.swing.JLabel lblmaths;
    private javax.swing.JLabel lblper;
    private javax.swing.JLabel lblphysics;
    private javax.swing.JLabel lblsection;
    private javax.swing.JLabel lblsid;
    private javax.swing.JLabel lblsn;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JTextField txtchemistry;
    private javax.swing.JTextField txtenglish;
    private javax.swing.JTextField txtgrade;
    private javax.swing.JTextField txtmaths;
    private javax.swing.JTextField txtper;
    private javax.swing.JTextField txtphysics;
    private javax.swing.JTextField txtsection;
    private javax.swing.JTextField txtstdid;
    private javax.swing.JTextField txtstdname;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
