public class Role {
    private int idRol;
    private String nameRole;

    public Role(int idRol) {
        this.idRol = idRol;
        this.nameRole = getRoleNameById(idRol);
    }

    public int getIdRole() {
        return idRol;
    }

    private String getRoleNameById(int idRole) {
        return switch (idRole) {
            case 1 -> "User";
            case 2 -> "Admin";
            case 3 -> "Manager";
            default -> "Unknown";
        };
    }

    public String getNombreRol() {
        return nameRole;
    }
}
