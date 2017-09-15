/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbatsolutions;

/**
 *
 * @author s528100
 */
public class Solutions {
 
/*Question: Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"*/
    public String conCat(String a, String b) {
        int i = a.length();
        int j = b.length();
        if(i>=1&& j>=1){
            if(a.charAt(i-1) == b.charAt(0)){
                return a+b.substring(1);
            }
        }
        return a+b;
    }


    
/*Question: Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
Two("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"*/
    
    public String lastTwo(String str) {
        int i = str.length();
        String a = i>=2? (str.substring(0, i-2)+str.charAt(i-1)+str.charAt(i-2)): str;
        return a;
    }

/*Question: Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"*/    
    public String seeColor(String str) {
        if(str.length()>3){
            if(str.substring(0,3).equals("red")){
                return "red";
            }
            else if(str.substring(0,4).equals("blue")){
                return "blue";
            }
        return "";
        }
        else if(str.length()==3 && str.substring(0,3).equals("red")){
            return "red";
        }
        return "";
    }
    
    
    /*Question: Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
    frontAgain("edited") → true
    frontAgain("edit") → false
    frontAgain("ed") → true*/
    public boolean frontAgain(String str) {
        int i = str.length();
        if(i == 2){
            return true;
        }
        else if(i>2){
            if(str.substring(0,2).equals(str.substring(i-2))){
                return true;
            }
        }
        return false;
    }
    
    
    /*Question: Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
    minCat("Hello", "Hi") → "loHi"
    minCat("Hello", "java") → "ellojava"
    minCat("java", "Hello") → "javaello"*/
    public String minCat(String a, String b) {
        int i = a.length();
        int j = b.length();
        String conc = "";
        if(i>j){
            conc += a.substring(i-j)+b;
            return conc;
        }
        else if(j>i){
            conc += a+b.substring(j-i);
            return conc;
        }
        return a+b;
    }
    
    
    /*Question: Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
    extraFront("Hello") → "HeHeHe"
    extraFront("ab") → "ababab"
    extraFront("H") → "HHH"*/
    public String extraFront(String str) {
        int i = str.length();
        String result = "";
        if(i>=2){
            for(int j=0; j<3; j++){
            result += str.substring(0,2);
            }
            return result;
        }
        else{
            for(int k=0; k<3; k++){
            result += str;
            }
            return result;
        }
    }
    
    /*Question: Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
    without2("HelloHe") → "lloHe"
    without2("HelloHi") → "HelloHi"
    without2("Hi") → ""*/
    public String without2(String str) {
        int i = str.length();
        if(i>2){
            if(str.substring(0,2).equals(str.substring(i-2))){
                return str.substring(2);
            }
            return str;
        }
        else if(i==1){
            return str;
        }
        return "";
    }
    
    /*Question: Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
    deFront("Hello") → "llo"
    deFront("java") → "va"
    deFront("away") → "aay"*/
    public String deFront(String str) {
        int i = str.length();
        String conct = "";
        if (i >= 2) {
            if (str.charAt(0) == 'a') {
                if (str.charAt(1) == 'b') {
                    conct += "ab" + str.substring(2);
                    return conct;
                } else {
                    conct += "a" + str.substring(2);
                    return conct;
                }
            } else if (str.charAt(1) == 'b') {
                conct += "b" + str.substring(2);
                return conct;
            }
        } else if (str.charAt(1) == 'b') {
            conct += "b" + str.substring(2);
            return conct;
        }
        return str.substring(2);
    }
    
    


    
}
