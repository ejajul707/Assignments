package com.kodnest.assignment.pattern;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==5/2) {
					System.out.print("*");
				}
				else {
					if(j==5/2) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
