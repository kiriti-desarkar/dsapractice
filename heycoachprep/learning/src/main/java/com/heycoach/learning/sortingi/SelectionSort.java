package com.heycoach.learning.sortingi;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {2,1,0,3,5,6};
		int n = a.length;
		for(int i =0;i<n-2;i++) {
			int min = i;
			for(int j=i;j < n-1;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			if(min!=i)
			swap(a,i,min);
		}
		System.out.println(Arrays.toString(a));
	}
	private static void swap(int[] a,int b,int c) {
		int temp = a[b];
		a[b]=a[c];
		a[c]=temp;
	}
}
