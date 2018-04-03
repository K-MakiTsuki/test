package lab1;

public class Student {
    private String name;
    private int NO;
    private double averScore;
    private Course report;

    public Student() {
    	this.averScore = 0.0;
        this.report = new Course();
        this.report.setNext(null);
    }

    public Student(String name, int NO) {
        this.name = name;
        this.NO = NO;
        this.averScore = 0.0;
        this.report = new Course();
        this.report.setNext(null);
    }

    private void calcAverScore() {
		Course temp;
		double sum;
		sum=0;
		temp=report.next;
		while(temp!=null)
		{
			sum+=temp.score;
		}
    }

    public String getName() {
        return name;
    }

    public int getNO() {
        return NO;
    }

    public double getAverScore() {
		return averScore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNO(int NO) {
        this.NO = NO;
    }

    public boolean addCourse(String NO, String name, int hour, double score) {
		// todo
    }

    public boolean delCourse(String NO) {
		// todo
    }

    public boolean updateCourse(String NO, double score) {
		// todo
    }

    public void printReport() {
		// todo
    }

    public void printReport(String NO) {
		// todo
    }

}
