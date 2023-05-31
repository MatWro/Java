package cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human mateusz = new Human(29, "Mateusz Wróbel");
        //Human twin = new Human(mateusz);
        Human twin = (Human)mateusz.clone();
        System.out.println(twin.age + " " + twin.name);

    }
}
