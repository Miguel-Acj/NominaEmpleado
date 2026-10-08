import java.util.Scanner;

public class Main
{
    /**
     * Declaracion del Punto de entrada del programa
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Sistema de nomina de Empleados.");

        //Capturar datos mediante Scanner
        Scanner entrada = new Scanner(System.in);

        //Captura de los datos
        System.out.println("Clave del Empleado: ");
        String clave = entrada.nextLine();
        System.out.println("Nombre del Empleado: ");
        String nombre = entrada.nextLine();
        System.out.println("Horas trabajadas del Empleado: ");
        int horasTrabajadas = entrada.nextInt();
        System.out.println("Pago por hora del Empleado: ");
        double pagoPorHora = entrada.nextDouble();

        //Creacion de un objeto Nomina usando el constructor
        Nomina nomina = new Nomina(clave, nombre, horasTrabajadas, pagoPorHora);

        System.out.println("==================================");
        System.out.println("          RECIBO DE NOMINA        ");
        System.out.println("==================================");
        System.out.println("Clave " + nomina.getClave());
        System.out.println("Empleado: " + nomina.getNombre());
        System.out.println("Horas normales: " + nomina.calcularHorasNormales());
        System.out.println("Horas extra: " + nomina.calcularHorasExtra());
        System.out.println("Pago por Hora: " + nomina.getPagoPorHora());
        System.out.println("Pago normal: " + nomina.calcularPagoNormal());
        System.out.println("Pago horas extra: " + nomina.calcularPagoExtra());
        System.out.println("----------------------------------");
        System.out.println("Pago Total: $" + nomina.calcularPagoTotal());
        System.out.println("=================================");
    }
}
