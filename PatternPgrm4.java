package in.ineuron.main;

public class PatternPgrm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		int n=15;
		
		for(i=0;i<n;i++)
		{
			for (j=0;j<n;j++)
			{
				if((j==0 && (i>=(n-1)/2))||(j==(n-1)&& (i>=(n-1)/2))||i==(n-2) || i==(n-1) || (i-j)>=((n-1)/2)||(i+j)>=((n-1)+(n-1)/2))
				{
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
