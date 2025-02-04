
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
 //----------------------
}
