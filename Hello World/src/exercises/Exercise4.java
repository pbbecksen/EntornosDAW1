package exercises;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		String[]students= {"Maria","Luis","Juan","Ana"};
		String[]classes= {"PROG","BD","LM","SIS"};
		int counter=0;
		float scoresum=0;
		//int[][]scores=new int[4][5];
		
		/*for(int x=0; x<classes.length;x++) {
			System.out.println(classes[x]);
			for(int y=0; y<students.length;y++) {
				System.out.println(students[y]);
				scores[x][y]=read.nextInt();
				
			}
		*/
		int[][]scores={
				{3,5,1,3},
				{10,10,9,10},
				{6,5,6,4},
				{9,10,9,10}};
		int op=2;
		op--;
		
		
		//System.out.println(students[op]+" Scores:");
		/*for(int x=0; x<students.length;x++) {
			counter=0;
			for(int y=0; y<classes.length;y++) {				//Student score
				if (scores[x][y]<5) {
					counter++;
				}
			}
			System.out.println(students[x]+" tiene "+counter+" suspensos.");
			}*/
		
		//PERFECTS
		
		for(int x=0; x<students.length;x++) {
			scoresum=0;
			for(int y=0; y<classes.length;y++) {
				scoresum= scoresum+scores[x][y];
				}
			float resoult=scoresum/classes.length;
			if (resoult>=9) {
				System.out.println("La nota media del alumno "+students[x]+" es "+resoult);
			}
			}

		

		/*System.out.println(classes[op]+" Scores:");
		for(int y=0; y<students.length;y++) {
			
			System.out.println(sudents[y]+" "+scores[y][op]);	//Classes Score
		*/
				
			//TESTsd

	}
}

