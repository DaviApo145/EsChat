package com.example;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
  public static void main(String[] args) throws Exception {
    ArrayList<ClientHandler> list = new ArrayList();
    ServerSocket ss = new ServerSocket(3000);
    System.out.println("Server in ascolto sulla porta 3000");
    boolean running = true;
   
    while (running) {
      Socket s = ss.accept();
      System.out.println("Client connesso");
      ClientHandler c = new ClientHandler(s, list);
      list.add(c);
      c.start();
    }
    ss.close();
  }
}
