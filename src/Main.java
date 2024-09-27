//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
    }
}