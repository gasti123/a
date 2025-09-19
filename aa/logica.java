package pruebitattt;

import javax.swing.table.DefaultTableModel;


public class logica{
	persistencia bd = new persistencia();
	public static void main(String[] args){
		presentacion pr = new presentacion();
		pr.setVisible(true);	
	}
   public void listarVehiculos(DefaultTableModel modelo) {
		
		bd.btn(modelo);
		
	}
}
