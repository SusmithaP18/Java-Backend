public class Main {

    public static void main(String[] args) {

        User user1 = new User();
        user1.id = 1;
        user1.name = "Alice";

        User user2 = new User();
        user2.id = 2;
        user2.name = "Bob";

        User user3 = new User();
        user3.id = 3;
        user3.name = "Charlie";

        user1.printUser();
        user2.printUser();
        user3.printUser();
    }
}
