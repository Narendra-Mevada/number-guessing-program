//import necessary tools or libraries:
import java.lang.ref.Cleaner;
import java.util.Scanner;
import java.util.Random;



public class game {
    public class AnsiColors {
        public static final String RESET = "\u001B[0m";
        public static final String BLACK = "\u001B[30m";
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE = "\u001B[34m";
        public static final String MAGENTA = "\u001B[35m";
        public static final String CYAN = "\u001B[36m";
        public static final String WHITE = "\u001B[37m";
    }
    
    public static void main(String[] args) {
        //impliment scanner as 'sc'
        Scanner sc = new Scanner(System.in);
        
        
        //x,y and z are chances for guessing the number:
        int x,y,z;

        //impliment randum as 'rnum':
        Random rnum = new Random();
        int num =  rnum.nextInt(10)+1;

        //code begins...
        System.out.print(AnsiColors.YELLOW+"guess the number from 1 to 10: "+AnsiColors.RESET);
        x = sc.nextInt();
        System.out.print("\033[H\033[2J");
        System.out.flush();

        //logics.
        if(x>10){
            System.out.println(AnsiColors.RED+"invalid input"+AnsiColors.RESET);
            
        } 
        
        else{
            if(x==num){
                System.out.println(AnsiColors.GREEN+"you guessed right..."+AnsiColors.RESET);
                
            }//if not guessed right then we have to give another chance.
    
            else{
                System.out.println(AnsiColors.RED+"you guessed wrong..."+AnsiColors.RESET);
                System.out.println(AnsiColors.YELLOW+"you have second chance:"+AnsiColors.RESET);
                System.out.print("guess the number: ");
                y = sc.nextInt();
                
                if(y==num){
                    System.out.println(AnsiColors.GREEN+"you guessed right..."+AnsiColors.RESET);
                    
                }//if not guessed right then gives another chance
    
                else{
                    System.out.println(AnsiColors.RED+"you guessed wrong..."+AnsiColors.RESET);
                    System.out.println(AnsiColors.YELLOW+"you have last chance:"+AnsiColors.RESET);
                    System.out.print("guess the number: ");
                    z = sc.nextInt();
                    
                    if(z==num){
                    
                        
                        System.out.println(AnsiColors.GREEN+"you guessed right..."+AnsiColors.RESET);
                        
                    }//if not guessed right then sorry and failed...
                    else {
                        System.out.println(AnsiColors.RED+"sorry,you failed...."+AnsiColors.RESET);
                        System.out.println("The number is: "+num);
                    }
                        

        }
        
            
        }
        




    

    }
       }   }

