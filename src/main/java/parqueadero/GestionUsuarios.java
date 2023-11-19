package parqueadero;
import java.util.ArrayList;
import java.util.List;

public class GestionUsuarios {
    private List<Usuario> listaUsuarios;

    public GestionUsuarios() {
        this.listaUsuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public void eliminarUsuario(int id) {
        listaUsuarios.removeIf(usuario -> usuario.getId() == id);
    }

    public Usuario buscarUsuarioPorIdr(int id) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }
}
