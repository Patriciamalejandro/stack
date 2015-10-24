/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class MyStack {
    int stack[] = new int[10];
    int stck;

    MyStack() {
        stck = -1;
    }

    void push (int item) {
    if ( stck == 9)
        System.out.println("Stack is full.");
    else
        stack[++stck] = item;
    }

    int pop() {
    if(stck < 0) {
        System.out.println("Stack is ...");
        return 0;
    }
    else
        return stack[stck--];
    }
}
