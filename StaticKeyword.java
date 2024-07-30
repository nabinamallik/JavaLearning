class Mobile {
    String brand;
    int price;
    String network;
    static String name; // static variable will be shared by all the objects that why if we ever change
                        // the
                        // static variable then the change will apears every where the keyword is used
    // Note : static means we are creating a class member not an object member

    static { // static block : here we can assigne all the static variables with value once
             // for all which will be called only onces
        name = "pallatop";
        System.out.println("in static block");
    }

    public Mobile() { // its a constructor
        brand = ""; // default values for each variables
        price = 2000;
        // name = "pallatop"; // we can use instance and static varible with in the
        // constuctor with out any harm
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(brand + ":" + price + ":" + name);
    }

    public static void show1() {
        System.out.println("its a static method");
        System.out.println(name); // we can use a static variable with in the static method but not the non static
                                  // variable

    }

    public static void show2(Mobile obj) {
        System.out.println(obj.brand); // we can use a non static variable within the static method with the help of
                                       // an
                                       // object refernce

    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "apple";
        obj1.price = 15000;
        obj1.name = "smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "samsung";
        obj2.price = 17000;
        obj2.name = "smartphone"; // the output for the name will be same as the value which is assigned by the
                                  // class your changes will not affect the static variable

        Mobile.name = "phone"; // static variable will be called by Class name and also can be called by
                               // objects as well

        obj1.show();
        obj2.show();

        Mobile.show1(); // A static method alco can be called by its class

        Mobile.show2(obj1);

    }
}
