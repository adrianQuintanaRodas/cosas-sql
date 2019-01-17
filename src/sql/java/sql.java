package sql.java;

import java.sql.Connection;
import java.sql.DriverManager;
import static java.sql.JDBCType.NULL;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class sql {

//Datos para la conexion con la base de datos
private String usuario = "root";
private String contraseña = "";
private String host = "localhost";
private String BD = "tiendajava";
private Connection con = null;

public Connection getConexionMYSQL() {
    try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String servidor = "jdbc:mysql://" + host + "/" + BD;
        con = DriverManager.getConnection(servidor, usuario, contraseña);
        return con;
    } catch (Exception e) {
        e.printStackTrace();
        return con;
    }
}

public static void main(String[] args) {
    //Inicio un objeto de la clase Pedido
    sql con = new sql();
    //Se llama al metodo
    Connection conexion = con.getConexionMYSQL();
    //comprobar que no sea nula la conexion
    if (conexion == null) {
        System.out.println("Error en la conexion");
    } else {
        System.out.println("Conexion Exitosa");
    }
    try {
        //Aqui van las consultas!!!!!!!!!!!!!!!
        System.out.println("Bienvenidos A mi tienda!!!!");

        //TAREA!!!!! PASAR EL QUERY POR UN SCANNER!!!!!!!!!
        String query = "insert into productos (name, price)" + " values (?, ?)";
        PreparedStatement preparedStmt = conexion.prepareStatement(query);
        preparedStmt.setString(1, "srsrs");
        preparedStmt.setInt(2, 500);

        // execute the preparedstatement
        int rows = preparedStmt.executeUpdate();
        if (rows == 0) {
            System.out.println("No se pudo insertar en la tabla");
        } else {
            System.out.println("INSERT Exitoso");
        }
        //conexion.close(); siempre al final de las consultas

    } catch (SQLException e) {
        System.err.println("Got an exception!");
        System.err.println(e.getMessage());
    }
    try {
        String selectQuery = "SELECT * FROM productos";
        PreparedStatement select = conexion.prepareStatement(selectQuery);
        java.sql.ResultSet rs = select.executeQuery();

        while (rs.next()) {
            int cod = rs.getInt("cod");
            String name = rs.getString("name");
            int price = rs.getInt("price");

            System.out.println(cod + name + price);
        }

        conexion.close();
    } catch (SQLException e) {
        System.err.println("Got an exception!");
        System.err.println(e.getMessage());
    }
}
}