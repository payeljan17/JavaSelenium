package matrix;

public class matrix1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{10,20}, {10,0}};
		int [][] B = {{20,10} , {10,20}};
		int [][] C = new int [2][2];
		
		for (int i=0 ; i< A.length ; i++)
		{
			for (int j=0 ; j< B.length ; j++)
			{
				C[i][j] = A[i][j] + B[i][j];
				system.out.print(C[i][j] + " ");
			}
			system.out.println();
		}
	}

}