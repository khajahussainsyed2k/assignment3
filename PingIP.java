package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PingIP {

    public static void runSystemCommand(String command) {

        try {
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String s = "";
            // reading output stream of the command
            while((s = inputStream.readLine())!=null)
            System.out.println(s);
            }

        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String ip ;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the ip address");
        ip=scanner.nextLine();
        runSystemCommand("ping " + ip);


    }
}