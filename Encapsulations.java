class Human {
    private String name = "Nabina";
    private int age = 21; // using the private keyword makes the variable to use only within its own class
    // which is human here and the only way to access these variable by the help of
    // a method

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

public class Encapsulations {
    public static void main(String[] args) {
        Human obj = new Human();
        // obj.name = "nabina";
        // obj.age = 21;

        obj.setAge(22);
        obj.setName("nabinamallik");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
