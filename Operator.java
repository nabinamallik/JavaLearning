public class Operator {
    public static void main(String[] args) {

        // Arithmetic Operators

        int num1 = 7;
        int num2 = 5;

        int result1 = num1 + num2;
        System.out.println(result1);//12

        int result2 = num1 - num2;
        System.out.println(result2);//2

        int result3 = num1 * num2;
        System.out.println(result3);//35

        int result4 = num1 / num2;
        System.out.println(result4);//1

        int result5 = num1 % num2;
        System.out.println(result5);//2

        int result6 = num1 / num2;
        System.out.println(result6);//1


        int num3 = 2; 
        num3 += 3;//num3 = num3+3
        //  num3 += 1 / num3 = num3 + 1 / num3++ || increment

        // ++num -> pre-increment  // first increment and then fetch the value
        // num++ -> post-increment // fetch the value and then increment
        
        int num4 = 3; 
        num4 -= 3;//num4 = num4-3
        //  num3 -= 1 / num3 = num3 - 1 / num3--

        int num5 = 6;
        num5 *=2; //num5 = num5*2

        int num6 = 10;
        num6 /= 2;//num6 = num6/2

        System.out.println(num3);//5
        System.out.println(num4);//0
        System.out.println(num5);//12
        System.out.println(num6);//5

        //Relational Operators

        int x = 6;
        int y = 5;
        int z = 5;

        // boolean result = x<y; //false
        // boolean result = x>y; //true
        // boolean result = y>=z; //true
        // boolean result = y<=z; //true
        // boolean result = y==z; //true
        // boolean result = y!=z; //false

        //Logical Operators

        int a = 5;
        int b = 7;
        int c = 8;
        int d = 9;

        // boolean res = a > b && c > d;//false
        // boolean res = a > b || c > d; // true
        boolean res = a > b || c > d && a < b; // true

        System.out.println(!res);//false




        
    } 
}
