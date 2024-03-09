class Solution {
    public int romanToInt(String s) {
        int val=0;
        String[] starray={"CM","CD","XC","XL","IX","IV","M","D","C","L","X","V","I"};
        int[] itarray={900,400,90,40,9,4,1000,500,100,50,10,5,1};
        for(int i=0;i<starray.length;i++){
            while(s.contains(starray[i])) {   
                s=s.replaceFirst(starray[i],"");
                val=val+itarray[i];
            }
        }
        return val;


        
    }
}
