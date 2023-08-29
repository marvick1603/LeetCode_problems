// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.
class Solution {
    public int romanToInt(String s) {
      int total_sum=0;
      char[] word=new char[s.length()];
      for(int i=0;i<s.length();i++){
          word[i]=s.charAt(i);
      }
      for(int i=0;i<word.length;i++){
      if(word[i]=='I'){
          
               
              total_sum+=1;}
              
          
          else if(word[i]=='V'){
              if(i>0){
                  if(word[i-1]=='I'){
                      total_sum+=4-1;
                  }
                 
                  else{
                       total_sum+=5;
                  }
              }
              else{
              total_sum+=5;}
          }
           else if(word[i]=='X'){
               
               if(i>0){
                  if(word[i-1]=='I'){
                      total_sum+=9-1;
                  }
                 
                  else{
                       total_sum+=10;
                  }
              }
              else{ 
              total_sum+=10;}}
          
           else if(word[i]=='L'){
                if(i>0){
                  if(word[i-1]=='X'){
                      total_sum+=40-10;
                  }
                 
                  else{
                       total_sum+=50;
                  }
              }
              else{
              total_sum+=50;}
          }
           else if(word[i]=='C'){
              if(i>0){
                  if(word[i-1]=='X'){
                      total_sum+=90-10;
                  }
                 
                  else{
                       total_sum+=100;
                  }
              }
               else{
              total_sum+=100;}
          }
           else if(word[i]=='D'){
                if(i>0){
                  if(word[i-1]=='C'){
                      total_sum+=400-100;
                  }
                 
                  else{
                       total_sum+=500;
                  }
              }
              else{
              total_sum+=500;}
          }
           else if(word[i]=='M'){
               if(i>0){
                  if(word[i-1]=='C'){
                      total_sum+=900-100;
                  }
                 
                  else{
                       total_sum+=1000;
                  }
              }
               else{
              total_sum+=1000;}
          }
      
     

    }
     return total_sum;
    }
}
