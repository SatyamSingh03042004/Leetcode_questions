class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch))
            str=str+ch;
        }
        String str1=str.toLowerCase();
        String str2="";
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            str2=ch+str2;
        }
        if(str1.equals(str2))
        return true;

        return false;
    }
}