/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien22;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Phien22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
		// TODO Auto-generated method stub
		
	        boolean isVowel=false;;
	        Scanner scanner=new Scanner(System.in);
	        System.out.println("Input an alphabet : ");
	        char ch=scanner.next().charAt(0);
	        scanner.close();
	        switch(ch)
	        {
	            case 'a' :
	            case 'e' :
	            case 'i' :
	            case 'o' :
	            case 'u' :
	            case 'A' :
	            case 'E' :
	            case 'I' :
	            case 'O' :
	            case 'U' : isVowel = true;
	        }
	        if(isVowel == true) {
	            System.out.println(ch+" Input letter is Vowel ");
	        }
	        else {
	            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	                System.out.println(ch+" Input letter is Consonant");
	            else
	                System.out.println("Error!");
	        }
	      }
}
    

