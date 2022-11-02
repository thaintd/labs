/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrix;
import java.util.Scanner;
/**
 *
 * @author ntduy
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
                System.out.print("Enter number of rows: ");
		int n = sc.nextInt();
                System.out.print("Enter number of columns: ");
		int m = sc.nextInt();
                System.out.println("Enter the matrix");
		int[][] arr = new int[n][m];
                for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("arr[" + i + "][" + j + "] = " );
                                arr[i][j] = sc.nextInt();        
			}
                }
                for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
		               System.out.print(arr[i][j]+" ");
			}
                       System.out.println();
		}
                int sum=0;
		for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        sum+=arr[i][j];
                    }
                }
                System.out.println("Sum= "+sum);
                double aver=0;
                aver= (double) sum/(n*m);
                System.out.println("Average= "+aver);

		
    }
}
