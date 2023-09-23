

import java.util.ArrayList;
import java.util.List;

class Equipo extends MiembroOrganizacion {
    private List<MiembroOrganizacion> miembros = new ArrayList<>();

    public Equipo(String nombre) {
        super(nombre);
    }

    public void agregarMiembro(MiembroOrganizacion miembro) {
        miembros.add(miembro);
    }

    public void eliminarMiembro(MiembroOrganizacion miembro) {
        miembros.remove(miembro);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Equipo: " + nombre);
        for (MiembroOrganizacion miembro : miembros) {
            miembro.mostrarDetalles();
        }
    }
}