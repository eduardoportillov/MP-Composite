
public class Organizacion {
    public static void main(String[] args) {
        // Crear empleados individuales
        MiembroOrganizacion empleado1 = new Empleado("Juan");
        MiembroOrganizacion empleado2 = new Empleado("Ana");
        MiembroOrganizacion empleado3 = new Empleado("Carlos");
        MiembroOrganizacion empleado4 = new Empleado("Marta");

        // Crear equipos
        Equipo equipoDesarrollo = new Equipo("Equipo de Desarrollo");
        equipoDesarrollo.agregarMiembro(empleado1);
        equipoDesarrollo.agregarMiembro(empleado2);

        Equipo equipoGestion = new Equipo("Equipo de Gestión");
        equipoGestion.agregarMiembro(empleado3);
        equipoGestion.agregarMiembro(equipoDesarrollo);

        Equipo equipoVentas = new Equipo("Equipo de Ventas");
        equipoVentas.agregarMiembro(empleado4);
        equipoVentas.agregarMiembro(equipoGestion);

        // Mostrar la estructura organizativa completa
        System.out.println("Estructura de la organización:");
        equipoVentas.mostrarDetalles();
    }
}