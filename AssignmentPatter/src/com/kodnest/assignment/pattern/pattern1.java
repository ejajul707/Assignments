package com.kodnest.assignment.pattern;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
