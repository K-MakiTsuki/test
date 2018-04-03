package lab1;

public class StuList {
	private Student[] stus;
	private int length;   // the actual number of student it contains
	/**
	 * Default initial capacity
	 * please write your answer here
	 * why use static final ?
	 */
	private static final int DEFAULT_CAPACITY=15;
	
	/**
	 * Init the StuList using the default capacity
	 */
	public StuList() {
		length=0;
		stus=new Student[DEFAULT_CAPACITY];
	}
	
	/**
	 * Init the StuList using the given cap
	 * @param 
	 */
	public StuList(int cap) {
		length=0;
		stus=new Student[cap];
	}
	
	private boolean isOverflow() {  
		if(length==DEFAULT_CAPACITY)
			return true;
		else
			return false;
	}
	
	public boolean isEmpty() {  
		if(length==0)
			return true;
		else
			return false;
	}
	
	public boolean addStu(Student x) { 
		if(length>15)
			return false;
		stus[length]=x;
		length++;
		return true;
	}
	
	public Student removeStu(int index) {
		// todo
	}
	
	public Student removeStu_id(int stuId) {
		// todo
	}
	
	private int indexOf(int stuId) {
		// todo
	}
	
	public void sort() {
		// todo
	}
	
	public void print() {
		// todo
	}
	
}
