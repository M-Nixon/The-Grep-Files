package basic;

import java.io.*;
import java.util.*;

public class DarkAlley
{
    public static void main(String[] args) throws IOException
    {
        //code to initialize character status
        String user=null;
        boolean flag = false;
        File records = new File("\"Character"+user+".txt");
        Scanner scan = new Scanner(records);
        while(scan.hasNext()){
            String str = scan.nextLine();
            String[] sp = str.split(";");
            
            String newCharacter=sp[0];
            //=sp[1];
            do {
                boolean newCharFlag = false;
                if (newCharacter == "1")
                    System.out.print("You find yourself in an dark alleyway, rain drips on your face");
                System.out.print("In A Dark Alley");
                System.out.println("You are in a dark alley, The cold brick walls on either side of the alley");
                System.out.println("are moist with mold. Dark clouds are overhead, pouring rain into the alley.");
                System.out.println("It collects on the ground and footsteps can be heard splashing on the ground");
                System.out.print("to the north.");
                System.out.print("Exits:[North]");
                if(newCharacter == "1") {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    System.out.print("You hear shoes scuff the ground beside you.");
                    System.out.print("A voice from the darkness says  Quick follow me!");
                    System.out.print("The shadowy figure leaves north.");
                }

            }while(flag!=true);
            Scanner input = new Scanner(System.in);
            String Input = input.nextLine();
            switch(Input.toLowerCase()){
                case "l":
                case "look":
                    flag=false;
                    break;
                case "s":
                case "scan":
             //       scan =
                default:
                break;
            }
        }
        
        
    }
}
