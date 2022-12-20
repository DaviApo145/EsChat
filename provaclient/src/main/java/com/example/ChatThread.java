package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.IOException;


public class ChatThread extends Thread{
    BufferedReader br;
    BufferedReader tastiera;
    PrintWriter pr;

    Socket s;
    Mess m;
    ObjectMapper map;

    public ChatThread(Socket s) {
        try{
            this.s = s;
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            tastiera = new BufferedReader(new InputStreamReader(System.in));
            pr = new PrintWriter(s.getOutputStream(), true);
            map = new ObjectMapper();
        }catch (IOException e){
            System.out.println(e.getMess());
            System.out.println("Errore");
        }
    }

    public void run() {
        String ChatJSONS;
        Boolean inChat = true;

        while(inChat){
            try{
                ChatJSONS = br.readLine();
                mesTrasfert = mapper.readValue(ChatJSONS, Mess.class);
                System.out.println(mesTrasfert.getBody());
                if(mesTrasfert.getBody().equals("chiudi"))  inChat = false;
            }catch (IOException e){
                System.out.println(e.getMess());
                System.out.println("Errore");
            }
        }
    }

}