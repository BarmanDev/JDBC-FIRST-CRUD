
package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TestMySqlJDBC {
    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetieval=true";
        try {
            Connection conexion = DriverManager.getConnection(url, "root", "password");
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT * FROM animal;";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("Id animal " + resultado.getInt("id_animal"));
                System.out.print(" Fecha " + resultado.getString("date"));
                System.out.print(" name " + resultado.getString("name"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
  
                
    }
    
}
