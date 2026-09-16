public class Main {
    public static void main(String[] args){
        User regularUser = new User("John Nolan", "nolan123@email.com");
        User adminUser = new Admin("Sgt Grey", "grey123@email.com");

        System.out.println(regularUser.getUserData());
        System.out.println("--------------------------------");
        System.out.println(adminUser.getUserData());
    }
}
