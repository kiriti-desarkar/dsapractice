package com.heycoach.learning.sortingi;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a = {2,1,0,3,5,6};
		int n = a.length;
		for(int i =0;i<=n-1;i++) {
			int j=i;
			while(j>0 && a[j-1] > a[j]){
				swap(a,j-1,j);
				j--;				
			}
		}
		System.out.println(Arrays.toString(a));
	}
	private static void swap(int[] a,int b,int c) {
		int temp = a[b];
		a[b]=a[c];
		a[c]=temp;
	}

}
