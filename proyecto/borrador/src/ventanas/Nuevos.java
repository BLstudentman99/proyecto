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
public class Nuevos extends javax.swing.JFrame {

    
    public Nuevos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    //Guarda el contenido de los productos
    //Public -> todos la pueden usar
    public static String texto = "";
    public static String precio = "";
    public static String unidades = "";
    public static String texto2 = "";
    public static String precio2 = "";
    public static String unidades2 = "";
    public static String texto3 = "";
    public static String precio3 = "";
    public static String unidades3 = "";
    public static String texto4 = "";
    public static String precio4 = "";
    public static String unidades4 = "";
    public static String Codigo1 = "" ;
    public static String Codigo2 = "" ;
    public static String Codigo3 = "" ;
    public static String Codigo4 = "" ;
    
   
    
    //Logo
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png"));
        return retValue;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Regresar = new javax.swing.JButton();
        jButton_Salida = new javax.swing.JButton();
        txtTexto = new javax.swing.JTextField();
        jButton_Agregar = new javax.swing.JButton();
        jTextField_Precio = new javax.swing.JTextField();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Precio = new javax.swing.JLabel();
        jLabel1_unidades = new javax.swing.JLabel();
        jTextField1_Unidades = new javax.swing.JTextField();
        txtTexto2 = new javax.swing.JTextField();
        jTextField_Precio2 = new javax.swing.JTextField();
        jTextField1_Unidades2 = new javax.swing.JTextField();
        txtTexto3 = new javax.swing.JTextField();
        jTextField_Precio3 = new javax.swing.JTextField();
        jTextField1_Unidades3 = new javax.swing.JTextField();
        txtTexto4 = new javax.swing.JTextField();
        jTextField_Precio4 = new javax.swing.JTextField();
        jTextField1_Unidades4 = new javax.swing.JTextField();
        codigo = new javax.swing.JLabel();
        jText_Codigo2 = new javax.swing.JTextField();
        jText_Codigo3 = new javax.swing.JTextField();
        jText_Codigo4 = new javax.swing.JTextField();
        jText_Codigo1 = new javax.swing.JTextField();
        jLabel_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Regresar.setBackground(new java.awt.Color(0, 0, 51));
        jButton_Regresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Regresar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Regresar.setText("Volver");
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton_Salida.setBackground(new java.awt.Color(0, 0, 51));
        jButton_Salida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Salida.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Salida.setText("Salir");
        jButton_Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SalidaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        txtTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTextoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 150, -1));

        jButton_Agregar.setBackground(new java.awt.Color(0, 0, 51));
        jButton_Agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Agregar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Agregar.setText("Agregar");
        jButton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        jTextField_Precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_PrecioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 90, -1));

        jLabel_Nombre.setBackground(new java.awt.Color(0, 0, 51));
        jLabel_Nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setText("Nombre del producto");
        getContentPane().add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel_Precio.setBackground(new java.awt.Color(0, 0, 51));
        jLabel_Precio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Precio.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Precio.setText("Precio   $");
        getContentPane().add(jLabel_Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        jLabel1_unidades.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1_unidades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1_unidades.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_unidades.setText("Unidades");
        getContentPane().add(jLabel1_unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));
        getContentPane().add(jTextField1_Unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, 90, -1));
        getContentPane().add(txtTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 150, -1));
        getContentPane().add(jTextField_Precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 90, -1));
        getContentPane().add(jTextField1_Unidades2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 90, -1));
        getContentPane().add(txtTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 150, -1));
        getContentPane().add(jTextField_Precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 90, -1));

        jTextField1_Unidades3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_Unidades3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1_Unidades3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 90, -1));
        getContentPane().add(txtTexto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 150, -1));
        getContentPane().add(jTextField_Precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 90, -1));
        getContentPane().add(jTextField1_Unidades4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 90, -1));

        codigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        codigo.setForeground(new java.awt.Color(255, 255, 255));
        codigo.setText("Codigo");
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));
        getContentPane().add(jText_Codigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 100, -1));
        getContentPane().add(jText_Codigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 100, -1));
        getContentPane().add(jText_Codigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 100, -1));

        jText_Codigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_Codigo1ActionPerformed(evt);
            }
        });
        getContentPane().add(jText_Codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 100, -1));

        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 671, 408));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SalidaActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_jButton_SalidaActionPerformed

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegresarActionPerformed

    Store st=new Store ();
           st.setVisible(true);
           dispose();

    }//GEN-LAST:event_jButton_RegresarActionPerformed

    private void jButton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AgregarActionPerformed
        texto= txtTexto.getText();
        precio= jTextField_Precio.getText();
        unidades=jTextField1_Unidades.getText();
        texto2= txtTexto2.getText();
        precio2= jTextField_Precio2.getText();
        unidades2=jTextField1_Unidades2.getText();
        texto3= txtTexto3.getText();
        precio3= jTextField_Precio3.getText();
        unidades3=jTextField1_Unidades3.getText();
        texto4= txtTexto4.getText();
        precio4= jTextField_Precio4.getText();
        unidades4=jTextField1_Unidades4.getText();
        
        Codigo1=jText_Codigo1.getText();
        Codigo2=jText_Codigo2.getText();
        Codigo3=jText_Codigo3.getText();
        Codigo4=jText_Codigo4.getText();
        
        
        
        Store st=new Store();
        st.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton_AgregarActionPerformed

    private void txtTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTextoActionPerformed
      
    }//GEN-LAST:event_txtTextoActionPerformed

    private void jTextField_PrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_PrecioActionPerformed
       
    }//GEN-LAST:event_jTextField_PrecioActionPerformed

    private void jTextField1_Unidades3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_Unidades3ActionPerformed
      
    }//GEN-LAST:event_jTextField1_Unidades3ActionPerformed

    private void jText_Codigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_Codigo1ActionPerformed
      
    }//GEN-LAST:event_jText_Codigo1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
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
            java.util.logging.Logger.getLogger(Nuevos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nuevos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nuevos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nuevos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nuevos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codigo;
    private javax.swing.JButton jButton_Agregar;
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JButton jButton_Salida;
    private javax.swing.JLabel jLabel1_unidades;
    private javax.swing.JLabel jLabel_Fondo;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Precio;
    private javax.swing.JTextField jTextField1_Unidades;
    private javax.swing.JTextField jTextField1_Unidades2;
    private javax.swing.JTextField jTextField1_Unidades3;
    private javax.swing.JTextField jTextField1_Unidades4;
    private javax.swing.JTextField jTextField_Precio;
    private javax.swing.JTextField jTextField_Precio2;
    private javax.swing.JTextField jTextField_Precio3;
    private javax.swing.JTextField jTextField_Precio4;
    private javax.swing.JTextField jText_Codigo1;
    private javax.swing.JTextField jText_Codigo2;
    private javax.swing.JTextField jText_Codigo3;
    private javax.swing.JTextField jText_Codigo4;
    private javax.swing.JTextField txtTexto;
    private javax.swing.JTextField txtTexto2;
    private javax.swing.JTextField txtTexto3;
    private javax.swing.JTextField txtTexto4;
    // End of variables declaration//GEN-END:variables
}
