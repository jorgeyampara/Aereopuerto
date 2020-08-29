public class Aereopuerto {
    private String idAeropuerto;
    private String nombre;
    private Ciudad ciudad;

    public Aereopuerto(String idAeropuerto, String nombre, Ciudad ciudad) {
        this.idAeropuerto = idAeropuerto;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getIdAeropuerto() {
        return idAeropuerto;
    }

    public void setIdAeropuerto(String idAeropuerto) {
        this.idAeropuerto = idAeropuerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}
