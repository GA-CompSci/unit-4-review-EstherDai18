
import java.util.Scanner;
public class Drills{

    public static void main(String[] args){

        // Declare 5 different data types with initial values


        String str = "I am a string!";
        int x = 0; 
        char letter = 'c';
        double pie = 3.14;
        boolean result = true;


        // A standard for loop printing a message three times


        for (int i=0; i<3; i++){
            System.out.println("I need to print three times");
        }

        // A for-each loop traversing a String[array]

       
        String[] PeriodicTable = {"H", "He", "Li", "Be", "B", "C"};  
        for (String element: PeriodicTable){
            System.out.println(element);
            //or whatever else I want the elements to do
        }


        // An infinite loop

        
        while (1>0){

        }


        // a short-circuit conditional with four tests
        

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        if (a<b && b<c && c<d && d<a){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


        // Break a loop if a conditional passes


        if (a<b){
            System.out.println("a<b");
            break;
        }


        // Loop through each char in a String


        String string = "string";
        for (int i=0; i<string.length(); i++){
            char ch = string.charAt(i);
        }


        // Print only the first three letters in “word”

        
        String word = "word";
        System.out.println(word.substring(0,3));


        // Print all the odd numbers from 1 - 100


        for (int i=1; i<100; i+=2){
            System.out.println(i);
        }


        // Create a Scanner and take an input


        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        

        // Create a Scanner, take a number, and count down from that number to 0

    
        Scanner Scan = new Scanner(System.in);
        int number = Scan.nextInt();
        for (int i=number; i>=0; i--){
            System.out.println(i);
        }
    
    }

    // Create a method that returns a comparison (include a JavaDoc comment)

    
    //I'm not sure what to compare here, so I'm just comparing two numbers
    public String comparison(int a, int b){
        //greater
        if (a>b){
            return a+">"+b;
        }
        //lesser
        else if (a<b){
            return a+"<"+b;
        }
        //equal
        else{
            return a+"="+b;
        }

    }
}