package be.vdab;

public class Dog {
    public void react(String command) {
        switch(command) {
            case "speak":
                bark();
                break;
            case "beg":
                beg();
                break;
            case "look, the postman!":
                chase();
                break;
        }
    }

    private void bark() {
        System.out.println("woof woof");
    }

    private void beg() {
        System.out.println("beg");
    }

    private void chase() {
        System.out.println("chase");
    }
}
