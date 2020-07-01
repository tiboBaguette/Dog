package be.vdab;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.react("speak");
        dog.react("beg");
        dog.react("look, the postman!");
    }
}
