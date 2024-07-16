package modelo.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexión {

	static String respuesta;
	public static Connection conectado;

	public static void conexion() {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3307/db_libros";
			String user = "root";
			String pass = "";

			conectado = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void conexionExit() {
		try {
			conectado.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
