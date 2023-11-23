package pack;

import java.lang.Math;
import java.text.DecimalFormat;

public class LoopContinue {
     static int players = 10;
    public static void main(String[] args) {   
       
    for(var i=0; i<10; i++){
        printEvenFormatedAge(2);
        System.out.println("--------------------");
    }    
 }    

public static void printEvenFormatedAge(int j){
    for (var i = j; i<= players; i++){
        double age = Math.random() * 100;
        var formatedAge = new DecimalFormat("#,####");
        if (i % 2 == 0) {
            System.out.println("Pos: " + i + " Idade: " + formatedAge.format(age));
            
        }
    }
}
}
