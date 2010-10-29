/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;
import java.sql.ResultSet;
import java.sql.SQLException;
import BD.BaseDeDatos;

/**
 *
 * @author Lizbeth
 */
public class Maestros extends BD.BaseDeDatos{
    //propiedades
    private int idMaestro;
    private int idUsuario;
    private String [][] menu = {
        {"Competencias", "maestro/competencias.jsp", "competencias"}, //ver caso de "Establecer propuestas de competencias"
        {"Reportes", "reportes.jsp", "reportes"},
        {"Evaluaciones Formativas", "evaluacionesf.jsp", "formativas"}, //Ver caso de uso "Evaluaciones formativas"
        {"Evaluaciones Acumulativa", "evaluacionesa.jsp", "acumulativas"}, //Ver caso de uso "Evaluaciones acumulativa"
        {"Estrategias", "http://localhost:8084/Siec/estrategias/", "estrategias"}//Ver caso de uso estrategias
    };

    public Maestros(int idMaestro, int idUsuario) {
        this.idMaestro = idMaestro;
        this.idUsuario = idUsuario;
    }

    public Maestros() {
    }

    // get and set
     public int getIdMaestro() {
        return idMaestro;
    }


    private void setIdMaestro(int idMaestro) {
        this.idMaestro = idMaestro;
    }

    public String [][] getMenu()
    {
        return menu;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    private void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

      //metodo to sating
    @Override
     public String toString()
     {
         String regresa="";
         StringBuilder x= new StringBuilder();
         x.append("id_usario [").append(getIdUsuario()).append("],");
         x.append("id_maestro [").append(getIdMaestro()).append("],");
         regresa=x.toString();
         return regresa;


     }
    public Maestros ObtenerMaestro(int id_usuario)
    {
                try{
                StringBuilder q = new StringBuilder();
                q.append("select * from maestros where id_usuario = ");
                q.append(id_usuario);
                ResultSet maestro = s.executeQuery (q.toString());
                maestro.next();
                Maestros miMaestro = new Maestros(Integer.parseInt(maestro.getString(1)),Integer.parseInt(maestro.getString(2)));
                return miMaestro;
                 }catch(SQLException ex)
                {
                    System.out.print(ex);
                return null;
                }
    }
     @Override// no se
    public void finalize() {
    }
     //metodo main
//    public static void main(String[] args)
//    {
//      Maestro maestro= new Maestro();
//      maestro.setIdMaestro(3);
//      maestro.setIdUsuario(4);
//      System.out.println(maestro.toString());
//
//    }
}
