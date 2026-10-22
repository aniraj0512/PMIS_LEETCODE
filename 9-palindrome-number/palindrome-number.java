class Solution {
    public boolean isPalindrome(int x) {
        int swap=0;
        int ori=x;
     if(x<0){
        x=x*-1;
        while(x!=0){
           swap=swap*10+ x%10;
           x/=10;
        }
        
     }
     else{
        while(x!=0){
           swap=swap*10+ x%10;
           x/=10;
        }

     }
     return swap==ori;   
    }
}