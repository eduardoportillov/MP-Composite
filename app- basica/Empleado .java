
// Empleado individual
class Empleado extends MiembroOrganizacion {
    public Empleado(String nombre) {
        super(nombre);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado: " + nombre);
    }
}
