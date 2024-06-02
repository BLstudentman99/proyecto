/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import static ventanas.Nuevos.precio;

/**
 *
 * @author Usuario
 */
public class Store extends javax.swing.JFrame {

  
    public Store() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Nuevos nu = new Nuevos();

        jLabel_Texto.setText(nu.texto);
        jLabel_Precio.setText(nu.precio);
        jLabel1_unidades.setText(nu.unidades);
        
        jLabel1_Texto2.setText(nu.texto2);
        jLabel4_Precio2.setText(nu.precio2);
        jLabel7_Uni2.setText(nu.unidades2);
        
        jLabel2_Texto3.setText(nu.texto3);
        jLabel5_Precio3.setText(nu.precio3);
        jLabel8_Uni3.setText(nu.unidades3);
        
        jLabel3_Texto4.setText(nu.texto4);
        jLabel6_Precio4.setText(nu.precio4);
        jLabel9_Uni4.setText(nu.unidades4);
        
        jLabel_Codigo1.setText(nu.Codigo1);
        jLabel_Codigo2.setText(nu.Codigo2);
        jLabel_Codigo3.setText(nu.Codigo3);
        jLabel_Codigo4.setText(nu.Codigo4);
        
        
    }
public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png"));
        return retValue;
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Exit = new javax.swing.JButton();
        jButton_return = new javax.swing.JButton();
        jButton_nuevo = new javax.swing.JButton();
        jLabel_Texto = new javax.swing.JLabel();
        jLabel_Precio = new javax.swing.JLabel();
        jLabel1_unidades = new javax.swing.JLabel();
        Producto = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        Unidades = new javax.swing.JLabel();
        producto2 = new javax.swing.JLabel();
        producto1 = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        unidades1 = new javax.swing.JLabel();
        unidades2 = new javax.swing.JLabel();
        jLabel1_Texto2 = new javax.swing.JLabel();
        jLabel2_Texto3 = new javax.swing.JLabel();
        jLabel3_Texto4 = new javax.swing.JLabel();
        jLabel4_Precio2 = new javax.swing.JLabel();
        jLabel5_Precio3 = new javax.swing.JLabel();
        jLabel6_Precio4 = new javax.swing.JLabel();
        jLabel7_Uni2 = new javax.swing.JLabel();
        jLabel8_Uni3 = new javax.swing.JLabel();
        jLabel9_Uni4 = new javax.swing.JLabel();
        Codigo = new javax.swing.JLabel();
        codigo1 = new javax.swing.JLabel();
        Codigo2 = new javax.swing.JLabel();
        jLabel_Codigo1 = new javax.swing.JLabel();
        jLabel_Codigo2 = new javax.swing.JLabel();
        jLabel_Codigo3 = new javax.swing.JLabel();
        jLabel_Codigo4 = new javax.swing.JLabel();
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

        jButton_return.setBackground(new java.awt.Color(0, 0, 51));
        jButton_return.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_return.setForeground(new java.awt.Color(255, 255, 255));
        jButton_return.setText("Volver");
        jButton_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_returnActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton_nuevo.setBackground(new java.awt.Color(0, 0, 51));
        jButton_nuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        jButton_nuevo.setText("Insertar nuevo producto");
        jButton_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_nuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jLabel_Texto.setBackground(new java.awt.Color(0, 0, 51));
        jLabel_Texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Texto.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Texto.setText("jLabel1");
        getContentPane().add(jLabel_Texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel_Precio.setBackground(new java.awt.Color(0, 0, 51));
        jLabel_Precio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Precio.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Precio.setText("jLabel1");
        getContentPane().add(jLabel_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        jLabel1_unidades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1_unidades.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_unidades.setText("jLabel1");
        getContentPane().add(jLabel1_unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, -1, -1));

        Producto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Producto.setForeground(new java.awt.Color(255, 255, 255));
        Producto.setText("Producto");
        getContentPane().add(Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        Precio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Precio.setForeground(new java.awt.Color(255, 255, 255));
        Precio.setText("Precio c/u");
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        Unidades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Unidades.setForeground(new java.awt.Color(255, 255, 255));
        Unidades.setText("Unidades");
        getContentPane().add(Unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        producto2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        producto2.setForeground(new java.awt.Color(255, 255, 255));
        producto2.setText("Guayaba");
        getContentPane().add(producto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        producto1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        producto1.setForeground(new java.awt.Color(255, 255, 255));
        producto1.setText("Kiwi");
        getContentPane().add(producto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, -1));

        precio1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio1.setForeground(new java.awt.Color(255, 255, 255));
        precio1.setText("3 $");
        getContentPane().add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        precio2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio2.setForeground(new java.awt.Color(255, 255, 255));
        precio2.setText("2 $");
        getContentPane().add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        unidades1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        unidades1.setForeground(new java.awt.Color(255, 255, 255));
        unidades1.setText("5");
        getContentPane().add(unidades1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, -1, -1));

        unidades2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        unidades2.setForeground(new java.awt.Color(255, 255, 255));
        unidades2.setText("5");
        getContentPane().add(unidades2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabel1_Texto2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1_Texto2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_Texto2.setText("jLabel1");
        getContentPane().add(jLabel1_Texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel2_Texto3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2_Texto3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2_Texto3.setText("jLabel2");
        getContentPane().add(jLabel2_Texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel3_Texto4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3_Texto4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3_Texto4.setText("jLabel3");
        getContentPane().add(jLabel3_Texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel4_Precio2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4_Precio2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4_Precio2.setText("jLabel4");
        getContentPane().add(jLabel4_Precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jLabel5_Precio3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5_Precio3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5_Precio3.setText("jLabel5");
        getContentPane().add(jLabel5_Precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        jLabel6_Precio4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6_Precio4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6_Precio4.setText("jLabel6");
        getContentPane().add(jLabel6_Precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jLabel7_Uni2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7_Uni2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7_Uni2.setText("jLabel7");
        getContentPane().add(jLabel7_Uni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        jLabel8_Uni3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8_Uni3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8_Uni3.setText("jLabel8");
        getContentPane().add(jLabel8_Uni3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        jLabel9_Uni4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9_Uni4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9_Uni4.setText("jLabel9");
        getContentPane().add(jLabel9_Uni4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));

        Codigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Codigo.setForeground(new java.awt.Color(255, 255, 255));
        Codigo.setText("Codigo");
        getContentPane().add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        codigo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        codigo1.setForeground(new java.awt.Color(255, 255, 255));
        codigo1.setText("13017");
        getContentPane().add(codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        Codigo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Codigo2.setForeground(new java.awt.Color(255, 255, 255));
        Codigo2.setText("01051");
        getContentPane().add(Codigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel_Codigo1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Codigo1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Codigo1.setText("jLabel3");
        getContentPane().add(jLabel_Codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        jLabel_Codigo2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Codigo2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Codigo2.setText("jLabel4");
        getContentPane().add(jLabel_Codigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        jLabel_Codigo3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Codigo3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Codigo3.setText("jLabel5");
        getContentPane().add(jLabel_Codigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        jLabel_Codigo4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Codigo4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Codigo4.setText("jLabel6");
        getContentPane().add(jLabel_Codigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, -1));

        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
       System.exit(0);
     
    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void jButton_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_returnActionPerformed
        Seleccion se=new Seleccion ();
           se.setVisible(true);
           dispose();

    }//GEN-LAST:event_jButton_returnActionPerformed

    private void jButton_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_nuevoActionPerformed
    Nuevos nu=new Nuevos ();
           nu.setVisible(true);
           dispose();
       
    }//GEN-LAST:event_jButton_nuevoActionPerformed

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
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Codigo;
    private javax.swing.JLabel Codigo2;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel Producto;
    private javax.swing.JLabel Unidades;
    private javax.swing.JLabel codigo1;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_nuevo;
    private javax.swing.JButton jButton_return;
    private javax.swing.JLabel jLabel1_Texto2;
    private javax.swing.JLabel jLabel1_unidades;
    private javax.swing.JLabel jLabel2_Texto3;
    private javax.swing.JLabel jLabel3_Texto4;
    private javax.swing.JLabel jLabel4_Precio2;
    private javax.swing.JLabel jLabel5_Precio3;
    private javax.swing.JLabel jLabel6_Precio4;
    private javax.swing.JLabel jLabel7_Uni2;
    private javax.swing.JLabel jLabel8_Uni3;
    private javax.swing.JLabel jLabel9_Uni4;
    private javax.swing.JLabel jLabel_Codigo1;
    private javax.swing.JLabel jLabel_Codigo2;
    private javax.swing.JLabel jLabel_Codigo3;
    private javax.swing.JLabel jLabel_Codigo4;
    private javax.swing.JLabel jLabel_Fondo;
    private javax.swing.JLabel jLabel_Precio;
    private javax.swing.JLabel jLabel_Texto;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel producto1;
    private javax.swing.JLabel producto2;
    private javax.swing.JLabel unidades1;
    private javax.swing.JLabel unidades2;
    // End of variables declaration//GEN-END:variables
}
