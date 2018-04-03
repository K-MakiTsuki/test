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
		int i;
		for(i=index;i<length-1;i++)
			stus[i]=stus[i+1];
		length--;
		return stus[0];
	}
	
	public Student removeStu_id(int stuId) {
		int i;
		for(i=0;i<length;i++)
			if(stus[i].getNO()==stuId)
				break;
		for(;i<length-1;i++)
			stus[i]=stus[i+1];
		length--;
		return stus[0];
	}
	
	private int indexOf(int stuId) {
		int i;
		for(i=0;i<length;i++)
			if(stus[i].getNO()==stuId)
				break;
		if(i!=length)
			return i;
		return -1;
	}
	
	public void sort() {
		Student temp;
		int i,j;
		for(i=0;i<length;i++)
			for(j=0;j<length-1;j++)
				if(stus[j].getAverScore()<stus[j+1].getAverScore())
				{
					temp=stus[j];
					stus[j]=stus[j+1];
					stus[j+1]=temp;
				}
	}
	
	public void print() {
		// todo
	}
	
}
