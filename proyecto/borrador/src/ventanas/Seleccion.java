/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
/**
 *
 * @author Usuario
 */
public class Seleccion extends javax.swing.JFrame {

   
    public Seleccion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png"));
        return retValue;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Exit = new javax.swing.JButton();
        jLabel_Store = new javax.swing.JLabel();
        jLabel_Sale = new javax.swing.JLabel();
        jButton_irStore = new javax.swing.JButton();
        jLabel_textStore = new javax.swing.JLabel();
        jLabel_textSale = new javax.swing.JLabel();
        jButton_irSale = new javax.swing.JButton();
        jLabel_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Exit.setBackground(new java.awt.Color(0, 0, 51));
        jButton_Exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Exit.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Exit.setText("Salir");
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, -1));

        jLabel_Store.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/almacen (2).png"))); // NOI18N
        getContentPane().add(jLabel_Store, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel_Sale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sale.png"))); // NOI18N
        getContentPane().add(jLabel_Sale, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 220, 140));

        jButton_irStore.setBackground(new java.awt.Color(0, 0, 51));
        jButton_irStore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_irStore.setForeground(new java.awt.Color(255, 255, 255));
        jButton_irStore.setText("Ir");
        jButton_irStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_irStoreActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_irStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, -1));

        jLabel_textStore.setBackground(new java.awt.Color(0, 0, 51));
        jLabel_textStore.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_textStore.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_textStore.setText("Almacén");
        getContentPane().add(jLabel_textStore, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel_textSale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_textSale.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_textSale.setText("Ventas");
        getContentPane().add(jLabel_textSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, -1, -1));

        jButton_irSale.setBackground(new java.awt.Color(0, 0, 51));
        jButton_irSale.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_irSale.setForeground(new java.awt.Color(255, 255, 255));
        jButton_irSale.setText("Ir");
        jButton_irSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_irSaleActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_irSale, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
       System.exit(0);
        

    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void jButton_irStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_irStoreActionPerformed
    Store st=new Store ();
           st.setVisible(true);
	//para que se cierre la ventana uno
           dispose();

	

    }//GEN-LAST:event_jButton_irStoreActionPerformed

    private void jButton_irSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_irSaleActionPerformed
       Sale sa=new Sale ();
           sa.setVisible(true);
	//para que se cierre la ventana uno
           dispose();
      
    }//GEN-LAST:event_jButton_irSaleActionPerformed

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
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seleccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seleccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_irSale;
    private javax.swing.JButton jButton_irStore;
    private javax.swing.JLabel jLabel_Fondo;
    private javax.swing.JLabel jLabel_Sale;
    private javax.swing.JLabel jLabel_Store;
    private javax.swing.JLabel jLabel_textSale;
    private javax.swing.JLabel jLabel_textStore;
    // End of variables declaration//GEN-END:variables
}
