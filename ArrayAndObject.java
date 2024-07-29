/**
 * Student
 */
class Student {
    int rollno;
    String name;
    int marks;

}

public class ArrayAndObject {
    public static void main(String[] args) {
        // int num[] = new int[4]; // Drawback : you cant extend the array , you only
        // can onlly put same type of
        // // data as per datatype.
        // System.out.println(num);

        // int nums[] = new int[4];
        // nums[0] = 10;
        // nums[1] = 20;
        // nums[2] = 30;
        // nums[3] = 40;

        // for (int i = 0; i < nums.length; i++) {
        // System.out.println(nums[i]);
        // }

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

        for (int i = 0; i < students.length; i++) {
            System.out.println(
                    "Roll No: " + students[i].rollno + ", Name: " + students[i].name + ", Marks: " + students[i].marks);
        }

        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);

        // s1.name = "Jane"; // changing the value
        // System.out.println(s1.name); // accessing the value

    }
}
