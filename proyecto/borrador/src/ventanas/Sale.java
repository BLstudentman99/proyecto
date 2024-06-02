/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import static ventanas.Nuevos.Codigo1;
/**
 *
 * @author Usuario
 */
public class Sale extends javax.swing.JFrame {

    /**
     * Creates new form Sale
     */
    public Sale() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Nuevos nu = new Nuevos();
        

//int numero1 = Integer.parseInt(nu.Codigo1);
//int numero2 = Integer.parseInt(nu.Codigo2);
//int numero3 = Integer.parseInt(nu.Codigo3);
//int numero4 = Integer.parseInt(nu.Codigo4);
//int numero5 = Integer.parseInt(obo);
//int numero6 = Integer.parseInt(nu.unidades);
//int numero7 = Integer.parseInt(nu.unidades2);
//int numero8 = Integer.parseInt(nu.unidades3);
//int numero9 = Integer.parseInt(nu.unidades4);
    
    

    
            }
         
        public static int NueVa1 ;
        public static int NueVa2 = 0;
        public static boolean NueVa3 ;
        public static String code = "";
        public static String no = "No hay";
    

    
public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Exit = new javax.swing.JButton();
        jButton_Return = new javax.swing.JButton();
        Producto = new javax.swing.JLabel();
        Unidades = new javax.swing.JLabel();
        TxtCodigoN = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        nombre = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        jLabel_name = new javax.swing.JLabel();
        jLabel_Uni = new javax.swing.JLabel();
        jLabel_pre = new javax.swing.JLabel();
        jLabel_Fondo = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();

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
        getContentPane().add(jButton_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, -1, 30));

        jButton_Return.setBackground(new java.awt.Color(0, 0, 51));
        jButton_Return.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_Return.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Return.setText("Volver");
        jButton_Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReturnActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Producto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Producto.setForeground(new java.awt.Color(255, 255, 255));
        Producto.setText("codigo");
        getContentPane().add(Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        Unidades.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Unidades.setForeground(new java.awt.Color(255, 255, 255));
        Unidades.setText("Unidades");
        getContentPane().add(Unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        TxtCodigoN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoNActionPerformed(evt);
            }
        });
        getContentPane().add(TxtCodigoN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 110, -1));

        Agregar.setBackground(new java.awt.Color(0, 0, 51));
        Agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Agregar.setForeground(new java.awt.Color(255, 255, 255));
        Agregar.setText("Sale");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        nombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombre ");
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        Precio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Precio.setForeground(new java.awt.Color(255, 255, 255));
        Precio.setText("Precio");
        getContentPane().add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        jLabel_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_name.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        jLabel_Uni.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_Uni.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_Uni, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        jLabel_pre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_pre.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_pre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        jLabel_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -9, 700, 470));

        Mensaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Mensaje.setText("jLabel1");
        getContentPane().add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void jButton_ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReturnActionPerformed
                                                     
        Seleccion se=new Seleccion ();
           se.setVisible(true);
           dispose();

    }//GEN-LAST:event_jButton_ReturnActionPerformed

    private void TxtCodigoNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigoNActionPerformed
     
    }//GEN-LAST:event_TxtCodigoNActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
    Nuevos nu = new Nuevos();
        code= TxtCodigoN.getText();
     
// se colocan los datos en la tabla  
        if(code.equals(nu.Codigo1)){
        jLabel_name.setText(nu.texto);
        jLabel_Uni.setText(nu.unidades);
        jLabel_pre.setText(nu.precio);
}
   else if (code.equals(nu.Codigo2)){
    jLabel_name.setText(nu.texto2);
    jLabel_Uni.setText(nu.unidades2);
    jLabel_pre.setText(nu.precio2);
}
else if(code.equals(nu.Codigo3)){
    jLabel_name.setText(nu.texto3);
    jLabel_Uni.setText(nu.unidades3);
    jLabel_pre.setText(nu.precio3);
}
else if(code.equals(nu.Codigo4)){
    jLabel_name.setText(nu.texto4);
    jLabel_Uni.setText(nu.unidades4);
    jLabel_pre.setText(nu.precio4);
 } else 
        // si no esta el codigo se indica al usuario.
        
      JOptionPane.showMessageDialog(this, "codigo no encontrado");  
       /* boolean same = Pro1(code); 
if (true){
    }    
}
else
    JOptionPane.showMessageDialog(this, "producto fuera de stock");*/

       // TODO add your handling code here:
    }//GEN-LAST:event_AgregarActionPerformed
   /* public static boolean Pro1(String code){  
 
  Nuevos nu = new Nuevos();
        boolean same;
        // codigo de producto = a codigo de producto 1
      if (code.equals(nu.Codigo1)){
          //si hay se indica para uso posterior
          same=true;
      if (code.equals(nu.Codigo2)){
          //si hay se indica para uso posterior
          same=true;
      }
      if (code.equals(nu.Codigo3)){
          //si hay se indica para uso posterior
          same=true;
      }
      if (code.equals(nu.Codigo4)){
          //si hay se indica para uso posterior
          same=true;
      }
      }else
          same=false;
      return same;
    }*/
            
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
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel Producto;
    private javax.swing.JTextField TxtCodigoN;
    private javax.swing.JLabel Unidades;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_Return;
    private javax.swing.JLabel jLabel_Fondo;
    private javax.swing.JLabel jLabel_Uni;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_pre;
    private javax.swing.JLabel nombre;
    // End of variables declaration//GEN-END:variables
}
