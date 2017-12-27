
package Producto;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Precio extends javax.swing.JFrame {
   
    
   Producto pro1;
   private listaProducto Lp=new listaProducto();
   DefaultTableModel modeloProducto;
   private int pos=0;
   
   
   
   public Precio() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtDescripcion = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtSmin = new javax.swing.JTextField();
        jtSact = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtabla = new javax.swing.JTable();

        jLabel5.setText("jLabel5");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo");

        jLabel2.setText("Descripción");

        jLabel3.setText("Precio");

        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
            }
        });
        jtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtCodigoKeyPressed(evt);
            }
        });

        jtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescripcionActionPerformed(evt);
            }
        });

        jLabel4.setText("Sistema de consulta de precios");

        jLabel6.setText("Stock Minimo");

        jLabel7.setText("Stock Actual");

        jtSmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtSminActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jtabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtCodigo)
                                            .addComponent(jtDescripcion)
                                            .addComponent(jtPrecio)
                                            .addComponent(jtSmin)
                                            .addComponent(jtSact, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtSmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtSact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed
  
    }//GEN-LAST:event_jtCodigoActionPerformed

    private void jtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescripcionActionPerformed
    
    }//GEN-LAST:event_jtDescripcionActionPerformed

    private void jtSminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtSminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtSminActionPerformed

    private void jtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCodigoKeyPressed
 
     if(evt.getKeyCode() == KeyEvent.VK_ENTER){
       Producto probuscado=new Producto();
        //JOptionPane.showMessageDialog(null,lp.size());
        String codigo=jtCodigo.getText();
        //pro1=new Producto("0001","A",1,1,1);
       //Lp.AgregarProd(pro1);
      
        pos=Lp.buscarProducto(codigo);
       if (pos>-1 && Lp.largo()>0)
       {
           probuscado=Lp.regresaProducto(codigo);
        jtDescripcion.setText(probuscado.getDescripcion());
      
                    int preInt=probuscado.getPrecio();
                    String preString=String.valueOf(preInt);
             jtPrecio.setText(preString);
      
                    int sminInt=probuscado.getStockMinimo();
                    String sminString=String.valueOf(sminInt);
             jtSmin.setText(sminString);

                    int sactInt=probuscado.getStockActual();
                    String sactString=String.valueOf(sactInt);
             jtSact.setText(sactString);
      }else{
            JOptionPane.showMessageDialog(null, "Codigo No registrado,favor ingresar producto");
            jtCodigo.setText("");
            jtDescripcion.setText("");
            jtPrecio.setText("");
            jtSmin.setText("");
            jtSact.setText("");
       }
    }//GEN-LAST:event_jtCodigoKeyPressed
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
      jtCodigo.setText("");
      jtDescripcion.setText("");
      jtPrecio.setText("");
      jtSmin.setText("");
      jtSact.setText("");
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        
        // acción presionar el boton guardar
        
        
       
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:JOptionPane.showMessageDialog(null,"entra al metodo");
        
        String cod=jtCodigo.getText();
        
        String des=jtDescripcion.getText();
        
        String preString=jtPrecio.getText();
        int preInt=Integer.parseInt(preString);
        
        String sminString=jtSmin.getText();
        int sminInt=Integer.parseInt(sminString);
        
        String sactString=jtSact.getText();
        int sactInt=Integer.parseInt(sactString);
        
        Producto pd=new Producto(cod,des,preInt,sminInt,sactInt);
         
        Lp.AgregarProd(pd);
        cargarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         
        
        Producto probuscado=new Producto();
         String codigo=jtCodigo.getText();
         
        pos=Lp.buscarProducto(codigo);
        
       if (pos>-1 && Lp.largo()>0){
           
            probuscado=Lp.regresaProducto(codigo);
            jtDescripcion.setText(probuscado.getDescripcion());
      
                    int preInt=probuscado.getPrecio();
                    String preString=String.valueOf(preInt);
             jtPrecio.setText(preString);
      
                    int sminInt=probuscado.getStockMinimo();
                    String sminString=String.valueOf(sminInt);
             jtSmin.setText(sminString);

                    int sactInt=probuscado.getStockActual();
                    String sactString=String.valueOf(sactInt);
             jtSact.setText(sactString);
             cargarTabla();
      }else{
            JOptionPane.showMessageDialog(null, "Codigo No registrado,favor ingresar producto");
            jtCodigo.setText("");
            jtDescripcion.setText("");
            jtPrecio.setText("");
            jtSmin.setText("");
            jtSact.setText("");
            cargarTabla();
       }
    }//GEN-LAST:event_jButton3ActionPerformed
 public void limpiarTabla(JTable jtabla){
        try {
            DefaultTableModel modelo=(DefaultTableModel) jtabla.getModel();
            int filas=jtabla.getRowCount();
            for (int i = 0;filas>i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
        
    }
    
    public void cargarTabla() {
       
        limpiarTabla(jtabla); 
     
        DefaultTableModel modelo = (DefaultTableModel)jtabla.getModel();
  
    
        String datos[] = new String[4];
   
        
        
        for (int i = 0; i < Lp.largo(); i++) {
    
        datos[0] = Lp.RegresaObje(i).getCodigo();
        datos[1] = Lp.RegresaObje(i).getDescripcion();
        datos[2] = Integer.toString(Lp.RegresaObje(i).getStockMinimo());
        datos[3] = Integer.toString(Lp.RegresaObje(i).getStockActual());

modelo.addRow(datos);
}
   
    }
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
            java.util.logging.Logger.getLogger(Precio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Precio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Precio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Precio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Precio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtSact;
    private javax.swing.JTextField jtSmin;
    private javax.swing.JTable jtabla;
    // End of variables declaration//GEN-END:variables
}
