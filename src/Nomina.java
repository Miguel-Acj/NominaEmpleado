public class Nomina
{
    /**
     * Declaracion de variables a utilizar
     */
    private String clave;
    private String nombre;
    private int horasTrabajadas;
    private double pagoPorHora;

    /**
     * Constructor que inicializa las variables
     */
    public Nomina(String clave, String nombre, int horasTrabajadas, double pagoPorHora)
    {
        this.clave = clave;
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }
}
