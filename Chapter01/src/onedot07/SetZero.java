package onedot07;

import java.util.*;

public class SetZero 

{
	public static void main(String[]args){
		int matrix[][] = {{0,2,3},{4,5,6},{7,8,9}};
		boolean[] rows = new boolean[matrix.length];
		boolean[] columns = new boolean[matrix[0].length];

		checkMatrix(rows,columns,matrix);
		setZero(rows,columns,matrix);
		for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++){
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
    }
	}
	
	private static void checkMatrix(boolean[] rows, boolean[] columns,int[][]matrix){
		if(rows == null || columns == null || matrix == null)
			return ;
		for(int i = 0 ; i < matrix.length; i++){
			for(int j = 0 ; j < matrix[0].length;j++){
				if(matrix[i][j] == 0){
					rows[i] = true;
					columns[j] = true;
				}
			}
		}

		return ;
	}

	private static void setZero(boolean[] rows, boolean[] columns,int[][]matrix){
		for(int i = 0; i < rows.length; i++){
			if(rows[i] == true){
				for(int j = 0 ; j < matrix[0].length; j++){
					matrix[i][j] =0;
				}
			}
		}
		for(int i = 0 ; i < columns.length; i++){
			if(columns[i] == true){
				for(int j = 0 ; j < matrix.length; j++){
					matrix[j][i] = 0 ;
				}
			}
		}
	}
}