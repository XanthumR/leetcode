class Solution {
    public String intToRoman(int num) {
        char[] chars = ("" + num).toCharArray();
        String a="";
        if(chars.length==4){
            a=a + "M".repeat(Character.getNumericValue(chars[0]));
            if(Character.getNumericValue(chars[1])==4){
                a=a+"CD";
            }
            else if(Character.getNumericValue(chars[1])==9){
                a=a+"CM";
            }
            else{
                if(Character.getNumericValue(chars[1])>=5){
                    a=a+"D"+"C".repeat(Character.getNumericValue(chars[1])%5);
                }
                else{
                    a=a+"C".repeat(Character.getNumericValue(chars[1]));
                }
            }
            if(Character.getNumericValue(chars[2])==4){
                a=a+"XL";
            }
            else if(Character.getNumericValue(chars[2])==9){
                a=a+"XC";
            }
            else{
                if(Character.getNumericValue(chars[2])>=5){
                    a=a+"L"+"X".repeat(Character.getNumericValue(chars[2])%5);
                }
                else{
                    a=a+"X".repeat(Character.getNumericValue(chars[2]));
                }
            }
            if(Character.getNumericValue(chars[3])==4){
                a=a+"IV";
            }
            else if(Character.getNumericValue(chars[3])==9){
                a=a+"IX";
            }
            else{
                if(Character.getNumericValue(chars[3])>=5){
                    a=a+"V"+"I".repeat(Character.getNumericValue(chars[3])%5);
                }
                else{
                    a=a+"I".repeat(Character.getNumericValue(chars[3]));
                }
            }
        }
        if(chars.length==3){
            if(Character.getNumericValue(chars[0])==4){
                a=a+"CD";
            }
            else if(Character.getNumericValue(chars[0])==9){
                a=a+"CM";
            }
            else{
                if(Character.getNumericValue(chars[0])>=5){
                    a=a+"D"+"C".repeat(Character.getNumericValue(chars[0])%5);
                }
                else{
                    a=a+"C".repeat(Character.getNumericValue(chars[0]));
                }
            }
            if(Character.getNumericValue(chars[1])==4){
                a=a+"XL";
            }
            else if(Character.getNumericValue(chars[1])==9){
                a=a+"XC";
            }
            else{
                if(Character.getNumericValue(chars[1])>=5){
                    a=a+"L"+"X".repeat(Character.getNumericValue(chars[1])%5);
                }
                else{
                    a=a+"X".repeat(Character.getNumericValue(chars[1]));
                }
            }
            if(Character.getNumericValue(chars[2])==4){
                a=a+"IV";
            }
            else if(Character.getNumericValue(chars[2])==9){
                a=a+"IX";
            }
            else{
                if(Character.getNumericValue(chars[2])>=5){
                    a=a+"V"+"I".repeat(Character.getNumericValue(chars[2])%5);
                }
                else{
                    a=a+"I".repeat(Character.getNumericValue(chars[2]));
                }
            }
        }
        if(chars.length==2){
            if(Character.getNumericValue(chars[0])==4){
                a=a+"XL";
            }
            else if(Character.getNumericValue(chars[0])==9){
                a=a+"XC";
            }
            else{
                if(Character.getNumericValue(chars[0])>=5){
                    a=a+"L"+"X".repeat(Character.getNumericValue(chars[0])%5);
                }
                else{
                    a=a+"X".repeat(Character.getNumericValue(chars[0]));
                }
            }
            if(Character.getNumericValue(chars[1])==4){
                a=a+"IV";
            }
            else if(Character.getNumericValue(chars[1])==9){
                a=a+"IX";
            }
            else{
                if(Character.getNumericValue(chars[1])>=5){
                    a=a+"V"+"I".repeat(Character.getNumericValue(chars[1])%5);
                }
                else{
                    a=a+"I".repeat(Character.getNumericValue(chars[1]));
                }
            }
        }
        if(chars.length==1){
            if(Character.getNumericValue(chars[0])==4){
                a=a+"IV";
            }
            else if(Character.getNumericValue(chars[0])==9){
                a=a+"IX";
            }
            else{
                if(Character.getNumericValue(chars[0])>=5){
                    a=a+"V"+"I".repeat(Character.getNumericValue(chars[0])%5);
                }
                else{
                    a=a+"I".repeat(Character.getNumericValue(chars[0]));
                }
            }
        }
        return a;
        
    }
}
