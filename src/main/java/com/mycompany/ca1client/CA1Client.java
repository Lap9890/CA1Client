/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ca1client;

import java.net.Socket;
import java.io.*;

/**
 *
 * @author lapi
 */
public class CA1Client {

    public static void main(String[] args) {
       
        try{
            
            while(true){
            System.out.println("Client started");
            Socket soc = new Socket("localhost",9806);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string");
            String str = userInput.readLine();
            
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);
            out.println(str);
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String serverResponse = in.readLine();
            if(serverResponse.equals("stop")){
                break;
            }
            System.out.println(serverResponse);
            }
            
                    
                  
               
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
