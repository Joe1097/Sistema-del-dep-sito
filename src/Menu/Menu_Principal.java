/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Clases.Producto;
import Clases.Cliente;
import Clases.Proveedor;
import Sistema_de_clientes.Sis_Clientes_Clientes;
import Sistema_de_encargado_de_mostrador.Sis_Encargado_Productos;
import Sistema_de_gerencia.Sis_Gerencia_Administracion_Gerencial;
import Sistema_de_proveedores.Sis_Proveedores_Proveedores;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author José Manuel Carrillo Torres
 */
public class Menu_Principal extends javax.swing.JFrame {

    public static List<Producto> productos = new ArrayList<>();
    public static List<Cliente> clientes = new ArrayList<>();
    public static List<Proveedor> proveedores = new ArrayList<>();
    
    /**
     * Creates new form Menu_de_Inicio
     */
    public Menu_Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        if(Iniciando_Sistema.primer_inicio){
            CargarProductos();
            CargarClientes();
            CargarProveedores();
            Iniciando_Sistema.primer_inicio=false;
        }  
        
        if(!Menu.Iniciando_Sistema.gerente){
            jButton_SistemaGerencia.setEnabled(false);
            jButton_IngresarComo.setText("Ingresar como gerente");
        }
        else{
            jButton_SistemaGerencia.setEnabled(true);
            jButton_IngresarComo.setText("Cerrar sesión de gerente");
        }
    }
    
    private void CargarProveedores(){
        try {
            FileReader FR = new FileReader("Proveedores.txt"); // Creo estos dos objetos para poder leer el txt
            BufferedReader BR = new BufferedReader(FR);
            String string=BR.readLine();  // Leo la primer linea y la guardo en "string" 
            while(string!=null){   // Mientras no se encuentre una linea nula...         
                StringTokenizer st = new StringTokenizer(string,"|");   // Creo un objeto StringTokenizer para separar en tokens a "string"  
                int id=Integer.parseInt(st.nextToken()); 
                String nombre=st.nextToken();
                long telefono=Long.parseLong(st.nextToken()); 
                String calle=st.nextToken();
                int numero=Integer.parseInt(st.nextToken()); 
                int interior=Integer.parseInt(st.nextToken()); 
                String colonia=st.nextToken();
                int cp=Integer.parseInt(st.nextToken()); 
                String municipio=st.nextToken();
                String estado=st.nextToken();
                Proveedor p = new Proveedor(id, nombre, telefono, calle, numero, interior, colonia, cp, municipio, estado); 
                proveedores.add(p);
                string=BR.readLine(); // Leo la siguiente linea                  
            }
            FR.close(); 
            BR.close(); // Cierro 
        }
        catch(IOException e){         
            final Formatter f;
            try{
                f = new Formatter("Proveedores.txt");
            }
            catch(IOException o){}
        }  
    }
    
    private void CargarClientes(){
        try {
            FileReader FR = new FileReader("Clientes.txt"); // Creo estos dos objetos para poder leer el txt
            BufferedReader BR = new BufferedReader(FR);
            String string=BR.readLine();  // Leo la primer linea y la guardo en "string" 
            while(string!=null){   // Mientras no se encuentre una linea nula...         
                StringTokenizer st = new StringTokenizer(string,"|");   // Creo un objeto StringTokenizer para separar en tokens a "string"  
                int num=Integer.parseInt(st.nextToken()); 
                int id_producto=Integer.parseInt(st.nextToken());
                int cantidad=Integer.parseInt(st.nextToken());
                Float monto=Float.valueOf(st.nextToken());
                String fecha=st.nextToken();
                Cliente c = new Cliente(num, id_producto, cantidad, monto, fecha); 
                clientes.add(c);
                string=BR.readLine(); // Leo la siguiente linea                  
            }
            FR.close(); 
            BR.close(); // Cierro 
        }
        catch(IOException e){         
            final Formatter f;
            try{
                f = new Formatter("Clientes.txt");
            }
            catch(IOException o){}
        }   
    }

    private void CargarProductos(){
        try {
            FileReader FR = new FileReader("Productos.txt");
            BufferedReader BR = new BufferedReader(FR);
            String string=BR.readLine();  
            while(string!=null){           
                StringTokenizer st = new StringTokenizer(string,"|");  
                int num=Integer.parseInt(st.nextToken()); 
                String nom=st.nextToken();
                String cont=st.nextToken();
                String lin=st.nextToken();
                int exist=Integer.parseInt(st.nextToken()); 
                Double prec=Double.parseDouble(st.nextToken());
                Producto p = new Producto(num, nom, cont, lin, exist, prec); 
                productos.add(p);
                string=BR.readLine();                 
            }
            FR.close(); 
            BR.close();
        }
        catch(IOException e){         
            final Formatter f;
            try{
                f = new Formatter("Productos.txt");
            }
            catch(IOException o){}
        }      
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_SistemaClientes = new javax.swing.JButton();
        jButton_SistemaGerencia = new javax.swing.JButton();
        jButton_SistemaEncargadoMostrador = new javax.swing.JButton();
        jButton_SistemaProveedores = new javax.swing.JButton();
        jButton_IngresarComo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú principal");
        setSize(new java.awt.Dimension(800, 600));

        jButton_SistemaClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_SistemaClientes.setText("Sistema de clientes");
        jButton_SistemaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SistemaClientesActionPerformed(evt);
            }
        });

        jButton_SistemaGerencia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_SistemaGerencia.setText("Sistema de gerencia");
        jButton_SistemaGerencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SistemaGerenciaActionPerformed(evt);
            }
        });

        jButton_SistemaEncargadoMostrador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_SistemaEncargadoMostrador.setText("Sistema de encargado de mostrador");
        jButton_SistemaEncargadoMostrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SistemaEncargadoMostradorActionPerformed(evt);
            }
        });

        jButton_SistemaProveedores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_SistemaProveedores.setText("Sistema de proveedores");
        jButton_SistemaProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SistemaProveedoresActionPerformed(evt);
            }
        });

        jButton_IngresarComo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_IngresarComo.setText("Ingresar como");
        jButton_IngresarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IngresarComoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_IngresarComo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_SistemaGerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_SistemaProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_SistemaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_SistemaEncargadoMostrador, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_SistemaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(jButton_SistemaEncargadoMostrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_SistemaGerencia, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SistemaProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_IngresarComo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SistemaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SistemaClientesActionPerformed
        Sis_Clientes_Clientes scc = new Sis_Clientes_Clientes();
        this.dispose();
        scc.setVisible(true);
    }//GEN-LAST:event_jButton_SistemaClientesActionPerformed

    private void jButton_SistemaEncargadoMostradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SistemaEncargadoMostradorActionPerformed
        Sis_Encargado_Productos sep = new Sis_Encargado_Productos();
        this.dispose();
        sep.setVisible(true);
    }//GEN-LAST:event_jButton_SistemaEncargadoMostradorActionPerformed

    private void jButton_SistemaGerenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SistemaGerenciaActionPerformed
        Sis_Gerencia_Administracion_Gerencial sgag = new Sis_Gerencia_Administracion_Gerencial();
        this.dispose();
        sgag.setVisible(true);
    }//GEN-LAST:event_jButton_SistemaGerenciaActionPerformed

    private void jButton_SistemaProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SistemaProveedoresActionPerformed
        Sis_Proveedores_Proveedores spp = new Sis_Proveedores_Proveedores();
        this.dispose();
        spp.setVisible(true);
    }//GEN-LAST:event_jButton_SistemaProveedoresActionPerformed

    private void jButton_IngresarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IngresarComoActionPerformed
        if(!Menu.Iniciando_Sistema.gerente)
            (new Menu.Login_Gerente()).setVisible(true);
        else{
            Menu.Iniciando_Sistema.gerente=false;
            this.dispose();
            (new Menu.Menu_Principal()).setVisible(true);        
        }
            
    }//GEN-LAST:event_jButton_IngresarComoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton_IngresarComo;
    private javax.swing.JButton jButton_SistemaClientes;
    private javax.swing.JButton jButton_SistemaEncargadoMostrador;
    public static javax.swing.JButton jButton_SistemaGerencia;
    private javax.swing.JButton jButton_SistemaProveedores;
    // End of variables declaration//GEN-END:variables
}
