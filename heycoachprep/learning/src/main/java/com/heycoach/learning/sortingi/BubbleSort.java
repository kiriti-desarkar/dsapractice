package com.heycoach.learning.sortingi;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {2,1,0,3,5,6};
		int n = a.length;
		for(int i =n-1;i>=1;i--) {
			boolean isSwapped = false;
			for(int j=0;j <= i-1;j++) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
					isSwapped = true;
				}
			}
			if(!isSwapped)
				break;
		}
		System.out.println(Arrays.toString(a));
	}
	private static void swap(int[] a,int b,int c) {
		int temp = a[b];
		a[b]=a[c];
		a[c]=temp;
	}

}
