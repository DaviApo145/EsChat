package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Client {
    private String name;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(s.getOutputStream(), true);

        Socket s = new Socket("localhost", 3000);
        ChatTherad t = new ChatTherad(s);
        ObjectMapper map = new ObjectMapper();

        System.out.println("Immettere nome: "); 
        name = tastiera.readLine();
        pr.print(name); 

        t.start();

        String inputSrting;
        String messJSON;
        String messTo;

        /*
        boolean fine = true; 
        String in;
        */  
        String scelta;  
        System.out.println(br.readLine()); 
        for(;;){
            /*
            pr.println(tastiera.readLine());
            in = br.readLine();
            if(in.equals("fine")) fine = false;
            else System.out.println(in);
            */
            System.out.println("Digita scrivi per chattare e disconnetti per disconnettersi dal server ")
            scelta = tastiera.readLine();

            if(scelta.equals("scrivi")){
                boolean fine = true; 
                while(fine){
                    inputSrting = tastiera.readLine();
                    messTo = new Mess(name, input);
                    messJSON = mapper.writeValueAsString(messTo);
                    pr.println(messJSON);
                    if(input.equals("esci"))  fine = false;
                }
            }else if(scelta.equals("disconnetti")){
                esegui.exit();
            }
        }; 
        s.close();
    }
}
