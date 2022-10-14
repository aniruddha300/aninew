package sept29;

public class count_distinct 
{
	public static void main(String[] args) 
	{
		String a= "aniruddha";
		int i;
		int j;
		String f ="";
//		int flag = 0;
		for(i =0;i<a.length();i++)
		{
			int flag = 0;
			for(j=0;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j) &&i!=j )
				break;
				if(i==j)
					System.out.print(a.charAt(i));
		
		}
//		System.out.println(f);
		
	}

}}
