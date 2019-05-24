package com.tristar;

public class Tristar {
	public static final int N = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		while(i <= Tristar.N) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println("");
			i++;
		}
	}
}
