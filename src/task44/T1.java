/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task44;

import java.lang.Thread;
/**
 *
 * @author a.yusupova
 */
public class T1 extends Thread{
    
    protected String name;
    T1(String name)
    {
        this.name = name;
    }
    
    public int threadNum = 1;
    public void run(){
        
        for(threadNum = 0; threadNum<100; )
        {
            print10(10);
        }

    }
    
    public void print10(int count){
        
        for(int i = 1; i <= count; ++i){
            System.out.print("Thread: " + threadNum + ": "+threadNum + " ");
            threadNum++;
        }
    }
}