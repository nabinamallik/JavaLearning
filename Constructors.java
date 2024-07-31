class Human {
    private String name = "Nabina";
    private int age = 21; // using the private keyword makes the variable to use only within its own class
    // which is human here and the only way to access these variable by the help of
    // a method

    public Human() { // default constructor
        age = 21;
        name = "john";
    }

    public Human(int a, String b) { // parameterized constructor
        this.age = a;
        this.name = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String a) {
        name = a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.name = "nabina";
        // obj.age = 21;

        Human obj1 = new Human(21, "nabina");
        System.out.println(obj1.getAge());

        obj.setAge(22);
        obj.setName("nabinamallik");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
