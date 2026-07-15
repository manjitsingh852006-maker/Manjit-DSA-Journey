class Solution {
    public int addDigits(int num) {
        int sum=0;
        int digit=0;
        if(num<10){
            return num;
        }
        while(num>0){
            digit=num%10;
            sum+=digit;
            num=num/10;
        }
        int fi=addDigits(sum);
        return fi;
    }
}