class Solution {
    public String reverseWords(String s) {
        String str=s+" ";
        String str1="",str2="";
        int l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            {
                str1=str1+ch;
            }
            else
            {
                str2=str1+" "+(str2.trim());
                str1="";
                
            }
        }
        return str2.trim();
    }
}