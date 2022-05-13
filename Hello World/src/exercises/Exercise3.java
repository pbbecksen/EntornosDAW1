package exercises;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		System.out.println("Tabla de Multiplicar");
		Scanner read=new Scanner(System.in);
		int table=0;
		int errCount=0;
		int[]tableStudent=new int[10];
		int data=0;
		System.out.println("Introduce tabla a estudiar");
		table=read.nextInt();
		System.out.println("Introduce tabla del "+table);
		for(int x=0;x<tableStudent.length;x++)
		{
			System.out.println(table+"x"+(x+1)+"=");
		data=read.nextInt();	
		tableStudent[x]=data;
		if(data!=(table*(x+1)))
		{
			errCount++;
		}
		}
		System.out.println("Numero de Errores: "+errCount);
	}

}
