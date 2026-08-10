class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        String rev="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            rev=ch+rev;
        }
        if(rev.equals(str))
        return true;
        return false;
    }
}