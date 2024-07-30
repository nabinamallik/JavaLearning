class Student {
    int rollno;
    String name;
    int marks;

}

public class EnhencedForLoop {
    public static void main(String[] args) {
        int nums[] = new int[4];
        nums[0] = 7;
        nums[1] = 3;
        nums[2] = 6;
        nums[3] = 9;

        for (int n : nums) {
            // instead of doing the messy for loop "for(int i; i < /> something ; i++/--)"
            // we can just do this "for(int i : name of the array or the something else)"
            // it is also calle as for each loop
            System.out.println(n);
        }

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "John";
        s1.marks = 85;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Alice";
        s2.marks = 90;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Bob";
        s3.marks = 75;

        Student students[] = new Student[3]; // here we are creating an array which can holds the students referenced
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (Student std : students) {
            System.out.println(std.name + " " + std.marks);
        }
    }
}
