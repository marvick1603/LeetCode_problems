// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
class Solution {
    public int strStr(String haystack, String needle) {
        int count=0;
        int c=0;
        int c1=0;
        for(int i=0;i<haystack.length();i++){
               
           c1=i;
            for(int j=0;j<needle.length();j++){
               if(c1<haystack.length()){
                if(haystack.charAt(c1)==needle.charAt(c)){
                    count++;
                    
                }}
               if(count==needle.length()){
                   return i;
               } 
               c++;
               c1++;
            } 
          c=0;
          count=0;
          c1=0;
        }
        return -1;
    }
}
