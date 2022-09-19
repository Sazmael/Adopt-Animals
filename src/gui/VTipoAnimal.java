/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import clases.TipoAnimales;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Olman
 */
public class VTipoAnimal extends javax.swing.JFrame {
    private ImageIcon imagen;
    private Icon icono;
    
    DefaultTableModel lisTipos0 = new DefaultTableModel();
    
    public static Stack<TipoAnimales> tipoStack = new Stack<TipoAnimales>();
    
    static int contador = 1;
    
    public VTipoAnimal() {
        initComponents();
        this.setTitle("Registrar tipo de animales"); //Título de la ventana de la GUI.
        this.setLocationRelativeTo(null); //Centrar la ventana de la GUI.
        this.ajustarImagen(this.label_Imagen1, "src\\com\\images\\conejo.png");
        
        txt_IDAnimal.setText(String.valueOf(contador));//Mostrar el contador a inicio
        lisTipos0 = (DefaultTableModel)this.jTablaTiposMostrar.getModel();
        mostrarTablasTipo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_IDAnimal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Descripción = new javax.swing.JTextField();
        btn_GuardarTipoAnimal = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTablaTiposMostrar = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btn_Cerrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        label_Imagen1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(801, 556));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("ID asignado: ");

        txt_IDAnimal.setEditable(false);
        txt_IDAnimal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Descripción:");

        txt_Descripción.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DescripciónKeyTyped(evt);
            }
        });

        btn_GuardarTipoAnimal.setBackground(new java.awt.Color(255, 255, 0));
        btn_GuardarTipoAnimal.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btn_GuardarTipoAnimal.setText("Guardar tipo de animal");
        btn_GuardarTipoAnimal.setEnabled(false);
        btn_GuardarTipoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarTipoAnimalActionPerformed(evt);
            }
        });

        jTablaTiposMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID tipo Animal", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTablaTiposMostrar.setEnabled(false);
        jTablaTiposMostrar.setRowHeight(20);
        jScrollPane6.setViewportView(jTablaTiposMostrar);

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Tipo de animales:");

        btn_Cerrar.setBackground(new java.awt.Color(51, 255, 51));
        btn_Cerrar.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btn_Cerrar.setText("Volver");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 102));

        jLabel3.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel3.setText("Registra el tipo de animal");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Goudy Old Style", 1, 18)); // NOI18N
        jLabel4.setText("Animales");
        jLabel4.setToolTipText("");

        label_Imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/conejo.png"))); // NOI18N
        label_Imagen1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(label_Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(label_Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(txt_IDAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(txt_Descripción, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addGap(106, 106, 106))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_GuardarTipoAnimal)
                    .addComponent(btn_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_Descripción, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_IDAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btn_GuardarTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btn_Cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DescripciónKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DescripciónKeyTyped
        //Deshabilitar guardar si esta vacio
        if(txt_Descripción.getText().isEmpty()){
            btn_GuardarTipoAnimal.setEnabled(false);
        }else{
            btn_GuardarTipoAnimal.setEnabled(true);
        }
        //Condicional de la dirección para no exceder más caracteres
        if (txt_Descripción.getText().length() > 20) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }
    }//GEN-LAST:event_txt_DescripciónKeyTyped

    private void btn_GuardarTipoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarTipoAnimalActionPerformed
        //Condicional para habilitar el boton de guardar animal si no esta vacio el campo de texto
        if(txt_Descripción.getText().isEmpty()){
            btn_GuardarTipoAnimal.setEnabled(false);
        }else{
            
            btn_GuardarTipoAnimal.setEnabled(true);

            TipoAnimales tipo = new TipoAnimales(); //Instancia de tipoAnimales

            txt_IDAnimal.setText(String.valueOf(contador)); //Asignar texto al contador

            //Recoger los datos de tipo
            tipo.setIdTipoAnimal(Integer.parseInt(this.txt_IDAnimal.getText()));
            tipo.setDescripcion(this.txt_Descripción.getText());
            //Subir al stack los datos recopilados
            tipoStack.push(tipo);

            refrescarTablasTipo();
            mostrarTablasTipo();

            contador++;  //incrementador ID tipo animal
            reset();

        }
    }//GEN-LAST:event_btn_GuardarTipoAnimalActionPerformed

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
       MenuPrincipal menu = new MenuPrincipal();
       menu.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void refrescarTablasTipo(){
        int fila;
        //Borrar datos de tablas tipo
        fila = lisTipos0.getRowCount();

        for(int i = fila-1;i >=0; i--){  
         lisTipos0.removeRow(i);
         
        } 
    }
    
    private void mostrarTablasTipo(){
         //Recorrer el stack para llenar las tablas tipoAnimal
         for (Iterator<TipoAnimales> iterator = tipoStack.iterator(); iterator.hasNext();) {
            TipoAnimales next = iterator.next();
            
            lisTipos0.addRow(new Object[]{

                next.getIdTipoAnimal(), next.getDescripcion()

            });
         }
     }
    
    public void reset(){
        this.txt_Descripción.setText("");
        this.txt_IDAnimal.setText(String.valueOf(contador));
        this.btn_GuardarTipoAnimal.setEnabled(false);
    }
    
    private void ajustarImagen(JLabel lbl, String ruta){
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(
                lbl.getWidth(), 
                lbl.getHeight(), 
                Image.SCALE_DEFAULT
             )   
      );
      lbl.setIcon(this.icono);
      this.repaint();      
    }
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
            java.util.logging.Logger.getLogger(VTipoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VTipoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VTipoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VTipoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VTipoAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_GuardarTipoAnimal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTablaTiposMostrar;
    private javax.swing.JLabel label_Imagen1;
    private javax.swing.JTextField txt_Descripción;
    private javax.swing.JTextField txt_IDAnimal;
    // End of variables declaration//GEN-END:variables
}
