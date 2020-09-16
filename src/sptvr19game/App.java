/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
class App {
     public void run() {
        System.out.println("угадай задуманное число.");
        System.out.println("------------------");
        Random random = new Random();
        int myNumber = random.nextInt(5-0+1)+0;
        System.out.println("задуманно число от 0 до 5. угадай.");
        Scanner scanner = new Scanner (System.in);
        int gamerNumber = scanner.nextInt();
        if (myNumber == gamerNumber) {
            System.out.println("ты выиграл!");  
        }else{
            System.out.println("ты проигралю Задумано число: "+myNumber);    
                }
   
    }
   
}
