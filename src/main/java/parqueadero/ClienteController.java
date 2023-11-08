package parqueadero;

import java.util.ArrayList;
import java.util.List;

public class ClienteController {
    private List<Cliente> clientes;

    public ClienteController() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente agregado correctamente.");
    }

    public Cliente obtenerClientePorId(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        System.out.println("Cliente no encontrado.");
        return null;
    }

    public void actualizarCliente(int id, Cliente nuevoCliente) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                clientes.set(i, nuevoCliente);
                System.out.println("Cliente actualizado correctamente.");
                return;
            }
        }
        System.out.println("Cliente no encontrado. No se pudo actualizar.");
    }

    public void eliminarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                clientes.remove(cliente);
                System.out.println("Cliente eliminado correctamente.");
                return;
            }
        }
        System.out.println("Cliente no encontrado. No se pudo eliminar.");
    }
}
