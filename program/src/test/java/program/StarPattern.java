package program;

import java.util.Iterator;

public class StarPattern {
	
	public static void main(String[] args) {
		

		for (int i = 1; i <= 5  ; i++) {
			
			System.out.println();
			for (int j = 1; j <=5-i; j++) {
				System.out.print("  ");
			}
			
			for (int j = 1; j <=i; j++) {
				System.out.print("* ");
				
			}
			
			  
	    	  for (int j = 1; j <i; j++) {
					System.out.printf("*  ");
				}
			System.out.println();
		}
       for (int i = 1; i < 5  ; i++) {
			
			System.out.println();
			
			for (int j = 1; i < 5 ; j++) {
				System.out.print("* ");
				
			}
			for (int j = i; j <=i; j++) {
				System.out.print("  ");
			}
			
			
			  
	    	  for (int j = 1; j <i; j++) {
					System.out.printf("*  ");
				}
			System.out.println();
		}
		
		
      for (int i = 1; i <= 5  ; i++) {
    	  
    	  
    	  
    	  
    	  for (int j = 1; j <=i; j++) {
				System.out.printf("*  ");
			}
			
			System.out.println();
			for (int j = 1; j <=5-i; j++) {
				System.out.printf("   ");
			}
			
			
			System.out.println();
		}
      
		
	}
}
