package es.studium.SumaFilaColumna;

import java.util.Scanner;

public class SumaFilaColumna
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		boolean antisimetrica=true;
		int sumaF0=0, sumaF1=0, sumaF2=0, sumaC0=0, sumaC1=0, sumaC2=0;
		for (int i=0;i<=2;i++)
		{
			for (int j=0;j<=2;j++)
			{
				System.out.println("Indique el número de la matriz situado en la posición "+i+","+j);
				matriz[i][j] = teclado.nextInt();
			}
		}
		//Suma fila CERO
		for (int j=0;j<=2;j++)
		{
			sumaF0+=matriz[0][j];
		}
		System.out.print("La suma de los elementos situados en la fila "+i+" es: "+sumaF0);
		System.out.println("");
		//Suma fila UNO
		for (int j=0;j<=2;j++)
		{
			sumaF1+=matriz[1][j];
		}
		System.out.print("La suma de los elementos situados en la fila "+i+" es: "+sumaF1);
		System.out.println("");
		//Suma fila DOS
		for (int j=0;j<=2;j++)
		{
			sumaF2+=matriz[2][j];
		}
		System.out.print("La suma de los elementos situados en la fila "+i+" es: "+sumaF2);
		System.out.println("");
		//Suma columna CERO
		for (int i=0;i<=2;i++)
		{
			sumaC0+=matriz[i][0];
		}
		System.out.print("La suma de los elementos situados en la columna 0 es: "+sumaC0);
		System.out.println(""); 
		//Suma columna UNO
		for (int i=0;i<=2;i++)
		{
			sumaC1+=matriz[i][1];
		}
		System.out.print("La suma de los elementos situados en la columna 1 es: "+sumaC1);
		System.out.println(""); 
		//Suma columna DOS
		for (int i=0;i<=2;i++)
		{
			sumaC2+=matriz[i][2];
		}
		System.out.print("La suma de los elementos situados en la columna 2 es: "+sumaC2);
		System.out.println("");
		teclado.close();
	}
}