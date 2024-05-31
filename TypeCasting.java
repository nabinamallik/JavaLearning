public class TypeCasting {
    public static void main(String[] args) {
          int a = 12;
          byte k = (byte) a; // tycasting
        //   System.out.println(k); //12

          int b = 257;
          byte m = (byte) b;
        //   System.out.println(m); //output will be 1 bcoz the b value which is 257 is out of byte size which is 256 so the value got converted by 257% 256 = 1 which is the output

          float f = 5.6f;
          int t = (int) f;

        //   System.out.println(t);//5

          byte x = 14;
          byte y = 19;

          int result = x*y;  //type promotion
        //   System.out.println(result);//266

    }
}
