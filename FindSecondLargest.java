package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]  arrnum= {23,45,21,22,55,45};

Arrays.sort(arrnum);
System.out.println("Largest number" +arrnum[arrnum.length-1]);
System.out.println("Secondlargest number"+ arrnum[arrnum.length-2]);
}

}
