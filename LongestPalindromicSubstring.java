class Solution {

    public String longestPalindrome(String s) {
        char[] array=s.toCharArray();
        int p=0;
        String sa="";
        String as="";
        int leng =s.length();
        boolean b=true;
        if(leng==1){
            return s;
        }
        for(int i=0;i<leng ;i++){
            for(int j=leng-1;j>p ;j--){
                if(array[p]==array[j]){
                    b=false;
                    int c=0;
                    for(int z = p; z< j +1; z++) {
                        int g= j -c;
                        if(array[z]!=array[j -c]){
                            break;
                        }
                        c=c+1;
                        if(z==g||g-z==1){
                            sa=s.substring(p,j+1);
                            if(sa.length()>as.length()){
                                as=sa;
                                sa="";
                            }
                            sa="";
                            if(as.length()==s.length()){
                                return as;
                            }
                            break;
                        }
                    }
                }
            }
            p++;
        }
        if(leng==2 && b){
            sa=sa+array[0];
            return sa;
        }
        if (as.isEmpty()){
            return s.substring(0,1);
        }
        return as;
    }
}
