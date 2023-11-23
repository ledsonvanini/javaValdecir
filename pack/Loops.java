package pack;

import java.util.Scanner;

public class Loops{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        var name = sc.nextLine();
        var olderAge = 18;
        var elderAge = 65;
        var bestestAge = 28;
               
        int age;
        
        do {
            System.out.println("Qual a sua idade?");
            age = sc.nextInt();
        } while (age < olderAge);
        if (age > elderAge) {
            System.out.println("Ancião da porra!");
        } else if (age > olderAge && age < elderAge) {
            System.out.println("Eh "+ name + ", você é um meia vida!");
        } else if (age >= olderAge && age < bestestAge){
            System.out.println("Powrra! Você tá no auge da juventude");
        } else {
            System.out.println("Por favor, mano! Digite uma idade válidaS");
        }
        sc.close();

       

    }
}