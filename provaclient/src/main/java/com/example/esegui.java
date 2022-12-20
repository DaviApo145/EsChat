package com.example;

import java.io.IOException;

public class esegui {
    public void exit(){
        try{
            System.out.println("disconnesso");
            s.close();
        }catch (IOException e){
            System.out.println(e.getMess());
            System.out.println("Errore");
        }
    }
}
