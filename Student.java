import java.util.Scanner;

public class Student {
    Scanner scn = new Scanner(System.in);
    String takeNam(){
        System.out.print("\nEnter the name of the student: ");
        return scn.nextLine();
    }
    String name = takeNam();
    int takRn(){
        System.out.print("\nEnter the roll number of the student: ");
//        assert scn != null;
        return scn.nextInt();
    }
    int rollno= takRn();



    double takeInp(int n){
        System.out.print("\nEnter the marks in Subject "+n+": ");
        return scn.nextInt();
    }


    double m1 = takeInp(1);
    double m2 = takeInp(2);


}
