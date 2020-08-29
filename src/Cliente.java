public class Cliente {
    private int idCliente;
    private String nombre;
    private String primerApelido;
    private String segundoApellido;

    public Cliente(int idCliente, String nombre, String primerApelido, String segundoApellido) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.primerApelido = primerApelido;
        this.segundoApellido = segundoApellido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApelido() {
        return primerApelido;
    }

    public void setPrimerApelido(String primerApelido) {
        this.primerApelido = primerApelido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
}
