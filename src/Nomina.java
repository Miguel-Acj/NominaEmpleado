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

    /**
     * Getters y setters
     */
    //Getters
    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    //Setters
    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        if(horasTrabajadas > 50)
        {
            this.horasTrabajadas = 50;
        }else{
            this.horasTrabajadas = horasTrabajadas;
        }
    }
    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    /**
     * Metodos para la resolucion del problema
     */

    public int calcularHorasNormales()
    {
        int horasNormales = 0;
        if(this.horasTrabajadas <= 40)
        {
            horasNormales = horasTrabajadas;
        }else{
            horasNormales = 40;
        }
        return horasNormales;
    }

    public double calcularPagoNormal()
    {
        double pagoNormal;
        pagoNormal = calcularHorasNormales() * pagoPorHora;
        return pagoNormal;
    }

    public int calcularHorasExtra ()
    {
        int horasExtra = 0;
        if (horasTrabajadas > 40)
        {
            horasExtra = horasTrabajadas - 40;
        }
        return horasExtra;
    }

    public double calcularPagoExtra()
    {
        double pagoExtra = 0;
        pagoExtra =  calcularHorasExtra() * pagoPorHora * 2;
        return pagoExtra;
    }

    public double calcularPagoTotal()
    {
        double pagoTotal = 0;
        pagoTotal = calcularPagoNormal() + calcularPagoExtra();
        return pagoTotal;
    }
}
