package week1.day2;


public class Simpleclass {
	public int add(int x,int y)
	{
		
		int z=x+y;
		return(z);
	}
	
	public int sub(int x,int y)
	{
		
		int z=x-y;
		return(z);
	}
	public int multiply(int x,int y)
	{
		
		int z=x*y;
		return(z);
	}
	public int divide(int x,int y)
	{
		
		int z=x/y;
		return(z);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result;
		
		Simpleclass obj=new Simpleclass();
		 result=obj.add(30,10);
		 System.out.println("Addition = " + result);
		 result=obj.sub(30,10);
		 System.out.println("Subtraction = " + result);
		 result=obj.multiply(30,10);
		 System.out.println("Multiplication= " + result);
		 result=obj.divide(30,10);
		
		 System.out.println("division= " + result);
	}

}
