class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common="";
        if(strs.length<2){
                return strs[0];
        }
        int a=strs[0].length();
        for(int v=0;v<strs.length;v++){
            if(strs[v].equals("")){
                return "";          }
            if(a>strs[v].length()){
                a=strs[v].length();
            }
        }
            System.out.println(a);
            for(int c=0;c<a;c++){
            for(int j=1;j<strs.length;j++){
                    if(strs[0].charAt(c)!=strs[j].charAt(c)){                    
                            return common;
                    }
                    if(j==strs.length-1&&strs[0].charAt(c)==strs[j].charAt(c)){
                        common=common+strs[j].charAt(c);
                    }
            }               
            }
       
    return common;
    }

}
