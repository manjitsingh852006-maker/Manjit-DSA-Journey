class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] arr=new int[n1+n2];
        int n3=arr.length;
        int p1=0;
        int p2=0;
        int p0=0;
        while(p1<n1 && p2<n2){
            if(nums1[p1]<=nums2[p2]){
                arr[p0]=nums1[p1];
                p1++;
            }
            else{
                arr[p0]=nums2[p2];
                p2++;
            }
            p0++;
        }
        // here we are adjusting the remaining elements 
        while(p1<n1){
            arr[p0]=nums1[p1];
            p1++;
            p0++;
        }
        // here we are handling the remainin elements of the other array 
        while(p2<n2){
            arr[p0]=nums2[p2];
            p2++;
            p0++;
        }
        // now we are going to find the median 
        if(n3 % 2==1){
            return arr[n3/2];
        }
        else{
            return  (arr[n3 / 2] + arr[n3 / 2 - 1]) / 2.0;
        }

    }
}