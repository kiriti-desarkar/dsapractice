package com.heycoach.learning.sortingii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("Merge sort");
		int[] arr = {2,3,0,1,5,7};
		mergeSort(arr,0,arr.length-1);
		for(int n:arr)
		System.out.print(n+",");
	}
	
	private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of array
        int right = mid + 1;   // starting index of right half of array

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transferring all elements from temporary to array //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2 ;
        mergeSort(arr, low, mid);  // left half
        mergeSort(arr, mid + 1, high); // right half
        merge(arr, low, mid, high);  // merging sorted halves
    }

}
