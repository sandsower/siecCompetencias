package BD;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lugubrenator
 */
import java.sql.*;

public class BaseDeDatos {
       protected String st = "";
       protected Statement s;
       private Connection conexion;
    public BaseDeDatos(){
         // Se mete todo en un try por los posibles errores de MySQL
        //PrintWriter out = response.getWriter();
        try
        {
            // Se registra el Driver de MySQL
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());

            // Se obtiene una conexión con la base de datos. Hay que
            // cambiar el usuario "root" y la clave "la_clave" por las
            // adecuadas a la base de datos que estemos usando.
            conexion = DriverManager.getConnection (
                "jdbc:mysql://localhost/siec","root", "13450811");

            // Se crea un Statement, para realizar la consulta
            s = conexion.createStatement();

            // Se realiza la consulta. Los resultados se guardan en el
            // ResultSet rs
            /*
            ResultSet rs = s.executeQuery ("select * from usuarios");

            // Se recorre el ResultSet, mostrando por pantalla los resultados.
            while (rs.next())
            {
                st += rs.getInt ("IdUsuario") + " " + rs.getString (2);
            }

            // Se cierra la conexión con la base de datos.
            conexion.close();
             *
             */
        }
        catch (Exception e)
        {
            st = e.toString();
        }

    }

    public String getSt(){
        return this.st;
    }

    public void cerrar() throws SQLException
    {
        conexion.close();
    }
}
