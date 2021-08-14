package week1.day2;

public class mycalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj=new Calculator();
          int result;
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
