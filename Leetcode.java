
package com.mycompany.solid;

public class Leetcode {
    //Given two binary strings a and b, return their sum as a binary string.
     public String addBinary(String a, String b) {
      StringBuilder ans=new StringBuilder();
       int carry=0;
       int sizeA=a.length()-1;
       int sizeB=b.length()-1;
       
       while(sizeA>=0 ||sizeB>=0 ||carry>0 ){
            int sum=carry;
           if(sizeA>=0){
             sum+=a.charAt(sizeA)-'0';
             sizeA--;        
           }
           if(sizeB>=0){
            sum+=a.charAt(sizeB)-'0';
             sizeB--; 
           }
           ans.append(sum%2);
           carry=sum>>1;
       }
       
       return ans.reverse().toString();
     



         
    }
}
//--------------------------- getsumOfTwo int whitout using + or -
 public int getSum(int a, int b) {
        while(b!=0){
            int carry=a&b;
            a=a^b;
            b=carry<<1;
        }
       
     
     return a;
    }
//---------------------187. Repeated DNA Sequences
//using sliding window,HashMap<,>mp
public List<String> findRepeatedDnaSequences(String s) {
        //frequency for store strings
        HashMap<String,Integer> mp = new HashMap<String,Integer>();//frequency 
        ArrayList<String> list=new ArrayList();

       
        if(s.length()<10)return list;
        for(int i=0;i<=s.length()-10;i++){
             //window
            String temp=s.substring(i,i+10);
            //if exist ++ or put it with init 0+1
            mp.put(temp,mp.getOrDefault(temp,0)+1);
          
          if(mp.get(temp)==2){
            list.add(temp);
          }
        }
        return list;
    }
//---------------------------
}
