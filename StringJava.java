public class StringJava {
    public static void main(String[] args) {
        String name = "nabina"; // as we know String is a class so directly declaring
                                // a value is not possible
                                // but in this case the java create an object behind the screan line the
                                // following bellow

        System.out.println(name);

        String name2 = new String("nabina2"); // use string as an object, name2 in a
                                              // string object
        System.out.println(name2);

        System.out.println(name.charAt(2));
        System.out.println(name2.concat(name));
        System.out.println(name);

        String s1 = "nabina";
        String s2 = "mallik";
        // here behind the screan the java not creating two variable but one,
        // but two reference

        System.out.println(s1 + " " + s2);

        // there is a concept of mutable (changeble) and Immutable string (unchangeble)
        // by default all strings are immutable which means you cant change it.

        // if ever we have to use a changeble or in technical term Mutable string
        // there are two types of methods one is String Buffer and another one is String
        // Builder
        // both are similar and both will provide you Mutable string

        StringBuffer sb = new StringBuffer("nabina");
        System.out.println(sb.capacity()); // 16 bit + 6 bit(for my name)
        sb.append("mallik");

        System.out.println(sb);

        // String str = sb; // it will throw error bcz string buffer cant be changed in
        // to string

        // there are many methode of string we can use them as our requirement

        // note: abote the string builder there is a single differnt which is threat

    }
}
