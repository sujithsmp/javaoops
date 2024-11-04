package overriding;

public class Parent 

{
	public void disp() 
	{
		System.out.println("Parent disp");
		
	}
	
	
	public int cal(int a,int b) 
	{
		int sum=a+b;
		//System.out.println("parent "+sum);
		return sum;
	}

}
