
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aloisio
 */
public class Mysql {

    private com.mysql.jdbc.Connection c;

    public com.mysql.jdbc.Connection getConnection() {
        return c;
    }

    public Connection conectar(String IP, String porta, String database, String usuario, String senha) {
        Connection c = null;
        try {
            String url = "jdbc:mysql://" + IP + ":" + porta + "/" + database + "?user=" + usuario + "&password=" + senha;
            System.out.println(url);
            c = (com.mysql.jdbc.Connection) DriverManager.getConnection(url);
            System.out.println("Conectado!");

        } catch (SQLException e) {
        }
        return c;
    }

    public ResultSet atualizar(Connection c, String squery) {
        try {
            java.sql.Statement st = (java.sql.Statement) c.createStatement();
            ResultSet rs = st.executeQuery(squery);
            return rs;
        } catch (SQLException ex) {
        }
        return null;
    }

    public ResultSet buscar(Connection c) {
        String query;

        try {
            query = "SELECT * FROM ufnprojetoacad.pessoa;";
            Statement st = (Statement) c.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
        }
        return null;
    }

    ResultSet consultanome(Connection c) {
        String query;
        query = "SELECT nome from pessoa;";
        try {
            Statement st = (Statement) c.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
        }
        return null;
    }

    ResultSet consultatreino(Connection c, int id) {
        String query = "call p_informacao_cliente('" + id + "');";
        try {
            Statement st = (Statement) c.createStatement();
            ResultSet rs = st.executeQuery(query);
            return rs;
        } catch (SQLException ex) {
        }
        return null;
    }

}
