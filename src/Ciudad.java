public class Ciudad {
    private int idCiudad;
    private String nombreCiudad;
    private Departamento departamento;

    public Ciudad(int idCiudad, String nombreCiudad) {
        this.idCiudad = idCiudad;
        this.nombreCiudad = nombreCiudad;


    }

    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;
    }

    public int getIdCiudad() {
        return idCiudad;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public boolean estaRegistrada() {
        return idCiudad > 0 && nombreCiudad != null && !nombreCiudad.isEmpty();
    }

    public void mostrarInformacion() {
        System.out.println("ID Ciudad: " + idCiudad);
        System.out.println("Nombre Ciudad: " + nombreCiudad);
    }
}