
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public HomePage() {
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

        studbtn = new javax.swing.JButton();
        lecbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/index student.png"))); // NOI18N
        studbtn.setText("Student");
        studbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studbtnActionPerformed(evt);
            }
        });
        getContentPane().add(studbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

        lecbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/index admin.png"))); // NOI18N
        lecbtn.setText("Lecturer");
        lecbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecbtnActionPerformed(evt);
            }
        });
        getContentPane().add(lecbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, 70));

        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/exit.png"))); // NOI18N
        exitbtn.setText("Exit");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, -1, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagestobeused/index background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1370, 780));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        int y = JOptionPane.showConfirmDialog(null, "Confirm you want to exit!!?", "Thank you", JOptionPane.YES_NO_OPTION);
        if (y == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitbtnActionPerformed

    private void lecbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecbtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new LoginLec().setVisible(true);
    }//GEN-LAST:event_lecbtnActionPerformed

    private void studbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studbtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new StudentHome().setVisible(true);
    }//GEN-LAST:event_studbtnActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton lecbtn;
    private javax.swing.JButton studbtn;
    // End of variables declaration//GEN-END:variables
}