/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.assignment2;
import java.util.Scanner;
import com.leapfrog.assignment2.util.Marksheet;

        
/**
 *
 * @author UsEr
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String [] students={"Ram","Shyam","Hari"};
       String[] subjects={"Science","Nepali","Math"};
       Scanner input;
        input = new Scanner (System.in);
       while(true){
           
           Marksheet ms;
           ms = new Marksheet(subjects,students,input);
           ms.entry();
           if(!ms.isFail()){
               System.out.println(ms.getPercentage());
               System.out.println(ms.getGrade());
           }else{
               System.out.println("Failed");
           }
           System.out.println("Do you want to continue[Y/N]");
           String ch=input.next();
           
           if (ch.equalsIgnoreCase("n")){
               System.exit(0);
           }
       }
    }
    
}
