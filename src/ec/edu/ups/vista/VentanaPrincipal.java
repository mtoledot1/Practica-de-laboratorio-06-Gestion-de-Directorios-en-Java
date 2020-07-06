/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorDirectorio;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author tano
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private ControladorDirectorio controladorDirectorio;
    private int muestra;
    
    public VentanaPrincipal() {
	initComponents();
	controladorDirectorio = new ControladorDirectorio("/home/tano");
	txtRuta.setText(controladorDirectorio.getArchivo().getAbsolutePath());
	menuItemEliminar.setEnabled(false);
	menuItemRenombrar.setEnabled(false);
	btnInformacion.setEnabled(false);
	txtAInformacion.setText("Informacion: ");
	muestra = -1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtAInformacion = new javax.swing.JTextArea();
        txtRuta = new javax.swing.JTextField();
        btnArchivos = new javax.swing.JButton();
        btnDirectorios = new javax.swing.JButton();
        btnAOcultos = new javax.swing.JButton();
        btnDOcultos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        btnInformacion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuGestion = new javax.swing.JMenu();
        menuItemCrear = new javax.swing.JMenuItem();
        menuItemEliminar = new javax.swing.JMenuItem();
        menuItemRenombrar = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAInformacion.setColumns(20);
        txtAInformacion.setRows(5);
        jScrollPane2.setViewportView(txtAInformacion);

        txtRuta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRutaKeyPressed(evt);
            }
        });

        btnArchivos.setText("Listar Archivos");
        btnArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivosActionPerformed(evt);
            }
        });

        btnDirectorios.setText("Listar Directorios");
        btnDirectorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDirectoriosActionPerformed(evt);
            }
        });

        btnAOcultos.setText("Listar Archivos Ocultos");
        btnAOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAOcultosActionPerformed(evt);
            }
        });

        btnDOcultos.setText("Listar Directorios Ocultos");
        btnDOcultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDOcultosActionPerformed(evt);
            }
        });

        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        btnInformacion.setText("Mostrar Informacion");
        btnInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionActionPerformed(evt);
            }
        });

        menuGestion.setText("Gestionar Directorio");

        menuItemCrear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuItemCrear.setText("Crear");
        menuItemCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCrearActionPerformed(evt);
            }
        });
        menuGestion.add(menuItemCrear);

        menuItemEliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuItemEliminar.setText("Eliminar");
        menuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEliminarActionPerformed(evt);
            }
        });
        menuGestion.add(menuItemEliminar);

        menuItemRenombrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        menuItemRenombrar.setText("Renombrar");
        menuItemRenombrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRenombrarActionPerformed(evt);
            }
        });
        menuGestion.add(menuItemRenombrar);

        menuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.CTRL_MASK));
        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuGestion.add(menuItemSalir);

        jMenuBar1.add(menuGestion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(btnInformacion)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnAOcultos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(btnDOcultos)
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnArchivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDirectorios)
                        .addGap(149, 149, 149))))
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDirectorios)
                        .addGap(18, 18, 18)
                        .addComponent(btnDOcultos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnArchivos)
                        .addGap(18, 18, 18)
                        .addComponent(btnAOcultos)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnInformacion)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCrearActionPerformed
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del directorio o archivo", 
		"Crear", JOptionPane.QUESTION_MESSAGE);
	String[] options = {"Archivo","Directorio"};
	int op = JOptionPane.showOptionDialog(this, "Eliga una opcion", "Crear", 
		JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	try {
	    if(op == 0){
		controladorDirectorio.crearDirectorio(nombre, false);
		if(muestra == 0)
		    btnArchivosActionPerformed(evt);
	    }else{
		controladorDirectorio.crearDirectorio(nombre, true);
		if(muestra == 1)
		    btnDirectoriosActionPerformed(evt);
	    }
	} catch (IOException ex) {
	    JOptionPane.showMessageDialog(this, "No se ha podido crear el directorio o archivo", 
		    "Error al crear archivo o directorio", JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_menuItemCrearActionPerformed

    private void btnArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivosActionPerformed
	controladorDirectorio.actualizarArchivos();
	DefaultListModel<String> modelo = new DefaultListModel<>();
	modelo.setSize(0);
	modelo.addAll(controladorDirectorio.listarArchivos());
	lista.setModel(modelo);
	muestra = 0;
    }//GEN-LAST:event_btnArchivosActionPerformed

    private void btnAOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAOcultosActionPerformed
        controladorDirectorio.actualizarArchivos();
	DefaultListModel<String> modelo = new DefaultListModel<>();
	modelo.setSize(0);
	modelo.addAll(controladorDirectorio.listarArchivosOcultos());
	lista.setModel(modelo);
    }//GEN-LAST:event_btnAOcultosActionPerformed

    private void btnDirectoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDirectoriosActionPerformed
        controladorDirectorio.actualizarArchivos();
	DefaultListModel<String> modelo = new DefaultListModel<>();
	modelo.setSize(0);
	modelo.addAll(controladorDirectorio.listarDirectorios());
	lista.setModel(modelo);
	muestra = 1;
    }//GEN-LAST:event_btnDirectoriosActionPerformed

    private void btnDOcultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDOcultosActionPerformed
        controladorDirectorio.actualizarArchivos();
	DefaultListModel<String> modelo = new DefaultListModel<>();
	modelo.setSize(0);
	modelo.addAll(controladorDirectorio.listarDirectoriosOcultos());
	lista.setModel(modelo);
    }//GEN-LAST:event_btnDOcultosActionPerformed

    private void btnInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionActionPerformed
        String nombre = lista.getSelectedValue();
	String actual = controladorDirectorio.getRuta();
	String informacion = controladorDirectorio.mostrarInformacion(actual+"/"+nombre);
	txtAInformacion.setText("Información:\n"+informacion);
    }//GEN-LAST:event_btnInformacionActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
        if(evt.getClickCount() == 2 && !evt.isConsumed()){
	    evt.consume();
	    String actual = controladorDirectorio.getRuta();
	    String nombre = lista.getSelectedValue();
	    controladorDirectorio.setRuta(actual+"/"+nombre);
	    if(controladorDirectorio.getArchivo().isDirectory()){
		txtRuta.setText(controladorDirectorio.getRuta());
		DefaultListModel<String> modelo = new DefaultListModel<>();
		modelo.setSize(0);
		lista.setModel(modelo);
		txtAInformacion.setText("Informacion: ");
		menuItemEliminar.setEnabled(false);
		menuItemRenombrar.setEnabled(false);
		btnInformacion.setEnabled(false);
		muestra = -1;
	    }else{
		controladorDirectorio.setRuta(actual);
	    }
	}
	if(evt.getClickCount() == 1 && !evt.isConsumed()){
	    evt.consume();
	    menuItemEliminar.setEnabled(true);
	    menuItemRenombrar.setEnabled(true);
	    btnInformacion.setEnabled(true);
	}
    }//GEN-LAST:event_listaMouseClicked

    private void menuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEliminarActionPerformed
        int op = JOptionPane.showConfirmDialog(this, "¿Está seguro de eliminar el directorio o archivo?", 
		    "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	if(op == 0){
	    try {
		String actual = controladorDirectorio.getRuta();
		String nombre = lista.getSelectedValue();
		controladorDirectorio.eliminarDirectorio(actual+"/"+nombre);
		if(muestra == 0){
		    btnArchivosActionPerformed(evt);
		}else{
		    btnDirectoriosActionPerformed(evt);
		}
	    } catch (IOException ex) {
		JOptionPane.showMessageDialog(this, "No se ha podido eliminar el directorio o archivo", 
		    "Error al eliminar archivo o directorio", JOptionPane.ERROR_MESSAGE);
	    }
	}
    }//GEN-LAST:event_menuItemEliminarActionPerformed

    private void menuItemRenombrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRenombrarActionPerformed
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre del directorio o archivo", 
		"Crear", JOptionPane.QUESTION_MESSAGE);
	String actual = controladorDirectorio.getRuta();
	try {
	    controladorDirectorio.renombrarDirectorio(actual+"/"+lista.getSelectedValue(), actual+"/"+nombre);
	    if(muestra == 0){
		btnArchivosActionPerformed(evt);
	    }else{
		btnDirectoriosActionPerformed(evt);
	    }
	} catch (IOException ex) {
	    JOptionPane.showMessageDialog(this, "No se ha podido crear el directorio o archivo", 
		    "Error al crear archivo o directorio", JOptionPane.ERROR_MESSAGE);
	}
    }//GEN-LAST:event_menuItemRenombrarActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        dispose();
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void txtRutaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRutaKeyPressed
	if(evt.getKeyCode() == KeyEvent.VK_ENTER && evt.getModifiersEx() == 0){
	    String actual = controladorDirectorio.getRuta();
	    String nombre = txtRuta.getText();
	    if(controladorDirectorio.setRuta(nombre)){
		DefaultListModel<String> modelo = new DefaultListModel<>();
		modelo.setSize(0);
		lista.setModel(modelo);
		txtAInformacion.setText("Informacion: ");
		menuItemEliminar.setEnabled(false);
		menuItemRenombrar.setEnabled(false);
		btnInformacion.setEnabled(false);
		muestra = -1;
	    }else{
		JOptionPane.showMessageDialog(this, "No se ha encontrado el directorio con la ruta indicada", 
			"Directorio no encontrado", JOptionPane.ERROR_MESSAGE);
		controladorDirectorio.setRuta(actual);
	    }
	}
    }//GEN-LAST:event_txtRutaKeyPressed
    
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
	    java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (InstantiationException ex) {
	    java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
	    java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
	    java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	}
	//</editor-fold>

	/* Create and display the form */
	java.awt.EventQueue.invokeLater(new Runnable() {
	    public void run() {
		new VentanaPrincipal().setVisible(true);
	    }
	});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAOcultos;
    private javax.swing.JButton btnArchivos;
    private javax.swing.JButton btnDOcultos;
    private javax.swing.JButton btnDirectorios;
    private javax.swing.JButton btnInformacion;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista;
    private javax.swing.JMenu menuGestion;
    private javax.swing.JMenuItem menuItemCrear;
    private javax.swing.JMenuItem menuItemEliminar;
    private javax.swing.JMenuItem menuItemRenombrar;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JTextArea txtAInformacion;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
