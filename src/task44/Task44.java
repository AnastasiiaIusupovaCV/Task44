/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task44;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author a.yusupova
 */
public class Task44 {
        public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        T1 thread1= new T1("Thread1");
        T1 thread2= new T1("Thread2");
        
        T2 thread3= new T2("Thread3");
        T2 thread4= new T2("Thread4");
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Task44.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        thread3.start();
        thread4.start();
        
    }
}
