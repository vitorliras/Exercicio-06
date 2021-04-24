package Application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digites dois numeros para saber o tamnaho da tabela: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++){
				System.out.println("Digito um numero: ");
				mat[i][j]=sc.nextInt();
			}
		}
		

		System.out.println(
		mat[0][0]+" | "+mat[0][1]+" | "+mat[0][2]+
		"\n"+
		mat[1][0]+" | "+mat[1][1]+" | "+mat[1][2]+
		"\n"+
		mat[2][0]+" | "+mat[2][1]+" | "+mat[2][2]);
			
		System.out.println("Main: ");
		for(int i = 0;i<n;i++) {
			System.out.println(mat[i][i]+" ");
		}
		
		int count =0;
		for(int i = 0; i<n; i++) {
			for(int j=0; j<n; j++){
				if(mat[i][j]<0) {
					count++;
				}
				
			}
		}
		
		System.out.println("Negative nunbers: "+count);
		
		
		
	}

}
