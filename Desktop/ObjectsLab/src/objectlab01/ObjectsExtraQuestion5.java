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
public class ObjectsExtraQuestion5 
{
    public static void main(String[] args) 
    {
        System.out.println("\nSolution 5");
        String inputString = "With great power often comes great confusion";
        String tempString = inputString;
        String resultString;
        System.out.println("The input string is\n"+inputString);
        tempString = tempString.substring(tempString.indexOf(" ")+1);
        tempString = tempString.substring(tempString.indexOf(" ")+1);
        // To extract the third word in the input string
        resultString = tempString.substring(0,tempString.indexOf(" "));
        resultString = resultString.toUpperCase();
        System.out.println("The output string is");
        System.out.println(resultString);
    }
}
