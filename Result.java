public class Result extends Student implements Exam{

    @Override
    public double Percent_cal(double m1, double m2) {
        return (m1+m2)/2;
    }
    void dispResults(){
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+rollno);
        System.out.println("Percentage: "+Percent_cal(m1,m2));
    }
}
