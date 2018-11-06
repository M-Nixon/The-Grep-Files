package basic;

import java.io.*;
import java.util.Scanner;

public class Street1 {
    public static void main(String[] args) throws IOException {
        String user = null;
        File records = new File("Character" + user + ".txt");
        Scanner scan = new Scanner(records);
        while (scan.hasNext()) {
            String str = scan.nextLine();
            String[] sp = str.split(";");

            String newCharacter = sp[0];
            //=sp[1];
            boolean flag = false;
            do {

                System.out.print("In A Dark Alley");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.print("");
                System.out.print("Exits:[West][East][South]");
                if (newCharacter == "1") {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    System.out.print("");
                    System.out.print("");
                    System.out.print("");
                }
                flag=true;
                Scanner input = new Scanner(System.in);
            }while(flag!=true);

        }
    }
}
