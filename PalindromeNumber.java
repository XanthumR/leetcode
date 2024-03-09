class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s=Integer.toString(x);
        for(int i=s.length();i>0;i--){
            if(s.charAt(s.length()-i)!=s.charAt(i-1)){
                return false;
            }
        }
        
        return true;
        
    }
}
