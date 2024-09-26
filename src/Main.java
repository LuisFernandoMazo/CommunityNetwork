import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Ciudad> ciudadesAntioquia =new ArrayList<>();
        ciudadesAntioquia.add(new Ciudad(1, "Medellín"));
        ciudadesAntioquia.add(new Ciudad(2, "Envigado"));
        ciudadesAntioquia.add(new Ciudad(3, "Itagüí"));

        Departamento departamento = new Departamento(1, "Antioquia", ciudadesAntioquia);

        for (Ciudad ciudad: ciudadesAntioquia){
            ciudad.setDepartamento(departamento);
        }

        if (departamento.estaRegistrado()) {
            System.out.println("El departamento está registrado.");
            departamento.mostrarInformacion();
        } else {
            System.out.println("El departamento no está registrado.");
        }

        Ciudad ciudad = new Ciudad(1, "Medellín");

        if (ciudad.estaRegistrada()) {
            System.out.println("La ciudad está registrada.");
            ciudad.mostrarInformacion();
        } else {
            System.out.println("La ciudad no está registrada.");
        }
    }
}