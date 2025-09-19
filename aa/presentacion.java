package pruebitattt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



public class presentacion extends JFrame{
	logica gestor = new logica();	
	public presentacion(){
		this.setTitle("Valentin, Gaston");
		this.setBounds(400, 100, 500, 500);
		this.setLocationRelativeTo(null); 
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
	
		JButton btn = new JButton("Listar Productos");
		DefaultTableModel modelo = new DefaultTableModel();
		 
		modelo.addColumn("ID");
		modelo.addColumn("Producto");
		modelo.addColumn("Precio");
		JTable tabla = new JTable(modelo);
		tabla.getSelectedColumn();
	    JScrollPane scroll = new JScrollPane(tabla);
		
		this.add(btn,BorderLayout.NORTH);
		this.add(scroll);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				gestor.listarVehiculos(modelo);
					//JOptionPane.showMessageDialog(aviso, "Datos Guardados!");
				
			}
		});
	}
}
