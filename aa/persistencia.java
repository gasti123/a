package pruebitattt;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class persistencia {
	private final String URL = "jdbc:mysql://23.111.185.242/program1_avanzada?useSSL=false";
	private final String USR = "program1_estudiantes";
	private final String PSS = "estudiantesarrayanes";
	
	private Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USR, PSS);
	}
	public void btn(DefaultTableModel modelo) {
		String sentencia = "SELECT ID, Producto, Precio, FROM productos";
		
		try {
			Connection conexion = getConnection();
			PreparedStatement declaracionSQL = conexion.prepareStatement(sentencia);
			ResultSet rs = declaracionSQL.executeQuery();
			
			while(rs.next()) {
				String ID = rs.getString(1);
				String Producto = rs.getString(2);
				String Precio = rs.getString(3);
		
			Object[] fila = {ID, Producto, Precio };
			modelo.addRow(fila);
		}
		
	}catch(Exception e) {
		JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
	}
	
	
}
}
