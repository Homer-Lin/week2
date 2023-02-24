import java.util.*;

public class week2_homework09
{
	public static void main(String[] argv)
	{
		int num;
		System.out.println();
		System.out.println("Please Input Integer");
		Scanner numberInput = new Scanner(System.in);
		num = numberInput.nextInt();
		System.out.println((num%2==0)?"是偶數":"是奇數");
		
	}
}