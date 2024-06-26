/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication6;

import ejer5.utils.UtilidadesGrafica;
import gestores.GestorArticulos;
import gestores.MyException;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jdk.jshell.execution.Util;
import modelos.Articulo;

/**
 *
 * @author Alumno
 */
public class Ventana extends javax.swing.JFrame {
    Articulo ul = null;
    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        //¿Se puede poner aquí?: Si
        creaArticulosBorrar();
        rellenoCombo();
        inicializaVentana();
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
        etiDescripcion = new javax.swing.JLabel();
        etiPrecio = new javax.swing.JLabel();
        etiDepartamento = new javax.swing.JLabel();
        textoDescripcion = new javax.swing.JTextField();
        textoPrecio = new javax.swing.JTextField();
        comboDepartamento = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        botonAlta = new javax.swing.JButton();
        botonPrevius = new javax.swing.JButton();
        botonNext = new javax.swing.JButton();
        botonBaja = new javax.swing.JToggleButton();
        botonLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textVisualizador = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiDescripcion.setText("Descripción");

        etiPrecio.setText("Precio");

        etiDepartamento.setText("Departamento");

        jLabel1.setFont(new java.awt.Font("Sitka Small", 2, 24)); // NOI18N
        jLabel1.setText("ARTICULO");

        botonAlta.setText("ALTA");
        botonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAltaActionPerformed(evt);
            }
        });

        botonPrevius.setText("<--");
        botonPrevius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPreviusActionPerformed(evt);
            }
        });

        botonNext.setText("-->");
        botonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNextActionPerformed(evt);
            }
        });

        botonBaja.setText("BAJA");
        botonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajaActionPerformed(evt);
            }
        });

        botonLimpiar.setText("LIMPIAR");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(textVisualizador);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonLimpiar)
                            .addComponent(etiDescripcion)
                            .addComponent(etiDepartamento)
                            .addComponent(etiPrecio)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonBaja)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textoPrecio)
                                .addComponent(comboDepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(textoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(botonPrevius, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiDescripcion)
                            .addComponent(textoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiPrecio)
                            .addComponent(textoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiDepartamento)
                            .addComponent(comboDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAlta)
                            .addComponent(botonPrevius)
                            .addComponent(botonNext)
                            .addComponent(botonBaja))
                        .addGap(18, 18, 18)
                        .addComponent(botonLimpiar)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonPreviusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPreviusActionPerformed
        try {
            Articulo a = GestorArticulos.previusArticulo();
            
            if (a == null) {
                throw new MyException("No hay ningun elemento en la izquierda.");
            }
            rellenaTextos(a);
        } catch (MyException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }//GEN-LAST:event_botonPreviusActionPerformed

    private void botonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNextActionPerformed
        try {
            Articulo a = GestorArticulos.nextArticulo();
            
            if (a == null) {
                throw new MyException("No hay ningun elemento en la derecha.");
            }
            rellenaTextos(a);
        } catch (MyException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_botonNextActionPerformed

    private void botonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAltaActionPerformed
        try {
            Articulo n = new Articulo(textoDescripcion.getText(), textoPrecio.getText(), Articulo.DEPARTAMENTOS[comboDepartamento.getSelectedIndex()]);
            
            if (!GestorArticulos.addArticulo(n)) {
                throw new MyException("El articulo no se ha dado de alta: Por que el articulo ya estaba dado de alta");
            }
            UtilidadesGrafica.muestraMensaje("Dado de alta correctamente");
            rellenaTextos(n);
        } catch (MyException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_botonAltaActionPerformed

    
    
    
    
    
    private void botonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajaActionPerformed

        Articulo a = GestorArticulos.removeArticulo();
        rellenaTextos(a);

        
        
        
        UtilidadesGrafica.muestraMensaje("Dado de baja correctamente");
    }//GEN-LAST:event_botonBajaActionPerformed

    
    
    
    
    
    

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiaTodo();
    }//GEN-LAST:event_botonLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
                
            }
        });
    }
    
    public static void creaArticulosBorrar() {
        Articulo a = new Articulo(
                "Una descripcionº", 333, "Perfumeria");
        Articulo a1 = new Articulo(
                "Dos descripcionº", 110, "Mascotas");
        Articulo a2 = new Articulo(
                "Tres descripcionº", 456, "Perfumeria");
        Articulo a3 = new Articulo(
                "Cuatro descripcionº", 777, "Mascotas");
        Articulo a4 = new Articulo(
                "Cinco descripcionº", 213, "Perfumeria");
        Articulo a5 = new Articulo(
                "Seis descripcionº", 003, "Deportes");
        Articulo a6 = new Articulo(
                "Siete descripcionº", 444, "Deportes");
        Articulo a7 = new Articulo(
                "Ocho descripcionº", 111, "Perfumeria");
        Articulo a8 = new Articulo(
                "Nueve descripcionº", 322, "Mascotas");
        Articulo a9 = new Articulo(
                "Dieez descripcionº", 999, "Deportes");
        GestorArticulos.addArticulo(a);
        GestorArticulos.addArticulo(a1);
        GestorArticulos.addArticulo(a2);
        GestorArticulos.addArticulo(a3);
        GestorArticulos.addArticulo(a4);
        GestorArticulos.addArticulo(a5);
        GestorArticulos.addArticulo(a6);
        GestorArticulos.addArticulo(a7);
        GestorArticulos.addArticulo(a8);
        GestorArticulos.addArticulo(a9);
    }
    
    private void inicializaVentana() {
        //  ImageIcon derecha = new ImageIcon("");
        // ImageIcon derecha = new ImageIcon();
        //botonPrevius.setIcon(izquierda);
        //  botonNext.setIcon(derecha);
        try {
            Articulo a = gestores.GestorArticulos.primerArticulo();
            System.out.println(a);
            rellenaTextos(a);
        } catch (MyException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void limpiaTodo() {
        comboDepartamento.setSelectedIndex(0);
        textoDescripcion.setText("");
        textoPrecio.setText("");
    }
    
    private void rellenaTextos(Articulo a) {
        if (a==null) {
            //Caso de que al borrar haya 1 o 0 artículos. 
            limpiaTodo();
            listadoIteratorArticulos();
            try {
                rellenaTextos(GestorArticulos.primerArticulo());
            } catch (MyException ex) {
                muestraError(ex.getMessage());
            }
        }else {
            comboDepartamento.setSelectedIndex(a.getNumDepartamento());
            textoDescripcion.setText(a.getDescripcion());
            textoPrecio.setText(a.getPrecio() + "");
            listadoIteratorArticulos();
        }
        
    }
    
    public void rellenoCombo() {
        for (int i = 0; i < Articulo.DEPARTAMENTOS.length; i++) {
            comboDepartamento.addItem(Articulo.DEPARTAMENTOS[i]);
        }
        comboDepartamento.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAlta;
    private javax.swing.JToggleButton botonBaja;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonNext;
    private javax.swing.JButton botonPrevius;
    private javax.swing.JComboBox<String> comboDepartamento;
    private javax.swing.JLabel etiDepartamento;
    private javax.swing.JLabel etiDescripcion;
    private javax.swing.JLabel etiPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane textVisualizador;
    private javax.swing.JTextField textoDescripcion;
    private javax.swing.JTextField textoPrecio;
    // End of variables declaration//GEN-END:variables

    private void muestraError(String message) {
        UtilidadesGrafica.muestraError(message);
    }

    private void listadoIteratorArticulos() {
        textVisualizador.setText(GestorArticulos.listadoArticulos());
    }

    
}
