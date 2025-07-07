/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prueba.ventana;

import javax.swing.table.DefaultTableModel;
import entidades.*;
import expediente_tramite.*;
import javax.swing.JOptionPane;
import tda.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.plaf.ComboBoxUI;
/**
 *
 * @author Evento
 */
public class Registro_Expediente extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    private DefaultTableModel modelo;
    private Administrador Admin;
    private ListaSimpleEnlazada<Dependencias> dependencias = new ListaSimpleEnlazada<>();
    private ListaSimpleEnlazada<Expediente> expedientes = new ListaSimpleEnlazada<>();
    private ListaSimpleEnlazada<Expediente> expfinalizados = new ListaSimpleEnlazada<>();
    
    
    public Registro_Expediente(Administrador admin) {
        initComponents();
        Cola<Expediente> ColaMesaDePartes = new Cola<>();
        Dependencias dependenciainicio = new Dependencias("Kelia", "Mesa_de_Partes", ColaMesaDePartes);
        Cola<Expediente> ColaAdministracion = new Cola<>();
        Dependencias dependenciaadministracion = new Dependencias("Jorge", "Administracion", ColaAdministracion);
        Cola<Expediente> ColaTecnico = new Cola<>();
        Dependencias dependenciatecnico = new Dependencias("Emanuel", "Tecnico", ColaTecnico);
        Cola<Expediente> ColaGestion = new Cola<>();
        Dependencias dependenciagestion = new Dependencias("Ana", "Gestion", ColaGestion);
        Cola<Expediente> ColaBiblioteca = new Cola<>();
        Dependencias dependenciabiblio = new Dependencias("Kiara", "Biblioteca", ColaGestion);
        dependencias.agregar(dependenciainicio);
        dependencias.agregar(dependenciaadministracion);
        dependencias.agregar(dependenciatecnico);
        dependencias.agregar(dependenciagestion);
        dependencias.agregar(dependenciabiblio);
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("PRIORIDAD");
        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRES");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("EMAIL");
        modelo.addColumn("ASUNTO");
        modelo.addColumn("Fecha Registro");
        modelo.addColumn("TIPO");
        this.jTable1.setModel(modelo);
        jComboBox1.setSelectedIndex(-1);
        Admin = new Administrador("nehemias", "123");
    }
    
    public Registro_Expediente(ListaSimpleEnlazada<Expediente> expedientes, ListaSimpleEnlazada<Dependencias> dependencias, ListaSimpleEnlazada<Expediente> expfin) {
        initComponents();
        this.expedientes = expedientes;
        this.dependencias = dependencias;
        this.expfinalizados = expfin;
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("PRIORIDAD");
        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRES");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("EMAIL");
        modelo.addColumn("ASUNTO");
        modelo.addColumn("Fecha Registro");
        modelo.addColumn("TIPO");
        this.jTable1.setModel(modelo);
        Admin = new Administrador("nehemias", "123");
        jComboBox1.setSelectedIndex(-1);
        Llenar_Expedientes_Registrados();
        setSize(1393, 447);
        Alerta();
    }
    
    public Registro_Expediente() {
        initComponents();
        Cola<Expediente> ColaMesaDePartes = new Cola<>();
        Dependencias dependenciainicio = new Dependencias("Kelia", "Mesa_de_Partes", ColaMesaDePartes);
        Cola<Expediente> ColaAdministracion = new Cola<>();
        Dependencias dependenciaadministracion = new Dependencias("Jorge", "Administracion", ColaAdministracion);
        Cola<Expediente> ColaTecnico = new Cola<>();
        Dependencias dependenciatecnico = new Dependencias("Emanuel", "Tecnico", ColaTecnico);
        Cola<Expediente> ColaGestion = new Cola<>();
        Dependencias dependenciagestion = new Dependencias("Ana", "Gestion", ColaGestion);
        Cola<Expediente> ColaBiblioteca = new Cola<>();
        Dependencias dependenciabiblio = new Dependencias("Kiara", "Biblioteca", ColaGestion);
        dependencias.agregar(dependenciainicio);
        dependencias.agregar(dependenciaadministracion);
        dependencias.agregar(dependenciatecnico);
        dependencias.agregar(dependenciagestion);
        dependencias.agregar(dependenciabiblio);
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("PRIORIDAD");
        modelo.addColumn("DNI");
        modelo.addColumn("NOMBRES");
        modelo.addColumn("TELEFONO");
        modelo.addColumn("EMAIL");
        modelo.addColumn("ASUNTO");
        modelo.addColumn("Fecha Registro");
        modelo.addColumn("TIPO");
        this.jTable1.setModel(modelo);
        jComboBox1.setSelectedIndex(-1);
        Admin = new Administrador("nehemias", "123");;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GESTIÓN DE SOCIOS v1.0");
        setMaximumSize(new java.awt.Dimension(1393, 500));
        setMinimumSize(new java.awt.Dimension(1393, 500));
        setPreferredSize(new java.awt.Dimension(1393, 500));
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(505, 52, 766, 238);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("DNI");

        jLabel3.setText("NOMBRES");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("EXTERNOS");

        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("ULIMA");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("TELEFONO");

        jLabel5.setText("EMAIL");

        jLabel6.setText("ASUNTO");

        jLabel1.setText("PRIORIDAD");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Media", "Baja" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jComboBox1, 0, 247, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(31, 31, 31)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                                        .addComponent(jTextField4))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 88, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(14, 52, 440, 377);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel21.setText("REGISTRARSE");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(124, 12, 142, 32);

        jButton5.setText("DEPENDENCIAS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(1108, 401, 114, 23);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("EXPEDIENTES REGISTRADOS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(773, 14, 228, 32);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1390, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1390, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int id;
        String prioridad = (String)this.jComboBox1.getSelectedItem();
        int dni = Integer.parseInt(this.jTextField2.getText());
        String nombre = this.jTextField3.getText();
        int telefono = Integer.parseInt(this.jTextField4.getText());
        String email = this.jTextField5.getText();
        String asunto = this.jTextField6.getText();
        LocalDateTime fecharegistro = LocalDateTime.now();
        ListaSimpleEnlazada<Documentos> documentosref = new ListaSimpleEnlazada<>();
        ListaSimpleEnlazada<Movimientos> movimientos = new ListaSimpleEnlazada<>();
        Interesado Int = null;
        if (this.jRadioButton1.isSelected())
        {
            Int = new Interesado(dni, nombre, telefono, email, "ULIMA");
        }
        else
        {
            Int = new Interesado(dni, nombre, telefono, email, "EXTERNO");
        }
        if (expedientes.iesimo(1) != null){
            id = expedientes.iesimo(expedientes.longitud()).getIdentificador() + 1;
        }else{
            id = 1;
        }
        
        Expediente Exp = new Expediente(id, prioridad, Int, asunto, fecharegistro, null, documentosref, movimientos);
        expedientes.agregar(Exp);
        
        
        
        Llenar_Expedientes_Registrados();
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField4.setText("");
        this.jTextField5.setText("");
        this.jTextField6.setText("");
        jComboBox1.setSelectedIndex(-1);
        this.buttonGroup1.clearSelection();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        boolean encontrado = false;
        int dni = Integer.parseInt(this.jTextField2.getText());
        if (!expedientes.esVacia()){
            for (int i = 1; i <= expedientes.longitud(); i++) {
                if (expedientes.iesimo(i).getDatosint().getDni() == dni){
                    this.jTextField2.setText(String.valueOf(dni));
                    this.jTextField3.setText(expedientes.iesimo(i).getDatosint().getNombres());
                    this.jTextField4.setText(String.valueOf(expedientes.iesimo(i).getDatosint().getTelefono()));
                    this.jTextField5.setText(expedientes.iesimo(i).getDatosint().getEmail());
                    if (expedientes.iesimo(i).getDatosint().getTipo().equals("ULIMA")){
                        this.jRadioButton1.setSelected(true);
                    }else{
                        this.jRadioButton2.setSelected(true);
                    }
                    encontrado = true;
                }
            }
            if (!encontrado){
                JOptionPane.showMessageDialog(null, "No se ha encontrado el dni: " + dni);
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se ha registrado ningun dni");
                }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Departamentos frmDependencias = new Departamentos(this.expedientes, this.dependencias, expfinalizados);
        frmDependencias.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public void Alerta(){
        Expediente alertaexp = null;
        
        if (alertaexp == null){
            alertaexp = Antiguo("Alta");
        }
        
        if (alertaexp == null){
            alertaexp = Antiguo("Media");
        }
        
        if (alertaexp == null){
            alertaexp = Antiguo("Baja");
        }
        
        if (alertaexp != null){
            JOptionPane.showMessageDialog(null, "Se debe atender el expediente: \n" + alertaexp.VerInfo());
        }else{
            JOptionPane.showMessageDialog(null, "No hay expedientes por atender");
        }
    }
    
    public Expediente Antiguo(String prioridad){
        Expediente expantiguo = null;
        for (int i = 1; i <= expedientes.longitud(); i++) {
            if (expedientes.iesimo(i).getPrioridad().equalsIgnoreCase(prioridad) && expedientes.iesimo(i).getMovimientos().esVacia()){
                if (expantiguo == null || expedientes.iesimo(i).getFecharegistro().isBefore(expantiguo.getFecharegistro())){
                    expantiguo = expedientes.iesimo(i);
                }
            }
        }
        return expantiguo;
    }
    
    public void Llenar_Expedientes_Registrados()
    {
        this.jTable1.setModel(modelo);
        int filas = this.jTable1.getRowCount();
        for (int i = 0; i < filas; i++)
        {
            modelo.removeRow(0);
        }
        
        String[] datos = new String[9];
        
        for (int i = 1; i <= expedientes.longitud(); i++)
        {
            datos[0] = String.valueOf(expedientes.iesimo(i).getIdentificador());
            datos[1] = expedientes.iesimo(i).getPrioridad();
            datos[2] = String.valueOf(expedientes.iesimo(i).getDatosint().getDni());
            datos[3] = expedientes.iesimo(i).getDatosint().getNombres();
            datos[4] = String.valueOf(expedientes.iesimo(i).getDatosint().getTelefono());
            datos[5] = expedientes.iesimo(i).getDatosint().getEmail();
            datos[6] = expedientes.iesimo(i).getAsunto();
            datos[7] = expedientes.iesimo(i).getFecharegistro().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
            datos[8] = expedientes.iesimo(i).getDatosint().getTipo();
            modelo.addRow(datos);
        }
        this.jTable1.setDefaultEditor(Object.class, null);
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
            java.util.logging.Logger.getLogger(Registro_Expediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Expediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Expediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Expediente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Expediente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
