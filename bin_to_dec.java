import java.util.*;
public class bin_to_dec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=0,p=1,sum=0;
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)=='1')
			{
				l.add(p*(int)Math.pow(2,k));
			}
			k++;
			//System.out.println(k);
		}
		//System.out.println(l);
		for(int i=0;i<l.size();i++)
		{
			sum=sum+l.get(i);
		}
		System.out.println(sum);
	}
}
