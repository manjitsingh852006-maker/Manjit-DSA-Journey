import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length;
        int[] arr=new int[n];
        int p1=0;
        int p2=n-1;
        int p0=arr.length-1;
        while(p1<=p2){
            int ss=nums[p1]*nums[p1];
            int es=nums[p2]*nums[p2];
            if(ss>es){
                arr[p0]=ss;
                p1++;
            }
            else{
                arr[p0]=es;
                p2--;
            }
            p0--;
        }
        return arr;
        
    }
}