package in.ineuron.main;


public class PatternPgrm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=25;
		
		for(int i=0;i<n; i++)//I
		{
			for(int j=0 ; j<n; j++)
			{
				if(j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			for(int j=0 ; j<n; j++)//N
			{
				if(j==0|| j==n-1 || (i==j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			for(int j=0 ; j<n; j++)//E
			{
				if(j==n/4|| i==0 && j>n/4 && j< 3*n/4 || i==(n-1)/2 && j>n/4 && j<3*n/4 || i==(n-1) && j>n/4 && j<3*n/4)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			
			for(int j=0 ; j<n; j++)//u
			{
				if(j==0|| j==3*n/4 || (i==(n-1)&& j>0 && j<3*n/4))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			
			for(int j=0 ; j<n; j++)//R
			{
				if(j==0|| i==0 && j< (n-1)/2 || j==(n-1)/2 & i>0 && i< (n-1)/2 || i==(n-1)/2 && j< (n-1)/2
					|| (i-j)==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			for(int j=0 ; j<n; j++)//O
			{
				if(j==0 ||j==(n-1)/2 || i==0 && j>0 && j< (n-1)/2 || i==(n-1) && j>0 && j< (n-1)/2 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}

			for(int j=0 ; j<n; j++)//N
			{
				if(j==0|| j==(n-1) || (i==j))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
				
			}
			System.out.println();

		}
		

	}

}
