package Loops.Exercises3;
import java.util.Scanner;
public class LoopsExercises3 {
    public static void main(String[] args) {
        
        int n;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please set limit:");
            n=input.nextInt();
        }
        for(int i=1; i<n; i*=4){
            System.out.println(i);
        }
        System.out.println("----------------------");
        for(int i=1; i<n; i*=5){
            System.out.println(i);
    }   
}
}
