import java.util.*;

public class week2_homework10
{
	public static void main(String[] args)
	{
		System.out.println("Please input the temperature in ℃");
		Scanner tem = new Scanner(System.in);
		float temper = tem.nextFloat();
		System.out.println("Now the temperature is " + (temper * 9 / 5 + 32) + "℉" );
	}
}