import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String identifier;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String password;
    private Role role;
    private Boolean isActive;

    public User(int userId, String identifier, String firstName, String lastName, String phone, String email, String password) {
        this.userId = userId;
        this.identifier = identifier;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.role = new Role(1);
        this.isActive = true;
    }

    public Boolean getActive() {
        return isActive;
    }

    public int getUserId() {
        return userId;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    // Método para iniciar sesión
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    // Método para cerrar sesión
    public void logout() {
        System.out.println("User logged out.");
    }

    // Método para actualizar perfil
    public void updateProfile(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    // Método para cambiar contraseña
    public boolean changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
            return true;
        }
        return false;
    }

    // Método para desactivar la cuenta
    public void deactivateAccount() {
        this.isActive = false;
    }

    // Método para activar la cuenta
    public void activateAccount() {
        this.isActive = true;
    }

    // Métodos de acceso a la información del usuario
    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public String getContactInfo() {
        return "Email: " + this.email + ", Phone: " + this.phone;
    }

    // Asignar un nuevo rol
    public void setRole(Role newRole) {
        this.role = newRole;
    }

    // Método para verificar si la cuenta está activa
    public boolean isActive() {
        return this.isActive;
    }

    // Método para obtener detalles completos del usuario
    public String getUserDetails() {
        return "ID: " + this.userId + ", Name: " + getFullName() + ", Email: " + this.email + ", Role: " + this.role.getNombreRol() + ", Active: " + isActive();
    }
}

