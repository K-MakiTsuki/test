package lab1;

public class StuTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("huazai");
        s.setNO(160824210);
        System.out.println(s.getName());
        s.printReport();

        s.addCourse("IT1001", "shengwu", 40, 80);
        s.addCourse("IT1002", "shoushu", 60, 90);
        s.addCourse("IT1003", "zhiliaoshu", 60, 55);

        s.printReport();
        s.printReport("IT1002");

        s.delCourse("IT1003");
        s.printReport();
    }
}
