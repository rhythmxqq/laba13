package com.company;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            FileReader fileReader = new FileReader("code.txt");
            int kolvo = 0;
            String text = "";
            while((kolvo = fileReader.read()) != -1){
                text += (char)kolvo; //общее кол-во символов
            }

            String a = text.replaceAll("\\//.+", "");
            String c = a.replaceAll("\\/\\*([\\S\\s]+)\\*\\/", "");

            FileWriter fileWriter = new FileWriter("vivod.txt");
            fileWriter.write(c);
            fileWriter.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}