
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER
 */


public class pin_validation extends javax.swing.JFrame {

    /**
     * Creates new form pin_validation
     */
    String pin="";
    String acc_no;
    int count=1;
    public pin_validation() {
        initComponents();
    }

    
    void getter(String acc){
        acc_no=acc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jbn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn_cancel = new javax.swing.JButton();
        jbtn_clear = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn_enter = new javax.swing.JButton();
        jbtn_clearbyone = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        BTN_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jbl_acno1 = new javax.swing.JLabel();
        jbl_acno = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Your PIN Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jbn1.setBackground(new java.awt.Color(68, 157, 209));
        jbn1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbn1.setText("1");
        jbn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbn1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 60, 50));

        jbtn2.setBackground(new java.awt.Color(68, 157, 209));
        jbtn2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 60, 50));

        jbtn3.setBackground(new java.awt.Color(68, 157, 209));
        jbtn3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 60, 50));

        jbtn_cancel.setBackground(new java.awt.Color(217, 4, 41));
        jbtn_cancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtn_cancel.setText("Cancel");
        jbtn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 110, 50));

        jbtn_clear.setBackground(new java.awt.Color(252, 191, 73));
        jbtn_clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtn_clear.setText("Clear");
        jbtn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 110, 50));

        jbtn6.setBackground(new java.awt.Color(68, 157, 209));
        jbtn6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 60, 50));

        jbtn5.setBackground(new java.awt.Color(68, 157, 209));
        jbtn5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 60, 50));

        jbtn4.setBackground(new java.awt.Color(68, 157, 209));
        jbtn4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 60, 50));

        jbtn7.setBackground(new java.awt.Color(68, 157, 209));
        jbtn7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 60, 50));

        jbtn8.setBackground(new java.awt.Color(68, 157, 209));
        jbtn8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 60, 50));

        jbtn9.setBackground(new java.awt.Color(68, 157, 209));
        jbtn9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtn9.setText("9");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 60, 50));

        jbtn_enter.setBackground(new java.awt.Color(138, 201, 38));
        jbtn_enter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtn_enter.setText("Enter");
        jbtn_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_enterActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 110, 50));

        jbtn_clearbyone.setBackground(new java.awt.Color(242, 100, 25));
        jbtn_clearbyone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtn_clearbyone.setText("<<");
        jbtn_clearbyone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_clearbyoneActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_clearbyone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 110, 50));

        jButton9.setBackground(new java.awt.Color(68, 157, 209));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 60, 50));

        jbtn0.setBackground(new java.awt.Color(68, 157, 209));
        jbtn0.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbtn0.setText("0");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 60, 50));

        jButton7.setBackground(new java.awt.Color(68, 157, 209));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 60, 50));

        BTN_panel.setBackground(new java.awt.Color(39, 76, 119));

        javax.swing.GroupLayout BTN_panelLayout = new javax.swing.GroupLayout(BTN_panel);
        BTN_panel.setLayout(BTN_panelLayout);
        BTN_panelLayout.setHorizontalGroup(
            BTN_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        BTN_panelLayout.setVerticalGroup(
            BTN_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(BTN_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 440, 300));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jbl_acno1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbl_acno1.setForeground(new java.awt.Color(0, 0, 255));
        jbl_acno1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jbl_acno.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jbl_acno.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jbl_acno, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jbl_acno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbl_acno1, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addComponent(jbl_acno))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 510, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbn1ActionPerformed
        // TODO add your handling code here:
        String txt=jbl_acno.getText();
        if(txt.length()<4){
        pin=txt+"1";
       jbl_acno.setText(pin);
        }
    }//GEN-LAST:event_jbn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        // TODO add your handling code here:
        String txt=jbl_acno.getText();
        if(txt.length()<4){
        pin=txt+"2";
       jbl_acno.setText(pin);
        }
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        // TODO add your handling code here:
        String txt=jbl_acno.getText();
        if(txt.length()<4){
        pin=txt+"3";
       jbl_acno.setText(pin);
        }
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelActionPerformed
        // TODO add your handling code here:
        main_interface m=new main_interface();
        m.show();
        dispose();
    }//GEN-LAST:event_jbtn_cancelActionPerformed

    private void jbtn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_clearActionPerformed
        // TODO add your handling code here:
        jbl_acno.setText("");
    }//GEN-LAST:event_jbtn_clearActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        // TODO add your handling code here:
        String txt=jbl_acno.getText();
        if(txt.length()<4){
        pin=txt+"6";
       jbl_acno.setText(pin);
        }
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        // TODO add your handling code here:
        String txt=jbl_acno.getText();
        if(txt.length()<4){
        pin=txt+"5";
       jbl_acno.setText(pin);
        }
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        // TODO add your handling code here:
        String txt=jbl_acno.getText();
        if(txt.length()<4){
        pin=txt+"4";
       jbl_acno.setText(pin);
        }
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        // TODO add your handling code here:
        String txt=jbl_acno.getText();
        if(txt.length()<4){
        pin=txt+"7";
       jbl_acno.setText(pin);
        }
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        // TODO add your handling code here:
        String txt=jbl_acno.getText();
        if(txt.length()<4){
        pin=txt+"8";
       jbl_acno.setText(pin);
        }
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        // TODO add your handling code here:
        String txt=jbl_acno.getText();
        if(txt.length()<4){
        pin=txt+"9";
       jbl_acno.setText(pin);
        }
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_enterActionPerformed
        
        if(jbl_acno.getText().length()<4){
            JOptionPane.showMessageDialog(rootPane, "PIN must has at least 4 characters");
            jbl_acno.setText("");
        }
        else{
            try {
            // TODO add your handling code here:
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ATM","root","");
            PreparedStatement ps=con.prepareStatement("Select * from user where acc_no=? and pin=?");
            ps.setString(1, acc_no);
            ps.setString(2, pin);
            
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                System.out.println(pin);
                System.out.println(acc_no);
                user_choise u=new user_choise(acc_no);
                u.getter(acc_no);
                
                u.show();
                dispose();
            }
            else{
                System.out.println(pin);
                System.out.println();
                System.out.println(acc_no);
                if(count<3){
                JOptionPane.showMessageDialog(rootPane, "Wrong PIN");
                jbl_acno.setText("");
                count++;
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Account Locked");
                    main_interface m=new main_interface();
                    m.show();
                    dispose();
                }
                
               
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(pin_validation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(pin_validation.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
       
        
    }//GEN-LAST:event_jbtn_enterActionPerformed

    private void jbtn_clearbyoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_clearbyoneActionPerformed
        // TODO add your handling code here:

        String txt=jbl_acno.getText();

        if(!txt.equals("")){
            StringBuilder sb=new StringBuilder(txt);

            sb.deleteCharAt(txt.length()-1);
            jbl_acno.setText(sb.toString());
        }
    }//GEN-LAST:event_jbtn_clearbyoneActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        // TODO add your handling code here:
        String txt=jbl_acno.getText();
        if(txt.length()<4){
        pin=txt+"0";
       jbl_acno.setText(pin);
        
        }
    }//GEN-LAST:event_jbtn0ActionPerformed

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
            java.util.logging.Logger.getLogger(pin_validation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pin_validation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pin_validation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pin_validation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pin_validation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BTN_panel;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jbl_acno;
    private javax.swing.JLabel jbl_acno1;
    private javax.swing.JButton jbn1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtn_cancel;
    private javax.swing.JButton jbtn_clear;
    private javax.swing.JButton jbtn_clearbyone;
    private javax.swing.JButton jbtn_enter;
    // End of variables declaration//GEN-END:variables
}
