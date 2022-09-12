package HuiWen;

public class HuiWen {
    class Solution {
        public boolean isPalindrome(int x) {
            if(x<0){
                return false;
            }
            int num=0;
            int t=x;
            while(t!=0){
                num=num*10+t%10;
                t/=10;
            }
            return num==x;
        }
    }
}
