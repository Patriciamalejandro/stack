/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class MyStackApp {
     public static void main ( String args[]) {

        Stack mystack1 = new Stack();
        
        for (int i=0; i<10; i++) mystack1.push(i);
        System.out.println("Stacks:");
        
        for (int i=0; i<10; i++)
            System.out.print(mystack1.pop() + " ");
     }

}
