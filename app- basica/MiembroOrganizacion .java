
// Componente abstracto para representar miembros de la organización
abstract class MiembroOrganizacion {
    protected String nombre;

    public MiembroOrganizacion(String nombre) {
        this.nombre = nombre;
    }

    public abstract void mostrarDetalles();
}