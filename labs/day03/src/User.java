import java.util.UUID;

public class User {
    private final String id;
    private String name;
    private String email;

    public User(String name, String email){
        validateName(name);
        validateEmail(email);

        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public String getRole(){
        return "User";
    }

    public String getUserData(){
        return String.format("ID: %s\nName: %s\nEmail: %s\nRole: %s", id, name, email, getRole());
    }

    public void setName(String name){
        validateName(name);
        this.name = name;
    }

    public void setEmail(String email){
        validateEmail(email);
        this.email = email;
    }

    private void validateName(String name){
        if(name == null || name.isBlank() || name.length() > 40){
            throw new IllegalArgumentException("Invalid name.");
        }
    }

    private void validateEmail(String email){
        if (
                email == null
                        || email.isBlank()
                        || !email.contains("@")
                        || email.charAt(0) == '@'
                        || email.charAt(email.length() - 1) == '@'
                        || email.length() > 50){
            throw new IllegalArgumentException("Invalid email.");
        }
    }
}
