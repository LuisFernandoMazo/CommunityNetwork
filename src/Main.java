import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Simulación de los datos ingresados por el usuario en un formulario
        String identifier = "user123";
        String firstName = "John";
        String lastName = "Doe";
        String phone = "123456789";
        String email = "john.doe@example.com";
        String password = "password123";

        // Llamada para registrar un nuevo usuario con los datos del formulario
        User newUser = new User(1, identifier, firstName, lastName, phone, email, password);

        // Mostrar información del usuario creado
        System.out.println("New user created:");
        System.out.println("ID: " + newUser.getUserId());
        System.out.println("Name: " + newUser.getFirstName() + " " + newUser.getLastName());
        System.out.println("Email: " + newUser.getEmail());
        System.out.println("Role: " + newUser.getRole().getNombreRol());
        System.out.println("Is Active: " + newUser.getActive());
        System.out.println("Contact Info : " + newUser.getContactInfo());
        System.out.println("User Details : " + newUser.getUserDetails());
        
        List<Ciudad> ciudadesAntioquia = new ArrayList<>();
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