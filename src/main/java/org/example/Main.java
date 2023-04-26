package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
RSA rsa=new RSA();
        System.out.println("1.Encrypt");
        System.out.println("2.Decrypt");
        System.out.print("Option:");
        int choice= Integer.parseInt(scan.next());
        System.out.println("File:");
        String file= scan.next();
        if(choice==1)
        {FileRSA.encrypt(rsa,file);

        }
        else if(choice==2)
        {

        }

    }
}