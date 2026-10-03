class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashMap<Character,Character> ST=new HashMap<>();
        HashMap<Character,Character> TS=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            //S->T mapping
            if(ST.containsKey(ch1)){
                if(ST.get(ch1)!=ch2)
                return false;
            }

            //T->S mapping
            if(TS.containsKey(ch2)){
                if(TS.get(ch2)!=ch1)
                return false;
            }

            ST.put(ch1,ch2);
            TS.put(ch2,ch1);
        }

        return true;
    }
}