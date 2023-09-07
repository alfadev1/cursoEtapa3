/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplobradorsql;


import javax.swing.JOptionPane;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author cyka
 */
public class EjemplObradorSQL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            //Cargar Driver
            Class.forName("org.mariadb.jdbc.Driver");
            //Conexion a la db
            Connection c = DriverManager.getConnection("jdbc:mariadb://localhost:3306/obradorulp", "root","");
            //Agregar empleado 
            /*
            String sql = "INSERT INTO empleado (`dni`, `apellido`, `nombre`, `acceso`, `estado`) "
                    + "VALUES (12456789,'Molinari','Karina',1,true)";
            PreparedStatement ps = c.prepareStatement(sql);
            int registros = ps.executeUpdate();
            System.out.println(registros);
            */
            /*
            String sql = "UPDATE empleado SET nombre ='Roxana' WHERE dni = 12456789";
            PreparedStatement ps = c.prepareStatement(sql);
            int registro = ps.executeUpdate();
            System.out.println(registro);
            */
            //eliminar fisicamente un empleado(de la db)
            String sql = "DELETE FROM empleado WHERE dni = 12456789";
            PreparedStatement ps = c.prepareStatement(sql);
            int registro = ps.executeUpdate();
            System.out.println(registro);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro al cargar Driver "+ ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar "+ ex.getMessage());
        }
    }
    
}
