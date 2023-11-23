package pack;
import java.lang.Math;
import java.text.DecimalFormat;

public class utils {
    
    int players = 10;
    
    public void printEvenFormatedAge(){
        for (var i=0; i<= players; i++){
            double age = Math.random() * 10;
            var formatedAge = new DecimalFormat("#,##");
            if (i % 2 == 0) {
                System.out.println("Pos: " + i + " Idade: " + formatedAge.format(age));
            }
        }
    }
    
}
