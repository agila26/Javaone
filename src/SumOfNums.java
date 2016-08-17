import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNums {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number");
		int n = Integer.parseInt(keyin.readLine());
		for(int i =1; i<n;i++)
		{
			int res = n-i;
			System.out.println(i + " + "+ res);
			
		}
		

	}

}
