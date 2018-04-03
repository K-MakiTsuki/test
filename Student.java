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
		int num=0;
		sum=0;
		temp=report.getNext();
		while(temp!=null)
		{
			num++;
			sum+=temp.getScore();
			temp=temp.getNext();
		}
		if(num==0)
			System.out.printf("ÔÝÎÞ³É¼¨\n");
		else
			averScore= (sum/num);
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
    	Course temp;
		temp=report;
		if(temp==null)
			return false;
		while(temp.getNext()!=null)
		{
			temp=temp.getNext();
		}
		Course c=new Course();
		c.setCourseNumber(NO);
		c.setCourseName(name);
		c.setCourseHour(hour);
		c.setScore(score);
		c.setNext(null);
		temp.setNext(c);
		return true;
    }

    public boolean delCourse(String NO) {
    	Course pre=report;
    	Course temp=report.getNext();
    	while((temp.getNext()!=null)&&(temp.getCourseNumber()!=NO))
    	{
    		pre=temp;
    		temp=temp.getNext();
    	}
    	if(temp.getCourseNumber()==NO)
    	{
    		pre.setNext(temp.getNext());
    		return true;
    	}
    	else
    		return false;
    }

    public boolean updateCourse(String NO, double score) {
    	Course temp=report.getNext();
    	while((temp.getNext()!=null)&&(temp.getCourseNumber()!=NO))
    	{
    		temp=temp.getNext();
    	}
    	if(temp.getCourseNumber()==NO)
    	{
    		temp.setScore(score);
    		return true;
    	}
    	else
    		return false;
    }

    public void printReport() {
		// todo
    }

    public void printReport(String NO) {
		// todo
    }

}
