package org.example;

public class OrderAgnositcBS {
    public static void main(String[] args) {
        int[] arr = {-11,-22,-4,-1,0,2,4,6,9,12,53,222,223,412};
        int target= 1;
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc;
        isAsc = arr[start] < arr[end];


        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                end = mid - 1;
                } else {
                start = mid + 1;
                }
            }
    }
        return -1;
        }
    }
