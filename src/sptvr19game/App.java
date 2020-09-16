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
        int min = 0;
        int max = 20;
        Random random = new Random();
        int myNumber = random.nextInt(max-min+1)+min;
        System.out.println("задуманно число от "+min+" до "+max+". угадай.");
        Scanner scanner = new Scanner (System.in);
        int attempt = 1;
        do{ 
            
            
            int gamerNumber = scanner.nextInt();
            if (myNumber == gamerNumber) {
               System.out.println("ты выиграл!");  
               break;
            }else{
                if(attempt < 3){
                    System.out.println("не угадал! попробуй еще"); 
                }else{    
                    System.out.println("ты проигралю Задумано число: "+myNumber);
                    break;
                }    
            }
            attempt++;
        }while(true);
   
    }
   
}
