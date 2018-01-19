/**
 * Makes this face ->   . .
 * 						 3
 *
 * Alyssa Ma
 */


public class print2d 
{
	public static void main(String[] args) 
	{
		
		int [][] arr = new int [10][21];
		arr[1][15] = 8;
		arr[1][5] = 8;
		arr[3][10] = 1;
		arr[5][12] = 3;
		
		print(arr);
	}
	
	public static void print(int [][] arr) 
	{
		for(int i = 0; i < arr.length; i++ )
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(arr[i][j] == 0)
				{
					System.out.print(" ");
				}
				else System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}