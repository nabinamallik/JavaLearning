public class ConditionalStatements {
    public static void main(String[] args) {
        // int a = 28;
        // int b = 

        // if (a>10 && a<20)  //11-20
        //     System.out.println("Hello");// if true
        //if the if else have only one statements then the curlybresses are not necessery
        // else
        //     System.out.println("bye");// if false
        
        // int x = 5;
        // int y = 7;

        // if (x>y) {
        //     System.out.println(x);
        //     System.out.println("Thank You!");
        // }
        // else{
        //     System.out.println(y);
        // }

        int x = 8;
        int y = 7;
        int z = 9;

        if (x>y && x>z) { //false
            System.out.println(x);
        }
        else if (y>z) {
            System.out.println(y);
        } 
        else{
            System.out.println(z);
        }
        
    }
}
