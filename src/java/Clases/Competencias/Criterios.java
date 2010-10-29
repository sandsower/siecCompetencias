/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases.Competencias;

import BD.ConexionBD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class Criterios {

    private int id;
    private String nombre;
    private String descripcion;
    private int ponderacion;


    public Criterios(){}

    public Criterios(String xNombre, String xDescripcion, int xPonderacion){
    setNombre(xNombre);
    setDescripcion(xDescripcion);
    setPonderacion(xPonderacion);
    }
    public Criterios(int xId,String xNombre, String xDescripcion, int xPonderacion){
    setId(xId);
    setNombre(xNombre);
    setDescripcion(xDescripcion);
    setPonderacion(xPonderacion);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getPonderacion() {
        return ponderacion;
    }
    public void setPonderacion(int ponderacion) {
        this.ponderacion = ponderacion;
    }

    public int crearCriterio(Criterios elCriterio) throws SQLException{
        ConexionBD connect = new ConexionBD();
        Connection con = connect.getConnect();
        if(con!=null){
            try {
                PreparedStatement stmt1 = (PreparedStatement) con.prepareStatement
                            ("Insert into tc_criterios(DES_CRITERIO,DESCRIPCION,PONDERACION)"
                            +  "VALUES(?,?,?)");
                    stmt1.setString(1, this.nombre);
                    stmt1.setString(2, elCriterio.descripcion);
                    stmt1.setInt(3, elCriterio.ponderacion);
                int rows_updated = stmt1.executeUpdate();
            con.close();
            return rows_updated;
             }
            catch (SQLException ex) {
                System.out.println("SQL Exception: "+ ex.toString());
            }


        }
        return 0;
    }
    public int eliminarCriterio(int xId){
       ConexionBD connect = new ConexionBD();
       Connection con = connect.getConnect();
        try {
                PreparedStatement stmt1 = (PreparedStatement) con.prepareStatement
                            ("DELETE FROM tc_criterios WHERE id=?)");
                int rows_updated = stmt1.executeUpdate();
            con.close();
            return rows_updated;
             }
            catch (SQLException ex) {
                System.out.println("SQL Exception: "+ ex.toString());
            }
        return 0;
    }
    public void modificarCriterio(){}

    public List<Criterios> ObtenerCriterios() throws InstantiationException, IllegalAccessException{
         String login = "root";
        String password = "1597";
        String url = "jdbc:mysql://localhost/siec";
        Connection conn = null;
    try {
         Class.forName("com.mysql.jdbc.Driver").newInstance();
                conn = (Connection) DriverManager.getConnection(url,login,password);
         if (conn != null)
         {


          PreparedStatement stmt1 = (PreparedStatement) conn.prepareStatement("SELECT * FROM tc_criterios");
            ResultSet result = stmt1.executeQuery();
            List<Criterios> criterios = new ArrayList();
            while(result.next())
            {
                Criterios criterio = new Criterios(Integer.parseInt(result.getString(1)),result.getString(2), result.getString(3),Integer.parseInt(result.getString(4)));
                criterios.add(criterio);
            }
                return criterios;
    }else
    {
    return null;
    }
    }
    catch(SQLException ex) {
         System.out.println(ex);
         return null;
    }
    catch(ClassNotFoundException ex) {
    System.out.println(ex);
    return null;
    }

    }


}
