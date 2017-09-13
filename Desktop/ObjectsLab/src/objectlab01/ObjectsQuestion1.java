/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectlab01;
/**
 *
 * @author Instructor
 */
public class ObjectsQuestion1
{
    public static void main(String[] args) 
    { 
        String inputString = "onlienonlieeonlinnonlineonliionlline";
        String positionName = "online";
        String concatString = "Northwest";
        int stringPosition = inputString.indexOf(positionName);
        System.out.println("Solution 1");
        System.out.println("The original string is "+inputString);
        System.out.println("The first occurrence of word '"+positionName+
                "' is found at position "+stringPosition);
        String resultString = inputString.substring(stringPosition,+
                stringPosition+positionName.length());
        System.out.println("The result is");
        System.out.println(concatString.concat(" "+resultString));
   } 
}
