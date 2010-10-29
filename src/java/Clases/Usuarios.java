package Clases;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuarios extends BD.BaseDeDatos {

    private int id = 0;
    private String nombre = "";
    private String usname = "";
    private String appaterno = "";
    private String apmaterno = "";
    private String pass = "";
    private String img = "sinavatar.jpg";
    private int perfil = 0;


    public Usuarios(){}
    public Usuarios(int id, String nombre, String usname, String pass){
        setId(id);
        setNombre(nombre);
        setUsname(usname);
        setPass(pass);

   }
    public Usuarios(int id, String nombre, String usname, String pass, String img, String appaterno, String apmaterno){
        setId(id);
        setNombre(nombre);
        setUsname(usname);
        setPass(pass);
        this.setImg(img);
        this.setApmaterno(apmaterno);
        this.setAppaterno(appaterno);
   }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getUsname() {
        return usname;
    }
    public void setUsname(String usname) {
        this.usname = usname;
    }
    @Override
    public String toString(){
        return this.getNombre()+" "+this.getAppaterno()+" "+this.getApmaterno();
    }

    public boolean Login(String usname,String pass) throws SQLException{
        //List<Usuarios>u = Usuarios.CrearUsuarios();
            
            ResultSet rs = s.executeQuery ("SELECT USUARIO_ID, USUARIO, PERFIL_ID FROM tr_usuario WHERE  USUARIO = '" + usname + "' AND PASSWORD = '" + pass + "'");
            System.out.println(rs.toString());
            this.st = "no logeado " + "SELECT USUARIO_ID, USUARIO, PERFIL_ID FROM tr_usuario WHERE  USUARIO = '" + usname + "' AND PASSWORD = '" + pass + "'";
            if(rs.last() == true){
                this.id = rs.getInt("USUARIO_ID");
                this.usname = rs.getString("USUARIO");
                this.perfil = rs.getInt("PERFIL_ID");
                this.st = "logeado";
                return true;
            }
        return false;
    }

    public Usuarios obtenerUsuario(int id_usuario)
    {
          try {
                StringBuilder q = new StringBuilder();
                q.append("select  * ");
                q.append("from tr_usuario where USUARIO_ID = ");
                q.append(id_usuario);
                ResultSet usuario = s.executeQuery(q.toString());
                usuario.next();
                //Usuarios(int id, String nombre, String usname, String pass, String img, String appaterno, String apmaterno)
                Usuarios usuarioc = new Usuarios (Integer.parseInt(usuario.getString(1)),
                                                  usuario.getString(2),
                                                  usuario.getString(6),
                                                  usuario.getString(7),
                                                  usuario.getString(9),
                                                  usuario.getString(3),
                                                  usuario.getString(4)
                                                  );
            return usuarioc;
            } catch (SQLException ex) {
                System.out.print("Error: "+ex);
                return null;
            }
    }
    public Usuarios obtenerUsuario(String usname, String password)
    {
          try {
                StringBuilder q = new StringBuilder();
                q.append("select  * ");
                q.append(" from tr_usuario where USUARIO = '");
                q.append(usname);
                q.append("' and PASSWORD = '");
                q.append(password);
                q.append("'");
                ResultSet usuario = s.executeQuery(q.toString());
                usuario.next();
                //Usuarios(int id, String nombre, String usname, String pass, String img, String appaterno, String apmaterno)
                Usuarios usuarioc = new Usuarios (Integer.parseInt(usuario.getString(1)),
                                                  usuario.getString(2),
                                                  usuario.getString(6),
                                                  usuario.getString(7),
                                                  usuario.getString(9),
                                                  usuario.getString(3),
                                                  usuario.getString(4)
                                                  );
            return usuarioc;
            } catch (SQLException ex) {
                System.out.print("Error: "+ex);
                return null;
            }
    }

    /**
     * @return the perfil
     */
    public int getPerfil() {
        return perfil;
    }

    public void setPerfil(int perfil){
        this.perfil = perfil;
    }

    public String [][] getMenu(){
        String [][] s = null;
        switch(this.perfil)
        {
            case 1:
                Maestros m = new Maestros();
                s =  m.getMenu();
            break;

            case 2:
                Dpa d = new Dpa();
                s = d.getMenu();
            break;
        }
        return s;
    }

    /**
     * @return the img
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img the img to set
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return the appaterno
     */
    public String getAppaterno() {
        return appaterno;
    }

    /**
     * @param appaterno the appaterno to set
     */
    public void setAppaterno(String appaterno) {
        this.appaterno = appaterno;
    }

    /**
     * @return the apmaterno
     */
    public String getApmaterno() {
        return apmaterno;
    }

    /**
     * @param apmaterno the apmaterno to set
     */
    public void setApmaterno(String apmaterno) {
        this.apmaterno = apmaterno;
    }

    
}
