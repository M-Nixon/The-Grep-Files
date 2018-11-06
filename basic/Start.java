package basic;

import java.io.*;
import java.util.Scanner;

public class Start
{
    public static void main(String[] args) throws IOException {


        File run = new File("Usernames.txt");
        Scanner scan = new Scanner(run);
        Scanner input = new Scanner(System.in);


        System.out.println("  ╲╲   ╭━━━━━━━┃┃━━╮╲╲");
        System.out.println("     ╲╲┃  ╲      /       ┃╲╲");
        System.out.println("╭━━╮  ┃ ▆┈┈┈┈┈┈┈▆      ┃╭━━╮");
        System.out.println("┃   ┃ ┃                 ┃┃   ┃");
        System.out.println("┃   ╰━┫┃▽ ▽ ▽ ▽ ▽┃ ┣╯    ┃");
        System.out.println("┃      ┃┃▆▆▆▆▆▆▆▆▆▆▆┃ ┃     ┃");
        System.out.println("╰━━━━┫ ┃△ △ △ △┃   ┣━━━╯");
        System.out.println("     ╲╲┃                 ┃╲╲");
        System.out.println("     ╲╲┃                 ┃╲╲");
        System.out.println("     ╲╲┃     ┏┓        ┃╲╲");
        System.out.println("    ▔▔ ╰━━━╯ ╰━━━━━╯▔▔");
        System.out.println("Welcome to The Grep Files");

        System.out.print("\n\n Please enter a user name: ");
        String userName = input.nextLine();
        String userPass = null;
        String scanName = null;
        String scanPass = null;
        boolean uflag = false;

        while (scan.hasNext()) {
            scanName = scan.next();
            scanPass = scan.next();
            System.out.print(scanName);
            System.out.print(scanPass);
            if (scanName.equals(userName)) {
                System.out.print("Please enter your password: ");
                userPass = input.nextLine();
                if (userPass.equals(scanPass)) {
                    System.out.println("Welcome back " + userName + "!");
                    //uflag = true;
                } else {
                    System.out.println("Incorrect password, Please try again");
                }
            } else {
                uflag = true;
            }
        }
        System.out.print("\nUser not found, would you like to create a user named: " + userName + "? [y/n]");
        String newUserCheck = input.nextLine();
        char nuc = newUserCheck.charAt(0);
        switch (nuc) {
            case 'y':
            case 'Y':

                //writes to a file, the true status means that it will not overwrite existing data on the file
                FileWriter fun = new FileWriter("Usernames.txt", true);
                //takes the old info in the file, and then adds
                PrintWriter pun = new PrintWriter(fun);
                System.out.println("User created!");
                pun.print(userName);
                System.out.print("Please create a password: ");
                userPass = input.nextLine();
                pun.print(userPass);
                PrintWriter writer = new PrintWriter("Character" + userName + ".txt");
                writer.print("1" + ";" + userName);
                break;
            default:
                System.out.print("\n\nPlease enter a user name: ");
                userName = input.nextLine();
                break;
        }

        System.out.print("Press the enter key to continue.");
                    try
        {
            System.in.read();
        }
        catch(Exception e)
        {}

    }
}
